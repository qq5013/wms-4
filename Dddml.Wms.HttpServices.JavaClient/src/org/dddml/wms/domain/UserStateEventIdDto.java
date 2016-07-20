package org.dddml.wms.domain;


public class UserStateEventIdDto
{
	
    private UserStateEventId value;

    public UserStateEventIdDto()
    {
        this(new UserStateEventId());
    }

    public UserStateEventIdDto(UserStateEventId value)
    {
        this.value = value;
    }

    public UserStateEventId toUserStateEventId()
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

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
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

        UserStateEventIdDto other = (UserStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

