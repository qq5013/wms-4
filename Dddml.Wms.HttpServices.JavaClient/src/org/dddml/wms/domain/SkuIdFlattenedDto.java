package org.dddml.wms.domain;


public class SkuIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "productId",
            "attributeSetInstanceId",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
        };
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

