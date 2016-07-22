package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class InOutLineStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "inOutDocumentNumber",
            "skuIdProductId",
            "skuIdAttributeSetInstanceId",
            "inOutVersion",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
            "String",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private InOutLineStateEventId value;

    public InOutLineStateEventIdFlattenedDto()
    {
        this(new InOutLineStateEventId());
    }

    public InOutLineStateEventIdFlattenedDto(InOutLineStateEventId value)
    {
        this.value = value;
    }

    public InOutLineStateEventId toInOutLineStateEventId()
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

    public Long getInOutVersion()
    {
        return this.value.getInOutVersion();
    }

    public void setInOutVersion(Long inOutVersion)
    {
        this.value.setInOutVersion(inOutVersion);
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

        InOutLineStateEventIdFlattenedDto other = (InOutLineStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

