package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeSetInstanceExtensionFieldStateCommandConverter<TCreateAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField, TMergePatchAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand.MergePatchAttributeSetInstanceExtensionField, TRemoveAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand.RemoveAttributeSetInstanceExtensionField>
{
    public AttributeSetInstanceExtensionFieldCommand toCreateOrMergePatchAttributeSetInstanceExtensionField(AttributeSetInstanceExtensionFieldState state)
    {
        //where TCreateAttributeSetInstanceExtensionField : ICreateAttributeSetInstanceExtensionField, new()
        //where TMergePatchAttributeSetInstanceExtensionField : IMergePatchAttributeSetInstanceExtensionField, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateAttributeSetInstanceExtensionField(state);
        }
        else 
        {
            return toMergePatchAttributeSetInstanceExtensionField(state);
        }
    }

    public TRemoveAttributeSetInstanceExtensionField toRemoveAttributeSetInstanceExtensionField(AttributeSetInstanceExtensionFieldState state) //where TRemoveAttributeSetInstanceExtensionField : IRemoveAttributeSetInstanceExtensionField, new()
    {
        TRemoveAttributeSetInstanceExtensionField cmd = newRemoveAttributeSetInstanceExtensionField();
        cmd.setIndex(state.getIndex());
        return cmd;
    }

    public TMergePatchAttributeSetInstanceExtensionField toMergePatchAttributeSetInstanceExtensionField(AttributeSetInstanceExtensionFieldState state) //where TMergePatchAttributeSetInstanceExtensionField : IMergePatchAttributeSetInstanceExtensionField, new()
    {
        TMergePatchAttributeSetInstanceExtensionField cmd = newMergePatchAttributeSetInstanceExtensionField();

        cmd.setIndex(state.getIndex());
        cmd.setName(state.getName());
        cmd.setType(state.getType());
        cmd.setLength(state.getLength());
        cmd.setAlias(state.getAlias());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setGroupId(state.getGroupId());
            
        if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
        if (state.getType() == null) { cmd.setIsPropertyTypeRemoved(true); }
        if (state.getLength() == null) { cmd.setIsPropertyLengthRemoved(true); }
        if (state.getAlias() == null) { cmd.setIsPropertyAliasRemoved(true); }
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateAttributeSetInstanceExtensionField toCreateAttributeSetInstanceExtensionField(AttributeSetInstanceExtensionFieldState state) //where TCreateAttributeSetInstanceExtensionField : ICreateAttributeSetInstanceExtensionField, new()
    {
        TCreateAttributeSetInstanceExtensionField cmd = newCreateAttributeSetInstanceExtensionField();

        cmd.setIndex(state.getIndex());
        cmd.setName(state.getName());
        cmd.setType(state.getType());
        cmd.setLength(state.getLength());
        cmd.setAlias(state.getAlias());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setGroupId(state.getGroupId());
        return cmd;
    }

    protected abstract TCreateAttributeSetInstanceExtensionField newCreateAttributeSetInstanceExtensionField();

    protected abstract TMergePatchAttributeSetInstanceExtensionField newMergePatchAttributeSetInstanceExtensionField(); 

    protected abstract TRemoveAttributeSetInstanceExtensionField newRemoveAttributeSetInstanceExtensionField();

    public static class SimpleAttributeSetInstanceExtensionFieldStateCommandConverter extends AbstractAttributeSetInstanceExtensionFieldStateCommandConverter<AbstractAttributeSetInstanceExtensionFieldCommand.SimpleCreateAttributeSetInstanceExtensionField, AbstractAttributeSetInstanceExtensionFieldCommand.SimpleMergePatchAttributeSetInstanceExtensionField, AbstractAttributeSetInstanceExtensionFieldCommand.SimpleRemoveAttributeSetInstanceExtensionField>
    {
        @Override
        protected AbstractAttributeSetInstanceExtensionFieldCommand.SimpleCreateAttributeSetInstanceExtensionField newCreateAttributeSetInstanceExtensionField() {
            return new AbstractAttributeSetInstanceExtensionFieldCommand.SimpleCreateAttributeSetInstanceExtensionField();
        }

        @Override
        protected AbstractAttributeSetInstanceExtensionFieldCommand.SimpleMergePatchAttributeSetInstanceExtensionField newMergePatchAttributeSetInstanceExtensionField() {
            return new AbstractAttributeSetInstanceExtensionFieldCommand.SimpleMergePatchAttributeSetInstanceExtensionField();
        }

        @Override
        protected AbstractAttributeSetInstanceExtensionFieldCommand.SimpleRemoveAttributeSetInstanceExtensionField newRemoveAttributeSetInstanceExtensionField() {
            return new AbstractAttributeSetInstanceExtensionFieldCommand.SimpleRemoveAttributeSetInstanceExtensionField();
        }


    }

}

