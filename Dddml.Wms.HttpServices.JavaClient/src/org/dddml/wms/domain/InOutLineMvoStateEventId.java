package org.dddml.wms.domain;


public class InOutLineMvoStateEventId
{
    private InOutLineId inOutLineId;

    public InOutLineId getInOutLineId()
    {
        return this.inOutLineId;
    }

    public void setInOutLineId(InOutLineId inOutLineId)
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

    public String getInOutLineIdInOutDocumentNumber()
    {
        return getInOutLineId().getInOutDocumentNumber();
    }

    public void setInOutLineIdInOutDocumentNumber(String inOutLineIdInOutDocumentNumber)
    {
        getInOutLineId().setInOutDocumentNumber(inOutLineIdInOutDocumentNumber);
    }

    public String getInOutLineIdSkuIdProductId()
    {
        return getInOutLineId().getSkuId().getProductId();
    }

    public void setInOutLineIdSkuIdProductId(String inOutLineIdSkuIdProductId)
    {
        getInOutLineId().getSkuId().setProductId(inOutLineIdSkuIdProductId);
    }

    public String getInOutLineIdSkuIdAttributeSetInstanceId()
    {
        return getInOutLineId().getSkuId().getAttributeSetInstanceId();
    }

    public void setInOutLineIdSkuIdAttributeSetInstanceId(String inOutLineIdSkuIdAttributeSetInstanceId)
    {
        getInOutLineId().getSkuId().setAttributeSetInstanceId(inOutLineIdSkuIdAttributeSetInstanceId);
    }


}

