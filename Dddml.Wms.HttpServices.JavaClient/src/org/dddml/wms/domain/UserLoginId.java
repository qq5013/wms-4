package org.dddml.wms.domain;


public class UserLoginId
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

    UserLoginId ()
    {
    }

    public UserLoginId (String userId, LoginKey loginKey)
    {
        this.userId = userId;
        this.loginKey = loginKey;
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

        UserLoginId other = (UserLoginId)obj;
        return true 
            && (userId == other.userId || (userId != null && userId.equals(other.userId)))
            && (loginKey == other.loginKey || (loginKey != null && loginKey.equals(other.loginKey)))
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
        return hash;
    }

}

