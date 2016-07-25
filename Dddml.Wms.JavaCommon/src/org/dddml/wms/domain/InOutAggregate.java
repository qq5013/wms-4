package org.dddml.wms.domain;

import java.util.List;
import org.joda.money.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface InOutAggregate
{
    InOutState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(InOutCommand.CreateInOut c);

    void mergePatch(InOutCommand.MergePatchInOut c);

    void delete(InOutCommand.DeleteInOut c);

}

