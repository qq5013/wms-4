package org.dddml.wms.domain;

import java.io.Serializable;

public class LocatorStateEventId implements Serializable
{
    private String locatorId;

    public String getLocatorId()
    {
        return this.locatorId;
    }

    public void setLocatorId(String locatorId)
    {
        this.locatorId = locatorId;
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

    public LocatorStateEventId()
    {
    }

    public LocatorStateEventId(String locatorId, Long version)
    {
        this.locatorId = locatorId;
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

        LocatorStateEventId other = (LocatorStateEventId)obj;
        return true 
            && (locatorId == other.locatorId || (locatorId != null && locatorId.equals(other.locatorId)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.locatorId != null) {
            hash += 13 * this.locatorId.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

