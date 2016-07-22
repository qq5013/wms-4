package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractUserCommandDto extends AbstractCommandDto
{
    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
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

