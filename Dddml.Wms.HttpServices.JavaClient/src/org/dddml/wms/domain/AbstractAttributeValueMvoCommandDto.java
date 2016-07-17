package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeValueIdDto;
import java.util.Date;
import org.dddml.wms.domain.AttributeValueStateDto;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAttributeValueMvoCommandDto extends AbstractCommandDto
{
    private AttributeValueIdDto attributeValueId;

    public AttributeValueIdDto getAttributeValueId()
    {
        return this.attributeValueId;
    }

    public void setAttributeValueId(AttributeValueIdDto attributeValueId)
    {
        this.attributeValueId = attributeValueId;
    }

    private Long attributeVersion;

    public Long getAttributeVersion()
    {
        return this.attributeVersion;
    }

    public void setAttributeVersion(Long attributeVersion)
    {
        this.attributeVersion = attributeVersion;
    }


}

