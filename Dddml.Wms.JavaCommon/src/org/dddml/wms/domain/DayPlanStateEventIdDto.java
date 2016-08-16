package org.dddml.wms.domain;


public class DayPlanStateEventIdDto
{
	
    private DayPlanStateEventId value;

    public DayPlanStateEventIdDto()
    {
        this(new DayPlanStateEventId());
    }

    public DayPlanStateEventIdDto(DayPlanStateEventId value)
    {
        this.value = value;
    }

    public DayPlanStateEventId toDayPlanStateEventId()
    {
        return this.value;
    }

    public PersonalNameDto getPersonalName()
    {
        return new PersonalNameDto(this.value.getPersonalName());
    }

    public void setPersonalName(PersonalNameDto personalName)
    {
        this.value.setPersonalName(personalName.toPersonalName());
    }

    public Integer getYear()
    {
        return this.value.getYear();
    }

    public void setYear(Integer year)
    {
        this.value.setYear(year);
    }

    public Integer getMonth()
    {
        return this.value.getMonth();
    }

    public void setMonth(Integer month)
    {
        this.value.setMonth(month);
    }

    public Integer getDay()
    {
        return this.value.getDay();
    }

    public void setDay(Integer day)
    {
        this.value.setDay(day);
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

        DayPlanStateEventIdDto other = (DayPlanStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

