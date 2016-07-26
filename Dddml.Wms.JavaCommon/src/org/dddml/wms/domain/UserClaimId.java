package org.dddml.wms.domain;

import java.io.Serializable;

public class UserClaimId implements Serializable
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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserClaimId other = (UserClaimId)obj;
        return true 
            && (userId == other.userId || (userId != null && userId.equals(other.userId)))
            && (claimId == other.claimId || (claimId != null && claimId.equals(other.claimId)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.userId != null) {
            hash += 13 * this.userId.hashCode();
        }
        if (this.claimId != null) {
            hash += 13 * this.claimId.hashCode();
        }
        return hash;
    }

}

