package org.dddml.wms.domain;

import java.io.Serializable;

public class UserClaimMvoStateEventId implements Serializable
{
    private UserClaimId userClaimId = new UserClaimId();

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

    UserClaimMvoStateEventId ()
    {
    }

    public UserClaimMvoStateEventId (UserClaimId userClaimId, Long userVersion)
    {
        this.userClaimId = userClaimId;
        this.userVersion = userVersion;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserClaimMvoStateEventId other = (UserClaimMvoStateEventId)obj;
        return true 
            && (userClaimId == other.userClaimId || (userClaimId != null && userClaimId.equals(other.userClaimId)))
            && (userVersion == other.userVersion || (userVersion != null && userVersion.equals(other.userVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.userClaimId != null) {
            hash += 13 * this.userClaimId.hashCode();
        }
        if (this.userVersion != null) {
            hash += 13 * this.userVersion.hashCode();
        }
        return hash;
    }

}

