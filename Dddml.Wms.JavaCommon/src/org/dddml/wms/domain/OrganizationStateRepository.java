package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;

public interface OrganizationStateRepository
{
    OrganizationState get(String id);

    Iterable<OrganizationState> getAll(Integer firstResult, Integer maxResults);
    
    void save(OrganizationState state);
    
    Iterable<OrganizationState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<OrganizationState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    OrganizationState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    OrganizationState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<OrganizationState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

