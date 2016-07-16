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


}

