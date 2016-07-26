package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeValueMvoAggregate
{
    AttributeValueMvoState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(AttributeValueMvoCommand.CreateAttributeValueMvo c);

    void mergePatch(AttributeValueMvoCommand.MergePatchAttributeValueMvo c);

    void delete(AttributeValueMvoCommand.DeleteAttributeValueMvo c);

}

