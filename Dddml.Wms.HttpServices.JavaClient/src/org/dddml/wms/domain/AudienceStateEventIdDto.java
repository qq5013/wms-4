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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        AudienceStateEventIdDto other = (AudienceStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

