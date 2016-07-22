package org.dddml.wms.domain;


public class AttributeUseMvoStateEventIdDto
{
	
    private AttributeUseMvoStateEventId value;

    public AttributeUseMvoStateEventIdDto()
    {
        this(new AttributeUseMvoStateEventId());
    }

    public AttributeUseMvoStateEventIdDto(AttributeUseMvoStateEventId value)
    {
        this.value = value;
    }

    public AttributeUseMvoStateEventId toAttributeUseMvoStateEventId()
    {
        return this.value;
    }

    public AttributeSetAttributeUseIdDto getAttributeSetAttributeUseId()
    {
        return new AttributeSetAttributeUseIdDto(this.value.getAttributeSetAttributeUseId());
    }

    public void setAttributeSetAttributeUseId(AttributeSetAttributeUseIdDto attributeSetAttributeUseId)
    {
        this.value.setAttributeSetAttributeUseId(attributeSetAttributeUseId.toAttributeSetAttributeUseId());
    }

    public Long getAttributeSetVersion()
    {
        return this.value.getAttributeSetVersion();
    }

    public void setAttributeSetVersion(Long attributeSetVersion)
    {
        this.value.setAttributeSetVersion(attributeSetVersion);
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

        AttributeUseMvoStateEventIdDto other = (AttributeUseMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

