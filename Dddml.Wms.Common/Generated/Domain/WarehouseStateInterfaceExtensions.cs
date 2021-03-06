﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Domain
{

	public static partial class WarehouseStateInterfaceExtensions
	{

        public static IWarehouseCommand ToCreateOrMergePatchWarehouse<TCreateWarehouse, TMergePatchWarehouse>(this IWarehouseState state)
            where TCreateWarehouse : ICreateWarehouse, new()
            where TMergePatchWarehouse : IMergePatchWarehouse, new()
        {
            bool bUnsaved = ((IWarehouseState)state).IsUnsaved;
            if (bUnsaved)
            {
                return state.ToCreateWarehouse<TCreateWarehouse>();
            }
            else 
            {
                return state.ToMergePatchWarehouse<TMergePatchWarehouse>();
            }
        }

        public static TDeleteWarehouse ToDeleteWarehouse<TDeleteWarehouse>(this IWarehouseState state)
            where TDeleteWarehouse : IDeleteWarehouse, new()
        {
            var cmd = new TDeleteWarehouse();
            cmd.WarehouseId = state.WarehouseId;
            cmd.Version = ((IWarehouseStateProperties)state).Version;

            return cmd;
        }

        public static TMergePatchWarehouse ToMergePatchWarehouse<TMergePatchWarehouse>(this IWarehouseState state)
            where TMergePatchWarehouse : IMergePatchWarehouse, new()
        {
            var cmd = new TMergePatchWarehouse();

            cmd.Version = ((IWarehouseStateProperties)state).Version;

            cmd.WarehouseId = state.WarehouseId;
            cmd.Name = state.Name;
            cmd.Description = state.Description;
            cmd.IsInTransit = state.IsInTransit;
            cmd.Active = ((IWarehouseStateProperties)state).Active;
            
            if (state.Name == null) { cmd.IsPropertyNameRemoved = true; }
            if (state.Description == null) { cmd.IsPropertyDescriptionRemoved = true; }
            return cmd;
        }

        public static TCreateWarehouse ToCreateWarehouse<TCreateWarehouse>(this IWarehouseState state)
            where TCreateWarehouse : ICreateWarehouse, new()
        {
            var cmd = new TCreateWarehouse();

            cmd.Version = ((IWarehouseStateProperties)state).Version;

            cmd.WarehouseId = state.WarehouseId;
            cmd.Name = state.Name;
            cmd.Description = state.Description;
            cmd.IsInTransit = state.IsInTransit;
            cmd.Active = ((IWarehouseStateProperties)state).Active;
            return cmd;
        }
		

	}

}

