package org.dddml.wms.domain;

import java.io.Serializable;

public class UserLoginMvoStateEventId implements Serializable
{
    private UserLoginId userLoginId = new UserLoginId();

    public UserLoginId getUserLoginId()
    {
        return this.userLoginId;
    }

    public void setUserLoginId(UserLoginId userLoginId)
    {
        this.userLoginId = userLoginId;
    }

    private Long userVersion;

    public Long getUserVersion()
    {
        return this.userVersion;
    }

    public void setUserVersion(Long userVersion)
    {
        this.userVersion = userVersion;
    }

    public String getUserLoginIdUserId()
    {
        return getUserLoginId().getUserId();
    }

    public void setUserLoginIdUserId(String userLoginIdUserId)
    {
        getUserLoginId().setUserId(userLoginIdUserId);
    }

    public String getUserLoginIdLoginKeyLoginProvider()
    {
        return getUserLoginId().getLoginKey().getLoginProvider();
    }

    public void setUserLoginIdLoginKeyLoginProvider(String userLoginIdLoginKeyLoginProvider)
    {
        getUserLoginId().getLoginKey().setLoginProvider(userLoginIdLoginKeyLoginProvider);
    }

    public String getUserLoginIdLoginKeyProviderKey()
    {
        return getUserLoginId().getLoginKey().getProviderKey();
    }

    public void setUserLoginIdLoginKeyProviderKey(String userLoginIdLoginKeyProviderKey)
    {
        getUserLoginId().getLoginKey().setProviderKey(userLoginIdLoginKeyProviderKey);
    }

    public UserLoginMvoStateEventId()
    {
    }

    public UserLoginMvoStateEventId(UserLoginId userLoginId, Long userVersion)
    {
        this.userLoginId = userLoginId;
        this.userVersion = userVersion;
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

        UserLoginMvoStateEventId other = (UserLoginMvoStateEventId)obj;
        return true 
            && (userLoginId == other.userLoginId || (userLoginId != null && userLoginId.equals(other.userLoginId)))
            && (userVersion == other.userVersion || (userVersion != null && userVersion.equals(other.userVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.userLoginId != null) {
            hash += 13 * this.userLoginId.hashCode();
        }
        if (this.userVersion != null) {
            hash += 13 * this.userVersion.hashCode();
        }
        return hash;
    }

}

