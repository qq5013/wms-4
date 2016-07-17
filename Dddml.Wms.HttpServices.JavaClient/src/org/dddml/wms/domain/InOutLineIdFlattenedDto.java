package org.dddml.wms.domain;

import org.dddml.wms.domain.SkuIdDto;

public class InOutLineIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "inOutDocumentNumber",
            "skuIdProductId",
            "skuIdAttributeSetInstanceId",
        };

    private static String[] _propertyTypes = new String[]{
            "String",
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
	
    private InOutLineId value;

    public InOutLineIdFlattenedDto()
    {
        this(new InOutLineId());
    }

    public InOutLineIdFlattenedDto(InOutLineId value)
    {
        this.value = value;
    }

    public InOutLineId toInOutLineId()
    {
        return this.value;
    }



    public String getInOutDocumentNumber()
    {
        return this.value.getInOutDocumentNumber();
    }

    public void setInOutDocumentNumber(String inOutDocumentNumber)
    {
        this.value.setInOutDocumentNumber(inOutDocumentNumber);
    }


    public String getSkuIdProductId()
    {
        return this.value.getSkuId().getProductId();
    }

    public void setSkuIdProductId(String skuIdProductId)
    {
        this.value.getSkuId().setProductId(skuIdProductId);
    }


    public String getSkuIdAttributeSetInstanceId()
    {
        return this.value.getSkuId().getAttributeSetInstanceId();
    }

    public void setSkuIdAttributeSetInstanceId(String skuIdAttributeSetInstanceId)
    {
        this.value.getSkuId().setAttributeSetInstanceId(skuIdAttributeSetInstanceId);
    }


}

