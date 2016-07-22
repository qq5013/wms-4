package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class InOutLineMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "inOutLineIdInOutDocumentNumber",
            "inOutLineIdSkuIdProductId",
            "inOutLineIdSkuIdAttributeSetInstanceId",
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
	
    private InOutLineMvoStateEventId value;

    public InOutLineMvoStateEventIdFlattenedDto()
    {
        this(new InOutLineMvoStateEventId());
    }

    public InOutLineMvoStateEventIdFlattenedDto(InOutLineMvoStateEventId value)
    {
        this.value = value;
    }

    public InOutLineMvoStateEventId toInOutLineMvoStateEventId()
    {
        return this.value;
    }


    public String getInOutLineIdInOutDocumentNumber()
    {
        return this.value.getInOutLineId().getInOutDocumentNumber();
    }

    public void setInOutLineIdInOutDocumentNumber(String inOutLineIdInOutDocumentNumber)
    {
        this.value.getInOutLineId().setInOutDocumentNumber(inOutLineIdInOutDocumentNumber);
    }

    public String getInOutLineIdSkuIdProductId()
    {
        return this.value.getInOutLineId().getSkuId().getProductId();
    }

    public void setInOutLineIdSkuIdProductId(String inOutLineIdSkuIdProductId)
    {
        this.value.getInOutLineId().getSkuId().setProductId(inOutLineIdSkuIdProductId);
    }

    public String getInOutLineIdSkuIdAttributeSetInstanceId()
    {
        return this.value.getInOutLineId().getSkuId().getAttributeSetInstanceId();
    }

    public void setInOutLineIdSkuIdAttributeSetInstanceId(String inOutLineIdSkuIdAttributeSetInstanceId)
    {
        this.value.getInOutLineId().getSkuId().setAttributeSetInstanceId(inOutLineIdSkuIdAttributeSetInstanceId);
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

        InOutLineMvoStateEventIdFlattenedDto other = (InOutLineMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

