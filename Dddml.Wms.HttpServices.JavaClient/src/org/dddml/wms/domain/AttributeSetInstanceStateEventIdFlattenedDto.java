package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeSetInstanceStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeSetInstanceId",
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
	
    private AttributeSetInstanceStateEventId value;

    public AttributeSetInstanceStateEventIdFlattenedDto()
    {
        this(new AttributeSetInstanceStateEventId());
    }

    public AttributeSetInstanceStateEventIdFlattenedDto(AttributeSetInstanceStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceStateEventId toAttributeSetInstanceStateEventId()
    {
        return this.value;
    }


    public String getAttributeSetInstanceId()
    {
        return this.value.getAttributeSetInstanceId();
    }

    public void setAttributeSetInstanceId(String attributeSetInstanceId)
    {
        this.value.setAttributeSetInstanceId(attributeSetInstanceId);
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

        AttributeSetInstanceStateEventIdFlattenedDto other = (AttributeSetInstanceStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

