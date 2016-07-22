package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "groupId",
            "index",
            "attributeSetInstanceExtensionFieldGroupVersion",
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
	
    private AttributeSetInstanceExtensionFieldStateEventId value;

    public AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto()
    {
        this(new AttributeSetInstanceExtensionFieldStateEventId());
    }

    public AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto(AttributeSetInstanceExtensionFieldStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceExtensionFieldStateEventId toAttributeSetInstanceExtensionFieldStateEventId()
    {
        return this.value;
    }


    public String getGroupId()
    {
        return this.value.getGroupId();
    }

    public void setGroupId(String groupId)
    {
        this.value.setGroupId(groupId);
    }

    public String getIndex()
    {
        return this.value.getIndex();
    }

    public void setIndex(String index)
    {
        this.value.setIndex(index);
    }

    public Long getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return this.value.getAttributeSetInstanceExtensionFieldGroupVersion();
    }

    public void setAttributeSetInstanceExtensionFieldGroupVersion(Long attributeSetInstanceExtensionFieldGroupVersion)
    {
        this.value.setAttributeSetInstanceExtensionFieldGroupVersion(attributeSetInstanceExtensionFieldGroupVersion);
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

        AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto other = (AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

