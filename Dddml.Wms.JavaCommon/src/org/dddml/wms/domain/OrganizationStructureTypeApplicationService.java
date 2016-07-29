package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureTypeApplicationService
{
    void when(OrganizationStructureTypeCommand.CreateOrganizationStructureType c);

    void when(OrganizationStructureTypeCommand.MergePatchOrganizationStructureType c);

    void when(OrganizationStructureTypeCommand.DeleteOrganizationStructureType c);

    OrganizationStructureTypeState get(String id);

    Iterable<OrganizationStructureTypeState> getAll(Integer firstResult, Integer maxResults);

    Iterable<OrganizationStructureTypeState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationStructureTypeState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationStructureTypeState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    OrganizationStructureTypeStateEvent getStateEvent(String id, long version);

}

