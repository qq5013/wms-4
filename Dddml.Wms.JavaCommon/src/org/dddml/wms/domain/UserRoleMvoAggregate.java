package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserRoleMvoAggregate
{
    UserRoleMvoState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(UserRoleMvoCommand.CreateUserRoleMvo c);

    void mergePatch(UserRoleMvoCommand.MergePatchUserRoleMvo c);

    void delete(UserRoleMvoCommand.DeleteUserRoleMvo c);

}

