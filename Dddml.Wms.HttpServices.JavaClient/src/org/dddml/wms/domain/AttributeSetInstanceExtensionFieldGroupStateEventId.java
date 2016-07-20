package org.dddml.wms.domain;


public class AttributeSetInstanceExtensionFieldGroupStateEventId
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

    AttributeSetInstanceExtensionFieldGroupStateEventId ()
    {
    }

    public AttributeSetInstanceExtensionFieldGroupStateEventId (String id, Long version)
    {
        this.id = id;
        this.version = version;
    }

}

