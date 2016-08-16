package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class MonthPlanMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "monthPlanIdPersonalNameFirstName",
            "monthPlanIdPersonalNameLastName",
            "monthPlanIdYear",
            "monthPlanIdMonth",
            "personVersion",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
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
	
    private MonthPlanMvoStateEventId value;

    public MonthPlanMvoStateEventIdFlattenedDto()
    {
        this(new MonthPlanMvoStateEventId());
    }

    public MonthPlanMvoStateEventIdFlattenedDto(MonthPlanMvoStateEventId value)
    {
        this.value = value;
    }

    public MonthPlanMvoStateEventId toMonthPlanMvoStateEventId()
    {
        return this.value;
    }


    public String getMonthPlanIdPersonalNameFirstName()
    {
        return this.value.getMonthPlanId().getPersonalName().getFirstName();
    }

    public void setMonthPlanIdPersonalNameFirstName(String monthPlanIdPersonalNameFirstName)
    {
        this.value.getMonthPlanId().getPersonalName().setFirstName(monthPlanIdPersonalNameFirstName);
    }

    public String getMonthPlanIdPersonalNameLastName()
    {
        return this.value.getMonthPlanId().getPersonalName().getLastName();
    }

    public void setMonthPlanIdPersonalNameLastName(String monthPlanIdPersonalNameLastName)
    {
        this.value.getMonthPlanId().getPersonalName().setLastName(monthPlanIdPersonalNameLastName);
    }

    public Integer getMonthPlanIdYear()
    {
        return this.value.getMonthPlanId().getYear();
    }

    public void setMonthPlanIdYear(Integer monthPlanIdYear)
    {
        this.value.getMonthPlanId().setYear(monthPlanIdYear);
    }

    public Integer getMonthPlanIdMonth()
    {
        return this.value.getMonthPlanId().getMonth();
    }

    public void setMonthPlanIdMonth(Integer monthPlanIdMonth)
    {
        this.value.getMonthPlanId().setMonth(monthPlanIdMonth);
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

        MonthPlanMvoStateEventIdFlattenedDto other = (MonthPlanMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

