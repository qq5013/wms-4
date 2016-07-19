package org.dddml.wms.domain;


public class UserLoginMvoStateEventId
{
    private UserLoginId userLoginId;

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


}

