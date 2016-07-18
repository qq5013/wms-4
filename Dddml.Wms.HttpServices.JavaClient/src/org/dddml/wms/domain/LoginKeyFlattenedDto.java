package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class LoginKeyFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "loginProvider",
            "providerKey",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
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

