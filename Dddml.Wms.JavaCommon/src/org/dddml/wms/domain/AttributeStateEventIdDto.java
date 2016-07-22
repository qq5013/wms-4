package org.dddml.wms.domain;


public class AttributeStateEventIdDto
{
	
    private AttributeStateEventId value;

    public AttributeStateEventIdDto()
    {
        this(new AttributeStateEventId());
    }

    public AttributeStateEventIdDto(AttributeStateEventId value)
    {
        this.value = value;
    }

    public AttributeStateEventId toAttributeStateEventId()
    {
        return this.value;
    }

    public String getAttributeId()
    {
        return this.value.getAttributeId();
    }

    public void setAttributeId(String attributeId)
    {
        this.value.setAttributeId(attributeId);
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

        AttributeStateEventIdDto other = (AttributeStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

