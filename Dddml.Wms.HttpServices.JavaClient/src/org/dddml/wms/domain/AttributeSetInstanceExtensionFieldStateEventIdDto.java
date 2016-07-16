package org.dddml.wms.domain;


public class AttributeSetInstanceExtensionFieldStateEventIdDto
{
	
    private AttributeSetInstanceExtensionFieldStateEventId value;

    public AttributeSetInstanceExtensionFieldStateEventIdDto()
    {
        this(new AttributeSetInstanceExtensionFieldStateEventId());
    }

    public AttributeSetInstanceExtensionFieldStateEventIdDto(AttributeSetInstanceExtensionFieldStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceExtensionFieldStateEventId toAttributeSetInstanceExtensionFieldStateEventId()
    {
        return this.value;
    }

    public String getGroupId()
    {
        return this.value.getGroupId();
    }

    public void setGroupId(String groupId)
    {
        this.value.setGroupId(groupId);
    }

    public String getIndex()
    {
        return this.value.getIndex();
    }

    public void setIndex(String index)
    {
        this.value.setIndex(index);
    }

    public Long getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return this.value.getAttributeSetInstanceExtensionFieldGroupVersion();
    }

    public void setAttributeSetInstanceExtensionFieldGroupVersion(Long attributeSetInstanceExtensionFieldGroupVersion)
    {
        this.value.setAttributeSetInstanceExtensionFieldGroupVersion(attributeSetInstanceExtensionFieldGroupVersion);
    }


}

