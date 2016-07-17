package org.dddml.wms.domain;


public class UserClaimIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "userId",
            "claimId",
        };

    private static String[] _propertyTypes = new String[]{
            "String",
            "Integer",
        };

    public static String[] getPropertyNames()
    {
        return _propertyNames;
    }

    public static String[] getPropertyTypes()
    {
        return _propertyTypes;
    }
	
    private UserClaimId value;

    public UserClaimIdFlattenedDto()
    {
        this(new UserClaimId());
    }

    public UserClaimIdFlattenedDto(UserClaimId value)
    {
        this.value = value;
    }

    public UserClaimId toUserClaimId()
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


    public Integer getClaimId()
    {
        return this.value.getClaimId();
    }

    public void setClaimId(Integer claimId)
    {
        this.value.setClaimId(claimId);
    }


}

