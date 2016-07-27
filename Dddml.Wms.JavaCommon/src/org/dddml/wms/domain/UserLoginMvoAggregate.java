package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserLoginMvoAggregate
{
    UserLoginMvoState getState();

    List<Event> getChanges();

    void create(UserLoginMvoCommand.CreateUserLoginMvo c);

    void mergePatch(UserLoginMvoCommand.MergePatchUserLoginMvo c);

    void delete(UserLoginMvoCommand.DeleteUserLoginMvo c);

    void throwOnInvalidStateTransition(Command c);
}

