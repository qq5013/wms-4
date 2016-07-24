package org.dddml.wms.domain;

import java.io.Serializable;

public class SkuId implements Serializable
{
    private String productId;

    public String getProductId()
    {
        return this.productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    private String attributeSetInstanceId;

    public String getAttributeSetInstanceId()
    {
        return this.attributeSetInstanceId;
    }

    public void setAttributeSetInstanceId(String attributeSetInstanceId)
    {
        this.attributeSetInstanceId = attributeSetInstanceId;
    }

    SkuId ()
    {
    }

    public SkuId (String productId, String attributeSetInstanceId)
    {
        this.productId = productId;
        this.attributeSetInstanceId = attributeSetInstanceId;
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

        SkuId other = (SkuId)obj;
        return true 
            && (productId == other.productId || (productId != null && productId.equals(other.productId)))
            && (attributeSetInstanceId == other.attributeSetInstanceId || (attributeSetInstanceId != null && attributeSetInstanceId.equals(other.attributeSetInstanceId)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.productId != null) {
            hash += 13 * this.productId.hashCode();
        }
        if (this.attributeSetInstanceId != null) {
            hash += 13 * this.attributeSetInstanceId.hashCode();
        }
        return hash;
    }

}

