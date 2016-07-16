package org.dddml.wms.domain;


public class LoginKeyDto
{
	
    private LoginKey value;

    public LoginKeyDto()
    {
        this(new LoginKey());
    }

    public LoginKeyDto(LoginKey value)
    {
        this.value = value;
    }

    public LoginKey toLoginKey()
    {
        return this.value;
    }

    public String getLoginProvider()
    {
        return this.value.getLoginProvider();
    }

    public void setLoginProvider(String loginProvider)
    {
        this.value.setLoginProvider(loginProvider);
    }

    public String getProviderKey()
    {
        return this.value.getProviderKey();
    }

    public void setProviderKey(String providerKey)
    {
        this.value.setProviderKey(providerKey);
    }


}

