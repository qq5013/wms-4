package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractTeamCommandDto extends AbstractCommand
{
    private String teamName;

    public String getTeamName()
    {
        return this.teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
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

