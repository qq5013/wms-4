package org.dddml.wms.domain;


public class AttributeStateEventId
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

    AttributeStateEventId ()
    {
    }

    public AttributeStateEventId (String attributeId, Long version)
    {
        this.attributeId = attributeId;
        this.version = version;
    }

}

