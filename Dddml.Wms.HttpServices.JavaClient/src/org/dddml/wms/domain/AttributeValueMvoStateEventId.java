package org.dddml.wms.domain;


public class AttributeValueMvoStateEventId
{
    private AttributeValueId attributeValueId;

    public AttributeValueId getAttributeValueId()
    {
        return this.attributeValueId;
    }

    public void setAttributeValueId(AttributeValueId attributeValueId)
    {
        this.attributeValueId = attributeValueId;
    }

    private Long attributeVersion;

    public Long getAttributeVersion()
    {
        return this.attributeVersion;
    }

    public void setAttributeVersion(Long attributeVersion)
    {
        this.attributeVersion = attributeVersion;
    }

    public String getAttributeValueIdAttributeId()
    {
        return getAttributeValueId().getAttributeId();
    }

    public void setAttributeValueIdAttributeId(String attributeValueIdAttributeId)
    {
        getAttributeValueId().setAttributeId(attributeValueIdAttributeId);
    }

    public String getAttributeValueIdValue()
    {
        return getAttributeValueId().getValue();
    }

    public void setAttributeValueIdValue(String attributeValueIdValue)
    {
        getAttributeValueId().setValue(attributeValueIdValue);
    }

    AttributeValueMvoStateEventId ()
    {
    }

    public AttributeValueMvoStateEventId (AttributeValueId attributeValueId, Long attributeVersion)
    {
        this.attributeValueId = attributeValueId;
        this.attributeVersion = attributeVersion;
    }

}

