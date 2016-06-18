﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomain.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Domain
{

	public class UserLogin
	{

		private string _loginProvider;

		public virtual string LoginProvider { 
			get { return this._loginProvider; } 
			internal set { _loginProvider = value; } 
		}

		private string _providerKey;

		public virtual string ProviderKey { 
			get { return this._providerKey; } 
			internal set { _providerKey = value; } 
		}


        #region  Flattened Properties


        #endregion

		internal UserLogin ()
		{
		}

		public UserLogin (string loginProvider, string providerKey)
		{
			this._loginProvider = loginProvider;
			this._providerKey = providerKey;

		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			UserLogin other = obj as UserLogin;
			if (other == null) {
				return false;
			}

			return true 
				&& Object.Equals (this.LoginProvider, other.LoginProvider)
				&& Object.Equals (this.ProviderKey, other.ProviderKey)
				;
		}

		public override int GetHashCode ()
		{
			int hash = 0;
			if (this.LoginProvider != null) {
				hash += 13 * this.LoginProvider.GetHashCode ();
			}
			if (this.ProviderKey != null) {
				hash += 13 * this.ProviderKey.GetHashCode ();
			}
			return hash;
		}

	}

}


