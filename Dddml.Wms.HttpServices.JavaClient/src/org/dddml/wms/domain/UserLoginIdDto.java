package org.dddml.wms.domain;

import org.dddml.wms.domain.LoginKeyDto;

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


}

