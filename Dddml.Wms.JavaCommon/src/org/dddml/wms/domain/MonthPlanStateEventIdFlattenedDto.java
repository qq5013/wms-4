package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class MonthPlanStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "personalNameFirstName",
            "personalNameLastName",
            "year",
            "month",
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
	
    private MonthPlanStateEventId value;

    public MonthPlanStateEventIdFlattenedDto()
    {
        this(new MonthPlanStateEventId());
    }

    public MonthPlanStateEventIdFlattenedDto(MonthPlanStateEventId value)
    {
        this.value = value;
    }

    public MonthPlanStateEventId toMonthPlanStateEventId()
    {
        return this.value;
    }


    public String getPersonalNameFirstName()
    {
        return this.value.getPersonalName().getFirstName();
    }

    public void setPersonalNameFirstName(String personalNameFirstName)
    {
        this.value.getPersonalName().setFirstName(personalNameFirstName);
    }

    public String getPersonalNameLastName()
    {
        return this.value.getPersonalName().getLastName();
    }

    public void setPersonalNameLastName(String personalNameLastName)
    {
        this.value.getPersonalName().setLastName(personalNameLastName);
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

        MonthPlanStateEventIdFlattenedDto other = (MonthPlanStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

