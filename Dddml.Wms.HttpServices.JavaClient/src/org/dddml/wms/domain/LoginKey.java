package org.dddml.wms.domain;


public class LoginKey
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


}

