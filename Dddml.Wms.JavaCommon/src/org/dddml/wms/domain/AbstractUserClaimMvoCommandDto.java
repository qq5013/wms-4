package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserClaimMvoCommandDto extends AbstractCommand
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

