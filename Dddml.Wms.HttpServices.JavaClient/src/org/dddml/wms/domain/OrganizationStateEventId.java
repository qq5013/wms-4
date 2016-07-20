package org.dddml.wms.domain;


public class OrganizationStateEventId
{
    private String organizationId;

    public String getOrganizationId()
    {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
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

    OrganizationStateEventId ()
    {
    }

    public OrganizationStateEventId (String organizationId, Long version)
    {
        this.organizationId = organizationId;
        this.version = version;
    }

}

