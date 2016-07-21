package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAttributeSetStateEvent implements AttributeSetStateEvent
{
    private AttributeSetStateEventId stateEventId;

    public AttributeSetStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(AttributeSetStateEventId stateEventId) {
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

    private String serialNumberAttributeId;

    public String getSerialNumberAttributeId()
    {
        return this.serialNumberAttributeId;
    }

    public void setSerialNumberAttributeId(String serialNumberAttributeId)
    {
        this.serialNumberAttributeId = serialNumberAttributeId;
    }

    private String lotAttributeId;

    public String getLotAttributeId()
    {
        return this.lotAttributeId;
    }

    public void setLotAttributeId(String lotAttributeId)
    {
        this.lotAttributeId = lotAttributeId;
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

    protected AbstractAttributeSetStateEvent() {
    }

    protected AbstractAttributeSetStateEvent(AttributeSetStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }

    protected AttributeUseStateEventDao getAttributeUseStateEventDao() {
        return (AttributeUseStateEventDao)ApplicationContext.current.get("AttributeUseStateEventDao");
    }

    protected AttributeUseStateEventId newAttributeUseStateEventId(String attributeId)
    {
        AttributeUseStateEventId stateEventId = new AttributeUseStateEventId(this.getStateEventId().getAttributeSetId(), 
            attributeId, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(AttributeUseStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(AttributeSetStateEvent oe, AttributeUseStateEvent e)
    {
        if (!oe.getStateEventId().getAttributeSetId().equals(e.getStateEventId().getAttributeSetId()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id AttributeSetId %1$s but inner id AttributeSetId %2$s", 
                oe.getStateEventId().getAttributeSetId(), e.getStateEventId().getAttributeSetId());
        }
    }

    public AttributeUseStateEvent.AttributeUseStateCreated newAttributeUseStateCreated(String attributeId) {
        return new AbstractAttributeUseStateEvent.SimpleAttributeUseStateCreated(newAttributeUseStateEventId(attributeId));
    }

    public AttributeUseStateEvent.AttributeUseStateMergePatched newAttributeUseStateMergePatched(String attributeId) {
        return new AbstractAttributeUseStateEvent.SimpleAttributeUseStateMergePatched(newAttributeUseStateEventId(attributeId));
    }

    public AttributeUseStateEvent.AttributeUseStateRemoved newAttributeUseStateRemoved(String attributeId) {
        return new AbstractAttributeUseStateEvent.SimpleAttributeUseStateRemoved(newAttributeUseStateEventId(attributeId));
    }


    public abstract String getStateEventType();


    public static abstract class AbstractAttributeSetStateCreated extends AbstractAttributeSetStateEvent implements AttributeSetStateCreated, Saveable
    {
        public AbstractAttributeSetStateCreated() {
        }

        public AbstractAttributeSetStateCreated(AttributeSetStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

        private Map<AttributeUseStateEventId, AttributeUseStateEvent.AttributeUseStateCreated> attributeUseEvents = new HashMap<AttributeUseStateEventId, AttributeUseStateEvent.AttributeUseStateCreated>();
        
        private Iterable<AttributeUseStateEvent.AttributeUseStateCreated> readOnlyAttributeUseEvents;

        public Iterable<AttributeUseStateEvent.AttributeUseStateCreated> getAttributeUseEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.attributeUseEvents.values();
            }
            else
            {
                if (readOnlyAttributeUseEvents != null) { return readOnlyAttributeUseEvents; }
                AttributeUseStateEventDao eventDao = getAttributeUseStateEventDao();
                List<AttributeUseStateEvent.AttributeUseStateCreated> eL = new ArrayList<AttributeUseStateEvent.AttributeUseStateCreated>();
                for (AttributeUseStateEvent e : eventDao.findByAttributeSetStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((AttributeUseStateEvent.AttributeUseStateCreated)e);
                }
                return (readOnlyAttributeUseEvents = eL);
            }
        }

        public void setAttributeUseEvents(Iterable<AttributeUseStateEvent.AttributeUseStateCreated> es)
        {
            if (es != null)
            {
                for (AttributeUseStateEvent.AttributeUseStateCreated e : es)
                {
                    addAttributeUseEvent(e);
                }
            }
            else { this.attributeUseEvents.clear(); }
        }
        
        public void addAttributeUseEvent(AttributeUseStateEvent.AttributeUseStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.attributeUseEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (AttributeUseStateEvent.AttributeUseStateCreated e : this.getAttributeUseEvents()) {
                getAttributeUseStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractAttributeSetStateMergePatched extends AbstractAttributeSetStateEvent implements AttributeSetStateMergePatched, Saveable
    {
        public AbstractAttributeSetStateMergePatched() {
        }

        public AbstractAttributeSetStateMergePatched(AttributeSetStateEventId stateEventId) {
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

        private Boolean isPropertySerialNumberAttributeIdRemoved;

        public Boolean getIsPropertySerialNumberAttributeIdRemoved() {
            return this.isPropertySerialNumberAttributeIdRemoved;
        }

        public void setIsPropertySerialNumberAttributeIdRemoved(Boolean removed) {
            this.isPropertySerialNumberAttributeIdRemoved = removed;
        }

        private Boolean isPropertyLotAttributeIdRemoved;

        public Boolean getIsPropertyLotAttributeIdRemoved() {
            return this.isPropertyLotAttributeIdRemoved;
        }

        public void setIsPropertyLotAttributeIdRemoved(Boolean removed) {
            this.isPropertyLotAttributeIdRemoved = removed;
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

        private Map<AttributeUseStateEventId, AttributeUseStateEvent> attributeUseEvents = new HashMap<AttributeUseStateEventId, AttributeUseStateEvent>();
        
        private Iterable<AttributeUseStateEvent> readOnlyAttributeUseEvents;

        public Iterable<AttributeUseStateEvent> getAttributeUseEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.attributeUseEvents.values();
            }
            else
            {
                if (readOnlyAttributeUseEvents != null) { return readOnlyAttributeUseEvents; }
                AttributeUseStateEventDao eventDao = getAttributeUseStateEventDao();
                List<AttributeUseStateEvent> eL = new ArrayList<AttributeUseStateEvent>();
                for (AttributeUseStateEvent e : eventDao.findByAttributeSetStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((AttributeUseStateEvent)e);
                }
                return (readOnlyAttributeUseEvents = eL);
            }
        }

        public void setAttributeUseEvents(Iterable<AttributeUseStateEvent> es)
        {
            if (es != null)
            {
                for (AttributeUseStateEvent e : es)
                {
                    addAttributeUseEvent(e);
                }
            }
            else { this.attributeUseEvents.clear(); }
        }
        
        public void addAttributeUseEvent(AttributeUseStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.attributeUseEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (AttributeUseStateEvent e : this.getAttributeUseEvents()) {
                getAttributeUseStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractAttributeSetStateDeleted extends AbstractAttributeSetStateEvent implements AttributeSetStateDeleted, Saveable
    {
        public AbstractAttributeSetStateDeleted() {
        }

        public AbstractAttributeSetStateDeleted(AttributeSetStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

		
        private Map<AttributeUseStateEventId, AttributeUseStateEvent.AttributeUseStateRemoved> attributeUseEvents = new HashMap<AttributeUseStateEventId, AttributeUseStateEvent.AttributeUseStateRemoved>();
        
        private Iterable<AttributeUseStateEvent.AttributeUseStateRemoved> readOnlyAttributeUseEvents;

        public Iterable<AttributeUseStateEvent.AttributeUseStateRemoved> getAttributeUseEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.attributeUseEvents.values();
            }
            else
            {
                if (readOnlyAttributeUseEvents != null) { return readOnlyAttributeUseEvents; }
                AttributeUseStateEventDao eventDao = getAttributeUseStateEventDao();
                List<AttributeUseStateEvent.AttributeUseStateRemoved> eL = new ArrayList<AttributeUseStateEvent.AttributeUseStateRemoved>();
                for (AttributeUseStateEvent e : eventDao.findByAttributeSetStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((AttributeUseStateEvent.AttributeUseStateRemoved)e);
                }
                return (readOnlyAttributeUseEvents = eL);
            }
        }

        public void setAttributeUseEvents(Iterable<AttributeUseStateEvent.AttributeUseStateRemoved> es)
        {
            if (es != null)
            {
                for (AttributeUseStateEvent.AttributeUseStateRemoved e : es)
                {
                    addAttributeUseEvent(e);
                }
            }
            else { this.attributeUseEvents.clear(); }
        }
        
        public void addAttributeUseEvent(AttributeUseStateEvent.AttributeUseStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.attributeUseEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (AttributeUseStateEvent.AttributeUseStateRemoved e : this.getAttributeUseEvents()) {
                getAttributeUseStateEventDao().save(e);
            }
        }
    }
        public static class SimpleAttributeSetStateCreated extends AbstractAttributeSetStateCreated
        {
			public SimpleAttributeSetStateCreated() {
			}

			public SimpleAttributeSetStateCreated(AttributeSetStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeSetStateMergePatched extends AbstractAttributeSetStateMergePatched
        {
			public SimpleAttributeSetStateMergePatched() {
			}

			public SimpleAttributeSetStateMergePatched(AttributeSetStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeSetStateDeleted extends AbstractAttributeSetStateDeleted
        {
			public SimpleAttributeSetStateDeleted() {
			}

			public SimpleAttributeSetStateDeleted(AttributeSetStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

