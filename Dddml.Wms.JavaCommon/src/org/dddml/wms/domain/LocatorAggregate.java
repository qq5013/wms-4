package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface LocatorAggregate
{
    LocatorState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(LocatorCommand.CreateLocator c);

    void mergePatch(LocatorCommand.MergePatchLocator c);

    void delete(LocatorCommand.DeleteLocator c);

}

