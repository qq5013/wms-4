package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractTeamStateEvent extends AbstractStateEvent implements TeamStateEvent 
{
    private TeamStateEventId stateEventId;

    public TeamStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(TeamStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private Set<PersonalName> players;

    public Set<PersonalName> getPlayers()
    {
        return this.players;
    }

    public void setPlayers(Set<PersonalName> players)
    {
        this.players = players;
    }

    private Set<String> mascots;

    public Set<String> getMascots()
    {
        return this.mascots;
    }

    public void setMascots(Set<String> mascots)
    {
        this.mascots = mascots;
    }


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractTeamStateEvent() {
    }

    protected AbstractTeamStateEvent(TeamStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractTeamStateCreated extends AbstractTeamStateEvent implements TeamStateCreated
    {
        public AbstractTeamStateCreated() {
        }

        public AbstractTeamStateCreated(TeamStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractTeamStateMergePatched extends AbstractTeamStateEvent implements TeamStateMergePatched
    {
        public AbstractTeamStateMergePatched() {
        }

        public AbstractTeamStateMergePatched(TeamStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved() {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed) {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyPlayersRemoved;

        public Boolean getIsPropertyPlayersRemoved() {
            return this.isPropertyPlayersRemoved;
        }

        public void setIsPropertyPlayersRemoved(Boolean removed) {
            this.isPropertyPlayersRemoved = removed;
        }

        private Boolean isPropertyMascotsRemoved;

        public Boolean getIsPropertyMascotsRemoved() {
            return this.isPropertyMascotsRemoved;
        }

        public void setIsPropertyMascotsRemoved(Boolean removed) {
            this.isPropertyMascotsRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

    }


    public static abstract class AbstractTeamStateDeleted extends AbstractTeamStateEvent implements TeamStateDeleted
    {
        public AbstractTeamStateDeleted() {
        }

        public AbstractTeamStateDeleted(TeamStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
        public static class SimpleTeamStateCreated extends AbstractTeamStateCreated
        {
			public SimpleTeamStateCreated() {
			}

			public SimpleTeamStateCreated(TeamStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleTeamStateMergePatched extends AbstractTeamStateMergePatched
        {
			public SimpleTeamStateMergePatched() {
			}

			public SimpleTeamStateMergePatched(TeamStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleTeamStateDeleted extends AbstractTeamStateDeleted
        {
			public SimpleTeamStateDeleted() {
			}

			public SimpleTeamStateDeleted(TeamStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

