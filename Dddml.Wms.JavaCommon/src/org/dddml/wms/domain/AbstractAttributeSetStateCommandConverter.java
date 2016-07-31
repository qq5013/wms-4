package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeSetStateCommandConverter<TCreateAttributeSet extends AttributeSetCommand.CreateAttributeSet, TMergePatchAttributeSet extends AttributeSetCommand.MergePatchAttributeSet, TDeleteAttributeSet extends AttributeSetCommand.DeleteAttributeSet, TCreateAttributeUse extends AttributeUseCommand.CreateAttributeUse, TMergePatchAttributeUse extends AttributeUseCommand.MergePatchAttributeUse, TRemoveAttributeUse extends AttributeUseCommand.RemoveAttributeUse>
{
    public AttributeSetCommand toCreateOrMergePatchAttributeSet(AttributeSetState state)
    {
        //where TCreateAttributeSet : ICreateAttributeSet, new()
        //where TMergePatchAttributeSet : IMergePatchAttributeSet, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateAttributeSet(state);
        }
        else 
        {
            return toMergePatchAttributeSet(state);
        }
    }

    public TDeleteAttributeSet toDeleteAttributeSet(AttributeSetState state) //where TDeleteAttributeSet : IDeleteAttributeSet, new()
    {
        TDeleteAttributeSet cmd = newDeleteAttributeSet();
        cmd.setAttributeSetId(state.getAttributeSetId());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchAttributeSet toMergePatchAttributeSet(AttributeSetState state) //where TMergePatchAttributeSet : IMergePatchAttributeSet, new()
    {
        TMergePatchAttributeSet cmd = newMergePatchAttributeSet();

        cmd.setVersion(state.getVersion());

        cmd.setAttributeSetId(state.getAttributeSetId());
        cmd.setName(state.getName());
        cmd.setOrganizationId(state.getOrganizationId());
        cmd.setDescription(state.getDescription());
        cmd.setSerialNumberAttributeId(state.getSerialNumberAttributeId());
        cmd.setLotAttributeId(state.getLotAttributeId());
        cmd.setReferenceId(state.getReferenceId());
        cmd.setActive(state.getActive());
            
        if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
        if (state.getOrganizationId() == null) { cmd.setIsPropertyOrganizationIdRemoved(true); }
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getSerialNumberAttributeId() == null) { cmd.setIsPropertySerialNumberAttributeIdRemoved(true); }
        if (state.getLotAttributeId() == null) { cmd.setIsPropertyLotAttributeIdRemoved(true); }
        if (state.getReferenceId() == null) { cmd.setIsPropertyReferenceIdRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        for (AttributeUseState d : state.getAttributeUses())
        {
            AttributeUseCommand c = getAttributeUseStateCommandConverter().toCreateOrMergePatchAttributeUse(d);
            cmd.getAttributeUseCommands().add(c);
        }
        return cmd;
    }

    public TCreateAttributeSet toCreateAttributeSet(AttributeSetState state) //where TCreateAttributeSet : ICreateAttributeSet, new()
    {
        TCreateAttributeSet cmd = newCreateAttributeSet();

        cmd.setVersion(state.getVersion());
        cmd.setAttributeSetId(state.getAttributeSetId());
        cmd.setName(state.getName());
        cmd.setOrganizationId(state.getOrganizationId());
        cmd.setDescription(state.getDescription());
        cmd.setSerialNumberAttributeId(state.getSerialNumberAttributeId());
        cmd.setLotAttributeId(state.getLotAttributeId());
        cmd.setReferenceId(state.getReferenceId());
        cmd.setActive(state.getActive());
        for (AttributeUseState d : state.getAttributeUses())
        {
            AttributeUseCommand.CreateAttributeUse c = getAttributeUseStateCommandConverter().toCreateAttributeUse(d);
            cmd.getAttributeUses().add(c);
        }
        return cmd;
    }

    protected abstract AbstractAttributeUseStateCommandConverter<TCreateAttributeUse, TMergePatchAttributeUse, TRemoveAttributeUse>
        getAttributeUseStateCommandConverter();

    protected abstract TCreateAttributeSet newCreateAttributeSet();

    protected abstract TMergePatchAttributeSet newMergePatchAttributeSet(); 

    protected abstract TDeleteAttributeSet newDeleteAttributeSet();

    public static class SimpleAttributeSetStateCommandConverter extends AbstractAttributeSetStateCommandConverter<AbstractAttributeSetCommand.SimpleCreateAttributeSet, AbstractAttributeSetCommand.SimpleMergePatchAttributeSet, AbstractAttributeSetCommand.SimpleDeleteAttributeSet, AbstractAttributeUseCommand.SimpleCreateAttributeUse, AbstractAttributeUseCommand.SimpleMergePatchAttributeUse, AbstractAttributeUseCommand.SimpleRemoveAttributeUse>
    {
        @Override
        protected AbstractAttributeSetCommand.SimpleCreateAttributeSet newCreateAttributeSet() {
            return new AbstractAttributeSetCommand.SimpleCreateAttributeSet();
        }

        @Override
        protected AbstractAttributeSetCommand.SimpleMergePatchAttributeSet newMergePatchAttributeSet() {
            return new AbstractAttributeSetCommand.SimpleMergePatchAttributeSet();
        }

        @Override
        protected AbstractAttributeSetCommand.SimpleDeleteAttributeSet newDeleteAttributeSet() {
            return new AbstractAttributeSetCommand.SimpleDeleteAttributeSet();
        }

        @Override
        protected AbstractAttributeUseStateCommandConverter<AbstractAttributeUseCommand.SimpleCreateAttributeUse, AbstractAttributeUseCommand.SimpleMergePatchAttributeUse, AbstractAttributeUseCommand.SimpleRemoveAttributeUse> getAttributeUseStateCommandConverter()
        {
            return new AbstractAttributeUseStateCommandConverter.SimpleAttributeUseStateCommandConverter();
        }


    }

}

