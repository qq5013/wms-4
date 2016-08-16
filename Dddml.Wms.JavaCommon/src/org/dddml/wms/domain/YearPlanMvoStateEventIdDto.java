package org.dddml.wms.domain;


public class YearPlanMvoStateEventIdDto
{
	
    private YearPlanMvoStateEventId value;

    public YearPlanMvoStateEventIdDto()
    {
        this(new YearPlanMvoStateEventId());
    }

    public YearPlanMvoStateEventIdDto(YearPlanMvoStateEventId value)
    {
        this.value = value;
    }

    public YearPlanMvoStateEventId toYearPlanMvoStateEventId()
    {
        return this.value;
    }

    public YearPlanIdDto getYearPlanId()
    {
        return new YearPlanIdDto(this.value.getYearPlanId());
    }

    public void setYearPlanId(YearPlanIdDto yearPlanId)
    {
        this.value.setYearPlanId(yearPlanId.toYearPlanId());
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

        YearPlanMvoStateEventIdDto other = (YearPlanMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

