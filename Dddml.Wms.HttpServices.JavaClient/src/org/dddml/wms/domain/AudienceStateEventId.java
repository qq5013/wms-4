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

}

