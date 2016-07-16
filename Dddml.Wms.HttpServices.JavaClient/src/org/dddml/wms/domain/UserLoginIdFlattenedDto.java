package org.dddml.wms.domain;

import org.dddml.wms.domain.LoginKeyDto;

public class UserLoginIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "userId",
            "loginKeyLoginProvider",
            "loginKeyProviderKey",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
            "String",
        };
    }
	
    private UserLoginId value;

    public UserLoginIdFlattenedDto()
    {
        this(new UserLoginId());
    }

    public UserLoginIdFlattenedDto(UserLoginId value)
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


    public String getLoginKeyLoginProvider()
    {
        return this.value.getLoginKey().getLoginProvider();
    }

    public void setLoginKeyLoginProvider(String loginKeyLoginProvider)
    {
        this.value.getLoginKey().setLoginProvider(loginKeyLoginProvider);
    }


    public String getLoginKeyProviderKey()
    {
        return this.value.getLoginKey().getProviderKey();
    }

    public void setLoginKeyProviderKey(String loginKeyProviderKey)
    {
        this.value.getLoginKey().setProviderKey(loginKeyProviderKey);
    }


}

