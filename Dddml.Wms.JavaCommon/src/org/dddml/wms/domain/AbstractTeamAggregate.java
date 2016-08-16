package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractTeamAggregate extends AbstractAggregate implements TeamAggregate
{
    private TeamState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractTeamAggregate(TeamState state)
    {
        this.state = state;
    }

    public TeamState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(TeamCommand.CreateTeam c)
    {
        if (c.getVersion() == null) { c.setVersion(TeamState.VERSION_NULL); }
        TeamStateEvent.TeamStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(TeamCommand.MergePatchTeam c)
    {
        TeamStateEvent.TeamStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(TeamCommand.DeleteTeam c)
    {
        TeamStateEvent.TeamStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((TeamCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((TeamCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected TeamStateEvent.TeamStateCreated map(TeamCommand.CreateTeam c)
    {
        TeamStateEventId stateEventId = new TeamStateEventId(c.getTeamName(), c.getVersion());
        TeamStateEvent.TeamStateCreated e = newTeamStateCreated(stateEventId);
        e.setDescription(c.getDescription());
        e.setPlayers(c.getPlayers());
        e.setMascots(c.getMascots());
        e.setActive(c.getActive());
        ((AbstractTeamStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected TeamStateEvent.TeamStateMergePatched map(TeamCommand.MergePatchTeam c)
    {
        TeamStateEventId stateEventId = new TeamStateEventId(c.getTeamName(), c.getVersion());
        TeamStateEvent.TeamStateMergePatched e = newTeamStateMergePatched(stateEventId);
        e.setDescription(c.getDescription());
        e.setPlayers(c.getPlayers());
        e.setMascots(c.getMascots());
        e.setActive(c.getActive());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyPlayersRemoved(c.getIsPropertyPlayersRemoved());
        e.setIsPropertyMascotsRemoved(c.getIsPropertyMascotsRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractTeamStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected TeamStateEvent.TeamStateDeleted map(TeamCommand.DeleteTeam c)
    {
        TeamStateEventId stateEventId = new TeamStateEventId(c.getTeamName(), c.getVersion());
        TeamStateEvent.TeamStateDeleted e = newTeamStateDeleted(stateEventId);
        ((AbstractTeamStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(TeamCommand c)
    {
        return ((c instanceof TeamCommand.CreateTeam) 
            && c.getVersion().equals(TeamState.VERSION_NULL));
    }


    ////////////////////////

    protected TeamStateEvent.TeamStateCreated newTeamStateCreated(String commandId, String requesterId) {
        TeamStateEventId stateEventId = new TeamStateEventId(this.state.getTeamName(), this.state.getVersion());
        TeamStateEvent.TeamStateCreated e = newTeamStateCreated(stateEventId);
        ((AbstractTeamStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected TeamStateEvent.TeamStateMergePatched newTeamStateMergePatched(String commandId, String requesterId) {
        TeamStateEventId stateEventId = new TeamStateEventId(this.state.getTeamName(), this.state.getVersion());
        TeamStateEvent.TeamStateMergePatched e = newTeamStateMergePatched(stateEventId);
        ((AbstractTeamStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected TeamStateEvent.TeamStateDeleted newTeamStateDeleted(String commandId, String requesterId) {
        TeamStateEventId stateEventId = new TeamStateEventId(this.state.getTeamName(), this.state.getVersion());
        TeamStateEvent.TeamStateDeleted e = newTeamStateDeleted(stateEventId);
        ((AbstractTeamStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected TeamStateEvent.TeamStateCreated newTeamStateCreated(TeamStateEventId stateEventId) {
        return new AbstractTeamStateEvent.SimpleTeamStateCreated(stateEventId);
    }

    protected TeamStateEvent.TeamStateMergePatched newTeamStateMergePatched(TeamStateEventId stateEventId) {
        return new AbstractTeamStateEvent.SimpleTeamStateMergePatched(stateEventId);
    }

    protected TeamStateEvent.TeamStateDeleted newTeamStateDeleted(TeamStateEventId stateEventId)
    {
        return new AbstractTeamStateEvent.SimpleTeamStateDeleted(stateEventId);
    }


    public static class SimpleTeamAggregate extends AbstractTeamAggregate
    {
        public SimpleTeamAggregate(TeamState state) {
            super(state);
        }
    }

}

