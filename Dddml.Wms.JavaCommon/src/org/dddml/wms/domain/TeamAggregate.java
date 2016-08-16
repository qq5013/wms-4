package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface TeamAggregate
{
    TeamState getState();

    List<Event> getChanges();

    void create(TeamCommand.CreateTeam c);

    void mergePatch(TeamCommand.MergePatchTeam c);

    void delete(TeamCommand.DeleteTeam c);

    void throwOnInvalidStateTransition(Command c);
}

