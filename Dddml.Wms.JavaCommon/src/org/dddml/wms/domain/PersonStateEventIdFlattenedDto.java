package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class PersonStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "personalNameFirstName",
            "personalNameLastName",
            "version",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private PersonStateEventId value;

    public PersonStateEventIdFlattenedDto()
    {
        this(new PersonStateEventId());
    }

    public PersonStateEventIdFlattenedDto(PersonStateEventId value)
    {
        this.value = value;
    }

    public PersonStateEventId toPersonStateEventId()
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

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
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

        PersonStateEventIdFlattenedDto other = (PersonStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

