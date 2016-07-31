package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeValueMvoStateCommandConverter<TCreateAttributeValueMvo extends AttributeValueMvoCommand.CreateAttributeValueMvo, TMergePatchAttributeValueMvo extends AttributeValueMvoCommand.MergePatchAttributeValueMvo, TDeleteAttributeValueMvo extends AttributeValueMvoCommand.DeleteAttributeValueMvo>
{
    public AttributeValueMvoCommand toCreateOrMergePatchAttributeValueMvo(AttributeValueMvoState state)
    {
        //where TCreateAttributeValueMvo : ICreateAttributeValueMvo, new()
        //where TMergePatchAttributeValueMvo : IMergePatchAttributeValueMvo, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateAttributeValueMvo(state);
        }
        else 
        {
            return toMergePatchAttributeValueMvo(state);
        }
    }

    public TDeleteAttributeValueMvo toDeleteAttributeValueMvo(AttributeValueMvoState state) //where TDeleteAttributeValueMvo : IDeleteAttributeValueMvo, new()
    {
        TDeleteAttributeValueMvo cmd = newDeleteAttributeValueMvo();
        cmd.setAttributeValueId(state.getAttributeValueId());
        cmd.setAttributeVersion(state.getAttributeVersion());

        return cmd;
    }

    public TMergePatchAttributeValueMvo toMergePatchAttributeValueMvo(AttributeValueMvoState state) //where TMergePatchAttributeValueMvo : IMergePatchAttributeValueMvo, new()
    {
        TMergePatchAttributeValueMvo cmd = newMergePatchAttributeValueMvo();

        cmd.setAttributeVersion(state.getAttributeVersion());

        cmd.setAttributeValueId(state.getAttributeValueId());
        cmd.setName(state.getName());
        cmd.setDescription(state.getDescription());
        cmd.setReferenceId(state.getReferenceId());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setAttributeName(state.getAttributeName());
        cmd.setAttributeOrganizationId(state.getAttributeOrganizationId());
        cmd.setAttributeDescription(state.getAttributeDescription());
        cmd.setAttributeIsMandatory(state.getAttributeIsMandatory());
        cmd.setAttributeIsInstanceAttribute(state.getAttributeIsInstanceAttribute());
        cmd.setAttributeAttributeValueType(state.getAttributeAttributeValueType());
        cmd.setAttributeAttributeValueLength(state.getAttributeAttributeValueLength());
        cmd.setAttributeIsList(state.getAttributeIsList());
        cmd.setAttributeFieldName(state.getAttributeFieldName());
        cmd.setAttributeReferenceId(state.getAttributeReferenceId());
        cmd.setAttributeCreatedBy(state.getAttributeCreatedBy());
        cmd.setAttributeCreatedAt(state.getAttributeCreatedAt());
        cmd.setAttributeUpdatedBy(state.getAttributeUpdatedBy());
        cmd.setAttributeUpdatedAt(state.getAttributeUpdatedAt());
        cmd.setAttributeActive(state.getAttributeActive());
        cmd.setAttributeDeleted(state.getAttributeDeleted());
            
        if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getReferenceId() == null) { cmd.setIsPropertyReferenceIdRemoved(true); }
        if (state.getVersion() == null) { cmd.setIsPropertyVersionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        if (state.getAttributeName() == null) { cmd.setIsPropertyAttributeNameRemoved(true); }
        if (state.getAttributeOrganizationId() == null) { cmd.setIsPropertyAttributeOrganizationIdRemoved(true); }
        if (state.getAttributeDescription() == null) { cmd.setIsPropertyAttributeDescriptionRemoved(true); }
        if (state.getAttributeIsMandatory() == null) { cmd.setIsPropertyAttributeIsMandatoryRemoved(true); }
        if (state.getAttributeIsInstanceAttribute() == null) { cmd.setIsPropertyAttributeIsInstanceAttributeRemoved(true); }
        if (state.getAttributeAttributeValueType() == null) { cmd.setIsPropertyAttributeAttributeValueTypeRemoved(true); }
        if (state.getAttributeAttributeValueLength() == null) { cmd.setIsPropertyAttributeAttributeValueLengthRemoved(true); }
        if (state.getAttributeIsList() == null) { cmd.setIsPropertyAttributeIsListRemoved(true); }
        if (state.getAttributeFieldName() == null) { cmd.setIsPropertyAttributeFieldNameRemoved(true); }
        if (state.getAttributeReferenceId() == null) { cmd.setIsPropertyAttributeReferenceIdRemoved(true); }
        if (state.getAttributeCreatedBy() == null) { cmd.setIsPropertyAttributeCreatedByRemoved(true); }
        if (state.getAttributeCreatedAt() == null) { cmd.setIsPropertyAttributeCreatedAtRemoved(true); }
        if (state.getAttributeUpdatedBy() == null) { cmd.setIsPropertyAttributeUpdatedByRemoved(true); }
        if (state.getAttributeUpdatedAt() == null) { cmd.setIsPropertyAttributeUpdatedAtRemoved(true); }
        if (state.getAttributeActive() == null) { cmd.setIsPropertyAttributeActiveRemoved(true); }
        if (state.getAttributeDeleted() == null) { cmd.setIsPropertyAttributeDeletedRemoved(true); }
        return cmd;
    }

    public TCreateAttributeValueMvo toCreateAttributeValueMvo(AttributeValueMvoState state) //where TCreateAttributeValueMvo : ICreateAttributeValueMvo, new()
    {
        TCreateAttributeValueMvo cmd = newCreateAttributeValueMvo();

        cmd.setAttributeVersion(state.getAttributeVersion());
        cmd.setAttributeValueId(state.getAttributeValueId());
        cmd.setName(state.getName());
        cmd.setDescription(state.getDescription());
        cmd.setReferenceId(state.getReferenceId());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setAttributeName(state.getAttributeName());
        cmd.setAttributeOrganizationId(state.getAttributeOrganizationId());
        cmd.setAttributeDescription(state.getAttributeDescription());
        cmd.setAttributeIsMandatory(state.getAttributeIsMandatory());
        cmd.setAttributeIsInstanceAttribute(state.getAttributeIsInstanceAttribute());
        cmd.setAttributeAttributeValueType(state.getAttributeAttributeValueType());
        cmd.setAttributeAttributeValueLength(state.getAttributeAttributeValueLength());
        cmd.setAttributeIsList(state.getAttributeIsList());
        cmd.setAttributeFieldName(state.getAttributeFieldName());
        cmd.setAttributeReferenceId(state.getAttributeReferenceId());
        cmd.setAttributeCreatedBy(state.getAttributeCreatedBy());
        cmd.setAttributeCreatedAt(state.getAttributeCreatedAt());
        cmd.setAttributeUpdatedBy(state.getAttributeUpdatedBy());
        cmd.setAttributeUpdatedAt(state.getAttributeUpdatedAt());
        cmd.setAttributeActive(state.getAttributeActive());
        cmd.setAttributeDeleted(state.getAttributeDeleted());
        return cmd;
    }

    protected abstract TCreateAttributeValueMvo newCreateAttributeValueMvo();

    protected abstract TMergePatchAttributeValueMvo newMergePatchAttributeValueMvo(); 

    protected abstract TDeleteAttributeValueMvo newDeleteAttributeValueMvo();

    public static class SimpleAttributeValueMvoStateCommandConverter extends AbstractAttributeValueMvoStateCommandConverter<AbstractAttributeValueMvoCommand.SimpleCreateAttributeValueMvo, AbstractAttributeValueMvoCommand.SimpleMergePatchAttributeValueMvo, AbstractAttributeValueMvoCommand.SimpleDeleteAttributeValueMvo>
    {
        @Override
        protected AbstractAttributeValueMvoCommand.SimpleCreateAttributeValueMvo newCreateAttributeValueMvo() {
            return new AbstractAttributeValueMvoCommand.SimpleCreateAttributeValueMvo();
        }

        @Override
        protected AbstractAttributeValueMvoCommand.SimpleMergePatchAttributeValueMvo newMergePatchAttributeValueMvo() {
            return new AbstractAttributeValueMvoCommand.SimpleMergePatchAttributeValueMvo();
        }

        @Override
        protected AbstractAttributeValueMvoCommand.SimpleDeleteAttributeValueMvo newDeleteAttributeValueMvo() {
            return new AbstractAttributeValueMvoCommand.SimpleDeleteAttributeValueMvo();
        }


    }

}

