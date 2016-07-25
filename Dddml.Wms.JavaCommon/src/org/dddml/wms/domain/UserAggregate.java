package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserAggregate
{
    UserState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(UserCommand.CreateUser c);

    void mergePatch(UserCommand.MergePatchUser c);

    void delete(UserCommand.DeleteUser c);

}

