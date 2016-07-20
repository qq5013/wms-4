package org.dddml.wms.domain;

import org.dddml.wms.specialization.CommandType;

public abstract class AbstractCommandDto
{
    public static final String COMMAND_TYPE_CREATE = CommandType.CREATE;

    public static final String COMMAND_TYPE_MERGE_PATCH = CommandType.MERGE_PATCH;

    public static final String COMMAND_TYPE_DELETE = CommandType.DELETE;

    public static final String COMMAND_TYPE_REMOVE = CommandType.REMOVE;

    private String commandType;

    public String getCommandType()
    {
        return this.commandType;
    }

    public void setCommandType(String commandType)
    {
        this.commandType = commandType;
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

    private String requesterId;

    public String getRequesterId()
    {
        return this.requesterId;
    }

    public void setRequesterId(String requesterId)
    {
        this.requesterId = requesterId;
    }

}


