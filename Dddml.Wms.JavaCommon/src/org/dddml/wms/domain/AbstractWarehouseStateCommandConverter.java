package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractWarehouseStateCommandConverter<TCreateWarehouse extends WarehouseCommand.CreateWarehouse, TMergePatchWarehouse extends WarehouseCommand.MergePatchWarehouse, TDeleteWarehouse extends WarehouseCommand.DeleteWarehouse>
{
    public WarehouseCommand toCreateOrMergePatchWarehouse(WarehouseState state)
    {
        //where TCreateWarehouse : ICreateWarehouse, new()
        //where TMergePatchWarehouse : IMergePatchWarehouse, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateWarehouse(state);
        }
        else 
        {
            return toMergePatchWarehouse(state);
        }
    }

    public TDeleteWarehouse toDeleteWarehouse(WarehouseState state) //where TDeleteWarehouse : IDeleteWarehouse, new()
    {
        TDeleteWarehouse cmd = newDeleteWarehouse();
        cmd.setWarehouseId(state.getWarehouseId());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchWarehouse toMergePatchWarehouse(WarehouseState state) //where TMergePatchWarehouse : IMergePatchWarehouse, new()
    {
        TMergePatchWarehouse cmd = newMergePatchWarehouse();

        cmd.setVersion(state.getVersion());

        cmd.setWarehouseId(state.getWarehouseId());
        cmd.setName(state.getName());
        cmd.setDescription(state.getDescription());
        cmd.setIsInTransit(state.getIsInTransit());
        cmd.setActive(state.getActive());
            
        if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getIsInTransit() == null) { cmd.setIsPropertyIsInTransitRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateWarehouse toCreateWarehouse(WarehouseState state) //where TCreateWarehouse : ICreateWarehouse, new()
    {
        TCreateWarehouse cmd = newCreateWarehouse();

        cmd.setVersion(state.getVersion());
        cmd.setWarehouseId(state.getWarehouseId());
        cmd.setName(state.getName());
        cmd.setDescription(state.getDescription());
        cmd.setIsInTransit(state.getIsInTransit());
        cmd.setActive(state.getActive());
        return cmd;
    }

    protected abstract TCreateWarehouse newCreateWarehouse();

    protected abstract TMergePatchWarehouse newMergePatchWarehouse(); 

    protected abstract TDeleteWarehouse newDeleteWarehouse();

    public static class SimpleWarehouseStateCommandConverter extends AbstractWarehouseStateCommandConverter<AbstractWarehouseCommand.SimpleCreateWarehouse, AbstractWarehouseCommand.SimpleMergePatchWarehouse, AbstractWarehouseCommand.SimpleDeleteWarehouse>
    {
        @Override
        protected AbstractWarehouseCommand.SimpleCreateWarehouse newCreateWarehouse() {
            return new AbstractWarehouseCommand.SimpleCreateWarehouse();
        }

        @Override
        protected AbstractWarehouseCommand.SimpleMergePatchWarehouse newMergePatchWarehouse() {
            return new AbstractWarehouseCommand.SimpleMergePatchWarehouse();
        }

        @Override
        protected AbstractWarehouseCommand.SimpleDeleteWarehouse newDeleteWarehouse() {
            return new AbstractWarehouseCommand.SimpleDeleteWarehouse();
        }


    }

}

