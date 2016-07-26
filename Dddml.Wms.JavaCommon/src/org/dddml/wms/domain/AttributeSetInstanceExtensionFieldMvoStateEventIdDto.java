package org.dddml.wms.domain;


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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        AttributeSetInstanceExtensionFieldMvoStateEventIdDto other = (AttributeSetInstanceExtensionFieldMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

