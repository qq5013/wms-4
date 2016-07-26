package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserClaimCommandDto extends AbstractCommand
{
    private Integer claimId;

    public Integer getClaimId()
    {
        return this.claimId;
    }

    public void setClaimId(Integer claimId)
    {
        this.claimId = claimId;
    }


}

