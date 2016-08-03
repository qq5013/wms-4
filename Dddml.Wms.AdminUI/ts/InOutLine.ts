namespace Dddml.Wms.Domain {

	export class InOutLine {

		private skuId: SkuId;

		getSkuId(): SkuId {
			return this.skuId;
		}

		setSkuId(skuId: SkuId) {
			this.skuId = skuId;
		}

		private lineNumber: string;

		getLineNumber(): string {
			return this.lineNumber;
		}

		setLineNumber(lineNumber: string) {
			this.lineNumber = lineNumber;
		}

		private description: string;

		getDescription(): string {
			return this.description;
		}

		setDescription(description: string) {
			this.description = description;
		}

		private locatorId: string;

		getLocatorId(): string {
			return this.locatorId;
		}

		setLocatorId(locatorId: string) {
			this.locatorId = locatorId;
		}

		private product: string;

		getProduct(): string {
			return this.product;
		}

		setProduct(product: string) {
			this.product = product;
		}

		private uomId: string;

		getUomId(): string {
			return this.uomId;
		}

		setUomId(uomId: string) {
			this.uomId = uomId;
		}

		private movementQuantity: string;

		getMovementQuantity(): string {
			return this.movementQuantity;
		}

		setMovementQuantity(movementQuantity: string) {
			this.movementQuantity = movementQuantity;
		}

		private confirmedQuantity: string;

		getConfirmedQuantity(): string {
			return this.confirmedQuantity;
		}

		setConfirmedQuantity(confirmedQuantity: string) {
			this.confirmedQuantity = confirmedQuantity;
		}

		private scrappedQuantity: string;

		getScrappedQuantity(): string {
			return this.scrappedQuantity;
		}

		setScrappedQuantity(scrappedQuantity: string) {
			this.scrappedQuantity = scrappedQuantity;
		}

		private targetQuantity: string;

		getTargetQuantity(): string {
			return this.targetQuantity;
		}

		setTargetQuantity(targetQuantity: string) {
			this.targetQuantity = targetQuantity;
		}

		private pickedQuantity: string;

		getPickedQuantity(): string {
			return this.pickedQuantity;
		}

		setPickedQuantity(pickedQuantity: string) {
			this.pickedQuantity = pickedQuantity;
		}

		private isInvoiced: boolean;

		getIsInvoiced(): boolean {
			return this.isInvoiced;
		}

		setIsInvoiced(isInvoiced: boolean) {
			this.isInvoiced = isInvoiced;
		}

		private attributeSetInstanceId: string;

		getAttributeSetInstanceId(): string {
			return this.attributeSetInstanceId;
		}

		setAttributeSetInstanceId(attributeSetInstanceId: string) {
			this.attributeSetInstanceId = attributeSetInstanceId;
		}

		private isDescription: boolean;

		getIsDescription(): boolean {
			return this.isDescription;
		}

		setIsDescription(isDescription: boolean) {
			this.isDescription = isDescription;
		}

		private processed: boolean;

		getProcessed(): boolean {
			return this.processed;
		}

		setProcessed(processed: boolean) {
			this.processed = processed;
		}

		private quantityEntered: string;

		getQuantityEntered(): string {
			return this.quantityEntered;
		}

		setQuantityEntered(quantityEntered: string) {
			this.quantityEntered = quantityEntered;
		}

		private rmaLineNumber: string;

		getRmaLineNumber(): string {
			return this.rmaLineNumber;
		}

		setRmaLineNumber(rmaLineNumber: string) {
			this.rmaLineNumber = rmaLineNumber;
		}

		private reversalLineNumber: string;

		getReversalLineNumber(): string {
			return this.reversalLineNumber;
		}

		setReversalLineNumber(reversalLineNumber: string) {
			this.reversalLineNumber = reversalLineNumber;
		}

		private active: boolean;

		getActive(): boolean {
			return this.active;
		}

		setActive(active: boolean) {
			this.active = active;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

		private inOutDocumentNumber: string;

		getInOutDocumentNumber(): string {
			return this.inOutDocumentNumber;
		}

		setInOutDocumentNumber(inOutDocumentNumber: string) {
			this.inOutDocumentNumber = inOutDocumentNumber;
		}

		private createdBy: string;

		getCreatedBy(): string {
			return this.createdBy;
		}

		setCreatedBy(createdBy: string) {
			this.createdBy = createdBy;
		}

		private createdAt: string;

		getCreatedAt(): string {
			return this.createdAt;
		}

		setCreatedAt(createdAt: string) {
			this.createdAt = createdAt;
		}

		private updatedBy: string;

		getUpdatedBy(): string {
			return this.updatedBy;
		}

		setUpdatedBy(updatedBy: string) {
			this.updatedBy = updatedBy;
		}

		private updatedAt: string;

		getUpdatedAt(): string {
			return this.updatedAt;
		}

		setUpdatedAt(updatedAt: string) {
			this.updatedAt = updatedAt;
		}

	}
}

