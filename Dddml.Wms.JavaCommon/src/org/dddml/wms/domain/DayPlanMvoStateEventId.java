package org.dddml.wms.domain;

import java.io.Serializable;

public class DayPlanMvoStateEventId implements Serializable
{
    private DayPlanId dayPlanId = new DayPlanId();

    public DayPlanId getDayPlanId()
    {
        return this.dayPlanId;
    }

    public void setDayPlanId(DayPlanId dayPlanId)
    {
        this.dayPlanId = dayPlanId;
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

    public String getDayPlanIdPersonalNameFirstName()
    {
        return getDayPlanId().getPersonalName().getFirstName();
    }

    public void setDayPlanIdPersonalNameFirstName(String dayPlanIdPersonalNameFirstName)
    {
        getDayPlanId().getPersonalName().setFirstName(dayPlanIdPersonalNameFirstName);
    }

    public String getDayPlanIdPersonalNameLastName()
    {
        return getDayPlanId().getPersonalName().getLastName();
    }

    public void setDayPlanIdPersonalNameLastName(String dayPlanIdPersonalNameLastName)
    {
        getDayPlanId().getPersonalName().setLastName(dayPlanIdPersonalNameLastName);
    }

    public Integer getDayPlanIdYear()
    {
        return getDayPlanId().getYear();
    }

    public void setDayPlanIdYear(Integer dayPlanIdYear)
    {
        getDayPlanId().setYear(dayPlanIdYear);
    }

    public Integer getDayPlanIdMonth()
    {
        return getDayPlanId().getMonth();
    }

    public void setDayPlanIdMonth(Integer dayPlanIdMonth)
    {
        getDayPlanId().setMonth(dayPlanIdMonth);
    }

    public Integer getDayPlanIdDay()
    {
        return getDayPlanId().getDay();
    }

    public void setDayPlanIdDay(Integer dayPlanIdDay)
    {
        getDayPlanId().setDay(dayPlanIdDay);
    }

    public DayPlanMvoStateEventId()
    {
    }

    public DayPlanMvoStateEventId(DayPlanId dayPlanId, Long personVersion)
    {
        this.dayPlanId = dayPlanId;
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

        DayPlanMvoStateEventId other = (DayPlanMvoStateEventId)obj;
        return true 
            && (dayPlanId == other.dayPlanId || (dayPlanId != null && dayPlanId.equals(other.dayPlanId)))
            && (personVersion == other.personVersion || (personVersion != null && personVersion.equals(other.personVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.dayPlanId != null) {
            hash += 13 * this.dayPlanId.hashCode();
        }
        if (this.personVersion != null) {
            hash += 13 * this.personVersion.hashCode();
        }
        return hash;
    }

}

