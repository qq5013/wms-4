package org.dddml.wms.domain;


public class AttributeValueMvoStateEventIdDto
{
	
    private AttributeValueMvoStateEventId value;

    public AttributeValueMvoStateEventIdDto()
    {
        this(new AttributeValueMvoStateEventId());
    }

    public AttributeValueMvoStateEventIdDto(AttributeValueMvoStateEventId value)
    {
        this.value = value;
    }

    public AttributeValueMvoStateEventId toAttributeValueMvoStateEventId()
    {
        return this.value;
    }

    public AttributeValueIdDto getAttributeValueId()
    {
        return new AttributeValueIdDto(this.value.getAttributeValueId());
    }

    public void setAttributeValueId(AttributeValueIdDto attributeValueId)
    {
        this.value.setAttributeValueId(attributeValueId.toAttributeValueId());
    }

    public Long getAttributeVersion()
    {
        return this.value.getAttributeVersion();
    }

    public void setAttributeVersion(Long attributeVersion)
    {
        this.value.setAttributeVersion(attributeVersion);
    }


}

