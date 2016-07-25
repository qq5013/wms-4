package org.dddml.wms.domain;

import java.util.List;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceAggregate
{
    AttributeSetInstanceState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(AttributeSetInstanceCommand.CreateAttributeSetInstance c);

    void mergePatch(AttributeSetInstanceCommand.MergePatchAttributeSetInstance c);

    void delete(AttributeSetInstanceCommand.DeleteAttributeSetInstance c);

}

