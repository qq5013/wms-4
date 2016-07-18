package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldId;

public class AttributeSetInstanceExtensionFieldMvoStateEventId
{
    private AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId;

    public AttributeSetInstanceExtensionFieldId getAttributeSetInstanceExtensionFieldId()
    {
        return this.attributeSetInstanceExtensionFieldId;
    }

    public void setAttributeSetInstanceExtensionFieldId(AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId)
    {
        this.attributeSetInstanceExtensionFieldId = attributeSetInstanceExtensionFieldId;
    }

    private Long attrSetInstEFGroupVersion;

    public Long getAttrSetInstEFGroupVersion()
    {
        return this.attrSetInstEFGroupVersion;
    }

    public void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion)
    {
        this.attrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
    }

    public String getAttributeSetInstanceExtensionFieldIdGroupId()
    {
        return getAttributeSetInstanceExtensionFieldId().getGroupId();
    }

    public void setAttributeSetInstanceExtensionFieldIdGroupId(String attributeSetInstanceExtensionFieldIdGroupId)
    {
        getAttributeSetInstanceExtensionFieldId().setGroupId(attributeSetInstanceExtensionFieldIdGroupId);
    }

    public String getAttributeSetInstanceExtensionFieldIdIndex()
    {
        return getAttributeSetInstanceExtensionFieldId().getIndex();
    }

    public void setAttributeSetInstanceExtensionFieldIdIndex(String attributeSetInstanceExtensionFieldIdIndex)
    {
        getAttributeSetInstanceExtensionFieldId().setIndex(attributeSetInstanceExtensionFieldIdIndex);
    }


}

