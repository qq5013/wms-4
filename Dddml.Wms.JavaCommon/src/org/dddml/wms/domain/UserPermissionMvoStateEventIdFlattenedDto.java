package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserPermissionMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userPermissionIdUserId",
            "userPermissionIdPermissionId",
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
	
    private UserPermissionMvoStateEventId value;

    public UserPermissionMvoStateEventIdFlattenedDto()
    {
        this(new UserPermissionMvoStateEventId());
    }

    public UserPermissionMvoStateEventIdFlattenedDto(UserPermissionMvoStateEventId value)
    {
        this.value = value;
    }

    public UserPermissionMvoStateEventId toUserPermissionMvoStateEventId()
    {
        return this.value;
    }


    public String getUserPermissionIdUserId()
    {
        return this.value.getUserPermissionId().getUserId();
    }

    public void setUserPermissionIdUserId(String userPermissionIdUserId)
    {
        this.value.getUserPermissionId().setUserId(userPermissionIdUserId);
    }

    public String getUserPermissionIdPermissionId()
    {
        return this.value.getUserPermissionId().getPermissionId();
    }

    public void setUserPermissionIdPermissionId(String userPermissionIdPermissionId)
    {
        this.value.getUserPermissionId().setPermissionId(userPermissionIdPermissionId);
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

        UserPermissionMvoStateEventIdFlattenedDto other = (UserPermissionMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

