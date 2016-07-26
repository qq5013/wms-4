package org.dddml.wms.domain;

import java.io.Serializable;

public class DocumentAction implements Serializable
{
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    DocumentAction ()
    {
    }

    public DocumentAction (String name)
    {
        this.name = name;
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

        DocumentAction other = (DocumentAction)obj;
        return true 
            && (name == other.name || (name != null && name.equals(other.name)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.name != null) {
            hash += 13 * this.name.hashCode();
        }
        return hash;
    }

}

