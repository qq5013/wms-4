package org.dddml.wms.domain;


public class AttributeValueIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "attributeId",
            "value",
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
	
    private AttributeValueId value;

    public AttributeValueIdFlattenedDto()
    {
        this(new AttributeValueId());
    }

    public AttributeValueIdFlattenedDto(AttributeValueId value)
    {
        this.value = value;
    }

    public AttributeValueId toAttributeValueId()
    {
        return this.value;
    }



    public String getAttributeId()
    {
        return this.value.getAttributeId();
    }

    public void setAttributeId(String attributeId)
    {
        this.value.setAttributeId(attributeId);
    }


    public String getValue()
    {
        return this.value.getValue();
    }

    public void setValue(String value)
    {
        this.value.setValue(value);
    }


}

