package org.dddml.wms.domain;


public class AttributeUseStateEventIdDto
{
	
    private AttributeUseStateEventId value;

    public AttributeUseStateEventIdDto()
    {
        this(new AttributeUseStateEventId());
    }

    public AttributeUseStateEventIdDto(AttributeUseStateEventId value)
    {
        this.value = value;
    }

    public AttributeUseStateEventId toAttributeUseStateEventId()
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

    public String getAttributeId()
    {
        return this.value.getAttributeId();
    }

    public void setAttributeId(String attributeId)
    {
        this.value.setAttributeId(attributeId);
    }

    public Long getAttributeSetVersion()
    {
        return this.value.getAttributeSetVersion();
    }

    public void setAttributeSetVersion(Long attributeSetVersion)
    {
        this.value.setAttributeSetVersion(attributeSetVersion);
    }


}

