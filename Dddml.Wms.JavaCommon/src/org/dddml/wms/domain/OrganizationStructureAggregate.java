package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureAggregate
{
    OrganizationStructureState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(OrganizationStructureCommand.CreateOrganizationStructure c);

    void mergePatch(OrganizationStructureCommand.MergePatchOrganizationStructure c);

    void delete(OrganizationStructureCommand.DeleteOrganizationStructure c);

}

