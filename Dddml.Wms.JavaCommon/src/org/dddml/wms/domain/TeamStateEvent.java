package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface TeamStateEvent extends Event
{
    TeamStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getDescription();

    void setDescription(String description);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    Set<PersonalName> getPlayers();

    void setPlayers(Set<PersonalName> players);

    Set<String> getMascots();

    void setMascots(Set<String> mascots);


    interface TeamStateCreated extends TeamStateEvent
    {
    
    }


    interface TeamStateMergePatched extends TeamStateEvent
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyPlayersRemoved();

        void setIsPropertyPlayersRemoved(Boolean removed);

        Boolean getIsPropertyMascotsRemoved();

        void setIsPropertyMascotsRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);


    }

    interface TeamStateDeleted extends TeamStateEvent
    {
    }


}

