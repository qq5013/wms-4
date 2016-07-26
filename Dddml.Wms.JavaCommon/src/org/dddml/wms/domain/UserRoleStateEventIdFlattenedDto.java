package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserRoleStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userId",
            "roleId",
            "userVersion",
        };

    public static final String[] propertyTypes = new String[]{
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
	
    private UserRoleStateEventId value;

    public UserRoleStateEventIdFlattenedDto()
    {
        this(new UserRoleStateEventId());
    }

    public UserRoleStateEventIdFlattenedDto(UserRoleStateEventId value)
    {
        this.value = value;
    }

    public UserRoleStateEventId toUserRoleStateEventId()
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

    public String getRoleId()
    {
        return this.value.getRoleId();
    }

    public void setRoleId(String roleId)
    {
        this.value.setRoleId(roleId);
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

        UserRoleStateEventIdFlattenedDto other = (UserRoleStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

