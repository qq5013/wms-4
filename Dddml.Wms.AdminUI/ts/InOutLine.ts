namespace Dddml.Wms.Domain {

	export class InOutLine {

		private SkuId: SkuId;

		getSkuId(): SkuId {
			return this.SkuId;
		}

		setSkuId(skuId: SkuId) {
			this.SkuId = skuId;
		}

		private LineNumber: string;

		getLineNumber(): string {
			return this.LineNumber;
		}

		setLineNumber(lineNumber: string) {
			this.LineNumber = lineNumber;
		}

		private Description: string;

		getDescription(): string {
			return this.Description;
		}

		setDescription(description: string) {
			this.Description = description;
		}

		private LocatorId: string;

		getLocatorId(): string {
			return this.LocatorId;
		}

		setLocatorId(locatorId: string) {
			this.LocatorId = locatorId;
		}

		private Product: string;

		getProduct(): string {
			return this.Product;
		}

		setProduct(product: string) {
			this.Product = product;
		}

		private UomId: string;

		getUomId(): string {
			return this.UomId;
		}

		setUomId(uomId: string) {
			this.UomId = uomId;
		}

		private MovementQuantity: string;

		getMovementQuantity(): string {
			return this.MovementQuantity;
		}

		setMovementQuantity(movementQuantity: string) {
			this.MovementQuantity = movementQuantity;
		}

		private ConfirmedQuantity: string;

		getConfirmedQuantity(): string {
			return this.ConfirmedQuantity;
		}

		setConfirmedQuantity(confirmedQuantity: string) {
			this.ConfirmedQuantity = confirmedQuantity;
		}

		private ScrappedQuantity: string;

		getScrappedQuantity(): string {
			return this.ScrappedQuantity;
		}

		setScrappedQuantity(scrappedQuantity: string) {
			this.ScrappedQuantity = scrappedQuantity;
		}

		private TargetQuantity: string;

		getTargetQuantity(): string {
			return this.TargetQuantity;
		}

		setTargetQuantity(targetQuantity: string) {
			this.TargetQuantity = targetQuantity;
		}

		private PickedQuantity: string;

		getPickedQuantity(): string {
			return this.PickedQuantity;
		}

		setPickedQuantity(pickedQuantity: string) {
			this.PickedQuantity = pickedQuantity;
		}

		private IsInvoiced: boolean;

		getIsInvoiced(): boolean {
			return this.IsInvoiced;
		}

		setIsInvoiced(isInvoiced: boolean) {
			this.IsInvoiced = isInvoiced;
		}

		private AttributeSetInstanceId: string;

		getAttributeSetInstanceId(): string {
			return this.AttributeSetInstanceId;
		}

		setAttributeSetInstanceId(attributeSetInstanceId: string) {
			this.AttributeSetInstanceId = attributeSetInstanceId;
		}

		private IsDescription: boolean;

		getIsDescription(): boolean {
			return this.IsDescription;
		}

		setIsDescription(isDescription: boolean) {
			this.IsDescription = isDescription;
		}

		private Processed: boolean;

		getProcessed(): boolean {
			return this.Processed;
		}

		setProcessed(processed: boolean) {
			this.Processed = processed;
		}

		private QuantityEntered: string;

		getQuantityEntered(): string {
			return this.QuantityEntered;
		}

		setQuantityEntered(quantityEntered: string) {
			this.QuantityEntered = quantityEntered;
		}

		private RmaLineNumber: string;

		getRmaLineNumber(): string {
			return this.RmaLineNumber;
		}

		setRmaLineNumber(rmaLineNumber: string) {
			this.RmaLineNumber = rmaLineNumber;
		}

		private ReversalLineNumber: string;

		getReversalLineNumber(): string {
			return this.ReversalLineNumber;
		}

		setReversalLineNumber(reversalLineNumber: string) {
			this.ReversalLineNumber = reversalLineNumber;
		}

		private Active: boolean;

		getActive(): boolean {
			return this.Active;
		}

		setActive(active: boolean) {
			this.Active = active;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

		private InOutDocumentNumber: string;

		getInOutDocumentNumber(): string {
			return this.InOutDocumentNumber;
		}

		setInOutDocumentNumber(inOutDocumentNumber: string) {
			this.InOutDocumentNumber = inOutDocumentNumber;
		}

		private CreatedBy: string;

		getCreatedBy(): string {
			return this.CreatedBy;
		}

		setCreatedBy(createdBy: string) {
			this.CreatedBy = createdBy;
		}

		private CreatedAt: string;

		getCreatedAt(): string {
			return this.CreatedAt;
		}

		setCreatedAt(createdAt: string) {
			this.CreatedAt = createdAt;
		}

		private UpdatedBy: string;

		getUpdatedBy(): string {
			return this.UpdatedBy;
		}

		setUpdatedBy(updatedBy: string) {
			this.UpdatedBy = updatedBy;
		}

		private UpdatedAt: string;

		getUpdatedAt(): string {
			return this.UpdatedAt;
		}

		setUpdatedAt(updatedAt: string) {
			this.UpdatedAt = updatedAt;
		}

	}
}

