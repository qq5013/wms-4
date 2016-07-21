package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAttributeUseMvoStateEvent implements AttributeUseMvoStateEvent
{
    private AttributeUseMvoStateEventId stateEventId;

    public AttributeUseMvoStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(AttributeUseMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

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

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
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

    protected AbstractAttributeUseMvoStateEvent() {
    }

    protected AbstractAttributeUseMvoStateEvent(AttributeUseMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractAttributeUseMvoStateCreated extends AbstractAttributeUseMvoStateEvent implements AttributeUseMvoStateCreated
    {
        public AbstractAttributeUseMvoStateCreated() {
        }

        public AbstractAttributeUseMvoStateCreated(AttributeUseMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractAttributeUseMvoStateMergePatched extends AbstractAttributeUseMvoStateEvent implements AttributeUseMvoStateMergePatched
    {
        public AbstractAttributeUseMvoStateMergePatched() {
        }

        public AbstractAttributeUseMvoStateMergePatched(AttributeUseMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertySequenceNumberRemoved;

        public Boolean getIsPropertySequenceNumberRemoved() {
            return this.isPropertySequenceNumberRemoved;
        }

        public void setIsPropertySequenceNumberRemoved(Boolean removed) {
            this.isPropertySequenceNumberRemoved = removed;
        }

        private Boolean isPropertyVersionRemoved;

        public Boolean getIsPropertyVersionRemoved() {
            return this.isPropertyVersionRemoved;
        }

        public void setIsPropertyVersionRemoved(Boolean removed) {
            this.isPropertyVersionRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

        private Boolean isPropertyAttributeSetNameRemoved;

        public Boolean getIsPropertyAttributeSetNameRemoved() {
            return this.isPropertyAttributeSetNameRemoved;
        }

        public void setIsPropertyAttributeSetNameRemoved(Boolean removed) {
            this.isPropertyAttributeSetNameRemoved = removed;
        }

        private Boolean isPropertyAttributeSetOrganizationIdRemoved;

        public Boolean getIsPropertyAttributeSetOrganizationIdRemoved() {
            return this.isPropertyAttributeSetOrganizationIdRemoved;
        }

        public void setIsPropertyAttributeSetOrganizationIdRemoved(Boolean removed) {
            this.isPropertyAttributeSetOrganizationIdRemoved = removed;
        }

        private Boolean isPropertyAttributeSetDescriptionRemoved;

        public Boolean getIsPropertyAttributeSetDescriptionRemoved() {
            return this.isPropertyAttributeSetDescriptionRemoved;
        }

        public void setIsPropertyAttributeSetDescriptionRemoved(Boolean removed) {
            this.isPropertyAttributeSetDescriptionRemoved = removed;
        }

        private Boolean isPropertyAttributeSetSerialNumberAttributeIdRemoved;

        public Boolean getIsPropertyAttributeSetSerialNumberAttributeIdRemoved() {
            return this.isPropertyAttributeSetSerialNumberAttributeIdRemoved;
        }

        public void setIsPropertyAttributeSetSerialNumberAttributeIdRemoved(Boolean removed) {
            this.isPropertyAttributeSetSerialNumberAttributeIdRemoved = removed;
        }

        private Boolean isPropertyAttributeSetLotAttributeIdRemoved;

        public Boolean getIsPropertyAttributeSetLotAttributeIdRemoved() {
            return this.isPropertyAttributeSetLotAttributeIdRemoved;
        }

        public void setIsPropertyAttributeSetLotAttributeIdRemoved(Boolean removed) {
            this.isPropertyAttributeSetLotAttributeIdRemoved = removed;
        }

        private Boolean isPropertyAttributeSetReferenceIdRemoved;

        public Boolean getIsPropertyAttributeSetReferenceIdRemoved() {
            return this.isPropertyAttributeSetReferenceIdRemoved;
        }

        public void setIsPropertyAttributeSetReferenceIdRemoved(Boolean removed) {
            this.isPropertyAttributeSetReferenceIdRemoved = removed;
        }

        private Boolean isPropertyAttributeSetCreatedByRemoved;

        public Boolean getIsPropertyAttributeSetCreatedByRemoved() {
            return this.isPropertyAttributeSetCreatedByRemoved;
        }

        public void setIsPropertyAttributeSetCreatedByRemoved(Boolean removed) {
            this.isPropertyAttributeSetCreatedByRemoved = removed;
        }

        private Boolean isPropertyAttributeSetCreatedAtRemoved;

        public Boolean getIsPropertyAttributeSetCreatedAtRemoved() {
            return this.isPropertyAttributeSetCreatedAtRemoved;
        }

        public void setIsPropertyAttributeSetCreatedAtRemoved(Boolean removed) {
            this.isPropertyAttributeSetCreatedAtRemoved = removed;
        }

        private Boolean isPropertyAttributeSetUpdatedByRemoved;

        public Boolean getIsPropertyAttributeSetUpdatedByRemoved() {
            return this.isPropertyAttributeSetUpdatedByRemoved;
        }

        public void setIsPropertyAttributeSetUpdatedByRemoved(Boolean removed) {
            this.isPropertyAttributeSetUpdatedByRemoved = removed;
        }

        private Boolean isPropertyAttributeSetUpdatedAtRemoved;

        public Boolean getIsPropertyAttributeSetUpdatedAtRemoved() {
            return this.isPropertyAttributeSetUpdatedAtRemoved;
        }

        public void setIsPropertyAttributeSetUpdatedAtRemoved(Boolean removed) {
            this.isPropertyAttributeSetUpdatedAtRemoved = removed;
        }

        private Boolean isPropertyAttributeSetActiveRemoved;

        public Boolean getIsPropertyAttributeSetActiveRemoved() {
            return this.isPropertyAttributeSetActiveRemoved;
        }

        public void setIsPropertyAttributeSetActiveRemoved(Boolean removed) {
            this.isPropertyAttributeSetActiveRemoved = removed;
        }

        private Boolean isPropertyAttributeSetDeletedRemoved;

        public Boolean getIsPropertyAttributeSetDeletedRemoved() {
            return this.isPropertyAttributeSetDeletedRemoved;
        }

        public void setIsPropertyAttributeSetDeletedRemoved(Boolean removed) {
            this.isPropertyAttributeSetDeletedRemoved = removed;
        }

    }


    public static abstract class AbstractAttributeUseMvoStateDeleted extends AbstractAttributeUseMvoStateEvent implements AttributeUseMvoStateDeleted
    {
        public AbstractAttributeUseMvoStateDeleted() {
        }

        public AbstractAttributeUseMvoStateDeleted(AttributeUseMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
        public static class SimpleAttributeUseMvoStateCreated extends AbstractAttributeUseMvoStateCreated
        {
			public SimpleAttributeUseMvoStateCreated() {
			}

			public SimpleAttributeUseMvoStateCreated(AttributeUseMvoStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeUseMvoStateMergePatched extends AbstractAttributeUseMvoStateMergePatched
        {
			public SimpleAttributeUseMvoStateMergePatched() {
			}

			public SimpleAttributeUseMvoStateMergePatched(AttributeUseMvoStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeUseMvoStateDeleted extends AbstractAttributeUseMvoStateDeleted
        {
			public SimpleAttributeUseMvoStateDeleted() {
			}

			public SimpleAttributeUseMvoStateDeleted(AttributeUseMvoStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

