package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class UserClaimMvoStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "userClaimIdUserId",
            "userClaimIdClaimId",
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
	
    private UserClaimMvoStateEventId value;

    public UserClaimMvoStateEventIdFlattenedDto()
    {
        this(new UserClaimMvoStateEventId());
    }

    public UserClaimMvoStateEventIdFlattenedDto(UserClaimMvoStateEventId value)
    {
        this.value = value;
    }

    public UserClaimMvoStateEventId toUserClaimMvoStateEventId()
    {
        return this.value;
    }


    public String getUserClaimIdUserId()
    {
        return this.value.getUserClaimId().getUserId();
    }

    public void setUserClaimIdUserId(String userClaimIdUserId)
    {
        this.value.getUserClaimId().setUserId(userClaimIdUserId);
    }

    public Integer getUserClaimIdClaimId()
    {
        return this.value.getUserClaimId().getClaimId();
    }

    public void setUserClaimIdClaimId(Integer userClaimIdClaimId)
    {
        this.value.getUserClaimId().setClaimId(userClaimIdClaimId);
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

        UserClaimMvoStateEventIdFlattenedDto other = (UserClaimMvoStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

