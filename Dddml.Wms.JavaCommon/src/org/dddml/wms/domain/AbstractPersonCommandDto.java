package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractPersonCommandDto extends AbstractCommand
{
    private PersonalNameDto personalName;

    public PersonalNameDto getPersonalName()
    {
        return this.personalName;
    }

    public void setPersonalName(PersonalNameDto personalName)
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


}

