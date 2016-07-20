package org.dddml.wms.domain;


public class AttributeSetAttributeUseId
{
    private String attributeSetId;

    public String getAttributeSetId()
    {
        return this.attributeSetId;
    }

    public void setAttributeSetId(String attributeSetId)
    {
        this.attributeSetId = attributeSetId;
    }

    private String attributeId;

    public String getAttributeId()
    {
        return this.attributeId;
    }

    public void setAttributeId(String attributeId)
    {
        this.attributeId = attributeId;
    }

    AttributeSetAttributeUseId ()
    {
    }

    public AttributeSetAttributeUseId (String attributeSetId, String attributeId)
    {
        this.attributeSetId = attributeSetId;
        this.attributeId = attributeId;
    }

}

