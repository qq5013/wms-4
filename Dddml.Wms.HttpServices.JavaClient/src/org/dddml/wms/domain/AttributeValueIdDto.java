package org.dddml.wms.domain;


public class AttributeValueIdDto
{
	
    private AttributeValueId value;

    public AttributeValueIdDto()
    {
        this(new AttributeValueId());
    }

    public AttributeValueIdDto(AttributeValueId value)
    {
        this.value = value;
    }

    public AttributeValueId toAttributeValueId()
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


}

