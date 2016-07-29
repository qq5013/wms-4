package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureApplicationService
{
    void when(OrganizationStructureCommand.CreateOrganizationStructure c);

    void when(OrganizationStructureCommand.MergePatchOrganizationStructure c);

    void when(OrganizationStructureCommand.DeleteOrganizationStructure c);

    OrganizationStructureState get(OrganizationStructureId id);

    Iterable<OrganizationStructureState> getAll(Integer firstResult, Integer maxResults);

    Iterable<OrganizationStructureState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationStructureState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationStructureState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    OrganizationStructureStateEvent getStateEvent(OrganizationStructureId id, long version);

}

