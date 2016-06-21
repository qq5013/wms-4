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

	public static partial class AttributeValueStateExtensions
	{

        public static IAttributeValueCommand ToCreateOrMergePatchAttributeValue(this AttributeValueState state)
        {
            bool bUnsaved = ((IAttributeValueState)state).IsUnsaved;
            if (bUnsaved)
            {
                return state.ToCreateAttributeValue();
            }
            else 
            {
                return state.ToMergePatchAttributeValue();
            }
        }

        public static RemoveAttributeValue ToRemoveAttributeValue(this AttributeValueState state)
        {
            var cmd = new RemoveAttributeValue();
            cmd.Value = state.Value;
            return cmd;
        }

        public static MergePatchAttributeValue ToMergePatchAttributeValue(this AttributeValueState state)
        {
            var cmd = new MergePatchAttributeValue();

            cmd.Value = state.Value;
            cmd.Name = state.Name;
            cmd.Description = state.Description;
            cmd.ReferenceId = state.ReferenceId;
            cmd.Active = state.Active;
            cmd.AttributeId = state.AttributeId;
            
            if (state.Name == null) { cmd.IsPropertyNameRemoved = true; }
            if (state.Description == null) { cmd.IsPropertyDescriptionRemoved = true; }
            if (state.ReferenceId == null) { cmd.IsPropertyReferenceIdRemoved = true; }
            return cmd;
        }

        public static CreateAttributeValue ToCreateAttributeValue(this AttributeValueState state)
        {
            var cmd = new CreateAttributeValue();

            cmd.Value = state.Value;
            cmd.Name = state.Name;
            cmd.Description = state.Description;
            cmd.ReferenceId = state.ReferenceId;
            cmd.Active = state.Active;
            cmd.AttributeId = state.AttributeId;
            return cmd;
        }
		

	}

}
