package org.dddml.wms.domain;


public class InOutLineMvoStateEventIdDto
{
	
    private InOutLineMvoStateEventId value;

    public InOutLineMvoStateEventIdDto()
    {
        this(new InOutLineMvoStateEventId());
    }

    public InOutLineMvoStateEventIdDto(InOutLineMvoStateEventId value)
    {
        this.value = value;
    }

    public InOutLineMvoStateEventId toInOutLineMvoStateEventId()
    {
        return this.value;
    }

    public InOutLineIdDto getInOutLineId()
    {
        return new InOutLineIdDto(this.value.getInOutLineId());
    }

    public void setInOutLineId(InOutLineIdDto inOutLineId)
    {
        this.value.setInOutLineId(inOutLineId.toInOutLineId());
    }

    public Long getInOutVersion()
    {
        return this.value.getInOutVersion();
    }

    public void setInOutVersion(Long inOutVersion)
    {
        this.value.setInOutVersion(inOutVersion);
    }


}

