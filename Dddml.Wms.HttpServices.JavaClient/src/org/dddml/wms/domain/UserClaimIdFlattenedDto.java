package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserClaimIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userId",
            "claimId",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "Integer",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
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

