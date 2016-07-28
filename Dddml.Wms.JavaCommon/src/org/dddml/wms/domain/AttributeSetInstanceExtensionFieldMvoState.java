package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldMvoStateEvent.*;

public interface AttributeSetInstanceExtensionFieldMvoState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    AttributeSetInstanceExtensionFieldId getAttributeSetInstanceExtensionFieldId();

    void setAttributeSetInstanceExtensionFieldId(AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId);

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

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);

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

    Long getAttrSetInstEFGroupVersion();

    void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion);

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


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(AttributeSetInstanceExtensionFieldMvoStateCreated e);

    void when(AttributeSetInstanceExtensionFieldMvoStateMergePatched e);

    void when(AttributeSetInstanceExtensionFieldMvoStateDeleted e);
    
}

