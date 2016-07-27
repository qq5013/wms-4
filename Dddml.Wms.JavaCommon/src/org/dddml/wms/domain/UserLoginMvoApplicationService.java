package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserLoginMvoApplicationService
{
    void when(UserLoginMvoCommand.CreateUserLoginMvo c);

    void when(UserLoginMvoCommand.MergePatchUserLoginMvo c);

    void when(UserLoginMvoCommand.DeleteUserLoginMvo c);

    UserLoginMvoState get(UserLoginId id);

    Iterable<UserLoginMvoState> getAll(Integer firstResult, Integer maxResults);

    Iterable<UserLoginMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<UserLoginMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserLoginMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    UserLoginMvoStateEvent getStateEvent(UserLoginId userLoginId, long version);

}

