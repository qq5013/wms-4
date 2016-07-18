package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AttributeSetAttributeUseIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "attributeSetId",
            "attributeId",
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
	
    private AttributeSetAttributeUseId value;

    public AttributeSetAttributeUseIdFlattenedDto()
    {
        this(new AttributeSetAttributeUseId());
    }

    public AttributeSetAttributeUseIdFlattenedDto(AttributeSetAttributeUseId value)
    {
        this.value = value;
    }

    public AttributeSetAttributeUseId toAttributeSetAttributeUseId()
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


}

