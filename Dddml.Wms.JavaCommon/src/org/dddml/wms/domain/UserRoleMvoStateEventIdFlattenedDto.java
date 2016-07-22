package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserRoleMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userRoleIdUserId",
            "userRoleIdRoleId",
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
	
    private UserRoleMvoStateEventId value;

    public UserRoleMvoStateEventIdFlattenedDto()
    {
        this(new UserRoleMvoStateEventId());
    }

    public UserRoleMvoStateEventIdFlattenedDto(UserRoleMvoStateEventId value)
    {
        this.value = value;
    }

    public UserRoleMvoStateEventId toUserRoleMvoStateEventId()
    {
        return this.value;
    }


    public String getUserRoleIdUserId()
    {
        return this.value.getUserRoleId().getUserId();
    }

    public void setUserRoleIdUserId(String userRoleIdUserId)
    {
        this.value.getUserRoleId().setUserId(userRoleIdUserId);
    }

    public String getUserRoleIdRoleId()
    {
        return this.value.getUserRoleId().getRoleId();
    }

    public void setUserRoleIdRoleId(String userRoleIdRoleId)
    {
        this.value.getUserRoleId().setRoleId(userRoleIdRoleId);
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

        UserRoleMvoStateEventIdFlattenedDto other = (UserRoleMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

