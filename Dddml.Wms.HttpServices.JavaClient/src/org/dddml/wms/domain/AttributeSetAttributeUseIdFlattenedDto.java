package org.dddml.wms.domain;


public class AttributeSetAttributeUseIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "attributeSetId",
            "attributeId",
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
	
    private AttributeSetAttributeUseId value;

    public AttributeSetAttributeUseIdFlattenedDto()
    {
        this(new AttributeSetAttributeUseId());
    }

    public AttributeSetAttributeUseIdFlattenedDto(AttributeSetAttributeUseId value)
    {
        this.value = value;
    }

    public AttributeSetAttributeUseId toAttributeSetAttributeUseId()
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


}

