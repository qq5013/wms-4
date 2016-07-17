package org.dddml.wms.domain;


public class SkuIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "productId",
            "attributeSetInstanceId",
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
	
    private SkuId value;

    public SkuIdFlattenedDto()
    {
        this(new SkuId());
    }

    public SkuIdFlattenedDto(SkuId value)
    {
        this.value = value;
    }

    public SkuId toSkuId()
    {
        return this.value;
    }



    public String getProductId()
    {
        return this.value.getProductId();
    }

    public void setProductId(String productId)
    {
        this.value.setProductId(productId);
    }


    public String getAttributeSetInstanceId()
    {
        return this.value.getAttributeSetInstanceId();
    }

    public void setAttributeSetInstanceId(String attributeSetInstanceId)
    {
        this.value.setAttributeSetInstanceId(attributeSetInstanceId);
    }


}

