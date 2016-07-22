package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAttributeCommandDto extends AbstractCommandDto
{
    private String attributeId;

    public String getAttributeId()
    {
        return this.attributeId;
    }

    public void setAttributeId(String attributeId)
    {
        this.attributeId = attributeId;
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

