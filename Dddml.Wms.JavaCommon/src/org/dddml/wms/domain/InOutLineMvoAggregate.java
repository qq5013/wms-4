package org.dddml.wms.domain;

import java.util.List;
import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface InOutLineMvoAggregate
{
    InOutLineMvoState getState();

    List<Event> getChanges();

    void create(InOutLineMvoCommand.CreateInOutLineMvo c);

    void mergePatch(InOutLineMvoCommand.MergePatchInOutLineMvo c);

    void delete(InOutLineMvoCommand.DeleteInOutLineMvo c);

    void throwOnInvalidStateTransition(Command c);
}

