package org.dddml.wms.domain;


public class SkuId
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

}

