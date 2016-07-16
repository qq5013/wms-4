package org.dddml.wms.domain;


public class LocatorStateEventIdDto
{
	
    private LocatorStateEventId value;

    public LocatorStateEventIdDto()
    {
        this(new LocatorStateEventId());
    }

    public LocatorStateEventIdDto(LocatorStateEventId value)
    {
        this.value = value;
    }

    public LocatorStateEventId toLocatorStateEventId()
    {
        return this.value;
    }

    public String getLocatorId()
    {
        return this.value.getLocatorId();
    }

    public void setLocatorId(String locatorId)
    {
        this.value.setLocatorId(locatorId);
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

