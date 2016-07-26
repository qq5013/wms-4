package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserPermissionMvoAggregate
{
    UserPermissionMvoState getState();

    List<Event> getChanges();

    void create(UserPermissionMvoCommand.CreateUserPermissionMvo c);

    void mergePatch(UserPermissionMvoCommand.MergePatchUserPermissionMvo c);

    void delete(UserPermissionMvoCommand.DeleteUserPermissionMvo c);

    void throwOnInvalidStateTransition(Command c);
}

