package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface PersonAggregate
{
    PersonState getState();

    List<Event> getChanges();

    void create(PersonCommand.CreatePerson c);

    void mergePatch(PersonCommand.MergePatchPerson c);

    void delete(PersonCommand.DeletePerson c);

    void throwOnInvalidStateTransition(Command c);
}

