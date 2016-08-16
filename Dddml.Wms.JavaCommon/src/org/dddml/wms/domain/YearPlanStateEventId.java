package org.dddml.wms.domain;

import java.io.Serializable;

public class YearPlanStateEventId implements Serializable
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

    private Long personVersion;

    public Long getPersonVersion()
    {
        return this.personVersion;
    }

    public void setPersonVersion(Long personVersion)
    {
        this.personVersion = personVersion;
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

    public YearPlanStateEventId()
    {
    }

    public YearPlanStateEventId(PersonalName personalName, Integer year, Long personVersion)
    {
        this.personalName = personalName;
        this.year = year;
        this.personVersion = personVersion;
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

        YearPlanStateEventId other = (YearPlanStateEventId)obj;
        return true 
            && (personalName == other.personalName || (personalName != null && personalName.equals(other.personalName)))
            && (year == other.year || (year != null && year.equals(other.year)))
            && (personVersion == other.personVersion || (personVersion != null && personVersion.equals(other.personVersion)))
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
        if (this.personVersion != null) {
            hash += 13 * this.personVersion.hashCode();
        }
        return hash;
    }

}

