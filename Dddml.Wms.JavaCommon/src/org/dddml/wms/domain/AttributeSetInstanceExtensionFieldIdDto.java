package org.dddml.wms.domain;


public class AttributeSetInstanceExtensionFieldIdDto
{
	
    private AttributeSetInstanceExtensionFieldId value;

    public AttributeSetInstanceExtensionFieldIdDto()
    {
        this(new AttributeSetInstanceExtensionFieldId());
    }

    public AttributeSetInstanceExtensionFieldIdDto(AttributeSetInstanceExtensionFieldId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceExtensionFieldId toAttributeSetInstanceExtensionFieldId()
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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        AttributeSetInstanceExtensionFieldIdDto other = (AttributeSetInstanceExtensionFieldIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

