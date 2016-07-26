package org.dddml.wms.domain;


public class UserLoginMvoStateEventIdDto
{
	
    private UserLoginMvoStateEventId value;

    public UserLoginMvoStateEventIdDto()
    {
        this(new UserLoginMvoStateEventId());
    }

    public UserLoginMvoStateEventIdDto(UserLoginMvoStateEventId value)
    {
        this.value = value;
    }

    public UserLoginMvoStateEventId toUserLoginMvoStateEventId()
    {
        return this.value;
    }

    public UserLoginIdDto getUserLoginId()
    {
        return new UserLoginIdDto(this.value.getUserLoginId());
    }

    public void setUserLoginId(UserLoginIdDto userLoginId)
    {
        this.value.setUserLoginId(userLoginId.toUserLoginId());
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

        UserLoginMvoStateEventIdDto other = (UserLoginMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

