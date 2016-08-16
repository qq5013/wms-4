package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractMonthPlanMvoCommandDto extends AbstractCommand
{
    private MonthPlanIdDto monthPlanId;

    public MonthPlanIdDto getMonthPlanId()
    {
        return this.monthPlanId;
    }

    public void setMonthPlanId(MonthPlanIdDto monthPlanId)
    {
        this.monthPlanId = monthPlanId;
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

