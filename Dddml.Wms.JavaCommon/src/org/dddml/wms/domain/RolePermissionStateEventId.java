package org.dddml.wms.domain;


public class RolePermissionStateEventId
{
    private RolePermissionId id;

    public RolePermissionId getId()
    {
        return this.id;
    }

    public void setId(RolePermissionId id)
    {
        this.id = id;
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

    public String getIdRoleId()
    {
        return getId().getRoleId();
    }

    public void setIdRoleId(String idRoleId)
    {
        getId().setRoleId(idRoleId);
    }

    public String getIdPermissionId()
    {
        return getId().getPermissionId();
    }

    public void setIdPermissionId(String idPermissionId)
    {
        getId().setPermissionId(idPermissionId);
    }

    RolePermissionStateEventId ()
    {
    }

    public RolePermissionStateEventId (RolePermissionId id, Long version)
    {
        this.id = id;
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

        RolePermissionStateEventId other = (RolePermissionStateEventId)obj;
        return true 
            && (id == other.id || (id != null && id.equals(other.id)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.id != null) {
            hash += 13 * this.id.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

