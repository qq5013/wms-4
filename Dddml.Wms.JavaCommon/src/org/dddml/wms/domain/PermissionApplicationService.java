package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface PermissionApplicationService
{
    void when(PermissionCommand.CreatePermission c);

    void when(PermissionCommand.MergePatchPermission c);

    void when(PermissionCommand.DeletePermission c);

    PermissionState get(String id);

    Iterable<PermissionState> getAll(Integer firstResult, Integer maxResults);

    Iterable<PermissionState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<PermissionState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    PermissionState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    PermissionState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<PermissionState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    PermissionStateEvent getStateEvent(String permissionId, long version);

}

