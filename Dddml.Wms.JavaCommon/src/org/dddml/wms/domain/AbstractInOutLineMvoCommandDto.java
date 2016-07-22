package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import nodamoney.Money;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractInOutLineMvoCommandDto extends AbstractCommandDto
{
    private InOutLineIdDto inOutLineId;

    public InOutLineIdDto getInOutLineId()
    {
        return this.inOutLineId;
    }

    public void setInOutLineId(InOutLineIdDto inOutLineId)
    {
        this.inOutLineId = inOutLineId;
    }

    private Long inOutVersion;

    public Long getInOutVersion()
    {
        return this.inOutVersion;
    }

    public void setInOutVersion(Long inOutVersion)
    {
        this.inOutVersion = inOutVersion;
    }


}

