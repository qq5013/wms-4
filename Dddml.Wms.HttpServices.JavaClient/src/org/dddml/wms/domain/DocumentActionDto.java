package org.dddml.wms.domain;


public class DocumentActionDto
{
	
    private DocumentAction value;

    public DocumentActionDto()
    {
        this(new DocumentAction());
    }

    public DocumentActionDto(DocumentAction value)
    {
        this.value = value;
    }

    public DocumentAction toDocumentAction()
    {
        return this.value;
    }

    public String getName()
    {
        return this.value.getName();
    }

    public void setName(String name)
    {
        this.value.setName(name);
    }


}

