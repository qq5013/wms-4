package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeStateCommandConverter<TCreateAttribute extends AttributeCommand.CreateAttribute, TMergePatchAttribute extends AttributeCommand.MergePatchAttribute, TDeleteAttribute extends AttributeCommand.DeleteAttribute, TCreateAttributeValue extends AttributeValueCommand.CreateAttributeValue, TMergePatchAttributeValue extends AttributeValueCommand.MergePatchAttributeValue, TRemoveAttributeValue extends AttributeValueCommand.RemoveAttributeValue>
{
    public AttributeCommand toCreateOrMergePatchAttribute(AttributeState state)
    {
        //where TCreateAttribute : ICreateAttribute, new()
        //where TMergePatchAttribute : IMergePatchAttribute, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateAttribute(state);
        }
        else 
        {
            return toMergePatchAttribute(state);
        }
    }

    public TDeleteAttribute toDeleteAttribute(AttributeState state) //where TDeleteAttribute : IDeleteAttribute, new()
    {
        TDeleteAttribute cmd = newDeleteAttribute();
        cmd.setAttributeId(state.getAttributeId());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchAttribute toMergePatchAttribute(AttributeState state) //where TMergePatchAttribute : IMergePatchAttribute, new()
    {
        TMergePatchAttribute cmd = newMergePatchAttribute();

        cmd.setVersion(state.getVersion());

        cmd.setAttributeId(state.getAttributeId());
        cmd.setName(state.getName());
        cmd.setOrganizationId(state.getOrganizationId());
        cmd.setDescription(state.getDescription());
        cmd.setIsMandatory(state.getIsMandatory());
        cmd.setIsInstanceAttribute(state.getIsInstanceAttribute());
        cmd.setAttributeValueType(state.getAttributeValueType());
        cmd.setAttributeValueLength(state.getAttributeValueLength());
        cmd.setIsList(state.getIsList());
        cmd.setFieldName(state.getFieldName());
        cmd.setReferenceId(state.getReferenceId());
        cmd.setActive(state.getActive());
            
        if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
        if (state.getOrganizationId() == null) { cmd.setIsPropertyOrganizationIdRemoved(true); }
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getIsMandatory() == null) { cmd.setIsPropertyIsMandatoryRemoved(true); }
        if (state.getIsInstanceAttribute() == null) { cmd.setIsPropertyIsInstanceAttributeRemoved(true); }
        if (state.getAttributeValueType() == null) { cmd.setIsPropertyAttributeValueTypeRemoved(true); }
        if (state.getAttributeValueLength() == null) { cmd.setIsPropertyAttributeValueLengthRemoved(true); }
        if (state.getIsList() == null) { cmd.setIsPropertyIsListRemoved(true); }
        if (state.getFieldName() == null) { cmd.setIsPropertyFieldNameRemoved(true); }
        if (state.getReferenceId() == null) { cmd.setIsPropertyReferenceIdRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        for (AttributeValueState d : state.getAttributeValues())
        {
            AttributeValueCommand c = getAttributeValueStateCommandConverter().toCreateOrMergePatchAttributeValue(d);
            cmd.getAttributeValueCommands().add(c);
        }
        return cmd;
    }

    public TCreateAttribute toCreateAttribute(AttributeState state) //where TCreateAttribute : ICreateAttribute, new()
    {
        TCreateAttribute cmd = newCreateAttribute();

        cmd.setVersion(state.getVersion());
        cmd.setAttributeId(state.getAttributeId());
        cmd.setName(state.getName());
        cmd.setOrganizationId(state.getOrganizationId());
        cmd.setDescription(state.getDescription());
        cmd.setIsMandatory(state.getIsMandatory());
        cmd.setIsInstanceAttribute(state.getIsInstanceAttribute());
        cmd.setAttributeValueType(state.getAttributeValueType());
        cmd.setAttributeValueLength(state.getAttributeValueLength());
        cmd.setIsList(state.getIsList());
        cmd.setFieldName(state.getFieldName());
        cmd.setReferenceId(state.getReferenceId());
        cmd.setActive(state.getActive());
        for (AttributeValueState d : state.getAttributeValues())
        {
            AttributeValueCommand.CreateAttributeValue c = getAttributeValueStateCommandConverter().toCreateAttributeValue(d);
            cmd.getAttributeValues().add(c);
        }
        return cmd;
    }

    protected abstract AbstractAttributeValueStateCommandConverter<TCreateAttributeValue, TMergePatchAttributeValue, TRemoveAttributeValue>
        getAttributeValueStateCommandConverter();

    protected abstract TCreateAttribute newCreateAttribute();

    protected abstract TMergePatchAttribute newMergePatchAttribute(); 

    protected abstract TDeleteAttribute newDeleteAttribute();

    public static class SimpleAttributeStateCommandConverter extends AbstractAttributeStateCommandConverter<AbstractAttributeCommand.SimpleCreateAttribute, AbstractAttributeCommand.SimpleMergePatchAttribute, AbstractAttributeCommand.SimpleDeleteAttribute, AbstractAttributeValueCommand.SimpleCreateAttributeValue, AbstractAttributeValueCommand.SimpleMergePatchAttributeValue, AbstractAttributeValueCommand.SimpleRemoveAttributeValue>
    {
        @Override
        protected AbstractAttributeCommand.SimpleCreateAttribute newCreateAttribute() {
            return new AbstractAttributeCommand.SimpleCreateAttribute();
        }

        @Override
        protected AbstractAttributeCommand.SimpleMergePatchAttribute newMergePatchAttribute() {
            return new AbstractAttributeCommand.SimpleMergePatchAttribute();
        }

        @Override
        protected AbstractAttributeCommand.SimpleDeleteAttribute newDeleteAttribute() {
            return new AbstractAttributeCommand.SimpleDeleteAttribute();
        }

        @Override
        protected AbstractAttributeValueStateCommandConverter<AbstractAttributeValueCommand.SimpleCreateAttributeValue, AbstractAttributeValueCommand.SimpleMergePatchAttributeValue, AbstractAttributeValueCommand.SimpleRemoveAttributeValue> getAttributeValueStateCommandConverter()
        {
            return new AbstractAttributeValueStateCommandConverter.SimpleAttributeValueStateCommandConverter();
        }


    }

}

