package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.support.criterion.Criterion;
import org.dddml.wms.specialization.*;

public interface OrganizationTreeApplicationService
{
    Iterable<OrganizationState> getRoots(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationState> getChildren(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<String> getRootIds(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<String> getChildIds(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationState> getRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<OrganizationState> getChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<String> getRootIds(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<String> getChildIds(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

}


