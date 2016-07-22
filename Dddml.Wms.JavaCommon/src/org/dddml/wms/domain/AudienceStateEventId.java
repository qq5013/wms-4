package org.dddml.wms.domain;


public class AudienceStateEventId
{
    private String clientId;

    public String getClientId()
    {
        return this.clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
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

    AudienceStateEventId ()
    {
    }

    public AudienceStateEventId (String clientId, Long version)
    {
        this.clientId = clientId;
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

        AudienceStateEventId other = (AudienceStateEventId)obj;
        return true 
            && (clientId == other.clientId || (clientId != null && clientId.equals(other.clientId)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.clientId != null) {
            hash += 13 * this.clientId.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

