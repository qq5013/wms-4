package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldStateDto;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAttributeSetInstanceExtensionFieldGroupCommandDto extends AbstractCommandDto
{
    private String id;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
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

