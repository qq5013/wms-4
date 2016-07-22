package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeUseStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeSetId",
            "attributeId",
            "attributeSetVersion",
        };

    public static final String[] propertyTypes = new String[]{
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
	
    private AttributeUseStateEventId value;

    public AttributeUseStateEventIdFlattenedDto()
    {
        this(new AttributeUseStateEventId());
    }

    public AttributeUseStateEventIdFlattenedDto(AttributeUseStateEventId value)
    {
        this.value = value;
    }

    public AttributeUseStateEventId toAttributeUseStateEventId()
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

    public Long getAttributeSetVersion()
    {
        return this.value.getAttributeSetVersion();
    }

    public void setAttributeSetVersion(Long attributeSetVersion)
    {
        this.value.setAttributeSetVersion(attributeSetVersion);
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

        AttributeUseStateEventIdFlattenedDto other = (AttributeUseStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

