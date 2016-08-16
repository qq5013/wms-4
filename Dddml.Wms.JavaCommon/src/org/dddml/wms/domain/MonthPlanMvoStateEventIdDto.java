package org.dddml.wms.domain;


public class MonthPlanMvoStateEventIdDto
{
	
    private MonthPlanMvoStateEventId value;

    public MonthPlanMvoStateEventIdDto()
    {
        this(new MonthPlanMvoStateEventId());
    }

    public MonthPlanMvoStateEventIdDto(MonthPlanMvoStateEventId value)
    {
        this.value = value;
    }

    public MonthPlanMvoStateEventId toMonthPlanMvoStateEventId()
    {
        return this.value;
    }

    public MonthPlanIdDto getMonthPlanId()
    {
        return new MonthPlanIdDto(this.value.getMonthPlanId());
    }

    public void setMonthPlanId(MonthPlanIdDto monthPlanId)
    {
        this.value.setMonthPlanId(monthPlanId.toMonthPlanId());
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

        MonthPlanMvoStateEventIdDto other = (MonthPlanMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

