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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        AttributeSetInstanceExtensionFieldStateEventIdDto other = (AttributeSetInstanceExtensionFieldStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

