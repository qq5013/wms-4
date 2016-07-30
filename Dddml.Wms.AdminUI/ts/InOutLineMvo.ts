namespace Dddml.Wms.Domain {

	export class InOutLineMvo {

		private InOutLineId: InOutLineId;

		getInOutLineId(): InOutLineId {
			return this.InOutLineId;
		}

		setInOutLineId(inOutLineId: InOutLineId) {
			this.InOutLineId = inOutLineId;
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

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

		private Active: boolean;

		getActive(): boolean {
			return this.Active;
		}

		setActive(active: boolean) {
			this.Active = active;
		}

		private InOutIsSOTransaction: boolean;

		getInOutIsSOTransaction(): boolean {
			return this.InOutIsSOTransaction;
		}

		setInOutIsSOTransaction(inOutIsSOTransaction: boolean) {
			this.InOutIsSOTransaction = inOutIsSOTransaction;
		}

		private InOutDocumentStatus: string;

		getInOutDocumentStatus(): string {
			return this.InOutDocumentStatus;
		}

		setInOutDocumentStatus(inOutDocumentStatus: string) {
			this.InOutDocumentStatus = inOutDocumentStatus;
		}

		private InOutPosted: boolean;

		getInOutPosted(): boolean {
			return this.InOutPosted;
		}

		setInOutPosted(inOutPosted: boolean) {
			this.InOutPosted = inOutPosted;
		}

		private InOutProcessing: boolean;

		getInOutProcessing(): boolean {
			return this.InOutProcessing;
		}

		setInOutProcessing(inOutProcessing: boolean) {
			this.InOutProcessing = inOutProcessing;
		}

		private InOutProcessed: boolean;

		getInOutProcessed(): boolean {
			return this.InOutProcessed;
		}

		setInOutProcessed(inOutProcessed: boolean) {
			this.InOutProcessed = inOutProcessed;
		}

		private InOutDocumentType: number;

		getInOutDocumentType(): number {
			return this.InOutDocumentType;
		}

		setInOutDocumentType(inOutDocumentType: number) {
			this.InOutDocumentType = inOutDocumentType;
		}

		private InOutDescription: string;

		getInOutDescription(): string {
			return this.InOutDescription;
		}

		setInOutDescription(inOutDescription: string) {
			this.InOutDescription = inOutDescription;
		}

		private InOutOrderNumber: string;

		getInOutOrderNumber(): string {
			return this.InOutOrderNumber;
		}

		setInOutOrderNumber(inOutOrderNumber: string) {
			this.InOutOrderNumber = inOutOrderNumber;
		}

		private InOutDateOrdered: string;

		getInOutDateOrdered(): string {
			return this.InOutDateOrdered;
		}

		setInOutDateOrdered(inOutDateOrdered: string) {
			this.InOutDateOrdered = inOutDateOrdered;
		}

		private InOutIsPrinted: boolean;

		getInOutIsPrinted(): boolean {
			return this.InOutIsPrinted;
		}

		setInOutIsPrinted(inOutIsPrinted: boolean) {
			this.InOutIsPrinted = inOutIsPrinted;
		}

		private InOutMovementType: string;

		getInOutMovementType(): string {
			return this.InOutMovementType;
		}

		setInOutMovementType(inOutMovementType: string) {
			this.InOutMovementType = inOutMovementType;
		}

		private InOutMovementDate: string;

		getInOutMovementDate(): string {
			return this.InOutMovementDate;
		}

		setInOutMovementDate(inOutMovementDate: string) {
			this.InOutMovementDate = inOutMovementDate;
		}

		private InOutBusinessPartnerId: string;

		getInOutBusinessPartnerId(): string {
			return this.InOutBusinessPartnerId;
		}

		setInOutBusinessPartnerId(inOutBusinessPartnerId: string) {
			this.InOutBusinessPartnerId = inOutBusinessPartnerId;
		}

		private InOutWarehouseId: string;

		getInOutWarehouseId(): string {
			return this.InOutWarehouseId;
		}

		setInOutWarehouseId(inOutWarehouseId: string) {
			this.InOutWarehouseId = inOutWarehouseId;
		}

		private InOutPOReference: string;

		getInOutPOReference(): string {
			return this.InOutPOReference;
		}

		setInOutPOReference(inOutPOReference: string) {
			this.InOutPOReference = inOutPOReference;
		}

		private InOutFreightAmount: Money;

		getInOutFreightAmount(): Money {
			return this.InOutFreightAmount;
		}

		setInOutFreightAmount(inOutFreightAmount: Money) {
			this.InOutFreightAmount = inOutFreightAmount;
		}

		private InOutShipperId: string;

		getInOutShipperId(): string {
			return this.InOutShipperId;
		}

		setInOutShipperId(inOutShipperId: string) {
			this.InOutShipperId = inOutShipperId;
		}

		private InOutChargeAmount: Money;

		getInOutChargeAmount(): Money {
			return this.InOutChargeAmount;
		}

		setInOutChargeAmount(inOutChargeAmount: Money) {
			this.InOutChargeAmount = inOutChargeAmount;
		}

		private InOutDatePrinted: string;

		getInOutDatePrinted(): string {
			return this.InOutDatePrinted;
		}

		setInOutDatePrinted(inOutDatePrinted: string) {
			this.InOutDatePrinted = inOutDatePrinted;
		}

		private InOutSalesRepresentative: string;

		getInOutSalesRepresentative(): string {
			return this.InOutSalesRepresentative;
		}

		setInOutSalesRepresentative(inOutSalesRepresentative: string) {
			this.InOutSalesRepresentative = inOutSalesRepresentative;
		}

		private InOutNumberOfPackages: number;

		getInOutNumberOfPackages(): number {
			return this.InOutNumberOfPackages;
		}

		setInOutNumberOfPackages(inOutNumberOfPackages: number) {
			this.InOutNumberOfPackages = inOutNumberOfPackages;
		}

		private InOutPickDate: string;

		getInOutPickDate(): string {
			return this.InOutPickDate;
		}

		setInOutPickDate(inOutPickDate: string) {
			this.InOutPickDate = inOutPickDate;
		}

		private InOutShipDate: string;

		getInOutShipDate(): string {
			return this.InOutShipDate;
		}

		setInOutShipDate(inOutShipDate: string) {
			this.InOutShipDate = inOutShipDate;
		}

		private InOutTrackingNumber: string;

		getInOutTrackingNumber(): string {
			return this.InOutTrackingNumber;
		}

		setInOutTrackingNumber(inOutTrackingNumber: string) {
			this.InOutTrackingNumber = inOutTrackingNumber;
		}

		private InOutDateReceived: string;

		getInOutDateReceived(): string {
			return this.InOutDateReceived;
		}

		setInOutDateReceived(inOutDateReceived: string) {
			this.InOutDateReceived = inOutDateReceived;
		}

		private InOutIsInTransit: boolean;

		getInOutIsInTransit(): boolean {
			return this.InOutIsInTransit;
		}

		setInOutIsInTransit(inOutIsInTransit: boolean) {
			this.InOutIsInTransit = inOutIsInTransit;
		}

		private InOutIsApproved: boolean;

		getInOutIsApproved(): boolean {
			return this.InOutIsApproved;
		}

		setInOutIsApproved(inOutIsApproved: boolean) {
			this.InOutIsApproved = inOutIsApproved;
		}

		private InOutIsInDispute: boolean;

		getInOutIsInDispute(): boolean {
			return this.InOutIsInDispute;
		}

		setInOutIsInDispute(inOutIsInDispute: boolean) {
			this.InOutIsInDispute = inOutIsInDispute;
		}

		private InOutVolume: string;

		getInOutVolume(): string {
			return this.InOutVolume;
		}

		setInOutVolume(inOutVolume: string) {
			this.InOutVolume = inOutVolume;
		}

		private InOutWeight: string;

		getInOutWeight(): string {
			return this.InOutWeight;
		}

		setInOutWeight(inOutWeight: string) {
			this.InOutWeight = inOutWeight;
		}

		private InOutRmaNumber: string;

		getInOutRmaNumber(): string {
			return this.InOutRmaNumber;
		}

		setInOutRmaNumber(inOutRmaNumber: string) {
			this.InOutRmaNumber = inOutRmaNumber;
		}

		private InOutReversalNumber: string;

		getInOutReversalNumber(): string {
			return this.InOutReversalNumber;
		}

		setInOutReversalNumber(inOutReversalNumber: string) {
			this.InOutReversalNumber = inOutReversalNumber;
		}

		private InOutIsDropShip: boolean;

		getInOutIsDropShip(): boolean {
			return this.InOutIsDropShip;
		}

		setInOutIsDropShip(inOutIsDropShip: boolean) {
			this.InOutIsDropShip = inOutIsDropShip;
		}

		private InOutDropShipBusinessPartnerId: string;

		getInOutDropShipBusinessPartnerId(): string {
			return this.InOutDropShipBusinessPartnerId;
		}

		setInOutDropShipBusinessPartnerId(inOutDropShipBusinessPartnerId: string) {
			this.InOutDropShipBusinessPartnerId = inOutDropShipBusinessPartnerId;
		}

		private InOutCreatedBy: string;

		getInOutCreatedBy(): string {
			return this.InOutCreatedBy;
		}

		setInOutCreatedBy(inOutCreatedBy: string) {
			this.InOutCreatedBy = inOutCreatedBy;
		}

		private InOutCreatedAt: string;

		getInOutCreatedAt(): string {
			return this.InOutCreatedAt;
		}

		setInOutCreatedAt(inOutCreatedAt: string) {
			this.InOutCreatedAt = inOutCreatedAt;
		}

		private InOutUpdatedBy: string;

		getInOutUpdatedBy(): string {
			return this.InOutUpdatedBy;
		}

		setInOutUpdatedBy(inOutUpdatedBy: string) {
			this.InOutUpdatedBy = inOutUpdatedBy;
		}

		private InOutUpdatedAt: string;

		getInOutUpdatedAt(): string {
			return this.InOutUpdatedAt;
		}

		setInOutUpdatedAt(inOutUpdatedAt: string) {
			this.InOutUpdatedAt = inOutUpdatedAt;
		}

		private InOutActive: boolean;

		getInOutActive(): boolean {
			return this.InOutActive;
		}

		setInOutActive(inOutActive: boolean) {
			this.InOutActive = inOutActive;
		}

		private InOutDeleted: boolean;

		getInOutDeleted(): boolean {
			return this.InOutDeleted;
		}

		setInOutDeleted(inOutDeleted: boolean) {
			this.InOutDeleted = inOutDeleted;
		}

		private InOutVersion: string;

		getInOutVersion(): string {
			return this.InOutVersion;
		}

		setInOutVersion(inOutVersion: string) {
			this.InOutVersion = inOutVersion;
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

