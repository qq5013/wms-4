package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchTeamDto extends AbstractTeamCommandDto
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

    private PersonalNameDto[] players;

    public PersonalNameDto[] getPlayers() {
        return this.players;
    }

    public void setPlayers(PersonalNameDto[] players) {
        this.players = players;
    }

    private String[] mascots;

    public String[] getMascots() {
        return this.mascots;
    }

    public void setMascots(String[] mascots) {
        this.mascots = mascots;
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


    public static class CreateTeamDto extends CreateOrMergePatchTeamDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchTeamDto extends CreateOrMergePatchTeamDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

