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

	public class UserRoleMvoStateEventId
	{

		private UserRoleId _userRoleId = new UserRoleId();

		public virtual UserRoleId UserRoleId { 
			get { return this._userRoleId; } 
			internal set { _userRoleId = value; } 
		}

		private long _userVersion;

		public virtual long UserVersion { 
			get { return this._userVersion; } 
			internal set { _userVersion = value; } 
		}


        #region  Flattened Properties


		public virtual string UserRoleIdUserId {
			get { return UserRoleId.UserId; }
			internal set { UserRoleId.UserId = value; }
		}

		public virtual string UserRoleIdRoleId {
			get { return UserRoleId.RoleId; }
			internal set { UserRoleId.RoleId = value; }
		}

        #endregion

		internal UserRoleMvoStateEventId ()
		{
		}

		public UserRoleMvoStateEventId (UserRoleId userRoleId, long userVersion)
		{
			this._userRoleId = userRoleId;
			this._userVersion = userVersion;

		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			UserRoleMvoStateEventId other = obj as UserRoleMvoStateEventId;
			if (other == null) {
				return false;
			}

			return true 
				&& Object.Equals (this.UserRoleId, other.UserRoleId)
				&& Object.Equals (this.UserVersion, other.UserVersion)
				;
		}

		public override int GetHashCode ()
		{
			int hash = 0;
			if (this.UserRoleId != null) {
				hash += 13 * this.UserRoleId.GetHashCode ();
			}
			if (this.UserVersion != null) {
				hash += 13 * this.UserVersion.GetHashCode ();
			}
			return hash;
		}

	}

}


