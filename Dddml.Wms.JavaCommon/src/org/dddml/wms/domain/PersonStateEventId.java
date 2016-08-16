package org.dddml.wms.domain;

import java.io.Serializable;

public class PersonStateEventId implements Serializable
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

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
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

    public PersonStateEventId()
    {
    }

    public PersonStateEventId(PersonalName personalName, Long version)
    {
        this.personalName = personalName;
        this.version = version;
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

        PersonStateEventId other = (PersonStateEventId)obj;
        return true 
            && (personalName == other.personalName || (personalName != null && personalName.equals(other.personalName)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.personalName != null) {
            hash += 13 * this.personalName.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

