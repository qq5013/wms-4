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


}

