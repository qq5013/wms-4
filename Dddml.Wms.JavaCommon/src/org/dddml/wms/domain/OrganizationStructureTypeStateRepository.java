package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface OrganizationStructureTypeStateRepository
{
    OrganizationStructureTypeState get(String id);

    Iterable<OrganizationStructureTypeState> getAll(Integer firstResult, Integer maxResults);
    
    void save(OrganizationStructureTypeState state);
    
    Iterable<OrganizationStructureTypeState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationStructureTypeState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    OrganizationStructureTypeState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    OrganizationStructureTypeState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<OrganizationStructureTypeState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

