package org.dddml.wms.domain;


public class AttributeSetAttributeUseIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "attributeSetId",
            "attributeId",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
        };
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

