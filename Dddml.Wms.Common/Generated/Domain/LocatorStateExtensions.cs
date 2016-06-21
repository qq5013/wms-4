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

	public static partial class LocatorStateExtensions
	{

        public static ILocatorCommand ToCreateOrMergePatchLocator(this LocatorState state)
        {
            bool bUnsaved = ((ILocatorState)state).IsUnsaved;
            if (bUnsaved)
            {
                return state.ToCreateLocator();
            }
            else 
            {
                return state.ToMergePatchLocator();
            }
        }

        public static DeleteLocator ToDeleteLocator(this LocatorState state)
        {
            var cmd = new DeleteLocator();
            cmd.LocatorId = state.LocatorId;
            cmd.Version = state.Version;

            return cmd;
        }

        public static MergePatchLocator ToMergePatchLocator(this LocatorState state)
        {
            var cmd = new MergePatchLocator();

            cmd.Version = state.Version;

            cmd.LocatorId = state.LocatorId;
            cmd.WarehouseId = state.WarehouseId;
            cmd.ParentLocatorId = state.ParentLocatorId;
            cmd.LocatorType = state.LocatorType;
            cmd.PriorityNumber = state.PriorityNumber;
            cmd.IsDefault = state.IsDefault;
            cmd.X = state.X;
            cmd.Y = state.Y;
            cmd.Z = state.Z;
            cmd.Active = state.Active;
            
            if (state.WarehouseId == null) { cmd.IsPropertyWarehouseIdRemoved = true; }
            if (state.ParentLocatorId == null) { cmd.IsPropertyParentLocatorIdRemoved = true; }
            if (state.LocatorType == null) { cmd.IsPropertyLocatorTypeRemoved = true; }
            if (state.PriorityNumber == null) { cmd.IsPropertyPriorityNumberRemoved = true; }
            if (state.X == null) { cmd.IsPropertyXRemoved = true; }
            if (state.Y == null) { cmd.IsPropertyYRemoved = true; }
            if (state.Z == null) { cmd.IsPropertyZRemoved = true; }
            return cmd;
        }

        public static CreateLocator ToCreateLocator(this LocatorState state)
        {
            var cmd = new CreateLocator();

            cmd.Version = state.Version;

            cmd.LocatorId = state.LocatorId;
            cmd.WarehouseId = state.WarehouseId;
            cmd.ParentLocatorId = state.ParentLocatorId;
            cmd.LocatorType = state.LocatorType;
            cmd.PriorityNumber = state.PriorityNumber;
            cmd.IsDefault = state.IsDefault;
            cmd.X = state.X;
            cmd.Y = state.Y;
            cmd.Z = state.Z;
            cmd.Active = state.Active;
            return cmd;
        }
		

	}

}
