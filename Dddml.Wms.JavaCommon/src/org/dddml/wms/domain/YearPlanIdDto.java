package org.dddml.wms.domain;


public class YearPlanIdDto
{
	
    private YearPlanId value;

    public YearPlanIdDto()
    {
        this(new YearPlanId());
    }

    public YearPlanIdDto(YearPlanId value)
    {
        this.value = value;
    }

    public YearPlanId toYearPlanId()
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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        YearPlanIdDto other = (YearPlanIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

