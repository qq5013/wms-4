package org.dddml.wms.domain;

import java.io.Serializable;

public class AttributeSetInstanceExtensionFieldId implements Serializable
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

    public AttributeSetInstanceExtensionFieldId()
    {
    }

    public AttributeSetInstanceExtensionFieldId(String groupId, String index)
    {
        this.groupId = groupId;
        this.index = index;
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

        AttributeSetInstanceExtensionFieldId other = (AttributeSetInstanceExtensionFieldId)obj;
        return true 
            && (groupId == other.groupId || (groupId != null && groupId.equals(other.groupId)))
            && (index == other.index || (index != null && index.equals(other.index)))
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
        return hash;
    }

}

