package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.TeamStateEvent.*;

public interface TeamState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    String getTeamName();

    void setTeamName(String teamName);

    String getDescription();

    void setDescription(String description);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);

    Set<PersonalName> getPlayers();

    void setPlayers(Set<PersonalName> players);

    Set<String> getMascots();

    void setMascots(Set<String> mascots);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(TeamStateCreated e);

    void when(TeamStateMergePatched e);

    void when(TeamStateDeleted e);
    
}

