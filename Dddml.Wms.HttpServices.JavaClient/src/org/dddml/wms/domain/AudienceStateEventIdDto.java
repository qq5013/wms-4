package org.dddml.wms.domain;


public class AudienceStateEventIdDto
{
	
    private AudienceStateEventId value;

    public AudienceStateEventIdDto()
    {
        this(new AudienceStateEventId());
    }

    public AudienceStateEventIdDto(AudienceStateEventId value)
    {
        this.value = value;
    }

    public AudienceStateEventId toAudienceStateEventId()
    {
        return this.value;
    }

    public String getClientId()
    {
        return this.value.getClientId();
    }

    public void setClientId(String clientId)
    {
        this.value.setClientId(clientId);
    }

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
    }


}

