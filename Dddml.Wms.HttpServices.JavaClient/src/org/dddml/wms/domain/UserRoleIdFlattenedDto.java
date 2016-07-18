package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserRoleIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userId",
            "roleId",
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
	
    private UserRoleId value;

    public UserRoleIdFlattenedDto()
    {
        this(new UserRoleId());
    }

    public UserRoleIdFlattenedDto(UserRoleId value)
    {
        this.value = value;
    }

    public UserRoleId toUserRoleId()
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


}

