package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureTypeAggregate
{
    OrganizationStructureTypeState getState();

    List<Event> getChanges();

    void create(OrganizationStructureTypeCommand.CreateOrganizationStructureType c);

    void mergePatch(OrganizationStructureTypeCommand.MergePatchOrganizationStructureType c);

    void delete(OrganizationStructureTypeCommand.DeleteOrganizationStructureType c);

    void throwOnInvalidStateTransition(Command c);
}

