package org.dddml.wms.domain;


public class AttributeSetInstanceExtensionFieldGroupStateEventIdDto
{
	
    private AttributeSetInstanceExtensionFieldGroupStateEventId value;

    public AttributeSetInstanceExtensionFieldGroupStateEventIdDto()
    {
        this(new AttributeSetInstanceExtensionFieldGroupStateEventId());
    }

    public AttributeSetInstanceExtensionFieldGroupStateEventIdDto(AttributeSetInstanceExtensionFieldGroupStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceExtensionFieldGroupStateEventId toAttributeSetInstanceExtensionFieldGroupStateEventId()
    {
        return this.value;
    }

    public String getId()
    {
        return this.value.getId();
    }

    public void setId(String id)
    {
        this.value.setId(id);
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

