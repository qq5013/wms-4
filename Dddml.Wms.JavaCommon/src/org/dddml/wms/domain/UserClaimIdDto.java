package org.dddml.wms.domain;


public class UserClaimIdDto
{
	
    private UserClaimId value;

    public UserClaimIdDto()
    {
        this(new UserClaimId());
    }

    public UserClaimIdDto(UserClaimId value)
    {
        this.value = value;
    }

    public UserClaimId toUserClaimId()
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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserClaimIdDto other = (UserClaimIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

