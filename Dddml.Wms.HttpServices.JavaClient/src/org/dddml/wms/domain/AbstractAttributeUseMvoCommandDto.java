package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeSetAttributeUseIdDto;
import java.util.Date;
import org.dddml.wms.domain.AttributeUseStateDto;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAttributeUseMvoCommandDto extends AbstractCommandDto
{
    private AttributeSetAttributeUseIdDto attributeSetAttributeUseId;

    public AttributeSetAttributeUseIdDto getAttributeSetAttributeUseId()
    {
        return this.attributeSetAttributeUseId;
    }

    public void setAttributeSetAttributeUseId(AttributeSetAttributeUseIdDto attributeSetAttributeUseId)
    {
        this.attributeSetAttributeUseId = attributeSetAttributeUseId;
    }

    private Long attributeSetVersion;

    public Long getAttributeSetVersion()
    {
        return this.attributeSetVersion;
    }

    public void setAttributeSetVersion(Long attributeSetVersion)
    {
        this.attributeSetVersion = attributeSetVersion;
    }


}

