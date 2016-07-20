package org.dddml.wms.domain;


public class AttributeUseMvoStateEventId
{
    private AttributeSetAttributeUseId attributeSetAttributeUseId;

    public AttributeSetAttributeUseId getAttributeSetAttributeUseId()
    {
        return this.attributeSetAttributeUseId;
    }

    public void setAttributeSetAttributeUseId(AttributeSetAttributeUseId attributeSetAttributeUseId)
    {
        this.attributeSetAttributeUseId = attributeSetAttributeUseId;
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

    public String getAttributeSetAttributeUseIdAttributeSetId()
    {
        return getAttributeSetAttributeUseId().getAttributeSetId();
    }

    public void setAttributeSetAttributeUseIdAttributeSetId(String attributeSetAttributeUseIdAttributeSetId)
    {
        getAttributeSetAttributeUseId().setAttributeSetId(attributeSetAttributeUseIdAttributeSetId);
    }

    public String getAttributeSetAttributeUseIdAttributeId()
    {
        return getAttributeSetAttributeUseId().getAttributeId();
    }

    public void setAttributeSetAttributeUseIdAttributeId(String attributeSetAttributeUseIdAttributeId)
    {
        getAttributeSetAttributeUseId().setAttributeId(attributeSetAttributeUseIdAttributeId);
    }

    AttributeUseMvoStateEventId ()
    {
    }

    public AttributeUseMvoStateEventId (AttributeSetAttributeUseId attributeSetAttributeUseId, Long attributeSetVersion)
    {
        this.attributeSetAttributeUseId = attributeSetAttributeUseId;
        this.attributeSetVersion = attributeSetVersion;
    }

}

