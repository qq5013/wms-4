package org.dddml.wms.domain;


public class UserPermissionIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "userId",
            "permissionId",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
        };
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

