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


}

