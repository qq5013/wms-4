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

	public class UserClaimIdDto
	{

        private UserClaimId _value = new UserClaimId();

		public UserClaimIdDto()
		{
		}

		public UserClaimIdDto(UserClaimId val)
		{
			this._value = val;
		}

        public UserClaimId ToUserClaimId()
        {
            return this._value;
        }

		public virtual string UserId { 
			get { return _value.UserId; } 
			set { _value.UserId = value; } 
		}

		public virtual int ClaimId { 
			get { return _value.ClaimId; } 
			set { _value.ClaimId = value; } 
		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			UserClaimIdDto other = obj as UserClaimIdDto;
			if (other == null) {
				return false;
			}

            return _value.Equals(other._value);

		}

		public override int GetHashCode ()
		{
			return _value.GetHashCode();
		}

	}

}


