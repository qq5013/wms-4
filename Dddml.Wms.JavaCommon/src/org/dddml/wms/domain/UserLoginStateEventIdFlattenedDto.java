package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserLoginStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userId",
            "loginKeyLoginProvider",
            "loginKeyProviderKey",
            "userVersion",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
            "String",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private UserLoginStateEventId value;

    public UserLoginStateEventIdFlattenedDto()
    {
        this(new UserLoginStateEventId());
    }

    public UserLoginStateEventIdFlattenedDto(UserLoginStateEventId value)
    {
        this.value = value;
    }

    public UserLoginStateEventId toUserLoginStateEventId()
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

    public Long getUserVersion()
    {
        return this.value.getUserVersion();
    }

    public void setUserVersion(Long userVersion)
    {
        this.value.setUserVersion(userVersion);
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

        UserLoginStateEventIdFlattenedDto other = (UserLoginStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

