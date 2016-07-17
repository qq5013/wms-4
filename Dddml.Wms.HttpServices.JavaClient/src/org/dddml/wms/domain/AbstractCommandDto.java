package org.dddml.wms.domain;

public abstract class AbstractCommandDto
{
    public static final String COMMAND_TYPE_CREATE = "Create";

    public static final String COMMAND_TYPE_MERGE_PATCH = "MergePatch";

    public static final String COMMAND_TYPE_DELETE = "Delete";

    public static  final String COMMAND_TYPE_REMOVE ="Remove";

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


