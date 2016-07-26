package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AudienceAggregate
{
    AudienceState getState();

    List<Event> getChanges();

    void create(AudienceCommand.CreateAudience c);

    void mergePatch(AudienceCommand.MergePatchAudience c);

    void delete(AudienceCommand.DeleteAudience c);

    void throwOnInvalidStateTransition(Command c);
}

