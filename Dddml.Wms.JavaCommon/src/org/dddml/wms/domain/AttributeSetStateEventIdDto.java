package org.dddml.wms.domain;


public class AttributeSetStateEventIdDto
{
	
    private AttributeSetStateEventId value;

    public AttributeSetStateEventIdDto()
    {
        this(new AttributeSetStateEventId());
    }

    public AttributeSetStateEventIdDto(AttributeSetStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetStateEventId toAttributeSetStateEventId()
    {
        return this.value;
    }

    public String getAttributeSetId()
    {
        return this.value.getAttributeSetId();
    }

    public void setAttributeSetId(String attributeSetId)
    {
        this.value.setAttributeSetId(attributeSetId);
    }

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
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

        AttributeSetStateEventIdDto other = (AttributeSetStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

