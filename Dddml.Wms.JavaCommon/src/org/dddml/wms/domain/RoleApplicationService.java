package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface RoleApplicationService
{
    void when(RoleCommand.CreateRole c);

    void when(RoleCommand.MergePatchRole c);

    void when(RoleCommand.DeleteRole c);

    RoleState get(String id);

    Iterable<RoleState> getAll(Integer firstResult, Integer maxResults);

    Iterable<RoleState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<RoleState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<RoleState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    RoleStateEvent getStateEvent(String roleId, long version);

}

