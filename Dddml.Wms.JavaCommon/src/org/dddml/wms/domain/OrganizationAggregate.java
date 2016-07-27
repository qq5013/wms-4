package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface OrganizationAggregate
{
    OrganizationState getState();

    List<Event> getChanges();

    void create(OrganizationCommand.CreateOrganization c);

    void mergePatch(OrganizationCommand.MergePatchOrganization c);

    void delete(OrganizationCommand.DeleteOrganization c);

    void throwOnInvalidStateTransition(Command c);
}

