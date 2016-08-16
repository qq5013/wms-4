package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractTeamStateCommandConverter<TCreateTeam extends TeamCommand.CreateTeam, TMergePatchTeam extends TeamCommand.MergePatchTeam, TDeleteTeam extends TeamCommand.DeleteTeam>
{
    public TeamCommand toCreateOrMergePatchTeam(TeamState state)
    {
        //where TCreateTeam : ICreateTeam, new()
        //where TMergePatchTeam : IMergePatchTeam, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateTeam(state);
        }
        else 
        {
            return toMergePatchTeam(state);
        }
    }

    public TDeleteTeam toDeleteTeam(TeamState state) //where TDeleteTeam : IDeleteTeam, new()
    {
        TDeleteTeam cmd = newDeleteTeam();
        cmd.setTeamName(state.getTeamName());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchTeam toMergePatchTeam(TeamState state) //where TMergePatchTeam : IMergePatchTeam, new()
    {
        TMergePatchTeam cmd = newMergePatchTeam();

        cmd.setVersion(state.getVersion());

        cmd.setTeamName(state.getTeamName());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
            
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateTeam toCreateTeam(TeamState state) //where TCreateTeam : ICreateTeam, new()
    {
        TCreateTeam cmd = newCreateTeam();

        cmd.setVersion(state.getVersion());
        cmd.setTeamName(state.getTeamName());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        return cmd;
    }

    protected abstract TCreateTeam newCreateTeam();

    protected abstract TMergePatchTeam newMergePatchTeam(); 

    protected abstract TDeleteTeam newDeleteTeam();

    public static class SimpleTeamStateCommandConverter extends AbstractTeamStateCommandConverter<AbstractTeamCommand.SimpleCreateTeam, AbstractTeamCommand.SimpleMergePatchTeam, AbstractTeamCommand.SimpleDeleteTeam>
    {
        @Override
        protected AbstractTeamCommand.SimpleCreateTeam newCreateTeam() {
            return new AbstractTeamCommand.SimpleCreateTeam();
        }

        @Override
        protected AbstractTeamCommand.SimpleMergePatchTeam newMergePatchTeam() {
            return new AbstractTeamCommand.SimpleMergePatchTeam();
        }

        @Override
        protected AbstractTeamCommand.SimpleDeleteTeam newDeleteTeam() {
            return new AbstractTeamCommand.SimpleDeleteTeam();
        }


    }

}

