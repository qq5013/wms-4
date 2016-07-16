package org.dddml.wms.domain;


public class UserRoleIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "userId",
            "roleId",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
        };
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

