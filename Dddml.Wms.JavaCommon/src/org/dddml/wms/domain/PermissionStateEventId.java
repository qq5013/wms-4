package org.dddml.wms.domain;

import java.io.Serializable;

public class PermissionStateEventId implements Serializable
{
    private String permissionId;

    public String getPermissionId()
    {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId)
    {
        this.permissionId = permissionId;
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

    PermissionStateEventId ()
    {
    }

    public PermissionStateEventId (String permissionId, Long version)
    {
        this.permissionId = permissionId;
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

        PermissionStateEventId other = (PermissionStateEventId)obj;
        return true 
            && (permissionId == other.permissionId || (permissionId != null && permissionId.equals(other.permissionId)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.permissionId != null) {
            hash += 13 * this.permissionId.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

