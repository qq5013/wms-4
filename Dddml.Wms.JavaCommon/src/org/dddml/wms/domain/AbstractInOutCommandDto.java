package org.dddml.wms.domain;

import nodamoney.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractInOutCommandDto extends AbstractCommandDto
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


}

