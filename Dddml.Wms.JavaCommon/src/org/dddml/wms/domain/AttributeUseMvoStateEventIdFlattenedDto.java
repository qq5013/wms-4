package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeUseMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeSetAttributeUseIdAttributeSetId",
            "attributeSetAttributeUseIdAttributeId",
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
	
    private AttributeUseMvoStateEventId value;

    public AttributeUseMvoStateEventIdFlattenedDto()
    {
        this(new AttributeUseMvoStateEventId());
    }

    public AttributeUseMvoStateEventIdFlattenedDto(AttributeUseMvoStateEventId value)
    {
        this.value = value;
    }

    public AttributeUseMvoStateEventId toAttributeUseMvoStateEventId()
    {
        return this.value;
    }


    public String getAttributeSetAttributeUseIdAttributeSetId()
    {
        return this.value.getAttributeSetAttributeUseId().getAttributeSetId();
    }

    public void setAttributeSetAttributeUseIdAttributeSetId(String attributeSetAttributeUseIdAttributeSetId)
    {
        this.value.getAttributeSetAttributeUseId().setAttributeSetId(attributeSetAttributeUseIdAttributeSetId);
    }

    public String getAttributeSetAttributeUseIdAttributeId()
    {
        return this.value.getAttributeSetAttributeUseId().getAttributeId();
    }

    public void setAttributeSetAttributeUseIdAttributeId(String attributeSetAttributeUseIdAttributeId)
    {
        this.value.getAttributeSetAttributeUseId().setAttributeId(attributeSetAttributeUseIdAttributeId);
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

        AttributeUseMvoStateEventIdFlattenedDto other = (AttributeUseMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

