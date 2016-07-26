package org.dddml.wms.domain;

import java.io.Serializable;

public class AttributeValueMvoStateEventId implements Serializable
{
    private AttributeValueId attributeValueId = new AttributeValueId();

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

    public AttributeValueMvoStateEventId()
    {
    }

    public AttributeValueMvoStateEventId(AttributeValueId attributeValueId, Long attributeVersion)
    {
        this.attributeValueId = attributeValueId;
        this.attributeVersion = attributeVersion;
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

        AttributeValueMvoStateEventId other = (AttributeValueMvoStateEventId)obj;
        return true 
            && (attributeValueId == other.attributeValueId || (attributeValueId != null && attributeValueId.equals(other.attributeValueId)))
            && (attributeVersion == other.attributeVersion || (attributeVersion != null && attributeVersion.equals(other.attributeVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.attributeValueId != null) {
            hash += 13 * this.attributeValueId.hashCode();
        }
        if (this.attributeVersion != null) {
            hash += 13 * this.attributeVersion.hashCode();
        }
        return hash;
    }

}

