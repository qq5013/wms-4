package org.dddml.wms.domain;


public class AttributeSetInstanceExtensionFieldIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "groupId",
            "index",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
        };
    }
	
    private AttributeSetInstanceExtensionFieldId value;

    public AttributeSetInstanceExtensionFieldIdFlattenedDto()
    {
        this(new AttributeSetInstanceExtensionFieldId());
    }

    public AttributeSetInstanceExtensionFieldIdFlattenedDto(AttributeSetInstanceExtensionFieldId value)
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

