package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAudienceCommandDto extends AbstractCommandDto
{
    private String clientId;

    public String getClientId()
    {
        return this.clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
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

