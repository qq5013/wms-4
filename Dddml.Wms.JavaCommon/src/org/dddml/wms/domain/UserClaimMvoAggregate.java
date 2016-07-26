package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserClaimMvoAggregate
{
    UserClaimMvoState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(UserClaimMvoCommand.CreateUserClaimMvo c);

    void mergePatch(UserClaimMvoCommand.MergePatchUserClaimMvo c);

    void delete(UserClaimMvoCommand.DeleteUserClaimMvo c);

}

