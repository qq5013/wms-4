package org.dddml.wms.domain;


public class UserStateEventId
{
    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
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

    UserStateEventId ()
    {
    }

    public UserStateEventId (String userId, Long version)
    {
        this.userId = userId;
        this.version = version;
    }

}

