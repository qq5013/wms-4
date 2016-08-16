package org.dddml.wms.domain;


public class MonthPlanIdDto
{
	
    private MonthPlanId value;

    public MonthPlanIdDto()
    {
        this(new MonthPlanId());
    }

    public MonthPlanIdDto(MonthPlanId value)
    {
        this.value = value;
    }

    public MonthPlanId toMonthPlanId()
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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        MonthPlanIdDto other = (MonthPlanIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

