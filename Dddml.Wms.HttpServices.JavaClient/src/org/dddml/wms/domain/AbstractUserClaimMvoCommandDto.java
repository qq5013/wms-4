package org.dddml.wms.domain;

import org.dddml.wms.domain.UserClaimIdDto;
import java.util.Date;
import org.dddml.wms.domain.UserRoleStateDto;
import org.dddml.wms.domain.UserClaimStateDto;
import org.dddml.wms.domain.UserPermissionStateDto;
import org.dddml.wms.domain.UserLoginStateDto;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractUserClaimMvoCommandDto extends AbstractCommandDto
{
    private UserClaimIdDto userClaimId;

    public UserClaimIdDto getUserClaimId()
    {
        return this.userClaimId;
    }

    public void setUserClaimId(UserClaimIdDto userClaimId)
    {
        this.userClaimId = userClaimId;
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

