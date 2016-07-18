package org.dddml.wms.domain;

public abstract class AbstractStateEventDto
{
    public static final String STATE_EVENT_TYPE_CREATED = "Created";

    public static final String STATE_EVENT_TYPE_MERGE_PATCHED = "MergePatched";

    public static final String STATE_EVENT_TYPE_DELETED = "Deleted";

    public static  final String STATE_EVENT_TYPE_REMOVED ="Removed";

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


