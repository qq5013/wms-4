package org.dddml.wms.domain;

import java.io.Serializable;

public class MonthPlanMvoStateEventId implements Serializable
{
    private MonthPlanId monthPlanId = new MonthPlanId();

    public MonthPlanId getMonthPlanId()
    {
        return this.monthPlanId;
    }

    public void setMonthPlanId(MonthPlanId monthPlanId)
    {
        this.monthPlanId = monthPlanId;
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

    public String getMonthPlanIdPersonalNameFirstName()
    {
        return getMonthPlanId().getPersonalName().getFirstName();
    }

    public void setMonthPlanIdPersonalNameFirstName(String monthPlanIdPersonalNameFirstName)
    {
        getMonthPlanId().getPersonalName().setFirstName(monthPlanIdPersonalNameFirstName);
    }

    public String getMonthPlanIdPersonalNameLastName()
    {
        return getMonthPlanId().getPersonalName().getLastName();
    }

    public void setMonthPlanIdPersonalNameLastName(String monthPlanIdPersonalNameLastName)
    {
        getMonthPlanId().getPersonalName().setLastName(monthPlanIdPersonalNameLastName);
    }

    public Integer getMonthPlanIdYear()
    {
        return getMonthPlanId().getYear();
    }

    public void setMonthPlanIdYear(Integer monthPlanIdYear)
    {
        getMonthPlanId().setYear(monthPlanIdYear);
    }

    public Integer getMonthPlanIdMonth()
    {
        return getMonthPlanId().getMonth();
    }

    public void setMonthPlanIdMonth(Integer monthPlanIdMonth)
    {
        getMonthPlanId().setMonth(monthPlanIdMonth);
    }

    public MonthPlanMvoStateEventId()
    {
    }

    public MonthPlanMvoStateEventId(MonthPlanId monthPlanId, Long personVersion)
    {
        this.monthPlanId = monthPlanId;
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

        MonthPlanMvoStateEventId other = (MonthPlanMvoStateEventId)obj;
        return true 
            && (monthPlanId == other.monthPlanId || (monthPlanId != null && monthPlanId.equals(other.monthPlanId)))
            && (personVersion == other.personVersion || (personVersion != null && personVersion.equals(other.personVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.monthPlanId != null) {
            hash += 13 * this.monthPlanId.hashCode();
        }
        if (this.personVersion != null) {
            hash += 13 * this.personVersion.hashCode();
        }
        return hash;
    }

}

