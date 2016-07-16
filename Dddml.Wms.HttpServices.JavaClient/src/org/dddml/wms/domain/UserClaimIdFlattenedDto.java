package org.dddml.wms.domain;


public class UserClaimIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "userId",
            "claimId",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "Integer",
        };
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

