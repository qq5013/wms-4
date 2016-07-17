package org.dddml.wms.domain;


public class UserRoleIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "userId",
            "roleId",
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

