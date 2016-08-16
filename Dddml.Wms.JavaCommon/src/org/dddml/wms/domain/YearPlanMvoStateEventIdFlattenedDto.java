package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class YearPlanMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "yearPlanIdPersonalNameFirstName",
            "yearPlanIdPersonalNameLastName",
            "yearPlanIdYear",
            "personVersion",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
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
	
    private YearPlanMvoStateEventId value;

    public YearPlanMvoStateEventIdFlattenedDto()
    {
        this(new YearPlanMvoStateEventId());
    }

    public YearPlanMvoStateEventIdFlattenedDto(YearPlanMvoStateEventId value)
    {
        this.value = value;
    }

    public YearPlanMvoStateEventId toYearPlanMvoStateEventId()
    {
        return this.value;
    }


    public String getYearPlanIdPersonalNameFirstName()
    {
        return this.value.getYearPlanId().getPersonalName().getFirstName();
    }

    public void setYearPlanIdPersonalNameFirstName(String yearPlanIdPersonalNameFirstName)
    {
        this.value.getYearPlanId().getPersonalName().setFirstName(yearPlanIdPersonalNameFirstName);
    }

    public String getYearPlanIdPersonalNameLastName()
    {
        return this.value.getYearPlanId().getPersonalName().getLastName();
    }

    public void setYearPlanIdPersonalNameLastName(String yearPlanIdPersonalNameLastName)
    {
        this.value.getYearPlanId().getPersonalName().setLastName(yearPlanIdPersonalNameLastName);
    }

    public Integer getYearPlanIdYear()
    {
        return this.value.getYearPlanId().getYear();
    }

    public void setYearPlanIdYear(Integer yearPlanIdYear)
    {
        this.value.getYearPlanId().setYear(yearPlanIdYear);
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

        YearPlanMvoStateEventIdFlattenedDto other = (YearPlanMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

