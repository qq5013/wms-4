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

	public static partial class LocatorStateInterfaceExtensions
	{

        public static ILocatorCommand ToCreateOrMergePatchLocator<TCreateLocator, TMergePatchLocator>(this ILocatorState state)
            where TCreateLocator : ICreateLocator, new()
            where TMergePatchLocator : IMergePatchLocator, new()
        {
            bool bUnsaved = ((ILocatorState)state).IsUnsaved;
            if (bUnsaved)
            {
                return state.ToCreateLocator<TCreateLocator>();
            }
            else 
            {
                return state.ToMergePatchLocator<TMergePatchLocator>();
            }
        }

        public static TDeleteLocator ToDeleteLocator<TDeleteLocator>(this ILocatorState state)
            where TDeleteLocator : IDeleteLocator, new()
        {
            var cmd = new TDeleteLocator();
            cmd.LocatorId = state.LocatorId;
            cmd.Version = ((ILocatorStateProperties)state).Version;

            return cmd;
        }

        public static TMergePatchLocator ToMergePatchLocator<TMergePatchLocator>(this ILocatorState state)
            where TMergePatchLocator : IMergePatchLocator, new()
        {
            var cmd = new TMergePatchLocator();

            cmd.Version = ((ILocatorStateProperties)state).Version;

            cmd.LocatorId = state.LocatorId;
            cmd.WarehouseId = state.WarehouseId;
            cmd.ParentLocatorId = state.ParentLocatorId;
            cmd.LocatorType = state.LocatorType;
            cmd.PriorityNumber = state.PriorityNumber;
            cmd.IsDefault = state.IsDefault;
            cmd.X = state.X;
            cmd.Y = state.Y;
            cmd.Z = state.Z;
            cmd.Active = ((ILocatorStateProperties)state).Active;
            
            if (state.WarehouseId == null) { cmd.IsPropertyWarehouseIdRemoved = true; }
            if (state.ParentLocatorId == null) { cmd.IsPropertyParentLocatorIdRemoved = true; }
            if (state.LocatorType == null) { cmd.IsPropertyLocatorTypeRemoved = true; }
            if (state.PriorityNumber == null) { cmd.IsPropertyPriorityNumberRemoved = true; }
            if (state.X == null) { cmd.IsPropertyXRemoved = true; }
            if (state.Y == null) { cmd.IsPropertyYRemoved = true; }
            if (state.Z == null) { cmd.IsPropertyZRemoved = true; }
            return cmd;
        }

        public static TCreateLocator ToCreateLocator<TCreateLocator>(this ILocatorState state)
            where TCreateLocator : ICreateLocator, new()
        {
            var cmd = new TCreateLocator();

            cmd.Version = ((ILocatorStateProperties)state).Version;

            cmd.LocatorId = state.LocatorId;
            cmd.WarehouseId = state.WarehouseId;
            cmd.ParentLocatorId = state.ParentLocatorId;
            cmd.LocatorType = state.LocatorType;
            cmd.PriorityNumber = state.PriorityNumber;
            cmd.IsDefault = state.IsDefault;
            cmd.X = state.X;
            cmd.Y = state.Y;
            cmd.Z = state.Z;
            cmd.Active = ((ILocatorStateProperties)state).Active;
            return cmd;
        }
		

	}

}

