package org.dddml.wms.domain;

import org.dddml.wms.domain.UserLoginIdDto;
import java.util.Date;
import org.dddml.wms.domain.UserRoleStateDto;
import org.dddml.wms.domain.UserClaimStateDto;
import org.dddml.wms.domain.UserPermissionStateDto;
import org.dddml.wms.domain.UserLoginStateDto;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractUserLoginMvoCommandDto extends AbstractCommandDto
{
    private UserLoginIdDto userLoginId;

    public UserLoginIdDto getUserLoginId()
    {
        return this.userLoginId;
    }

    public void setUserLoginId(UserLoginIdDto userLoginId)
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


}

