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

    InOutLineId ()
    {
    }

    public InOutLineId (String inOutDocumentNumber, SkuId skuId)
    {
        this.inOutDocumentNumber = inOutDocumentNumber;
        this.skuId = skuId;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        InOutLineId other = (InOutLineId)obj;
        return true 
            && (inOutDocumentNumber == other.inOutDocumentNumber || (inOutDocumentNumber != null && inOutDocumentNumber.equals(other.inOutDocumentNumber)))
            && (skuId == other.skuId || (skuId != null && skuId.equals(other.skuId)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.inOutDocumentNumber != null) {
            hash += 13 * this.inOutDocumentNumber.hashCode();
        }
        if (this.skuId != null) {
            hash += 13 * this.skuId.hashCode();
        }
        return hash;
    }

}

