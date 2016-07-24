package org.dddml.wms.domain;

import java.io.Serializable;

public class AttributeSetInstanceExtensionFieldStateEventId implements Serializable
{
    private String groupId;

    public String getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    private String index;

    public String getIndex()
    {
        return this.index;
    }

    public void setIndex(String index)
    {
        this.index = index;
    }

    private Long attributeSetInstanceExtensionFieldGroupVersion;

    public Long getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return this.attributeSetInstanceExtensionFieldGroupVersion;
    }

    public void setAttributeSetInstanceExtensionFieldGroupVersion(Long attributeSetInstanceExtensionFieldGroupVersion)
    {
        this.attributeSetInstanceExtensionFieldGroupVersion = attributeSetInstanceExtensionFieldGroupVersion;
    }

    AttributeSetInstanceExtensionFieldStateEventId ()
    {
    }

    public AttributeSetInstanceExtensionFieldStateEventId (String groupId, String index, Long attributeSetInstanceExtensionFieldGroupVersion)
    {
        this.groupId = groupId;
        this.index = index;
        this.attributeSetInstanceExtensionFieldGroupVersion = attributeSetInstanceExtensionFieldGroupVersion;
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

        AttributeSetInstanceExtensionFieldStateEventId other = (AttributeSetInstanceExtensionFieldStateEventId)obj;
        return true 
            && (groupId == other.groupId || (groupId != null && groupId.equals(other.groupId)))
            && (index == other.index || (index != null && index.equals(other.index)))
            && (attributeSetInstanceExtensionFieldGroupVersion == other.attributeSetInstanceExtensionFieldGroupVersion || (attributeSetInstanceExtensionFieldGroupVersion != null && attributeSetInstanceExtensionFieldGroupVersion.equals(other.attributeSetInstanceExtensionFieldGroupVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.groupId != null) {
            hash += 13 * this.groupId.hashCode();
        }
        if (this.index != null) {
            hash += 13 * this.index.hashCode();
        }
        if (this.attributeSetInstanceExtensionFieldGroupVersion != null) {
            hash += 13 * this.attributeSetInstanceExtensionFieldGroupVersion.hashCode();
        }
        return hash;
    }

}

