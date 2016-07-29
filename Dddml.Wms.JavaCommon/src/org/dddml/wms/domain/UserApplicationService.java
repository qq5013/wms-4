package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface UserApplicationService
{
    void when(UserCommand.CreateUser c);

    void when(UserCommand.MergePatchUser c);

    void when(UserCommand.DeleteUser c);

    UserState get(String id);

    Iterable<UserState> getAll(Integer firstResult, Integer maxResults);

    Iterable<UserState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    UserStateEvent getStateEvent(String userId, long version);

}

