package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractAttributeUseCommand extends AbstractCommand implements AttributeUseCommand
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

    private String attributeSetId;

    public String getAttributeSetId()
    {
        return this.attributeSetId;
    }

    public void setAttributeSetId(String attributeSetId)
    {
        this.attributeSetId = attributeSetId;
    }


    public static abstract class AbstractCreateOrMergePatchAttributeUse extends AbstractAttributeUseCommand implements CreateOrMergePatchAttributeUse
    {
        private Integer sequenceNumber;

        public Integer getSequenceNumber()
        {
            return this.sequenceNumber;
        }

        public void setSequenceNumber(Integer sequenceNumber)
        {
            this.sequenceNumber = sequenceNumber;
        }

        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

    }

    public static abstract class AbstractCreateAttributeUse extends AbstractCreateOrMergePatchAttributeUse implements CreateAttributeUse
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchAttributeUse extends AbstractCreateOrMergePatchAttributeUse implements MergePatchAttributeUse
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertySequenceNumberRemoved;

        public Boolean getIsPropertySequenceNumberRemoved()
        {
            return this.isPropertySequenceNumberRemoved;
        }

        public void setIsPropertySequenceNumberRemoved(Boolean removed)
        {
            this.isPropertySequenceNumberRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

    }

    public static class SimpleCreateAttributeUse extends AbstractCreateAttributeUse
    {
    }

    public static class SimpleMergePatchAttributeUse extends AbstractMergePatchAttributeUse
    {
    }

	public static class SimpleRemoveAttributeUse extends AbstractAttributeUseCommand implements RemoveAttributeUse
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

