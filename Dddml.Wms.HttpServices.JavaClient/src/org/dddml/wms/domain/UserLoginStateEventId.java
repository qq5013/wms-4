package org.dddml.wms.domain;


public class UserLoginStateEventId
{
    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    private LoginKey loginKey;

    public LoginKey getLoginKey()
    {
        return this.loginKey;
    }

    public void setLoginKey(LoginKey loginKey)
    {
        this.loginKey = loginKey;
    }

    private Long userVersion;

    public Long getUserVersion()
    {
        return this.userVersion;
    }

    public void setUserVersion(Long userVersion)
    {
        this.userVersion = userVersion;
    }

    public String getLoginKeyLoginProvider()
    {
        return getLoginKey().getLoginProvider();
    }

    public void setLoginKeyLoginProvider(String loginKeyLoginProvider)
    {
        getLoginKey().setLoginProvider(loginKeyLoginProvider);
    }

    public String getLoginKeyProviderKey()
    {
        return getLoginKey().getProviderKey();
    }

    public void setLoginKeyProviderKey(String loginKeyProviderKey)
    {
        getLoginKey().setProviderKey(loginKeyProviderKey);
    }

    UserLoginStateEventId ()
    {
    }

    public UserLoginStateEventId (String userId, LoginKey loginKey, Long userVersion)
    {
        this.userId = userId;
        this.loginKey = loginKey;
        this.userVersion = userVersion;
    }

}

