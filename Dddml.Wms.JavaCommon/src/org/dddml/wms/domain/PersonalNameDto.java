package org.dddml.wms.domain;


public class PersonalNameDto
{
	
    private PersonalName value;

    public PersonalNameDto()
    {
        this(new PersonalName());
    }

    public PersonalNameDto(PersonalName value)
    {
        this.value = value;
    }

    public PersonalName toPersonalName()
    {
        return this.value;
    }

    public String getFirstName()
    {
        return this.value.getFirstName();
    }

    public void setFirstName(String firstName)
    {
        this.value.setFirstName(firstName);
    }

    public String getLastName()
    {
        return this.value.getLastName();
    }

    public void setLastName(String lastName)
    {
        this.value.setLastName(lastName);
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

        PersonalNameDto other = (PersonalNameDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

