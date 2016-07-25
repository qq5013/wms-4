package org.dddml.wms.domain;

import org.dddml.wms.specialization.CommandType;

public interface Command
{
    String COMMAND_TYPE_CREATE = CommandType.CREATE;

    String COMMAND_TYPE_MERGE_PATCH = CommandType.MERGE_PATCH;

    String COMMAND_TYPE_DELETE = CommandType.DELETE;

    String COMMAND_TYPE_REMOVE = CommandType.REMOVE;

    String getCommandType();

    String getCommandId();

    String getRequesterId();

}


