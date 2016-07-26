package org.dddml.wms.domain;

import java.io.Serializable;

public class AttributeSetAttributeUseId implements Serializable
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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        AttributeSetAttributeUseId other = (AttributeSetAttributeUseId)obj;
        return true 
            && (attributeSetId == other.attributeSetId || (attributeSetId != null && attributeSetId.equals(other.attributeSetId)))
            && (attributeId == other.attributeId || (attributeId != null && attributeId.equals(other.attributeId)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.attributeSetId != null) {
            hash += 13 * this.attributeSetId.hashCode();
        }
        if (this.attributeId != null) {
            hash += 13 * this.attributeId.hashCode();
        }
        return hash;
    }

}

