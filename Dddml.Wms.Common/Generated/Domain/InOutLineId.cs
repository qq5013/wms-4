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

	public class InOutLineId
	{

		private string _inOutDocumentNumber;

		public virtual string InOutDocumentNumber { 
			get { return this._inOutDocumentNumber; } 
			internal set { _inOutDocumentNumber = value; } 
		}

		private SkuId _skuId = new SkuId();

		public virtual SkuId SkuId { 
			get { return this._skuId; } 
			internal set { _skuId = value; } 
		}


        #region  Flattened Properties


		public virtual string SkuIdProductId {
			get { return SkuId.ProductId; }
			internal set { SkuId.ProductId = value; }
		}

		public virtual string SkuIdAttributeSetInstanceId {
			get { return SkuId.AttributeSetInstanceId; }
			internal set { SkuId.AttributeSetInstanceId = value; }
		}

        #endregion

		internal InOutLineId ()
		{
		}

		public InOutLineId (string inOutDocumentNumber, SkuId skuId)
		{
			this._inOutDocumentNumber = inOutDocumentNumber;
			this._skuId = skuId;

		}


		public override bool Equals (object obj)
		{
			if (Object.ReferenceEquals (this, obj)) {
				return true;
			}

			InOutLineId other = obj as InOutLineId;
			if (other == null) {
				return false;
			}

			return true 
				&& Object.Equals (this.InOutDocumentNumber, other.InOutDocumentNumber)
				&& Object.Equals (this.SkuId, other.SkuId)
				;
		}

		public override int GetHashCode ()
		{
			int hash = 0;
			if (this.InOutDocumentNumber != null) {
				hash += 13 * this.InOutDocumentNumber.GetHashCode ();
			}
			if (this.SkuId != null) {
				hash += 13 * this.SkuId.GetHashCode ();
			}
			return hash;
		}

	}

}


