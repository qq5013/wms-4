package org.dddml.wms.domain;


public class AttributeSetInstanceStateEventId
{
    private String attributeSetInstanceId;

    public String getAttributeSetInstanceId()
    {
        return this.attributeSetInstanceId;
    }

    public void setAttributeSetInstanceId(String attributeSetInstanceId)
    {
        this.attributeSetInstanceId = attributeSetInstanceId;
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

    AttributeSetInstanceStateEventId ()
    {
    }

    public AttributeSetInstanceStateEventId (String attributeSetInstanceId, Long version)
    {
        this.attributeSetInstanceId = attributeSetInstanceId;
        this.version = version;
    }

}

