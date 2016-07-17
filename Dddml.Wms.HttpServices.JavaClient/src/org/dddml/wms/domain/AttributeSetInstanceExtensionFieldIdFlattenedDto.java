package org.dddml.wms.domain;


public class AttributeSetInstanceExtensionFieldIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "groupId",
            "index",
        };

    private static String[] _propertyTypes = new String[]{
            "String",
            "String",
        };

    public static String[] getPropertyNames()
    {
        return _propertyNames;
    }

    public static String[] getPropertyTypes()
    {
        return _propertyTypes;
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

