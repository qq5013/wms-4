package org.dddml.wms.domain;


public class UserPermissionIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "userId",
            "permissionId",
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

