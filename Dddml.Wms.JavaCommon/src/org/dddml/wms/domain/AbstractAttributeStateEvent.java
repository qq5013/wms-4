package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAttributeStateEvent implements AttributeStateEvent
{
    private AttributeStateEventId stateEventId;

    public AttributeStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(AttributeStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private String organizationId;

    public String getOrganizationId()
    {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
    }

    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    private Boolean isMandatory;

    public Boolean getIsMandatory()
    {
        return this.isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory)
    {
        this.isMandatory = isMandatory;
    }

    private Boolean isInstanceAttribute;

    public Boolean getIsInstanceAttribute()
    {
        return this.isInstanceAttribute;
    }

    public void setIsInstanceAttribute(Boolean isInstanceAttribute)
    {
        this.isInstanceAttribute = isInstanceAttribute;
    }

    private String attributeValueType;

    public String getAttributeValueType()
    {
        return this.attributeValueType;
    }

    public void setAttributeValueType(String attributeValueType)
    {
        this.attributeValueType = attributeValueType;
    }

    private Integer attributeValueLength;

    public Integer getAttributeValueLength()
    {
        return this.attributeValueLength;
    }

    public void setAttributeValueLength(Integer attributeValueLength)
    {
        this.attributeValueLength = attributeValueLength;
    }

    private Boolean isList;

    public Boolean getIsList()
    {
        return this.isList;
    }

    public void setIsList(Boolean isList)
    {
        this.isList = isList;
    }

    private String fieldName;

    public String getFieldName()
    {
        return this.fieldName;
    }

    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }

    private String referenceId;

    public String getReferenceId()
    {
        return this.referenceId;
    }

    public void setReferenceId(String referenceId)
    {
        this.referenceId = referenceId;
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


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractAttributeStateEvent() {
    }

    protected AbstractAttributeStateEvent(AttributeStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }

    protected AttributeValueStateEventDao getAttributeValueStateEventDao() {
        return (AttributeValueStateEventDao)ApplicationContext.current.get("AttributeValueStateEventDao");
    }

    protected AttributeValueStateEventId newAttributeValueStateEventId(String value)
    {
        AttributeValueStateEventId stateEventId = new AttributeValueStateEventId(this.getStateEventId().getAttributeId(), 
            value, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(AttributeValueStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(AttributeStateEvent oe, AttributeValueStateEvent e)
    {
        if (!oe.getStateEventId().getAttributeId().equals(e.getStateEventId().getAttributeId()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id AttributeId %1$s but inner id AttributeId %2$s", 
                oe.getStateEventId().getAttributeId(), e.getStateEventId().getAttributeId());
        }
    }

    public AttributeValueStateEvent.AttributeValueStateCreated newAttributeValueStateCreated(String value) {
        return new AbstractAttributeValueStateEvent.SimpleAttributeValueStateCreated(newAttributeValueStateEventId(value));
    }

    public AttributeValueStateEvent.AttributeValueStateMergePatched newAttributeValueStateMergePatched(String value) {
        return new AbstractAttributeValueStateEvent.SimpleAttributeValueStateMergePatched(newAttributeValueStateEventId(value));
    }

    public AttributeValueStateEvent.AttributeValueStateRemoved newAttributeValueStateRemoved(String value) {
        return new AbstractAttributeValueStateEvent.SimpleAttributeValueStateRemoved(newAttributeValueStateEventId(value));
    }


    public abstract String getStateEventType();


    public static abstract class AbstractAttributeStateCreated extends AbstractAttributeStateEvent implements AttributeStateCreated, Saveable
    {
        public AbstractAttributeStateCreated() {
        }

        public AbstractAttributeStateCreated(AttributeStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

        private Map<AttributeValueStateEventId, AttributeValueStateEvent.AttributeValueStateCreated> attributeValueEvents = new HashMap<AttributeValueStateEventId, AttributeValueStateEvent.AttributeValueStateCreated>();
        
        private Iterable<AttributeValueStateEvent.AttributeValueStateCreated> readOnlyAttributeValueEvents;

        public Iterable<AttributeValueStateEvent.AttributeValueStateCreated> getAttributeValueEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.attributeValueEvents.values();
            }
            else
            {
                if (readOnlyAttributeValueEvents != null) { return readOnlyAttributeValueEvents; }
                AttributeValueStateEventDao eventDao = getAttributeValueStateEventDao();
                List<AttributeValueStateEvent.AttributeValueStateCreated> eL = new ArrayList<AttributeValueStateEvent.AttributeValueStateCreated>();
                for (AttributeValueStateEvent e : eventDao.findByAttributeStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((AttributeValueStateEvent.AttributeValueStateCreated)e);
                }
                return (readOnlyAttributeValueEvents = eL);
            }
        }

        public void setAttributeValueEvents(Iterable<AttributeValueStateEvent.AttributeValueStateCreated> es)
        {
            if (es != null)
            {
                for (AttributeValueStateEvent.AttributeValueStateCreated e : es)
                {
                    addAttributeValueEvent(e);
                }
            }
            else { this.attributeValueEvents.clear(); }
        }
        
        public void addAttributeValueEvent(AttributeValueStateEvent.AttributeValueStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.attributeValueEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (AttributeValueStateEvent.AttributeValueStateCreated e : this.getAttributeValueEvents()) {
                getAttributeValueStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractAttributeStateMergePatched extends AbstractAttributeStateEvent implements AttributeStateMergePatched, Saveable
    {
        public AbstractAttributeStateMergePatched() {
        }

        public AbstractAttributeStateMergePatched(AttributeStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyNameRemoved;

        public Boolean getIsPropertyNameRemoved() {
            return this.isPropertyNameRemoved;
        }

        public void setIsPropertyNameRemoved(Boolean removed) {
            this.isPropertyNameRemoved = removed;
        }

        private Boolean isPropertyOrganizationIdRemoved;

        public Boolean getIsPropertyOrganizationIdRemoved() {
            return this.isPropertyOrganizationIdRemoved;
        }

        public void setIsPropertyOrganizationIdRemoved(Boolean removed) {
            this.isPropertyOrganizationIdRemoved = removed;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved() {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed) {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyIsMandatoryRemoved;

        public Boolean getIsPropertyIsMandatoryRemoved() {
            return this.isPropertyIsMandatoryRemoved;
        }

        public void setIsPropertyIsMandatoryRemoved(Boolean removed) {
            this.isPropertyIsMandatoryRemoved = removed;
        }

        private Boolean isPropertyIsInstanceAttributeRemoved;

        public Boolean getIsPropertyIsInstanceAttributeRemoved() {
            return this.isPropertyIsInstanceAttributeRemoved;
        }

        public void setIsPropertyIsInstanceAttributeRemoved(Boolean removed) {
            this.isPropertyIsInstanceAttributeRemoved = removed;
        }

        private Boolean isPropertyAttributeValueTypeRemoved;

        public Boolean getIsPropertyAttributeValueTypeRemoved() {
            return this.isPropertyAttributeValueTypeRemoved;
        }

        public void setIsPropertyAttributeValueTypeRemoved(Boolean removed) {
            this.isPropertyAttributeValueTypeRemoved = removed;
        }

        private Boolean isPropertyAttributeValueLengthRemoved;

        public Boolean getIsPropertyAttributeValueLengthRemoved() {
            return this.isPropertyAttributeValueLengthRemoved;
        }

        public void setIsPropertyAttributeValueLengthRemoved(Boolean removed) {
            this.isPropertyAttributeValueLengthRemoved = removed;
        }

        private Boolean isPropertyIsListRemoved;

        public Boolean getIsPropertyIsListRemoved() {
            return this.isPropertyIsListRemoved;
        }

        public void setIsPropertyIsListRemoved(Boolean removed) {
            this.isPropertyIsListRemoved = removed;
        }

        private Boolean isPropertyFieldNameRemoved;

        public Boolean getIsPropertyFieldNameRemoved() {
            return this.isPropertyFieldNameRemoved;
        }

        public void setIsPropertyFieldNameRemoved(Boolean removed) {
            this.isPropertyFieldNameRemoved = removed;
        }

        private Boolean isPropertyReferenceIdRemoved;

        public Boolean getIsPropertyReferenceIdRemoved() {
            return this.isPropertyReferenceIdRemoved;
        }

        public void setIsPropertyReferenceIdRemoved(Boolean removed) {
            this.isPropertyReferenceIdRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

        private Map<AttributeValueStateEventId, AttributeValueStateEvent> attributeValueEvents = new HashMap<AttributeValueStateEventId, AttributeValueStateEvent>();
        
        private Iterable<AttributeValueStateEvent> readOnlyAttributeValueEvents;

        public Iterable<AttributeValueStateEvent> getAttributeValueEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.attributeValueEvents.values();
            }
            else
            {
                if (readOnlyAttributeValueEvents != null) { return readOnlyAttributeValueEvents; }
                AttributeValueStateEventDao eventDao = getAttributeValueStateEventDao();
                List<AttributeValueStateEvent> eL = new ArrayList<AttributeValueStateEvent>();
                for (AttributeValueStateEvent e : eventDao.findByAttributeStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((AttributeValueStateEvent)e);
                }
                return (readOnlyAttributeValueEvents = eL);
            }
        }

        public void setAttributeValueEvents(Iterable<AttributeValueStateEvent> es)
        {
            if (es != null)
            {
                for (AttributeValueStateEvent e : es)
                {
                    addAttributeValueEvent(e);
                }
            }
            else { this.attributeValueEvents.clear(); }
        }
        
        public void addAttributeValueEvent(AttributeValueStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.attributeValueEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (AttributeValueStateEvent e : this.getAttributeValueEvents()) {
                getAttributeValueStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractAttributeStateDeleted extends AbstractAttributeStateEvent implements AttributeStateDeleted, Saveable
    {
        public AbstractAttributeStateDeleted() {
        }

        public AbstractAttributeStateDeleted(AttributeStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

		
        private Map<AttributeValueStateEventId, AttributeValueStateEvent.AttributeValueStateRemoved> attributeValueEvents = new HashMap<AttributeValueStateEventId, AttributeValueStateEvent.AttributeValueStateRemoved>();
        
        private Iterable<AttributeValueStateEvent.AttributeValueStateRemoved> readOnlyAttributeValueEvents;

        public Iterable<AttributeValueStateEvent.AttributeValueStateRemoved> getAttributeValueEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.attributeValueEvents.values();
            }
            else
            {
                if (readOnlyAttributeValueEvents != null) { return readOnlyAttributeValueEvents; }
                AttributeValueStateEventDao eventDao = getAttributeValueStateEventDao();
                List<AttributeValueStateEvent.AttributeValueStateRemoved> eL = new ArrayList<AttributeValueStateEvent.AttributeValueStateRemoved>();
                for (AttributeValueStateEvent e : eventDao.findByAttributeStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((AttributeValueStateEvent.AttributeValueStateRemoved)e);
                }
                return (readOnlyAttributeValueEvents = eL);
            }
        }

        public void setAttributeValueEvents(Iterable<AttributeValueStateEvent.AttributeValueStateRemoved> es)
        {
            if (es != null)
            {
                for (AttributeValueStateEvent.AttributeValueStateRemoved e : es)
                {
                    addAttributeValueEvent(e);
                }
            }
            else { this.attributeValueEvents.clear(); }
        }
        
        public void addAttributeValueEvent(AttributeValueStateEvent.AttributeValueStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.attributeValueEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (AttributeValueStateEvent.AttributeValueStateRemoved e : this.getAttributeValueEvents()) {
                getAttributeValueStateEventDao().save(e);
            }
        }
    }
        public static class SimpleAttributeStateCreated extends AbstractAttributeStateCreated
        {
			public SimpleAttributeStateCreated() {
			}

			public SimpleAttributeStateCreated(AttributeStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeStateMergePatched extends AbstractAttributeStateMergePatched
        {
			public SimpleAttributeStateMergePatched() {
			}

			public SimpleAttributeStateMergePatched(AttributeStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeStateDeleted extends AbstractAttributeStateDeleted
        {
			public SimpleAttributeStateDeleted() {
			}

			public SimpleAttributeStateDeleted(AttributeStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

