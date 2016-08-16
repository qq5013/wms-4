package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface TeamApplicationService
{
    void when(TeamCommand.CreateTeam c);

    void when(TeamCommand.MergePatchTeam c);

    void when(TeamCommand.DeleteTeam c);

    TeamState get(String id);

    Iterable<TeamState> getAll(Integer firstResult, Integer maxResults);

    Iterable<TeamState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TeamState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TeamState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    TeamStateEvent getStateEvent(String teamName, long version);

}

