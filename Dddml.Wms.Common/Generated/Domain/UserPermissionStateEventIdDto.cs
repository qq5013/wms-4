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

	public class UserPermissionStateEventIdDto
	{

        private UserPermissionStateEventId _value = new UserPermissionStateEventId();

		public UserPermissionStateEventIdDto()
		{
		}

		public UserPermissionStateEventIdDto(UserPermissionStateEventId val)
		{
			this._value = val;
		}

        public UserPermissionStateEventId ToUserPermissionStateEventId()
        {
            return this._value;
        }

		public virtual string UserId { 
			get { return _value.UserId; } 
			set { _value.UserId = value; } 
		}

		public virtual string PermissionId { 
			get { return _value.PermissionId; } 
			set { _value.PermissionId = value; } 
		}

		public virtual long UserVersion { 
			get { return _value.UserVersion; } 
			set { _value.UserVersion = value; } 
		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			UserPermissionStateEventIdDto other = obj as UserPermissionStateEventIdDto;
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


