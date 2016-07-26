package org.dddml.wms.domain;

import java.io.Serializable;

public class InOutStateEventId implements Serializable
{
    private String documentNumber;

    public String getDocumentNumber()
    {
        return this.documentNumber;
    }

    public void setDocumentNumber(String documentNumber)
    {
        this.documentNumber = documentNumber;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    InOutStateEventId ()
    {
    }

    public InOutStateEventId (String documentNumber, Long version)
    {
        this.documentNumber = documentNumber;
        this.version = version;
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

        InOutStateEventId other = (InOutStateEventId)obj;
        return true 
            && (documentNumber == other.documentNumber || (documentNumber != null && documentNumber.equals(other.documentNumber)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.documentNumber != null) {
            hash += 13 * this.documentNumber.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

