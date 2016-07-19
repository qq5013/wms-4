package org.dddml.wms.domain;


public class UserClaimMvoStateEventIdDto
{
	
    private UserClaimMvoStateEventId value;

    public UserClaimMvoStateEventIdDto()
    {
        this(new UserClaimMvoStateEventId());
    }

    public UserClaimMvoStateEventIdDto(UserClaimMvoStateEventId value)
    {
        this.value = value;
    }

    public UserClaimMvoStateEventId toUserClaimMvoStateEventId()
    {
        return this.value;
    }

    public UserClaimIdDto getUserClaimId()
    {
        return new UserClaimIdDto(this.value.getUserClaimId());
    }

    public void setUserClaimId(UserClaimIdDto userClaimId)
    {
        this.value.setUserClaimId(userClaimId.toUserClaimId());
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

