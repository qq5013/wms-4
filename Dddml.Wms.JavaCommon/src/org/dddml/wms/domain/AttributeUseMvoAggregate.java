package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeUseMvoAggregate
{
    AttributeUseMvoState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(AttributeUseMvoCommand.CreateAttributeUseMvo c);

    void mergePatch(AttributeUseMvoCommand.MergePatchAttributeUseMvo c);

    void delete(AttributeUseMvoCommand.DeleteAttributeUseMvo c);

}

