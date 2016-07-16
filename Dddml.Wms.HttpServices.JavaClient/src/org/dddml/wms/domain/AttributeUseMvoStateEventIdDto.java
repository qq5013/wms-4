package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeSetAttributeUseIdDto;

public class AttributeUseMvoStateEventIdDto
{
	
    private AttributeUseMvoStateEventId value;

    public AttributeUseMvoStateEventIdDto()
    {
        this(new AttributeUseMvoStateEventId());
    }

    public AttributeUseMvoStateEventIdDto(AttributeUseMvoStateEventId value)
    {
        this.value = value;
    }

    public AttributeUseMvoStateEventId toAttributeUseMvoStateEventId()
    {
        return this.value;
    }

    public AttributeSetAttributeUseIdDto getAttributeSetAttributeUseId()
    {
        return new AttributeSetAttributeUseIdDto(this.value.getAttributeSetAttributeUseId());
    }

    public void setAttributeSetAttributeUseId(AttributeSetAttributeUseIdDto attributeSetAttributeUseId)
    {
        this.value.setAttributeSetAttributeUseId(attributeSetAttributeUseId.toAttributeSetAttributeUseId());
    }

    public Long getAttributeSetVersion()
    {
        return this.value.getAttributeSetVersion();
    }

    public void setAttributeSetVersion(Long attributeSetVersion)
    {
        this.value.setAttributeSetVersion(attributeSetVersion);
    }


}

