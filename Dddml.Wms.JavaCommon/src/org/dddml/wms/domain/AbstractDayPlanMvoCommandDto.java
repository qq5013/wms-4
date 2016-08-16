package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractDayPlanMvoCommandDto extends AbstractCommand
{
    private DayPlanIdDto dayPlanId;

    public DayPlanIdDto getDayPlanId()
    {
        return this.dayPlanId;
    }

    public void setDayPlanId(DayPlanIdDto dayPlanId)
    {
        this.dayPlanId = dayPlanId;
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

