package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeSetInstanceExtensionFieldMvoStateEvent extends Event
{

    AttributeSetInstanceExtensionFieldMvoStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getType();

    void setType(String type);

    Integer getLength();

    void setLength(Integer length);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getAttrSetInstEFGroupFieldType();

    void setAttrSetInstEFGroupFieldType(String attrSetInstEFGroupFieldType);

    Integer getAttrSetInstEFGroupFieldLength();

    void setAttrSetInstEFGroupFieldLength(Integer attrSetInstEFGroupFieldLength);

    Integer getAttrSetInstEFGroupFieldCount();

    void setAttrSetInstEFGroupFieldCount(Integer attrSetInstEFGroupFieldCount);

    String getAttrSetInstEFGroupNameFormat();

    void setAttrSetInstEFGroupNameFormat(String attrSetInstEFGroupNameFormat);

    String getAttrSetInstEFGroupDescription();

    void setAttrSetInstEFGroupDescription(String attrSetInstEFGroupDescription);

    String getAttrSetInstEFGroupCreatedBy();

    void setAttrSetInstEFGroupCreatedBy(String attrSetInstEFGroupCreatedBy);

    Date getAttrSetInstEFGroupCreatedAt();

    void setAttrSetInstEFGroupCreatedAt(Date attrSetInstEFGroupCreatedAt);

    String getAttrSetInstEFGroupUpdatedBy();

    void setAttrSetInstEFGroupUpdatedBy(String attrSetInstEFGroupUpdatedBy);

    Date getAttrSetInstEFGroupUpdatedAt();

    void setAttrSetInstEFGroupUpdatedAt(Date attrSetInstEFGroupUpdatedAt);

    Boolean getAttrSetInstEFGroupActive();

    void setAttrSetInstEFGroupActive(Boolean attrSetInstEFGroupActive);

    Boolean getAttrSetInstEFGroupDeleted();

    void setAttrSetInstEFGroupDeleted(Boolean attrSetInstEFGroupDeleted);

    

    interface AttributeSetInstanceExtensionFieldMvoStateCreated extends AttributeSetInstanceExtensionFieldMvoStateEvent
    {
    
    }


    interface AttributeSetInstanceExtensionFieldMvoStateMergePatched extends AttributeSetInstanceExtensionFieldMvoStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyTypeRemoved();

        void setPropertyTypeRemoved(Boolean removed);

        Boolean isPropertyLengthRemoved();

        void setPropertyLengthRemoved(Boolean removed);

        Boolean isPropertyAliasRemoved();

        void setPropertyAliasRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupFieldTypeRemoved();

        void setPropertyAttrSetInstEFGroupFieldTypeRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupFieldLengthRemoved();

        void setPropertyAttrSetInstEFGroupFieldLengthRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupFieldCountRemoved();

        void setPropertyAttrSetInstEFGroupFieldCountRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupNameFormatRemoved();

        void setPropertyAttrSetInstEFGroupNameFormatRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupDescriptionRemoved();

        void setPropertyAttrSetInstEFGroupDescriptionRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupCreatedByRemoved();

        void setPropertyAttrSetInstEFGroupCreatedByRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupCreatedAtRemoved();

        void setPropertyAttrSetInstEFGroupCreatedAtRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupUpdatedByRemoved();

        void setPropertyAttrSetInstEFGroupUpdatedByRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupUpdatedAtRemoved();

        void setPropertyAttrSetInstEFGroupUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupActiveRemoved();

        void setPropertyAttrSetInstEFGroupActiveRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupDeletedRemoved();

        void setPropertyAttrSetInstEFGroupDeletedRemoved(Boolean removed);


    }

    interface AttributeSetInstanceExtensionFieldMvoStateDeleted extends AttributeSetInstanceExtensionFieldMvoStateEvent
    {
    }


}

