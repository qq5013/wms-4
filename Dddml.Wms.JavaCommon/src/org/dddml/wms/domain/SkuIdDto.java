package org.dddml.wms.domain;


public class SkuIdDto
{
	
    private SkuId value;

    public SkuIdDto()
    {
        this(new SkuId());
    }

    public SkuIdDto(SkuId value)
    {
        this.value = value;
    }

    public SkuId toSkuId()
    {
        return this.value;
    }

    public String getProductId()
    {
        return this.value.getProductId();
    }

    public void setProductId(String productId)
    {
        this.value.setProductId(productId);
    }

    public String getAttributeSetInstanceId()
    {
        return this.value.getAttributeSetInstanceId();
    }

    public void setAttributeSetInstanceId(String attributeSetInstanceId)
    {
        this.value.setAttributeSetInstanceId(attributeSetInstanceId);
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

        SkuIdDto other = (SkuIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

