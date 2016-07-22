package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeId",
            "version",
        };

    public static final String[] propertyTypes = new String[]{
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
	
    private AttributeStateEventId value;

    public AttributeStateEventIdFlattenedDto()
    {
        this(new AttributeStateEventId());
    }

    public AttributeStateEventIdFlattenedDto(AttributeStateEventId value)
    {
        this.value = value;
    }

    public AttributeStateEventId toAttributeStateEventId()
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

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
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

        AttributeStateEventIdFlattenedDto other = (AttributeStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

