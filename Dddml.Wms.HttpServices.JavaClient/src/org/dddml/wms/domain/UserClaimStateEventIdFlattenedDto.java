package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserClaimStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userId",
            "claimId",
            "userVersion",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "Integer",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private UserClaimStateEventId value;

    public UserClaimStateEventIdFlattenedDto()
    {
        this(new UserClaimStateEventId());
    }

    public UserClaimStateEventIdFlattenedDto(UserClaimStateEventId value)
    {
        this.value = value;
    }

    public UserClaimStateEventId toUserClaimStateEventId()
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

        UserClaimStateEventIdFlattenedDto other = (UserClaimStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

