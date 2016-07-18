package org.dddml.wms.domain;

import org.dddml.wms.domain.UserClaimId;

public class UserClaimMvoStateEventId
{
    private UserClaimId userClaimId;

    public UserClaimId getUserClaimId()
    {
        return this.userClaimId;
    }

    public void setUserClaimId(UserClaimId userClaimId)
    {
        this.userClaimId = userClaimId;
    }

    private Long userVersion;

    public Long getUserVersion()
    {
        return this.userVersion;
    }

    public void setUserVersion(Long userVersion)
    {
        this.userVersion = userVersion;
    }

    public String getUserClaimIdUserId()
    {
        return getUserClaimId().getUserId();
    }

    public void setUserClaimIdUserId(String userClaimIdUserId)
    {
        getUserClaimId().setUserId(userClaimIdUserId);
    }

    public Integer getUserClaimIdClaimId()
    {
        return getUserClaimId().getClaimId();
    }

    public void setUserClaimIdClaimId(Integer userClaimIdClaimId)
    {
        getUserClaimId().setClaimId(userClaimIdClaimId);
    }


}

