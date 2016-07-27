package org.dddml.wms.domain;

import java.io.Serializable;

public class AttributeSetStateEventId implements Serializable
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

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    public AttributeSetStateEventId()
    {
    }

    public AttributeSetStateEventId(String attributeSetId, Long version)
    {
        this.attributeSetId = attributeSetId;
        this.version = version;
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

        AttributeSetStateEventId other = (AttributeSetStateEventId)obj;
        return true 
            && (attributeSetId == other.attributeSetId || (attributeSetId != null && attributeSetId.equals(other.attributeSetId)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.attributeSetId != null) {
            hash += 13 * this.attributeSetId.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

