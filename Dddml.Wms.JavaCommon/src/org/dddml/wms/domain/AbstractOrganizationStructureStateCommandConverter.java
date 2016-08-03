package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractOrganizationStructureStateCommandConverter<TCreateOrganizationStructure extends OrganizationStructureCommand.CreateOrganizationStructure, TMergePatchOrganizationStructure extends OrganizationStructureCommand.MergePatchOrganizationStructure, TDeleteOrganizationStructure extends OrganizationStructureCommand.DeleteOrganizationStructure>
{
    public OrganizationStructureCommand toCreateOrMergePatchOrganizationStructure(OrganizationStructureState state)
    {
        //where TCreateOrganizationStructure : ICreateOrganizationStructure, new()
        //where TMergePatchOrganizationStructure : IMergePatchOrganizationStructure, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateOrganizationStructure(state);
        }
        else 
        {
            return toMergePatchOrganizationStructure(state);
        }
    }

    public TDeleteOrganizationStructure toDeleteOrganizationStructure(OrganizationStructureState state) //where TDeleteOrganizationStructure : IDeleteOrganizationStructure, new()
    {
        TDeleteOrganizationStructure cmd = newDeleteOrganizationStructure();
        cmd.setId(state.getId());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchOrganizationStructure toMergePatchOrganizationStructure(OrganizationStructureState state) //where TMergePatchOrganizationStructure : IMergePatchOrganizationStructure, new()
    {
        TMergePatchOrganizationStructure cmd = newMergePatchOrganizationStructure();

        cmd.setVersion(state.getVersion());

        cmd.setId(state.getId());
        cmd.setActive(state.getActive());
            
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateOrganizationStructure toCreateOrganizationStructure(OrganizationStructureState state) //where TCreateOrganizationStructure : ICreateOrganizationStructure, new()
    {
        TCreateOrganizationStructure cmd = newCreateOrganizationStructure();

        cmd.setVersion(state.getVersion());
        cmd.setId(state.getId());
        cmd.setActive(state.getActive());
        return cmd;
    }

    protected abstract TCreateOrganizationStructure newCreateOrganizationStructure();

    protected abstract TMergePatchOrganizationStructure newMergePatchOrganizationStructure(); 

    protected abstract TDeleteOrganizationStructure newDeleteOrganizationStructure();

    public static class SimpleOrganizationStructureStateCommandConverter extends AbstractOrganizationStructureStateCommandConverter<AbstractOrganizationStructureCommand.SimpleCreateOrganizationStructure, AbstractOrganizationStructureCommand.SimpleMergePatchOrganizationStructure, AbstractOrganizationStructureCommand.SimpleDeleteOrganizationStructure>
    {
        @Override
        protected AbstractOrganizationStructureCommand.SimpleCreateOrganizationStructure newCreateOrganizationStructure() {
            return new AbstractOrganizationStructureCommand.SimpleCreateOrganizationStructure();
        }

        @Override
        protected AbstractOrganizationStructureCommand.SimpleMergePatchOrganizationStructure newMergePatchOrganizationStructure() {
            return new AbstractOrganizationStructureCommand.SimpleMergePatchOrganizationStructure();
        }

        @Override
        protected AbstractOrganizationStructureCommand.SimpleDeleteOrganizationStructure newDeleteOrganizationStructure() {
            return new AbstractOrganizationStructureCommand.SimpleDeleteOrganizationStructure();
        }


    }

}

