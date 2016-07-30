package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserRoleMvoApplicationService
{
    void when(UserRoleMvoCommand.CreateUserRoleMvo c);

    void when(UserRoleMvoCommand.MergePatchUserRoleMvo c);

    void when(UserRoleMvoCommand.DeleteUserRoleMvo c);

    UserRoleMvoState get(UserRoleId id);

    Iterable<UserRoleMvoState> getAll(Integer firstResult, Integer maxResults);

    Iterable<UserRoleMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserRoleMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserRoleMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    UserRoleMvoStateEvent getStateEvent(UserRoleId userRoleId, long version);

}

