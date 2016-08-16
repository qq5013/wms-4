package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractTeamCommand extends AbstractCommand implements TeamCommand
{
    private String teamName;

    public String getTeamName()
    {
        return this.teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }


    public static abstract class AbstractCreateOrMergePatchTeam extends AbstractTeamCommand implements CreateOrMergePatchTeam
    {
        private String description;

        public String getDescription()
        {
            return this.description;
        }

        public void setDescription(String description)
        {
            this.description = description;
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

    }

    public static abstract class AbstractCreateTeam extends AbstractCreateOrMergePatchTeam implements CreateTeam
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchTeam extends AbstractCreateOrMergePatchTeam implements MergePatchTeam
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved()
        {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed)
        {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyPlayersRemoved;

        public Boolean getIsPropertyPlayersRemoved()
        {
            return this.isPropertyPlayersRemoved;
        }

        public void setIsPropertyPlayersRemoved(Boolean removed)
        {
            this.isPropertyPlayersRemoved = removed;
        }

        private Boolean isPropertyMascotsRemoved;

        public Boolean getIsPropertyMascotsRemoved()
        {
            return this.isPropertyMascotsRemoved;
        }

        public void setIsPropertyMascotsRemoved(Boolean removed)
        {
            this.isPropertyMascotsRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

    }

    public static class SimpleCreateTeam extends AbstractCreateTeam
    {
    }

    public static class SimpleMergePatchTeam extends AbstractMergePatchTeam
    {
    }

	public static class SimpleDeleteTeam extends AbstractTeamCommand implements DeleteTeam
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

