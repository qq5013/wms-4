package org.dddml.wms.domain;


public class InOutStateEventIdDto
{
	
    private InOutStateEventId value;

    public InOutStateEventIdDto()
    {
        this(new InOutStateEventId());
    }

    public InOutStateEventIdDto(InOutStateEventId value)
    {
        this.value = value;
    }

    public InOutStateEventId toInOutStateEventId()
    {
        return this.value;
    }

    public String getDocumentNumber()
    {
        return this.value.getDocumentNumber();
    }

    public void setDocumentNumber(String documentNumber)
    {
        this.value.setDocumentNumber(documentNumber);
    }

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
    }


}

