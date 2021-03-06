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

	public static partial class AttributeUseMvoStateInterfaceExtensions
	{

        public static IAttributeUseMvoCommand ToCreateOrMergePatchAttributeUseMvo<TCreateAttributeUseMvo, TMergePatchAttributeUseMvo>(this IAttributeUseMvoState state)
            where TCreateAttributeUseMvo : ICreateAttributeUseMvo, new()
            where TMergePatchAttributeUseMvo : IMergePatchAttributeUseMvo, new()
        {
            bool bUnsaved = ((IAttributeUseMvoState)state).IsUnsaved;
            if (bUnsaved)
            {
                return state.ToCreateAttributeUseMvo<TCreateAttributeUseMvo>();
            }
            else 
            {
                return state.ToMergePatchAttributeUseMvo<TMergePatchAttributeUseMvo>();
            }
        }

        public static TDeleteAttributeUseMvo ToDeleteAttributeUseMvo<TDeleteAttributeUseMvo>(this IAttributeUseMvoState state)
            where TDeleteAttributeUseMvo : IDeleteAttributeUseMvo, new()
        {
            var cmd = new TDeleteAttributeUseMvo();
            cmd.AttributeSetAttributeUseId = state.AttributeSetAttributeUseId;
            cmd.AttributeSetVersion = ((IAttributeUseMvoStateProperties)state).AttributeSetVersion;

            return cmd;
        }

        public static TMergePatchAttributeUseMvo ToMergePatchAttributeUseMvo<TMergePatchAttributeUseMvo>(this IAttributeUseMvoState state)
            where TMergePatchAttributeUseMvo : IMergePatchAttributeUseMvo, new()
        {
            var cmd = new TMergePatchAttributeUseMvo();

            cmd.AttributeSetVersion = ((IAttributeUseMvoStateProperties)state).AttributeSetVersion;

            cmd.AttributeSetAttributeUseId = state.AttributeSetAttributeUseId;
            cmd.SequenceNumber = state.SequenceNumber;
            cmd.Version = ((IAttributeUseMvoStateProperties)state).Version;
            cmd.Active = ((IAttributeUseMvoStateProperties)state).Active;
            cmd.AttributeSetName = state.AttributeSetName;
            cmd.AttributeSetOrganizationId = state.AttributeSetOrganizationId;
            cmd.AttributeSetDescription = state.AttributeSetDescription;
            cmd.AttributeSetSerialNumberAttributeId = state.AttributeSetSerialNumberAttributeId;
            cmd.AttributeSetLotAttributeId = state.AttributeSetLotAttributeId;
            cmd.AttributeSetReferenceId = state.AttributeSetReferenceId;
            cmd.AttributeSetCreatedBy = state.AttributeSetCreatedBy;
            cmd.AttributeSetCreatedAt = state.AttributeSetCreatedAt;
            cmd.AttributeSetUpdatedBy = state.AttributeSetUpdatedBy;
            cmd.AttributeSetUpdatedAt = state.AttributeSetUpdatedAt;
            cmd.AttributeSetActive = state.AttributeSetActive;
            cmd.AttributeSetDeleted = state.AttributeSetDeleted;
            
            if (state.AttributeSetName == null) { cmd.IsPropertyAttributeSetNameRemoved = true; }
            if (state.AttributeSetOrganizationId == null) { cmd.IsPropertyAttributeSetOrganizationIdRemoved = true; }
            if (state.AttributeSetDescription == null) { cmd.IsPropertyAttributeSetDescriptionRemoved = true; }
            if (state.AttributeSetSerialNumberAttributeId == null) { cmd.IsPropertyAttributeSetSerialNumberAttributeIdRemoved = true; }
            if (state.AttributeSetLotAttributeId == null) { cmd.IsPropertyAttributeSetLotAttributeIdRemoved = true; }
            if (state.AttributeSetReferenceId == null) { cmd.IsPropertyAttributeSetReferenceIdRemoved = true; }
            if (state.AttributeSetCreatedBy == null) { cmd.IsPropertyAttributeSetCreatedByRemoved = true; }
            if (state.AttributeSetUpdatedBy == null) { cmd.IsPropertyAttributeSetUpdatedByRemoved = true; }
            return cmd;
        }

        public static TCreateAttributeUseMvo ToCreateAttributeUseMvo<TCreateAttributeUseMvo>(this IAttributeUseMvoState state)
            where TCreateAttributeUseMvo : ICreateAttributeUseMvo, new()
        {
            var cmd = new TCreateAttributeUseMvo();

            cmd.AttributeSetVersion = ((IAttributeUseMvoStateProperties)state).AttributeSetVersion;

            cmd.AttributeSetAttributeUseId = state.AttributeSetAttributeUseId;
            cmd.SequenceNumber = state.SequenceNumber;
            cmd.Version = ((IAttributeUseMvoStateProperties)state).Version;
            cmd.Active = ((IAttributeUseMvoStateProperties)state).Active;
            cmd.AttributeSetName = state.AttributeSetName;
            cmd.AttributeSetOrganizationId = state.AttributeSetOrganizationId;
            cmd.AttributeSetDescription = state.AttributeSetDescription;
            cmd.AttributeSetSerialNumberAttributeId = state.AttributeSetSerialNumberAttributeId;
            cmd.AttributeSetLotAttributeId = state.AttributeSetLotAttributeId;
            cmd.AttributeSetReferenceId = state.AttributeSetReferenceId;
            cmd.AttributeSetCreatedBy = state.AttributeSetCreatedBy;
            cmd.AttributeSetCreatedAt = state.AttributeSetCreatedAt;
            cmd.AttributeSetUpdatedBy = state.AttributeSetUpdatedBy;
            cmd.AttributeSetUpdatedAt = state.AttributeSetUpdatedAt;
            cmd.AttributeSetActive = state.AttributeSetActive;
            cmd.AttributeSetDeleted = state.AttributeSetDeleted;
            return cmd;
        }
		

	}

}

