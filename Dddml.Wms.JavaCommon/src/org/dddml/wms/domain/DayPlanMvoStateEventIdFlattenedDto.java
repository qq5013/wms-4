package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class DayPlanMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "dayPlanIdPersonalNameFirstName",
            "dayPlanIdPersonalNameLastName",
            "dayPlanIdYear",
            "dayPlanIdMonth",
            "dayPlanIdDay",
            "personVersion",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
            "Integer",
            "Integer",
            "Integer",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private DayPlanMvoStateEventId value;

    public DayPlanMvoStateEventIdFlattenedDto()
    {
        this(new DayPlanMvoStateEventId());
    }

    public DayPlanMvoStateEventIdFlattenedDto(DayPlanMvoStateEventId value)
    {
        this.value = value;
    }

    public DayPlanMvoStateEventId toDayPlanMvoStateEventId()
    {
        return this.value;
    }


    public String getDayPlanIdPersonalNameFirstName()
    {
        return this.value.getDayPlanId().getPersonalName().getFirstName();
    }

    public void setDayPlanIdPersonalNameFirstName(String dayPlanIdPersonalNameFirstName)
    {
        this.value.getDayPlanId().getPersonalName().setFirstName(dayPlanIdPersonalNameFirstName);
    }

    public String getDayPlanIdPersonalNameLastName()
    {
        return this.value.getDayPlanId().getPersonalName().getLastName();
    }

    public void setDayPlanIdPersonalNameLastName(String dayPlanIdPersonalNameLastName)
    {
        this.value.getDayPlanId().getPersonalName().setLastName(dayPlanIdPersonalNameLastName);
    }

    public Integer getDayPlanIdYear()
    {
        return this.value.getDayPlanId().getYear();
    }

    public void setDayPlanIdYear(Integer dayPlanIdYear)
    {
        this.value.getDayPlanId().setYear(dayPlanIdYear);
    }

    public Integer getDayPlanIdMonth()
    {
        return this.value.getDayPlanId().getMonth();
    }

    public void setDayPlanIdMonth(Integer dayPlanIdMonth)
    {
        this.value.getDayPlanId().setMonth(dayPlanIdMonth);
    }

    public Integer getDayPlanIdDay()
    {
        return this.value.getDayPlanId().getDay();
    }

    public void setDayPlanIdDay(Integer dayPlanIdDay)
    {
        this.value.getDayPlanId().setDay(dayPlanIdDay);
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

        DayPlanMvoStateEventIdFlattenedDto other = (DayPlanMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

