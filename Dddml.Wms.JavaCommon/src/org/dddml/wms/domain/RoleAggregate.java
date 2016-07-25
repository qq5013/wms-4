package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface RoleAggregate
{
    RoleState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(RoleCommand.CreateRole c);

    void mergePatch(RoleCommand.MergePatchRole c);

    void delete(RoleCommand.DeleteRole c);

}

