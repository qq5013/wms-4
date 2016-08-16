package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractYearPlanMvoCommandDto extends AbstractCommand
{
    private YearPlanIdDto yearPlanId;

    public YearPlanIdDto getYearPlanId()
    {
        return this.yearPlanId;
    }

    public void setYearPlanId(YearPlanIdDto yearPlanId)
    {
        this.yearPlanId = yearPlanId;
    }

    private Long personVersion;

    public Long getPersonVersion()
    {
        return this.personVersion;
    }

    public void setPersonVersion(Long personVersion)
    {
        this.personVersion = personVersion;
    }


}

