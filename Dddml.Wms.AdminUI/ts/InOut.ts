namespace Dddml.Wms.Domain {

	export class InOut {

		private documentNumber: string;

		getDocumentNumber(): string {
			return this.documentNumber;
		}

		setDocumentNumber(documentNumber: string) {
			this.documentNumber = documentNumber;
		}

		private isSOTransaction: boolean;

		getIsSOTransaction(): boolean {
			return this.isSOTransaction;
		}

		setIsSOTransaction(isSOTransaction: boolean) {
			this.isSOTransaction = isSOTransaction;
		}

		private documentStatus: string;

		getDocumentStatus(): string {
			return this.documentStatus;
		}

		setDocumentStatus(documentStatus: string) {
			this.documentStatus = documentStatus;
		}

		private posted: boolean;

		getPosted(): boolean {
			return this.posted;
		}

		setPosted(posted: boolean) {
			this.posted = posted;
		}

		private processing: boolean;

		getProcessing(): boolean {
			return this.processing;
		}

		setProcessing(processing: boolean) {
			this.processing = processing;
		}

		private processed: boolean;

		getProcessed(): boolean {
			return this.processed;
		}

		setProcessed(processed: boolean) {
			this.processed = processed;
		}

		private documentType: number;

		getDocumentType(): number {
			return this.documentType;
		}

		setDocumentType(documentType: number) {
			this.documentType = documentType;
		}

		private description: string;

		getDescription(): string {
			return this.description;
		}

		setDescription(description: string) {
			this.description = description;
		}

		private orderNumber: string;

		getOrderNumber(): string {
			return this.orderNumber;
		}

		setOrderNumber(orderNumber: string) {
			this.orderNumber = orderNumber;
		}

		private dateOrdered: string;

		getDateOrdered(): string {
			return this.dateOrdered;
		}

		setDateOrdered(dateOrdered: string) {
			this.dateOrdered = dateOrdered;
		}

		private isPrinted: boolean;

		getIsPrinted(): boolean {
			return this.isPrinted;
		}

		setIsPrinted(isPrinted: boolean) {
			this.isPrinted = isPrinted;
		}

		private movementType: string;

		getMovementType(): string {
			return this.movementType;
		}

		setMovementType(movementType: string) {
			this.movementType = movementType;
		}

		private movementDate: string;

		getMovementDate(): string {
			return this.movementDate;
		}

		setMovementDate(movementDate: string) {
			this.movementDate = movementDate;
		}

		private businessPartnerId: string;

		getBusinessPartnerId(): string {
			return this.businessPartnerId;
		}

		setBusinessPartnerId(businessPartnerId: string) {
			this.businessPartnerId = businessPartnerId;
		}

		private warehouseId: string;

		getWarehouseId(): string {
			return this.warehouseId;
		}

		setWarehouseId(warehouseId: string) {
			this.warehouseId = warehouseId;
		}

		private poReference: string;

		getPOReference(): string {
			return this.poReference;
		}

		setPOReference(poReference: string) {
			this.poReference = poReference;
		}

		private freightAmount: Money;

		getFreightAmount(): Money {
			return this.freightAmount;
		}

		setFreightAmount(freightAmount: Money) {
			this.freightAmount = freightAmount;
		}

		private shipperId: string;

		getShipperId(): string {
			return this.shipperId;
		}

		setShipperId(shipperId: string) {
			this.shipperId = shipperId;
		}

		private chargeAmount: Money;

		getChargeAmount(): Money {
			return this.chargeAmount;
		}

		setChargeAmount(chargeAmount: Money) {
			this.chargeAmount = chargeAmount;
		}

		private datePrinted: string;

		getDatePrinted(): string {
			return this.datePrinted;
		}

		setDatePrinted(datePrinted: string) {
			this.datePrinted = datePrinted;
		}

		private salesRepresentative: string;

		getSalesRepresentative(): string {
			return this.salesRepresentative;
		}

		setSalesRepresentative(salesRepresentative: string) {
			this.salesRepresentative = salesRepresentative;
		}

		private numberOfPackages: number;

		getNumberOfPackages(): number {
			return this.numberOfPackages;
		}

		setNumberOfPackages(numberOfPackages: number) {
			this.numberOfPackages = numberOfPackages;
		}

		private pickDate: string;

		getPickDate(): string {
			return this.pickDate;
		}

		setPickDate(pickDate: string) {
			this.pickDate = pickDate;
		}

		private shipDate: string;

		getShipDate(): string {
			return this.shipDate;
		}

		setShipDate(shipDate: string) {
			this.shipDate = shipDate;
		}

		private trackingNumber: string;

		getTrackingNumber(): string {
			return this.trackingNumber;
		}

		setTrackingNumber(trackingNumber: string) {
			this.trackingNumber = trackingNumber;
		}

		private dateReceived: string;

		getDateReceived(): string {
			return this.dateReceived;
		}

		setDateReceived(dateReceived: string) {
			this.dateReceived = dateReceived;
		}

		private isInTransit: boolean;

		getIsInTransit(): boolean {
			return this.isInTransit;
		}

		setIsInTransit(isInTransit: boolean) {
			this.isInTransit = isInTransit;
		}

		private isApproved: boolean;

		getIsApproved(): boolean {
			return this.isApproved;
		}

		setIsApproved(isApproved: boolean) {
			this.isApproved = isApproved;
		}

		private isInDispute: boolean;

		getIsInDispute(): boolean {
			return this.isInDispute;
		}

		setIsInDispute(isInDispute: boolean) {
			this.isInDispute = isInDispute;
		}

		private volume: string;

		getVolume(): string {
			return this.volume;
		}

		setVolume(volume: string) {
			this.volume = volume;
		}

		private weight: string;

		getWeight(): string {
			return this.weight;
		}

		setWeight(weight: string) {
			this.weight = weight;
		}

		private rmaNumber: string;

		getRmaNumber(): string {
			return this.rmaNumber;
		}

		setRmaNumber(rmaNumber: string) {
			this.rmaNumber = rmaNumber;
		}

		private reversalNumber: string;

		getReversalNumber(): string {
			return this.reversalNumber;
		}

		setReversalNumber(reversalNumber: string) {
			this.reversalNumber = reversalNumber;
		}

		private isDropShip: boolean;

		getIsDropShip(): boolean {
			return this.isDropShip;
		}

		setIsDropShip(isDropShip: boolean) {
			this.isDropShip = isDropShip;
		}

		private dropShipBusinessPartnerId: string;

		getDropShipBusinessPartnerId(): string {
			return this.dropShipBusinessPartnerId;
		}

		setDropShipBusinessPartnerId(dropShipBusinessPartnerId: string) {
			this.dropShipBusinessPartnerId = dropShipBusinessPartnerId;
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

		private inOutLines: Array<InOutLine>;

		getInOutLines() {
			return this.inOutLines;
		}
	
		setInOutLines(inOutLines: Array<InOutLine>){
			this.inOutLines = inOutLines;
		}

	}
}

