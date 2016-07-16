package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldIdDto;

public class AttributeSetInstanceExtensionFieldMvoStateEventIdDto
{
	
    private AttributeSetInstanceExtensionFieldMvoStateEventId value;

    public AttributeSetInstanceExtensionFieldMvoStateEventIdDto()
    {
        this(new AttributeSetInstanceExtensionFieldMvoStateEventId());
    }

    public AttributeSetInstanceExtensionFieldMvoStateEventIdDto(AttributeSetInstanceExtensionFieldMvoStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceExtensionFieldMvoStateEventId toAttributeSetInstanceExtensionFieldMvoStateEventId()
    {
        return this.value;
    }

    public AttributeSetInstanceExtensionFieldIdDto getAttributeSetInstanceExtensionFieldId()
    {
        return new AttributeSetInstanceExtensionFieldIdDto(this.value.getAttributeSetInstanceExtensionFieldId());
    }

    public void setAttributeSetInstanceExtensionFieldId(AttributeSetInstanceExtensionFieldIdDto attributeSetInstanceExtensionFieldId)
    {
        this.value.setAttributeSetInstanceExtensionFieldId(attributeSetInstanceExtensionFieldId.toAttributeSetInstanceExtensionFieldId());
    }

    public Long getAttrSetInstEfGroupVersion()
    {
        return this.value.getAttrSetInstEfGroupVersion();
    }

    public void setAttrSetInstEfGroupVersion(Long attrSetInstEfGroupVersion)
    {
        this.value.setAttrSetInstEfGroupVersion(attrSetInstEfGroupVersion);
    }


}

