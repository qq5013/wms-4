package org.dddml.wms.domain;

import org.dddml.wms.domain.SkuId;

public class InOutLineId
{
    private String inOutDocumentNumber;

    public String getInOutDocumentNumber()
    {
        return this.inOutDocumentNumber;
    }

    public void setInOutDocumentNumber(String inOutDocumentNumber)
    {
        this.inOutDocumentNumber = inOutDocumentNumber;
    }

    private SkuId skuId;

    public SkuId getSkuId()
    {
        return this.skuId;
    }

    public void setSkuId(SkuId skuId)
    {
        this.skuId = skuId;
    }

}

