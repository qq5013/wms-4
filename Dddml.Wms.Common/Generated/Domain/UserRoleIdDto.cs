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

	public class UserRoleIdDto
	{

        private UserRoleId _value = new UserRoleId();

		public UserRoleIdDto()
		{
		}

		public UserRoleIdDto(UserRoleId val)
		{
			this._value = val;
		}

        public UserRoleId ToUserRoleId()
        {
            return this._value;
        }

		public virtual string UserId { 
			get { return _value.UserId; } 
			set { _value.UserId = value; } 
		}

		public virtual string RoleId { 
			get { return _value.RoleId; } 
			set { _value.RoleId = value; } 
		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			UserRoleIdDto other = obj as UserRoleIdDto;
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


