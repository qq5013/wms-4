package org.dddml.wms.domain;


public class LoginKeyFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "loginProvider",
            "providerKey",
        };

    private static String[] _propertyTypes = new String[]{
            "String",
            "String",
        };

    public static String[] getPropertyNames()
    {
        return _propertyNames;
    }

    public static String[] getPropertyTypes()
    {
        return _propertyTypes;
    }
	
    private LoginKey value;

    public LoginKeyFlattenedDto()
    {
        this(new LoginKey());
    }

    public LoginKeyFlattenedDto(LoginKey value)
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

