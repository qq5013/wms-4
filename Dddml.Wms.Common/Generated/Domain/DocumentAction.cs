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

	public class DocumentAction
	{

		private string _name;

		public virtual string Name { 
			get { return this._name; } 
			internal set { _name = value; } 
		}


        #region  Flattened Properties


        #endregion

		internal DocumentAction ()
		{
		}

		public DocumentAction (string name)
		{
			this._name = name;

		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			DocumentAction other = obj as DocumentAction;
			if (other == null) {
				return false;
			}

			return true 
				&& Object.Equals (this.Name, other.Name)
				;
		}

		public override int GetHashCode ()
		{
			int hash = 0;
			if (this.Name != null) {
				hash += 13 * this.Name.GetHashCode ();
			}
			return hash;
		}

	}

}


