package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface RolePermissionAggregate
{
    RolePermissionState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(RolePermissionCommand.CreateRolePermission c);

    void mergePatch(RolePermissionCommand.MergePatchRolePermission c);

    void delete(RolePermissionCommand.DeleteRolePermission c);

}

