package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface RoleAggregate
{
    RoleState getState();

    List<Event> getChanges();

    void create(RoleCommand.CreateRole c);

    void mergePatch(RoleCommand.MergePatchRole c);

    void delete(RoleCommand.DeleteRole c);

    void throwOnInvalidStateTransition(Command c);
}

