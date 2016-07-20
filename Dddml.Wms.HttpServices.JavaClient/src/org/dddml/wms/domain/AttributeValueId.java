package org.dddml.wms.domain;


public class AttributeValueId
{
    private String attributeId;

    public String getAttributeId()
    {
        return this.attributeId;
    }

    public void setAttributeId(String attributeId)
    {
        this.attributeId = attributeId;
    }

    private String value;

    public String getValue()
    {
        return this.value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    AttributeValueId ()
    {
    }

    public AttributeValueId (String attributeId, String value)
    {
        this.attributeId = attributeId;
        this.value = value;
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

        AttributeValueId other = (AttributeValueId)obj;
        return true 
            && (attributeId == other.attributeId || (attributeId != null && attributeId.equals(other.attributeId)))
            && (value == other.value || (value != null && value.equals(other.value)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.attributeId != null) {
            hash += 13 * this.attributeId.hashCode();
        }
        if (this.value != null) {
            hash += 13 * this.value.hashCode();
        }
        return hash;
    }

}

