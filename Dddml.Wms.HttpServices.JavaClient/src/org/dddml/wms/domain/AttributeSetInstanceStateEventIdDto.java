package org.dddml.wms.domain;


public class AttributeSetInstanceStateEventIdDto
{
	
    private AttributeSetInstanceStateEventId value;

    public AttributeSetInstanceStateEventIdDto()
    {
        this(new AttributeSetInstanceStateEventId());
    }

    public AttributeSetInstanceStateEventIdDto(AttributeSetInstanceStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceStateEventId toAttributeSetInstanceStateEventId()
    {
        return this.value;
    }

    public String getAttributeSetInstanceId()
    {
        return this.value.getAttributeSetInstanceId();
    }

    public void setAttributeSetInstanceId(String attributeSetInstanceId)
    {
        this.value.setAttributeSetInstanceId(attributeSetInstanceId);
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

