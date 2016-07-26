package org.dddml.wms.domain;

import java.io.Serializable;

public class UserLoginStateEventId implements Serializable
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

    private LoginKey loginKey = new LoginKey();

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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserLoginStateEventId other = (UserLoginStateEventId)obj;
        return true 
            && (userId == other.userId || (userId != null && userId.equals(other.userId)))
            && (loginKey == other.loginKey || (loginKey != null && loginKey.equals(other.loginKey)))
            && (userVersion == other.userVersion || (userVersion != null && userVersion.equals(other.userVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.userId != null) {
            hash += 13 * this.userId.hashCode();
        }
        if (this.loginKey != null) {
            hash += 13 * this.loginKey.hashCode();
        }
        if (this.userVersion != null) {
            hash += 13 * this.userVersion.hashCode();
        }
        return hash;
    }

}

