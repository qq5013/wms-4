package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserPermissionIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userId",
            "permissionId",
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
	
    private UserPermissionId value;

    public UserPermissionIdFlattenedDto()
    {
        this(new UserPermissionId());
    }

    public UserPermissionIdFlattenedDto(UserPermissionId value)
    {
        this.value = value;
    }

    public UserPermissionId toUserPermissionId()
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

    public String getPermissionId()
    {
        return this.value.getPermissionId();
    }

    public void setPermissionId(String permissionId)
    {
        this.value.setPermissionId(permissionId);
    }


}

