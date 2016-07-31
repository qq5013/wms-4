package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractOrganizationStateCommandConverter<TCreateOrganization extends OrganizationCommand.CreateOrganization, TMergePatchOrganization extends OrganizationCommand.MergePatchOrganization, TDeleteOrganization extends OrganizationCommand.DeleteOrganization>
{
    public OrganizationCommand toCreateOrMergePatchOrganization(OrganizationState state)
    {
        //where TCreateOrganization : ICreateOrganization, new()
        //where TMergePatchOrganization : IMergePatchOrganization, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateOrganization(state);
        }
        else 
        {
            return toMergePatchOrganization(state);
        }
    }

    public TDeleteOrganization toDeleteOrganization(OrganizationState state) //where TDeleteOrganization : IDeleteOrganization, new()
    {
        TDeleteOrganization cmd = newDeleteOrganization();
        cmd.setOrganizationId(state.getOrganizationId());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchOrganization toMergePatchOrganization(OrganizationState state) //where TMergePatchOrganization : IMergePatchOrganization, new()
    {
        TMergePatchOrganization cmd = newMergePatchOrganization();

        cmd.setVersion(state.getVersion());

        cmd.setOrganizationId(state.getOrganizationId());
        cmd.setName(state.getName());
        cmd.setDescription(state.getDescription());
        cmd.setType(state.getType());
        cmd.setIsSummary(state.getIsSummary());
        cmd.setActive(state.getActive());
            
        if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getType() == null) { cmd.setIsPropertyTypeRemoved(true); }
        if (state.getIsSummary() == null) { cmd.setIsPropertyIsSummaryRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateOrganization toCreateOrganization(OrganizationState state) //where TCreateOrganization : ICreateOrganization, new()
    {
        TCreateOrganization cmd = newCreateOrganization();

        cmd.setVersion(state.getVersion());
        cmd.setOrganizationId(state.getOrganizationId());
        cmd.setName(state.getName());
        cmd.setDescription(state.getDescription());
        cmd.setType(state.getType());
        cmd.setIsSummary(state.getIsSummary());
        cmd.setActive(state.getActive());
        return cmd;
    }

    protected abstract TCreateOrganization newCreateOrganization();

    protected abstract TMergePatchOrganization newMergePatchOrganization(); 

    protected abstract TDeleteOrganization newDeleteOrganization();

    public static class SimpleOrganizationStateCommandConverter extends AbstractOrganizationStateCommandConverter<AbstractOrganizationCommand.SimpleCreateOrganization, AbstractOrganizationCommand.SimpleMergePatchOrganization, AbstractOrganizationCommand.SimpleDeleteOrganization>
    {
        @Override
        protected AbstractOrganizationCommand.SimpleCreateOrganization newCreateOrganization() {
            return new AbstractOrganizationCommand.SimpleCreateOrganization();
        }

        @Override
        protected AbstractOrganizationCommand.SimpleMergePatchOrganization newMergePatchOrganization() {
            return new AbstractOrganizationCommand.SimpleMergePatchOrganization();
        }

        @Override
        protected AbstractOrganizationCommand.SimpleDeleteOrganization newDeleteOrganization() {
            return new AbstractOrganizationCommand.SimpleDeleteOrganization();
        }


    }

}

