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

	public class UserLoginStateEventId
	{

		private string _userId;

		public virtual string UserId { 
			get { return this._userId; } 
			internal set { _userId = value; } 
		}

		private LoginKey _loginKey = new LoginKey();

		public virtual LoginKey LoginKey { 
			get { return this._loginKey; } 
			internal set { _loginKey = value; } 
		}

		private long _userVersion;

		public virtual long UserVersion { 
			get { return this._userVersion; } 
			internal set { _userVersion = value; } 
		}


        #region  Flattened Properties


		public virtual string LoginKeyLoginProvider {
			get { return LoginKey.LoginProvider; }
			internal set { LoginKey.LoginProvider = value; }
		}

		public virtual string LoginKeyProviderKey {
			get { return LoginKey.ProviderKey; }
			internal set { LoginKey.ProviderKey = value; }
		}

        #endregion

		internal UserLoginStateEventId ()
		{
		}

		public UserLoginStateEventId (string userId, LoginKey loginKey, long userVersion)
		{
			this._userId = userId;
			this._loginKey = loginKey;
			this._userVersion = userVersion;

		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			UserLoginStateEventId other = obj as UserLoginStateEventId;
			if (other == null) {
				return false;
			}

			return true 
				&& Object.Equals (this.UserId, other.UserId)
				&& Object.Equals (this.LoginKey, other.LoginKey)
				&& Object.Equals (this.UserVersion, other.UserVersion)
				;
		}

		public override int GetHashCode ()
		{
			int hash = 0;
			if (this.UserId != null) {
				hash += 13 * this.UserId.GetHashCode ();
			}
			if (this.LoginKey != null) {
				hash += 13 * this.LoginKey.GetHashCode ();
			}
			if (this.UserVersion != null) {
				hash += 13 * this.UserVersion.GetHashCode ();
			}
			return hash;
		}

	}

}


