package org.dddml.wms.domain;


public class UserClaimId
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

    private Integer claimId;

    public Integer getClaimId()
    {
        return this.claimId;
    }

    public void setClaimId(Integer claimId)
    {
        this.claimId = claimId;
    }

    UserClaimId ()
    {
    }

    public UserClaimId (String userId, Integer claimId)
    {
        this.userId = userId;
        this.claimId = claimId;
    }

}

