package org.dddml.wms.domain;

import org.dddml.wms.specialization.StateEventType;

public abstract class AbstractStateEvent
{
    public static final String STATE_EVENT_TYPE_CREATED = StateEventType.CREATED;

    public static final String STATE_EVENT_TYPE_MERGE_PATCHED = StateEventType.MERGE_PATCHED;

    public static final String STATE_EVENT_TYPE_DELETED = StateEventType.DELETED;

    public static final String STATE_EVENT_TYPE_REMOVED = StateEventType.REMOVED;

    private String stateEventType;

    public String getStateEventType()
    {
        return this.stateEventType;
    }

    public void setStateEventType(String stateEventType)
    {
        this.stateEventType = stateEventType;
    }

    private String commandId;

    public String getCommandId()
    {
        return this.commandId;
    }

    public void setCommandId(String commandId)
    {
        this.commandId = commandId;
    }

}


