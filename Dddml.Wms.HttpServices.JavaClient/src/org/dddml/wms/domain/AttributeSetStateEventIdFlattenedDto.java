package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeSetStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeSetId",
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
	
    private AttributeSetStateEventId value;

    public AttributeSetStateEventIdFlattenedDto()
    {
        this(new AttributeSetStateEventId());
    }

    public AttributeSetStateEventIdFlattenedDto(AttributeSetStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetStateEventId toAttributeSetStateEventId()
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

        AttributeSetStateEventIdFlattenedDto other = (AttributeSetStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

