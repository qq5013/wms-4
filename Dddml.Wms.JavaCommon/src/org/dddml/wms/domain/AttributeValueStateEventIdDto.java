package org.dddml.wms.domain;


public class AttributeValueStateEventIdDto
{
	
    private AttributeValueStateEventId value;

    public AttributeValueStateEventIdDto()
    {
        this(new AttributeValueStateEventId());
    }

    public AttributeValueStateEventIdDto(AttributeValueStateEventId value)
    {
        this.value = value;
    }

    public AttributeValueStateEventId toAttributeValueStateEventId()
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

    public String getValue()
    {
        return this.value.getValue();
    }

    public void setValue(String value)
    {
        this.value.setValue(value);
    }

    public Long getAttributeVersion()
    {
        return this.value.getAttributeVersion();
    }

    public void setAttributeVersion(Long attributeVersion)
    {
        this.value.setAttributeVersion(attributeVersion);
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

        AttributeValueStateEventIdDto other = (AttributeValueStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

