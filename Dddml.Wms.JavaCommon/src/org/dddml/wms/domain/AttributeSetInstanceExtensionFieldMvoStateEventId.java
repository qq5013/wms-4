package org.dddml.wms.domain;

import java.io.Serializable;

public class AttributeSetInstanceExtensionFieldMvoStateEventId implements Serializable
{
    private AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId = new AttributeSetInstanceExtensionFieldId();

    public AttributeSetInstanceExtensionFieldId getAttributeSetInstanceExtensionFieldId()
    {
        return this.attributeSetInstanceExtensionFieldId;
    }

    public void setAttributeSetInstanceExtensionFieldId(AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId)
    {
        this.attributeSetInstanceExtensionFieldId = attributeSetInstanceExtensionFieldId;
    }

    private Long attrSetInstEFGroupVersion;

    public Long getAttrSetInstEFGroupVersion()
    {
        return this.attrSetInstEFGroupVersion;
    }

    public void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion)
    {
        this.attrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
    }

    public String getAttributeSetInstanceExtensionFieldIdGroupId()
    {
        return getAttributeSetInstanceExtensionFieldId().getGroupId();
    }

    public void setAttributeSetInstanceExtensionFieldIdGroupId(String attributeSetInstanceExtensionFieldIdGroupId)
    {
        getAttributeSetInstanceExtensionFieldId().setGroupId(attributeSetInstanceExtensionFieldIdGroupId);
    }

    public String getAttributeSetInstanceExtensionFieldIdIndex()
    {
        return getAttributeSetInstanceExtensionFieldId().getIndex();
    }

    public void setAttributeSetInstanceExtensionFieldIdIndex(String attributeSetInstanceExtensionFieldIdIndex)
    {
        getAttributeSetInstanceExtensionFieldId().setIndex(attributeSetInstanceExtensionFieldIdIndex);
    }

    AttributeSetInstanceExtensionFieldMvoStateEventId ()
    {
    }

    public AttributeSetInstanceExtensionFieldMvoStateEventId (AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId, Long attrSetInstEFGroupVersion)
    {
        this.attributeSetInstanceExtensionFieldId = attributeSetInstanceExtensionFieldId;
        this.attrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
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

        AttributeSetInstanceExtensionFieldMvoStateEventId other = (AttributeSetInstanceExtensionFieldMvoStateEventId)obj;
        return true 
            && (attributeSetInstanceExtensionFieldId == other.attributeSetInstanceExtensionFieldId || (attributeSetInstanceExtensionFieldId != null && attributeSetInstanceExtensionFieldId.equals(other.attributeSetInstanceExtensionFieldId)))
            && (attrSetInstEFGroupVersion == other.attrSetInstEFGroupVersion || (attrSetInstEFGroupVersion != null && attrSetInstEFGroupVersion.equals(other.attrSetInstEFGroupVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.attributeSetInstanceExtensionFieldId != null) {
            hash += 13 * this.attributeSetInstanceExtensionFieldId.hashCode();
        }
        if (this.attrSetInstEFGroupVersion != null) {
            hash += 13 * this.attrSetInstEFGroupVersion.hashCode();
        }
        return hash;
    }

}

