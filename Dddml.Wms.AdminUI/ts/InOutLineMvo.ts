namespace Dddml.Wms.Domain {

	export class InOutLineMvo {

		private inOutLineId: InOutLineId;

		getInOutLineId(): InOutLineId {
			return this.inOutLineId;
		}

		setInOutLineId(inOutLineId: InOutLineId) {
			this.inOutLineId = inOutLineId;
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

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

		private active: boolean;

		getActive(): boolean {
			return this.active;
		}

		setActive(active: boolean) {
			this.active = active;
		}

		private inOutIsSOTransaction: boolean;

		getInOutIsSOTransaction(): boolean {
			return this.inOutIsSOTransaction;
		}

		setInOutIsSOTransaction(inOutIsSOTransaction: boolean) {
			this.inOutIsSOTransaction = inOutIsSOTransaction;
		}

		private inOutDocumentStatus: string;

		getInOutDocumentStatus(): string {
			return this.inOutDocumentStatus;
		}

		setInOutDocumentStatus(inOutDocumentStatus: string) {
			this.inOutDocumentStatus = inOutDocumentStatus;
		}

		private inOutPosted: boolean;

		getInOutPosted(): boolean {
			return this.inOutPosted;
		}

		setInOutPosted(inOutPosted: boolean) {
			this.inOutPosted = inOutPosted;
		}

		private inOutProcessing: boolean;

		getInOutProcessing(): boolean {
			return this.inOutProcessing;
		}

		setInOutProcessing(inOutProcessing: boolean) {
			this.inOutProcessing = inOutProcessing;
		}

		private inOutProcessed: boolean;

		getInOutProcessed(): boolean {
			return this.inOutProcessed;
		}

		setInOutProcessed(inOutProcessed: boolean) {
			this.inOutProcessed = inOutProcessed;
		}

		private inOutDocumentType: number;

		getInOutDocumentType(): number {
			return this.inOutDocumentType;
		}

		setInOutDocumentType(inOutDocumentType: number) {
			this.inOutDocumentType = inOutDocumentType;
		}

		private inOutDescription: string;

		getInOutDescription(): string {
			return this.inOutDescription;
		}

		setInOutDescription(inOutDescription: string) {
			this.inOutDescription = inOutDescription;
		}

		private inOutOrderNumber: string;

		getInOutOrderNumber(): string {
			return this.inOutOrderNumber;
		}

		setInOutOrderNumber(inOutOrderNumber: string) {
			this.inOutOrderNumber = inOutOrderNumber;
		}

		private inOutDateOrdered: string;

		getInOutDateOrdered(): string {
			return this.inOutDateOrdered;
		}

		setInOutDateOrdered(inOutDateOrdered: string) {
			this.inOutDateOrdered = inOutDateOrdered;
		}

		private inOutIsPrinted: boolean;

		getInOutIsPrinted(): boolean {
			return this.inOutIsPrinted;
		}

		setInOutIsPrinted(inOutIsPrinted: boolean) {
			this.inOutIsPrinted = inOutIsPrinted;
		}

		private inOutMovementType: string;

		getInOutMovementType(): string {
			return this.inOutMovementType;
		}

		setInOutMovementType(inOutMovementType: string) {
			this.inOutMovementType = inOutMovementType;
		}

		private inOutMovementDate: string;

		getInOutMovementDate(): string {
			return this.inOutMovementDate;
		}

		setInOutMovementDate(inOutMovementDate: string) {
			this.inOutMovementDate = inOutMovementDate;
		}

		private inOutBusinessPartnerId: string;

		getInOutBusinessPartnerId(): string {
			return this.inOutBusinessPartnerId;
		}

		setInOutBusinessPartnerId(inOutBusinessPartnerId: string) {
			this.inOutBusinessPartnerId = inOutBusinessPartnerId;
		}

		private inOutWarehouseId: string;

		getInOutWarehouseId(): string {
			return this.inOutWarehouseId;
		}

		setInOutWarehouseId(inOutWarehouseId: string) {
			this.inOutWarehouseId = inOutWarehouseId;
		}

		private inOutPOReference: string;

		getInOutPOReference(): string {
			return this.inOutPOReference;
		}

		setInOutPOReference(inOutPOReference: string) {
			this.inOutPOReference = inOutPOReference;
		}

		private inOutFreightAmount: Money;

		getInOutFreightAmount(): Money {
			return this.inOutFreightAmount;
		}

		setInOutFreightAmount(inOutFreightAmount: Money) {
			this.inOutFreightAmount = inOutFreightAmount;
		}

		private inOutShipperId: string;

		getInOutShipperId(): string {
			return this.inOutShipperId;
		}

		setInOutShipperId(inOutShipperId: string) {
			this.inOutShipperId = inOutShipperId;
		}

		private inOutChargeAmount: Money;

		getInOutChargeAmount(): Money {
			return this.inOutChargeAmount;
		}

		setInOutChargeAmount(inOutChargeAmount: Money) {
			this.inOutChargeAmount = inOutChargeAmount;
		}

		private inOutDatePrinted: string;

		getInOutDatePrinted(): string {
			return this.inOutDatePrinted;
		}

		setInOutDatePrinted(inOutDatePrinted: string) {
			this.inOutDatePrinted = inOutDatePrinted;
		}

		private inOutSalesRepresentative: string;

		getInOutSalesRepresentative(): string {
			return this.inOutSalesRepresentative;
		}

		setInOutSalesRepresentative(inOutSalesRepresentative: string) {
			this.inOutSalesRepresentative = inOutSalesRepresentative;
		}

		private inOutNumberOfPackages: number;

		getInOutNumberOfPackages(): number {
			return this.inOutNumberOfPackages;
		}

		setInOutNumberOfPackages(inOutNumberOfPackages: number) {
			this.inOutNumberOfPackages = inOutNumberOfPackages;
		}

		private inOutPickDate: string;

		getInOutPickDate(): string {
			return this.inOutPickDate;
		}

		setInOutPickDate(inOutPickDate: string) {
			this.inOutPickDate = inOutPickDate;
		}

		private inOutShipDate: string;

		getInOutShipDate(): string {
			return this.inOutShipDate;
		}

		setInOutShipDate(inOutShipDate: string) {
			this.inOutShipDate = inOutShipDate;
		}

		private inOutTrackingNumber: string;

		getInOutTrackingNumber(): string {
			return this.inOutTrackingNumber;
		}

		setInOutTrackingNumber(inOutTrackingNumber: string) {
			this.inOutTrackingNumber = inOutTrackingNumber;
		}

		private inOutDateReceived: string;

		getInOutDateReceived(): string {
			return this.inOutDateReceived;
		}

		setInOutDateReceived(inOutDateReceived: string) {
			this.inOutDateReceived = inOutDateReceived;
		}

		private inOutIsInTransit: boolean;

		getInOutIsInTransit(): boolean {
			return this.inOutIsInTransit;
		}

		setInOutIsInTransit(inOutIsInTransit: boolean) {
			this.inOutIsInTransit = inOutIsInTransit;
		}

		private inOutIsApproved: boolean;

		getInOutIsApproved(): boolean {
			return this.inOutIsApproved;
		}

		setInOutIsApproved(inOutIsApproved: boolean) {
			this.inOutIsApproved = inOutIsApproved;
		}

		private inOutIsInDispute: boolean;

		getInOutIsInDispute(): boolean {
			return this.inOutIsInDispute;
		}

		setInOutIsInDispute(inOutIsInDispute: boolean) {
			this.inOutIsInDispute = inOutIsInDispute;
		}

		private inOutVolume: string;

		getInOutVolume(): string {
			return this.inOutVolume;
		}

		setInOutVolume(inOutVolume: string) {
			this.inOutVolume = inOutVolume;
		}

		private inOutWeight: string;

		getInOutWeight(): string {
			return this.inOutWeight;
		}

		setInOutWeight(inOutWeight: string) {
			this.inOutWeight = inOutWeight;
		}

		private inOutRmaNumber: string;

		getInOutRmaNumber(): string {
			return this.inOutRmaNumber;
		}

		setInOutRmaNumber(inOutRmaNumber: string) {
			this.inOutRmaNumber = inOutRmaNumber;
		}

		private inOutReversalNumber: string;

		getInOutReversalNumber(): string {
			return this.inOutReversalNumber;
		}

		setInOutReversalNumber(inOutReversalNumber: string) {
			this.inOutReversalNumber = inOutReversalNumber;
		}

		private inOutIsDropShip: boolean;

		getInOutIsDropShip(): boolean {
			return this.inOutIsDropShip;
		}

		setInOutIsDropShip(inOutIsDropShip: boolean) {
			this.inOutIsDropShip = inOutIsDropShip;
		}

		private inOutDropShipBusinessPartnerId: string;

		getInOutDropShipBusinessPartnerId(): string {
			return this.inOutDropShipBusinessPartnerId;
		}

		setInOutDropShipBusinessPartnerId(inOutDropShipBusinessPartnerId: string) {
			this.inOutDropShipBusinessPartnerId = inOutDropShipBusinessPartnerId;
		}

		private inOutCreatedBy: string;

		getInOutCreatedBy(): string {
			return this.inOutCreatedBy;
		}

		setInOutCreatedBy(inOutCreatedBy: string) {
			this.inOutCreatedBy = inOutCreatedBy;
		}

		private inOutCreatedAt: string;

		getInOutCreatedAt(): string {
			return this.inOutCreatedAt;
		}

		setInOutCreatedAt(inOutCreatedAt: string) {
			this.inOutCreatedAt = inOutCreatedAt;
		}

		private inOutUpdatedBy: string;

		getInOutUpdatedBy(): string {
			return this.inOutUpdatedBy;
		}

		setInOutUpdatedBy(inOutUpdatedBy: string) {
			this.inOutUpdatedBy = inOutUpdatedBy;
		}

		private inOutUpdatedAt: string;

		getInOutUpdatedAt(): string {
			return this.inOutUpdatedAt;
		}

		setInOutUpdatedAt(inOutUpdatedAt: string) {
			this.inOutUpdatedAt = inOutUpdatedAt;
		}

		private inOutActive: boolean;

		getInOutActive(): boolean {
			return this.inOutActive;
		}

		setInOutActive(inOutActive: boolean) {
			this.inOutActive = inOutActive;
		}

		private inOutDeleted: boolean;

		getInOutDeleted(): boolean {
			return this.inOutDeleted;
		}

		setInOutDeleted(inOutDeleted: boolean) {
			this.inOutDeleted = inOutDeleted;
		}

		private inOutVersion: string;

		getInOutVersion(): string {
			return this.inOutVersion;
		}

		setInOutVersion(inOutVersion: string) {
			this.inOutVersion = inOutVersion;
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

