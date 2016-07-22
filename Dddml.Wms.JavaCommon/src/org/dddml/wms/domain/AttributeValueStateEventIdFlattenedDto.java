package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeValueStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeId",
            "value",
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
	
    private AttributeValueStateEventId value;

    public AttributeValueStateEventIdFlattenedDto()
    {
        this(new AttributeValueStateEventId());
    }

    public AttributeValueStateEventIdFlattenedDto(AttributeValueStateEventId value)
    {
        this.value = value;
    }

    public AttributeValueStateEventId toAttributeValueStateEventId()
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

        AttributeValueStateEventIdFlattenedDto other = (AttributeValueStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

