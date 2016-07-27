package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeSetAggregate
{
    AttributeSetState getState();

    List<Event> getChanges();

    void create(AttributeSetCommand.CreateAttributeSet c);

    void mergePatch(AttributeSetCommand.MergePatchAttributeSet c);

    void delete(AttributeSetCommand.DeleteAttributeSet c);

    void throwOnInvalidStateTransition(Command c);
}

