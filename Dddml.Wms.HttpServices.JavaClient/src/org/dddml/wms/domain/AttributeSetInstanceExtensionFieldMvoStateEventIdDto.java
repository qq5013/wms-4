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

    public Long getAttrSetInstEFGroupVersion()
    {
        return this.value.getAttrSetInstEFGroupVersion();
    }

    public void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion)
    {
        this.value.setAttrSetInstEFGroupVersion(attrSetInstEFGroupVersion);
    }


}

