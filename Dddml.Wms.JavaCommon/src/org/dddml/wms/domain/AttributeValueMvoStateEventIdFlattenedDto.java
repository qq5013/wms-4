package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeValueMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeValueIdAttributeId",
            "attributeValueIdValue",
            "attributeVersion",
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
	
    private AttributeValueMvoStateEventId value;

    public AttributeValueMvoStateEventIdFlattenedDto()
    {
        this(new AttributeValueMvoStateEventId());
    }

    public AttributeValueMvoStateEventIdFlattenedDto(AttributeValueMvoStateEventId value)
    {
        this.value = value;
    }

    public AttributeValueMvoStateEventId toAttributeValueMvoStateEventId()
    {
        return this.value;
    }


    public String getAttributeValueIdAttributeId()
    {
        return this.value.getAttributeValueId().getAttributeId();
    }

    public void setAttributeValueIdAttributeId(String attributeValueIdAttributeId)
    {
        this.value.getAttributeValueId().setAttributeId(attributeValueIdAttributeId);
    }

    public String getAttributeValueIdValue()
    {
        return this.value.getAttributeValueId().getValue();
    }

    public void setAttributeValueIdValue(String attributeValueIdValue)
    {
        this.value.getAttributeValueId().setValue(attributeValueIdValue);
    }

    public Long getAttributeVersion()
    {
        return this.value.getAttributeVersion();
    }

    public void setAttributeVersion(Long attributeVersion)
    {
        this.value.setAttributeVersion(attributeVersion);
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

        AttributeValueMvoStateEventIdFlattenedDto other = (AttributeValueMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

