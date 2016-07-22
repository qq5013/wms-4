package org.dddml.wms.domain;


public class UserClaimStateEventIdDto
{
	
    private UserClaimStateEventId value;

    public UserClaimStateEventIdDto()
    {
        this(new UserClaimStateEventId());
    }

    public UserClaimStateEventIdDto(UserClaimStateEventId value)
    {
        this.value = value;
    }

    public UserClaimStateEventId toUserClaimStateEventId()
    {
        return this.value;
    }

    public String getUserId()
    {
        return this.value.getUserId();
    }

    public void setUserId(String userId)
    {
        this.value.setUserId(userId);
    }

    public Integer getClaimId()
    {
        return this.value.getClaimId();
    }

    public void setClaimId(Integer claimId)
    {
        this.value.setClaimId(claimId);
    }

    public Long getUserVersion()
    {
        return this.value.getUserVersion();
    }

    public void setUserVersion(Long userVersion)
    {
        this.value.setUserVersion(userVersion);
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

        UserClaimStateEventIdDto other = (UserClaimStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

