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

	public class UserLoginMvoStateEventIdDto
	{

        private UserLoginMvoStateEventId _value = new UserLoginMvoStateEventId();

		public UserLoginMvoStateEventIdDto()
		{
		}

		public UserLoginMvoStateEventIdDto(UserLoginMvoStateEventId val)
		{
			this._value = val;
		}

        public UserLoginMvoStateEventId ToUserLoginMvoStateEventId()
        {
            return this._value;
        }

		public virtual UserLoginIdDto UserLoginId { 
			get { return new UserLoginIdDto(_value.UserLoginId); } 
			set { _value.UserLoginId = value.ToUserLoginId(); } 
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

			UserLoginMvoStateEventIdDto other = obj as UserLoginMvoStateEventIdDto;
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


