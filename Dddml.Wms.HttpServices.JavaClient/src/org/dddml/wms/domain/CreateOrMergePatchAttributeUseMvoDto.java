package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeSetAttributeUseIdDto;
import java.util.Date;
import org.dddml.wms.domain.AttributeUseStateDto;

public class CreateOrMergePatchAttributeUseMvoDto extends AbstractAttributeUseMvoCommandDto
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

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
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

    private String attributeSetName;

    public String getAttributeSetName()
    {
        return this.attributeSetName;
    }

    public void setAttributeSetName(String attributeSetName)
    {
        this.attributeSetName = attributeSetName;
    }

    private String attributeSetOrganizationId;

    public String getAttributeSetOrganizationId()
    {
        return this.attributeSetOrganizationId;
    }

    public void setAttributeSetOrganizationId(String attributeSetOrganizationId)
    {
        this.attributeSetOrganizationId = attributeSetOrganizationId;
    }

    private String attributeSetDescription;

    public String getAttributeSetDescription()
    {
        return this.attributeSetDescription;
    }

    public void setAttributeSetDescription(String attributeSetDescription)
    {
        this.attributeSetDescription = attributeSetDescription;
    }

    private String attributeSetSerialNumberAttributeId;

    public String getAttributeSetSerialNumberAttributeId()
    {
        return this.attributeSetSerialNumberAttributeId;
    }

    public void setAttributeSetSerialNumberAttributeId(String attributeSetSerialNumberAttributeId)
    {
        this.attributeSetSerialNumberAttributeId = attributeSetSerialNumberAttributeId;
    }

    private String attributeSetLotAttributeId;

    public String getAttributeSetLotAttributeId()
    {
        return this.attributeSetLotAttributeId;
    }

    public void setAttributeSetLotAttributeId(String attributeSetLotAttributeId)
    {
        this.attributeSetLotAttributeId = attributeSetLotAttributeId;
    }

    private String attributeSetReferenceId;

    public String getAttributeSetReferenceId()
    {
        return this.attributeSetReferenceId;
    }

    public void setAttributeSetReferenceId(String attributeSetReferenceId)
    {
        this.attributeSetReferenceId = attributeSetReferenceId;
    }

    private String attributeSetCreatedBy;

    public String getAttributeSetCreatedBy()
    {
        return this.attributeSetCreatedBy;
    }

    public void setAttributeSetCreatedBy(String attributeSetCreatedBy)
    {
        this.attributeSetCreatedBy = attributeSetCreatedBy;
    }

    private Date attributeSetCreatedAt;

    public Date getAttributeSetCreatedAt()
    {
        return this.attributeSetCreatedAt;
    }

    public void setAttributeSetCreatedAt(Date attributeSetCreatedAt)
    {
        this.attributeSetCreatedAt = attributeSetCreatedAt;
    }

    private String attributeSetUpdatedBy;

    public String getAttributeSetUpdatedBy()
    {
        return this.attributeSetUpdatedBy;
    }

    public void setAttributeSetUpdatedBy(String attributeSetUpdatedBy)
    {
        this.attributeSetUpdatedBy = attributeSetUpdatedBy;
    }

    private Date attributeSetUpdatedAt;

    public Date getAttributeSetUpdatedAt()
    {
        return this.attributeSetUpdatedAt;
    }

    public void setAttributeSetUpdatedAt(Date attributeSetUpdatedAt)
    {
        this.attributeSetUpdatedAt = attributeSetUpdatedAt;
    }

    private Boolean attributeSetActive;

    public Boolean getAttributeSetActive()
    {
        return this.attributeSetActive;
    }

    public void setAttributeSetActive(Boolean attributeSetActive)
    {
        this.attributeSetActive = attributeSetActive;
    }

    private Boolean attributeSetDeleted;

    public Boolean getAttributeSetDeleted()
    {
        return this.attributeSetDeleted;
    }

    public void setAttributeSetDeleted(Boolean attributeSetDeleted)
    {
        this.attributeSetDeleted = attributeSetDeleted;
    }

    private Boolean isPropertySequenceNumberRemoved;

    public Boolean getIsPropertySequenceNumberRemoved()
    {
        return this.isPropertySequenceNumberRemoved;
    }

    public void setIsPropertySequenceNumberRemoved(Boolean isPropertySequenceNumberRemoved)
    {
        this.isPropertySequenceNumberRemoved = isPropertySequenceNumberRemoved;
    }

    private Boolean isPropertyVersionRemoved;

    public Boolean getIsPropertyVersionRemoved()
    {
        return this.isPropertyVersionRemoved;
    }

    public void setIsPropertyVersionRemoved(Boolean isPropertyVersionRemoved)
    {
        this.isPropertyVersionRemoved = isPropertyVersionRemoved;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }

    private Boolean isPropertyAttributeSetNameRemoved;

    public Boolean getIsPropertyAttributeSetNameRemoved()
    {
        return this.isPropertyAttributeSetNameRemoved;
    }

    public void setIsPropertyAttributeSetNameRemoved(Boolean isPropertyAttributeSetNameRemoved)
    {
        this.isPropertyAttributeSetNameRemoved = isPropertyAttributeSetNameRemoved;
    }

    private Boolean isPropertyAttributeSetOrganizationIdRemoved;

    public Boolean getIsPropertyAttributeSetOrganizationIdRemoved()
    {
        return this.isPropertyAttributeSetOrganizationIdRemoved;
    }

    public void setIsPropertyAttributeSetOrganizationIdRemoved(Boolean isPropertyAttributeSetOrganizationIdRemoved)
    {
        this.isPropertyAttributeSetOrganizationIdRemoved = isPropertyAttributeSetOrganizationIdRemoved;
    }

    private Boolean isPropertyAttributeSetDescriptionRemoved;

    public Boolean getIsPropertyAttributeSetDescriptionRemoved()
    {
        return this.isPropertyAttributeSetDescriptionRemoved;
    }

    public void setIsPropertyAttributeSetDescriptionRemoved(Boolean isPropertyAttributeSetDescriptionRemoved)
    {
        this.isPropertyAttributeSetDescriptionRemoved = isPropertyAttributeSetDescriptionRemoved;
    }

    private Boolean isPropertyAttributeSetSerialNumberAttributeIdRemoved;

    public Boolean getIsPropertyAttributeSetSerialNumberAttributeIdRemoved()
    {
        return this.isPropertyAttributeSetSerialNumberAttributeIdRemoved;
    }

    public void setIsPropertyAttributeSetSerialNumberAttributeIdRemoved(Boolean isPropertyAttributeSetSerialNumberAttributeIdRemoved)
    {
        this.isPropertyAttributeSetSerialNumberAttributeIdRemoved = isPropertyAttributeSetSerialNumberAttributeIdRemoved;
    }

    private Boolean isPropertyAttributeSetLotAttributeIdRemoved;

    public Boolean getIsPropertyAttributeSetLotAttributeIdRemoved()
    {
        return this.isPropertyAttributeSetLotAttributeIdRemoved;
    }

    public void setIsPropertyAttributeSetLotAttributeIdRemoved(Boolean isPropertyAttributeSetLotAttributeIdRemoved)
    {
        this.isPropertyAttributeSetLotAttributeIdRemoved = isPropertyAttributeSetLotAttributeIdRemoved;
    }

    private Boolean isPropertyAttributeSetReferenceIdRemoved;

    public Boolean getIsPropertyAttributeSetReferenceIdRemoved()
    {
        return this.isPropertyAttributeSetReferenceIdRemoved;
    }

    public void setIsPropertyAttributeSetReferenceIdRemoved(Boolean isPropertyAttributeSetReferenceIdRemoved)
    {
        this.isPropertyAttributeSetReferenceIdRemoved = isPropertyAttributeSetReferenceIdRemoved;
    }

    private Boolean isPropertyAttributeSetCreatedByRemoved;

    public Boolean getIsPropertyAttributeSetCreatedByRemoved()
    {
        return this.isPropertyAttributeSetCreatedByRemoved;
    }

    public void setIsPropertyAttributeSetCreatedByRemoved(Boolean isPropertyAttributeSetCreatedByRemoved)
    {
        this.isPropertyAttributeSetCreatedByRemoved = isPropertyAttributeSetCreatedByRemoved;
    }

    private Boolean isPropertyAttributeSetCreatedAtRemoved;

    public Boolean getIsPropertyAttributeSetCreatedAtRemoved()
    {
        return this.isPropertyAttributeSetCreatedAtRemoved;
    }

    public void setIsPropertyAttributeSetCreatedAtRemoved(Boolean isPropertyAttributeSetCreatedAtRemoved)
    {
        this.isPropertyAttributeSetCreatedAtRemoved = isPropertyAttributeSetCreatedAtRemoved;
    }

    private Boolean isPropertyAttributeSetUpdatedByRemoved;

    public Boolean getIsPropertyAttributeSetUpdatedByRemoved()
    {
        return this.isPropertyAttributeSetUpdatedByRemoved;
    }

    public void setIsPropertyAttributeSetUpdatedByRemoved(Boolean isPropertyAttributeSetUpdatedByRemoved)
    {
        this.isPropertyAttributeSetUpdatedByRemoved = isPropertyAttributeSetUpdatedByRemoved;
    }

    private Boolean isPropertyAttributeSetUpdatedAtRemoved;

    public Boolean getIsPropertyAttributeSetUpdatedAtRemoved()
    {
        return this.isPropertyAttributeSetUpdatedAtRemoved;
    }

    public void setIsPropertyAttributeSetUpdatedAtRemoved(Boolean isPropertyAttributeSetUpdatedAtRemoved)
    {
        this.isPropertyAttributeSetUpdatedAtRemoved = isPropertyAttributeSetUpdatedAtRemoved;
    }

    private Boolean isPropertyAttributeSetActiveRemoved;

    public Boolean getIsPropertyAttributeSetActiveRemoved()
    {
        return this.isPropertyAttributeSetActiveRemoved;
    }

    public void setIsPropertyAttributeSetActiveRemoved(Boolean isPropertyAttributeSetActiveRemoved)
    {
        this.isPropertyAttributeSetActiveRemoved = isPropertyAttributeSetActiveRemoved;
    }

    private Boolean isPropertyAttributeSetDeletedRemoved;

    public Boolean getIsPropertyAttributeSetDeletedRemoved()
    {
        return this.isPropertyAttributeSetDeletedRemoved;
    }

    public void setIsPropertyAttributeSetDeletedRemoved(Boolean isPropertyAttributeSetDeletedRemoved)
    {
        this.isPropertyAttributeSetDeletedRemoved = isPropertyAttributeSetDeletedRemoved;
    }


    public static class CreateAttributeUseMvoDto extends CreateOrMergePatchAttributeUseMvoDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchAttributeUseMvoDto extends CreateOrMergePatchAttributeUseMvoDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

