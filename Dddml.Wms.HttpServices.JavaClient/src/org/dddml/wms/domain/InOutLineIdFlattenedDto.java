package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class InOutLineIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "inOutDocumentNumber",
            "skuIdProductId",
            "skuIdAttributeSetInstanceId",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
            "String",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        InOutLineIdFlattenedDto other = (InOutLineIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

