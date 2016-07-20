package org.dddml.wms.domain;


public class UserLoginIdDto
{
	
    private UserLoginId value;

    public UserLoginIdDto()
    {
        this(new UserLoginId());
    }

    public UserLoginIdDto(UserLoginId value)
    {
        this.value = value;
    }

    public UserLoginId toUserLoginId()
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

    public LoginKeyDto getLoginKey()
    {
        return new LoginKeyDto(this.value.getLoginKey());
    }

    public void setLoginKey(LoginKeyDto loginKey)
    {
        this.value.setLoginKey(loginKey.toLoginKey());
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

        UserLoginIdDto other = (UserLoginIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

