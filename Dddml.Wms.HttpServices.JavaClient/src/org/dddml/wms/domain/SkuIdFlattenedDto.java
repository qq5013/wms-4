package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class SkuIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "productId",
            "attributeSetInstanceId",
        };

    public static final String[] propertyTypes = new String[]{
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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        SkuIdFlattenedDto other = (SkuIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

