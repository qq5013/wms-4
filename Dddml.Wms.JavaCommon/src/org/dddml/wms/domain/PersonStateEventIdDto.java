package org.dddml.wms.domain;


public class PersonStateEventIdDto
{
	
    private PersonStateEventId value;

    public PersonStateEventIdDto()
    {
        this(new PersonStateEventId());
    }

    public PersonStateEventIdDto(PersonStateEventId value)
    {
        this.value = value;
    }

    public PersonStateEventId toPersonStateEventId()
    {
        return this.value;
    }

    public PersonalNameDto getPersonalName()
    {
        return new PersonalNameDto(this.value.getPersonalName());
    }

    public void setPersonalName(PersonalNameDto personalName)
    {
        this.value.setPersonalName(personalName.toPersonalName());
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

        PersonStateEventIdDto other = (PersonStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

