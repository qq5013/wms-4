package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAttributeSetInstanceExtensionFieldCommandDto extends AbstractCommandDto
{
    private String index;

    public String getIndex()
    {
        return this.index;
    }

    public void setIndex(String index)
    {
        this.index = index;
    }


}

