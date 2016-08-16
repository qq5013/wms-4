package org.dddml.wms.domain;


public class YearPlanStateEventIdDto
{
	
    private YearPlanStateEventId value;

    public YearPlanStateEventIdDto()
    {
        this(new YearPlanStateEventId());
    }

    public YearPlanStateEventIdDto(YearPlanStateEventId value)
    {
        this.value = value;
    }

    public YearPlanStateEventId toYearPlanStateEventId()
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

        YearPlanStateEventIdDto other = (YearPlanStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

