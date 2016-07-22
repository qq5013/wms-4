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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        DocumentActionDto other = (DocumentActionDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

