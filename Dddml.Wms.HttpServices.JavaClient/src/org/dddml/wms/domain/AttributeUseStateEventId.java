package org.dddml.wms.domain;


public class AttributeUseStateEventId
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

    private Long attributeSetVersion;

    public Long getAttributeSetVersion()
    {
        return this.attributeSetVersion;
    }

    public void setAttributeSetVersion(Long attributeSetVersion)
    {
        this.attributeSetVersion = attributeSetVersion;
    }

    AttributeUseStateEventId ()
    {
    }

    public AttributeUseStateEventId (String attributeSetId, String attributeId, Long attributeSetVersion)
    {
        this.attributeSetId = attributeSetId;
        this.attributeId = attributeId;
        this.attributeSetVersion = attributeSetVersion;
    }

}

