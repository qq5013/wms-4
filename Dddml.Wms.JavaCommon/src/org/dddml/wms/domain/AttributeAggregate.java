package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeAggregate
{
    AttributeState getState();

    List<Event> getChanges();

    void create(AttributeCommand.CreateAttribute c);

    void mergePatch(AttributeCommand.MergePatchAttribute c);

    void delete(AttributeCommand.DeleteAttribute c);

    void throwOnInvalidStateTransition(Command c);
}

