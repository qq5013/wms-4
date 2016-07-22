package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchAttributeUseDto extends AbstractAttributeUseCommandDto
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


    public static class CreateAttributeUseDto extends CreateOrMergePatchAttributeUseDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchAttributeUseDto extends CreateOrMergePatchAttributeUseDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

