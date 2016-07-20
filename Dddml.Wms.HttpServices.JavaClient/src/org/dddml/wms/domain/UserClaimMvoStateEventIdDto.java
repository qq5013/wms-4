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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserClaimMvoStateEventIdDto other = (UserClaimMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

