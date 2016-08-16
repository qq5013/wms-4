package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface TeamCommand extends Command
{
    String getTeamName();

    void setTeamName(String teamName);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchTeam extends TeamCommand
    {
        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

        Set<PersonalName> getPlayers();

        void setPlayers(Set<PersonalName> players);

        Set<String> getMascots();

        void setMascots(Set<String> mascots);

    }

    interface CreateTeam extends CreateOrMergePatchTeam
    {
    }

    interface MergePatchTeam extends CreateOrMergePatchTeam
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

	interface DeleteTeam extends TeamCommand
	{
	}

}

