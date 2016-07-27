package org.dddml.wms.domain;

import java.io.Serializable;

public class AttributeUseMvoStateEventId implements Serializable
{
    private AttributeSetAttributeUseId attributeSetAttributeUseId = new AttributeSetAttributeUseId();

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

    public AttributeUseMvoStateEventId()
    {
    }

    public AttributeUseMvoStateEventId(AttributeSetAttributeUseId attributeSetAttributeUseId, Long attributeSetVersion)
    {
        this.attributeSetAttributeUseId = attributeSetAttributeUseId;
        this.attributeSetVersion = attributeSetVersion;
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

        AttributeUseMvoStateEventId other = (AttributeUseMvoStateEventId)obj;
        return true 
            && (attributeSetAttributeUseId == other.attributeSetAttributeUseId || (attributeSetAttributeUseId != null && attributeSetAttributeUseId.equals(other.attributeSetAttributeUseId)))
            && (attributeSetVersion == other.attributeSetVersion || (attributeSetVersion != null && attributeSetVersion.equals(other.attributeSetVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.attributeSetAttributeUseId != null) {
            hash += 13 * this.attributeSetAttributeUseId.hashCode();
        }
        if (this.attributeSetVersion != null) {
            hash += 13 * this.attributeSetVersion.hashCode();
        }
        return hash;
    }

}

