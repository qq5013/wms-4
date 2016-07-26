package org.dddml.wms.domain;

import java.io.Serializable;

public class InOutLineStateEventId implements Serializable
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

    private SkuId skuId = new SkuId();

    public SkuId getSkuId()
    {
        return this.skuId;
    }

    public void setSkuId(SkuId skuId)
    {
        this.skuId = skuId;
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

    InOutLineStateEventId ()
    {
    }

    public InOutLineStateEventId (String inOutDocumentNumber, SkuId skuId, Long inOutVersion)
    {
        this.inOutDocumentNumber = inOutDocumentNumber;
        this.skuId = skuId;
        this.inOutVersion = inOutVersion;
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

        InOutLineStateEventId other = (InOutLineStateEventId)obj;
        return true 
            && (inOutDocumentNumber == other.inOutDocumentNumber || (inOutDocumentNumber != null && inOutDocumentNumber.equals(other.inOutDocumentNumber)))
            && (skuId == other.skuId || (skuId != null && skuId.equals(other.skuId)))
            && (inOutVersion == other.inOutVersion || (inOutVersion != null && inOutVersion.equals(other.inOutVersion)))
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
        if (this.inOutVersion != null) {
            hash += 13 * this.inOutVersion.hashCode();
        }
        return hash;
    }

}

