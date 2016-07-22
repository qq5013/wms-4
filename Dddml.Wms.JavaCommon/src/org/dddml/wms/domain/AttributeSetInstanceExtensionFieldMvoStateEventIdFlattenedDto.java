package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeSetInstanceExtensionFieldIdGroupId",
            "attributeSetInstanceExtensionFieldIdIndex",
            "attrSetInstEFGroupVersion",
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
	
    private AttributeSetInstanceExtensionFieldMvoStateEventId value;

    public AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto()
    {
        this(new AttributeSetInstanceExtensionFieldMvoStateEventId());
    }

    public AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto(AttributeSetInstanceExtensionFieldMvoStateEventId value)
    {
        this.value = value;
    }

    public AttributeSetInstanceExtensionFieldMvoStateEventId toAttributeSetInstanceExtensionFieldMvoStateEventId()
    {
        return this.value;
    }


    public String getAttributeSetInstanceExtensionFieldIdGroupId()
    {
        return this.value.getAttributeSetInstanceExtensionFieldId().getGroupId();
    }

    public void setAttributeSetInstanceExtensionFieldIdGroupId(String attributeSetInstanceExtensionFieldIdGroupId)
    {
        this.value.getAttributeSetInstanceExtensionFieldId().setGroupId(attributeSetInstanceExtensionFieldIdGroupId);
    }

    public String getAttributeSetInstanceExtensionFieldIdIndex()
    {
        return this.value.getAttributeSetInstanceExtensionFieldId().getIndex();
    }

    public void setAttributeSetInstanceExtensionFieldIdIndex(String attributeSetInstanceExtensionFieldIdIndex)
    {
        this.value.getAttributeSetInstanceExtensionFieldId().setIndex(attributeSetInstanceExtensionFieldIdIndex);
    }

    public Long getAttrSetInstEFGroupVersion()
    {
        return this.value.getAttrSetInstEFGroupVersion();
    }

    public void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion)
    {
        this.value.setAttrSetInstEFGroupVersion(attrSetInstEFGroupVersion);
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

        AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto other = (AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

