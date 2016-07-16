package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeValueId;

public class AttributeValueMvoStateEventId
{
    private AttributeValueId attributeValueId;

    public AttributeValueId getAttributeValueId()
    {
        return this.attributeValueId;
    }

    public void setAttributeValueId(AttributeValueId attributeValueId)
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

