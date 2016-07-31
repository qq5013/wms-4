package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractOrganizationStructureTypeStateCommandConverter<TCreateOrganizationStructureType extends OrganizationStructureTypeCommand.CreateOrganizationStructureType, TMergePatchOrganizationStructureType extends OrganizationStructureTypeCommand.MergePatchOrganizationStructureType, TDeleteOrganizationStructureType extends OrganizationStructureTypeCommand.DeleteOrganizationStructureType>
{
    public OrganizationStructureTypeCommand toCreateOrMergePatchOrganizationStructureType(OrganizationStructureTypeState state)
    {
        //where TCreateOrganizationStructureType : ICreateOrganizationStructureType, new()
        //where TMergePatchOrganizationStructureType : IMergePatchOrganizationStructureType, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateOrganizationStructureType(state);
        }
        else 
        {
            return toMergePatchOrganizationStructureType(state);
        }
    }

    public TDeleteOrganizationStructureType toDeleteOrganizationStructureType(OrganizationStructureTypeState state) //where TDeleteOrganizationStructureType : IDeleteOrganizationStructureType, new()
    {
        TDeleteOrganizationStructureType cmd = newDeleteOrganizationStructureType();
        cmd.setId(state.getId());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchOrganizationStructureType toMergePatchOrganizationStructureType(OrganizationStructureTypeState state) //where TMergePatchOrganizationStructureType : IMergePatchOrganizationStructureType, new()
    {
        TMergePatchOrganizationStructureType cmd = newMergePatchOrganizationStructureType();

        cmd.setVersion(state.getVersion());

        cmd.setId(state.getId());
        cmd.setActive(state.getActive());
            
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateOrganizationStructureType toCreateOrganizationStructureType(OrganizationStructureTypeState state) //where TCreateOrganizationStructureType : ICreateOrganizationStructureType, new()
    {
        TCreateOrganizationStructureType cmd = newCreateOrganizationStructureType();

        cmd.setVersion(state.getVersion());
        cmd.setId(state.getId());
        cmd.setActive(state.getActive());
        return cmd;
    }

    protected abstract TCreateOrganizationStructureType newCreateOrganizationStructureType();

    protected abstract TMergePatchOrganizationStructureType newMergePatchOrganizationStructureType(); 

    protected abstract TDeleteOrganizationStructureType newDeleteOrganizationStructureType();

    public static class SimpleOrganizationStructureTypeStateCommandConverter extends AbstractOrganizationStructureTypeStateCommandConverter<AbstractOrganizationStructureTypeCommand.SimpleCreateOrganizationStructureType, AbstractOrganizationStructureTypeCommand.SimpleMergePatchOrganizationStructureType, AbstractOrganizationStructureTypeCommand.SimpleDeleteOrganizationStructureType>
    {
        @Override
        protected AbstractOrganizationStructureTypeCommand.SimpleCreateOrganizationStructureType newCreateOrganizationStructureType() {
            return new AbstractOrganizationStructureTypeCommand.SimpleCreateOrganizationStructureType();
        }

        @Override
        protected AbstractOrganizationStructureTypeCommand.SimpleMergePatchOrganizationStructureType newMergePatchOrganizationStructureType() {
            return new AbstractOrganizationStructureTypeCommand.SimpleMergePatchOrganizationStructureType();
        }

        @Override
        protected AbstractOrganizationStructureTypeCommand.SimpleDeleteOrganizationStructureType newDeleteOrganizationStructureType() {
            return new AbstractOrganizationStructureTypeCommand.SimpleDeleteOrganizationStructureType();
        }


    }

}

