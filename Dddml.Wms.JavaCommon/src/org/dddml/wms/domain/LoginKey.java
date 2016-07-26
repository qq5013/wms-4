package org.dddml.wms.domain;

import java.io.Serializable;

public class LoginKey implements Serializable
{
    private String loginProvider;

    public String getLoginProvider()
    {
        return this.loginProvider;
    }

    public void setLoginProvider(String loginProvider)
    {
        this.loginProvider = loginProvider;
    }

    private String providerKey;

    public String getProviderKey()
    {
        return this.providerKey;
    }

    public void setProviderKey(String providerKey)
    {
        this.providerKey = providerKey;
    }

    public LoginKey()
    {
    }

    public LoginKey(String loginProvider, String providerKey)
    {
        this.loginProvider = loginProvider;
        this.providerKey = providerKey;
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

        LoginKey other = (LoginKey)obj;
        return true 
            && (loginProvider == other.loginProvider || (loginProvider != null && loginProvider.equals(other.loginProvider)))
            && (providerKey == other.providerKey || (providerKey != null && providerKey.equals(other.providerKey)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.loginProvider != null) {
            hash += 13 * this.loginProvider.hashCode();
        }
        if (this.providerKey != null) {
            hash += 13 * this.providerKey.hashCode();
        }
        return hash;
    }

}

