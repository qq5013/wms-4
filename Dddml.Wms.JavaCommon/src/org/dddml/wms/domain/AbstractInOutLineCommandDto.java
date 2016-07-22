package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractInOutLineCommandDto extends AbstractCommandDto
{
    private SkuIdDto skuId;

    public SkuIdDto getSkuId()
    {
        return this.skuId;
    }

    public void setSkuId(SkuIdDto skuId)
    {
        this.skuId = skuId;
    }


}

