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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

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
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyTypeRemoved();

        void setIsPropertyTypeRemoved(Boolean removed);

        Boolean getIsPropertyLengthRemoved();

        void setIsPropertyLengthRemoved(Boolean removed);

        Boolean getIsPropertyAliasRemoved();

        void setIsPropertyAliasRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyVersionRemoved();

        void setIsPropertyVersionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupFieldTypeRemoved();

        void setIsPropertyAttrSetInstEFGroupFieldTypeRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupFieldLengthRemoved();

        void setIsPropertyAttrSetInstEFGroupFieldLengthRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupFieldCountRemoved();

        void setIsPropertyAttrSetInstEFGroupFieldCountRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupNameFormatRemoved();

        void setIsPropertyAttrSetInstEFGroupNameFormatRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupDescriptionRemoved();

        void setIsPropertyAttrSetInstEFGroupDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupCreatedByRemoved();

        void setIsPropertyAttrSetInstEFGroupCreatedByRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupCreatedAtRemoved();

        void setIsPropertyAttrSetInstEFGroupCreatedAtRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupUpdatedByRemoved();

        void setIsPropertyAttrSetInstEFGroupUpdatedByRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupUpdatedAtRemoved();

        void setIsPropertyAttrSetInstEFGroupUpdatedAtRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupActiveRemoved();

        void setIsPropertyAttrSetInstEFGroupActiveRemoved(Boolean removed);

        Boolean getIsPropertyAttrSetInstEFGroupDeletedRemoved();

        void setIsPropertyAttrSetInstEFGroupDeletedRemoved(Boolean removed);


    }

    interface AttributeSetInstanceExtensionFieldMvoStateDeleted extends AttributeSetInstanceExtensionFieldMvoStateEvent
    {
    }


}

