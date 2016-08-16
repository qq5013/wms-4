package org.dddml.wms.domain;


public class DayPlanMvoStateEventIdDto
{
	
    private DayPlanMvoStateEventId value;

    public DayPlanMvoStateEventIdDto()
    {
        this(new DayPlanMvoStateEventId());
    }

    public DayPlanMvoStateEventIdDto(DayPlanMvoStateEventId value)
    {
        this.value = value;
    }

    public DayPlanMvoStateEventId toDayPlanMvoStateEventId()
    {
        return this.value;
    }

    public DayPlanIdDto getDayPlanId()
    {
        return new DayPlanIdDto(this.value.getDayPlanId());
    }

    public void setDayPlanId(DayPlanIdDto dayPlanId)
    {
        this.value.setDayPlanId(dayPlanId.toDayPlanId());
    }

    public Long getPersonVersion()
    {
        return this.value.getPersonVersion();
    }

    public void setPersonVersion(Long personVersion)
    {
        this.value.setPersonVersion(personVersion);
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

        DayPlanMvoStateEventIdDto other = (DayPlanMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

