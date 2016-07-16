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

}

