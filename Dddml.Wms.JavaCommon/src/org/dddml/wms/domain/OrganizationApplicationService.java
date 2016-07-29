package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface OrganizationApplicationService
{
    void when(OrganizationCommand.CreateOrganization c);

    void when(OrganizationCommand.MergePatchOrganization c);

    void when(OrganizationCommand.DeleteOrganization c);

    OrganizationState get(String id);

    Iterable<OrganizationState> getAll(Integer firstResult, Integer maxResults);

    Iterable<OrganizationState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    OrganizationStateEvent getStateEvent(String organizationId, long version);

}

