package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeValueIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeId",
            "value",
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
	
    private AttributeValueId value;

    public AttributeValueIdFlattenedDto()
    {
        this(new AttributeValueId());
    }

    public AttributeValueIdFlattenedDto(AttributeValueId value)
    {
        this.value = value;
    }

    public AttributeValueId toAttributeValueId()
    {
        return this.value;
    }


    public String getAttributeId()
    {
        return this.value.getAttributeId();
    }

    public void setAttributeId(String attributeId)
    {
        this.value.setAttributeId(attributeId);
    }

    public String getValue()
    {
        return this.value.getValue();
    }

    public void setValue(String value)
    {
        this.value.setValue(value);
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

        AttributeValueIdFlattenedDto other = (AttributeValueIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

