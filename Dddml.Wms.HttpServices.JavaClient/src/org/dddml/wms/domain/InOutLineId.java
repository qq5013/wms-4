package org.dddml.wms.domain;


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

    public String getSkuIdProductId()
    {
        return getSkuId().getProductId();
    }

    public void setSkuIdProductId(String skuIdProductId)
    {
        getSkuId().setProductId(skuIdProductId);
    }

    public String getSkuIdAttributeSetInstanceId()
    {
        return getSkuId().getAttributeSetInstanceId();
    }

    public void setSkuIdAttributeSetInstanceId(String skuIdAttributeSetInstanceId)
    {
        getSkuId().setAttributeSetInstanceId(skuIdAttributeSetInstanceId);
    }


}

