package org.dddml.wms.domain;

import java.io.Serializable;

public class YearPlanId implements Serializable
{
    private PersonalName personalName = new PersonalName();

    public PersonalName getPersonalName()
    {
        return this.personalName;
    }

    public void setPersonalName(PersonalName personalName)
    {
        this.personalName = personalName;
    }

    private Integer year;

    public Integer getYear()
    {
        return this.year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    public String getPersonalNameFirstName()
    {
        return getPersonalName().getFirstName();
    }

    public void setPersonalNameFirstName(String personalNameFirstName)
    {
        getPersonalName().setFirstName(personalNameFirstName);
    }

    public String getPersonalNameLastName()
    {
        return getPersonalName().getLastName();
    }

    public void setPersonalNameLastName(String personalNameLastName)
    {
        getPersonalName().setLastName(personalNameLastName);
    }

    public YearPlanId()
    {
    }

    public YearPlanId(PersonalName personalName, Integer year)
    {
        this.personalName = personalName;
        this.year = year;
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

        YearPlanId other = (YearPlanId)obj;
        return true 
            && (personalName == other.personalName || (personalName != null && personalName.equals(other.personalName)))
            && (year == other.year || (year != null && year.equals(other.year)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.personalName != null) {
            hash += 13 * this.personalName.hashCode();
        }
        if (this.year != null) {
            hash += 13 * this.year.hashCode();
        }
        return hash;
    }

}

