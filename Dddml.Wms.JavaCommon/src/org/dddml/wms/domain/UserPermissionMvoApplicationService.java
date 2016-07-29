package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserPermissionMvoApplicationService
{
    void when(UserPermissionMvoCommand.CreateUserPermissionMvo c);

    void when(UserPermissionMvoCommand.MergePatchUserPermissionMvo c);

    void when(UserPermissionMvoCommand.DeleteUserPermissionMvo c);

    UserPermissionMvoState get(UserPermissionId id);

    Iterable<UserPermissionMvoState> getAll(Integer firstResult, Integer maxResults);

    Iterable<UserPermissionMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserPermissionMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserPermissionMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    UserPermissionMvoStateEvent getStateEvent(UserPermissionId userPermissionId, long version);

}

