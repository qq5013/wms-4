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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        LoginKeyDto other = (LoginKeyDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

