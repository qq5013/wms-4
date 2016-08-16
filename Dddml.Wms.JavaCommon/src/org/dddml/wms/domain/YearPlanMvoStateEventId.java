package org.dddml.wms.domain;

import java.io.Serializable;

public class YearPlanMvoStateEventId implements Serializable
{
    private YearPlanId yearPlanId = new YearPlanId();

    public YearPlanId getYearPlanId()
    {
        return this.yearPlanId;
    }

    public void setYearPlanId(YearPlanId yearPlanId)
    {
        this.yearPlanId = yearPlanId;
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

    public String getYearPlanIdPersonalNameFirstName()
    {
        return getYearPlanId().getPersonalName().getFirstName();
    }

    public void setYearPlanIdPersonalNameFirstName(String yearPlanIdPersonalNameFirstName)
    {
        getYearPlanId().getPersonalName().setFirstName(yearPlanIdPersonalNameFirstName);
    }

    public String getYearPlanIdPersonalNameLastName()
    {
        return getYearPlanId().getPersonalName().getLastName();
    }

    public void setYearPlanIdPersonalNameLastName(String yearPlanIdPersonalNameLastName)
    {
        getYearPlanId().getPersonalName().setLastName(yearPlanIdPersonalNameLastName);
    }

    public Integer getYearPlanIdYear()
    {
        return getYearPlanId().getYear();
    }

    public void setYearPlanIdYear(Integer yearPlanIdYear)
    {
        getYearPlanId().setYear(yearPlanIdYear);
    }

    public YearPlanMvoStateEventId()
    {
    }

    public YearPlanMvoStateEventId(YearPlanId yearPlanId, Long personVersion)
    {
        this.yearPlanId = yearPlanId;
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

        YearPlanMvoStateEventId other = (YearPlanMvoStateEventId)obj;
        return true 
            && (yearPlanId == other.yearPlanId || (yearPlanId != null && yearPlanId.equals(other.yearPlanId)))
            && (personVersion == other.personVersion || (personVersion != null && personVersion.equals(other.personVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.yearPlanId != null) {
            hash += 13 * this.yearPlanId.hashCode();
        }
        if (this.personVersion != null) {
            hash += 13 * this.personVersion.hashCode();
        }
        return hash;
    }

}

