package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AudienceAggregate
{
    AudienceState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(AudienceCommand.CreateAudience c);

    void mergePatch(AudienceCommand.MergePatchAudience c);

    void delete(AudienceCommand.DeleteAudience c);

}

