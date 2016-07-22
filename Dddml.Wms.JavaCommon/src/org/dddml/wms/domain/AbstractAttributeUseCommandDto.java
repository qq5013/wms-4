package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAttributeUseCommandDto extends AbstractCommandDto
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


}

