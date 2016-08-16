package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class YearPlanStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "personalNameFirstName",
            "personalNameLastName",
            "year",
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
	
    private YearPlanStateEventId value;

    public YearPlanStateEventIdFlattenedDto()
    {
        this(new YearPlanStateEventId());
    }

    public YearPlanStateEventIdFlattenedDto(YearPlanStateEventId value)
    {
        this.value = value;
    }

    public YearPlanStateEventId toYearPlanStateEventId()
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

        YearPlanStateEventIdFlattenedDto other = (YearPlanStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

