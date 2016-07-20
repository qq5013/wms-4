package org.dddml.wms.domain;


public class AttributeValueId
{
    private String attributeId;

    public String getAttributeId()
    {
        return this.attributeId;
    }

    public void setAttributeId(String attributeId)
    {
        this.attributeId = attributeId;
    }

    private String value;

    public String getValue()
    {
        return this.value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    AttributeValueId ()
    {
    }

    public AttributeValueId (String attributeId, String value)
    {
        this.attributeId = attributeId;
        this.value = value;
    }

}

