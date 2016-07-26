package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface PermissionAggregate
{
    PermissionState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(PermissionCommand.CreatePermission c);

    void mergePatch(PermissionCommand.MergePatchPermission c);

    void delete(PermissionCommand.DeletePermission c);

}

