﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;
using NodaMoney;

namespace Dddml.Wms.Domain
{

	public static partial class InOutLineStateExtensions
	{

        public static IInOutLineCommand ToCreateOrMergePatchInOutLine(this InOutLineStateDto state)
        {
            return state.ToCreateOrMergePatchInOutLine<CreateInOutLineDto, MergePatchInOutLineDto>();
        }

        public static RemoveInOutLineDto ToRemoveInOutLine(this InOutLineStateDto state)
        {
            return state.ToRemoveInOutLine<RemoveInOutLineDto>();
        }

        public static MergePatchInOutLineDto ToMergePatchInOutLine(this InOutLineStateDto state)
        {
            return state.ToMergePatchInOutLine<MergePatchInOutLineDto>();
        }

        public static CreateInOutLineDto ToCreateInOutLine(this InOutLineStateDto state)
        {
            return state.ToCreateInOutLine<CreateInOutLineDto>();
        }
		

	}

}

