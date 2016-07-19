package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserLoginIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userId",
            "loginKeyLoginProvider",
            "loginKeyProviderKey",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
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

