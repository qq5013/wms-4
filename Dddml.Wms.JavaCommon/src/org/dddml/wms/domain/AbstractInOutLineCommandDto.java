package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractInOutLineCommandDto extends AbstractCommand
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

