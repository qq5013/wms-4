namespace Dddml.Wms.Domain {

	export class InOut {

		private DocumentNumber: string;

		getDocumentNumber(): string {
			return this.DocumentNumber;
		}

		setDocumentNumber(documentNumber: string) {
			this.DocumentNumber = documentNumber;
		}

		private IsSOTransaction: boolean;

		getIsSOTransaction(): boolean {
			return this.IsSOTransaction;
		}

		setIsSOTransaction(isSOTransaction: boolean) {
			this.IsSOTransaction = isSOTransaction;
		}

		private DocumentStatus: string;

		getDocumentStatus(): string {
			return this.DocumentStatus;
		}

		setDocumentStatus(documentStatus: string) {
			this.DocumentStatus = documentStatus;
		}

		private Posted: boolean;

		getPosted(): boolean {
			return this.Posted;
		}

		setPosted(posted: boolean) {
			this.Posted = posted;
		}

		private Processing: boolean;

		getProcessing(): boolean {
			return this.Processing;
		}

		setProcessing(processing: boolean) {
			this.Processing = processing;
		}

		private Processed: boolean;

		getProcessed(): boolean {
			return this.Processed;
		}

		setProcessed(processed: boolean) {
			this.Processed = processed;
		}

		private DocumentType: number;

		getDocumentType(): number {
			return this.DocumentType;
		}

		setDocumentType(documentType: number) {
			this.DocumentType = documentType;
		}

		private Description: string;

		getDescription(): string {
			return this.Description;
		}

		setDescription(description: string) {
			this.Description = description;
		}

		private OrderNumber: string;

		getOrderNumber(): string {
			return this.OrderNumber;
		}

		setOrderNumber(orderNumber: string) {
			this.OrderNumber = orderNumber;
		}

		private DateOrdered: string;

		getDateOrdered(): string {
			return this.DateOrdered;
		}

		setDateOrdered(dateOrdered: string) {
			this.DateOrdered = dateOrdered;
		}

		private IsPrinted: boolean;

		getIsPrinted(): boolean {
			return this.IsPrinted;
		}

		setIsPrinted(isPrinted: boolean) {
			this.IsPrinted = isPrinted;
		}

		private MovementType: string;

		getMovementType(): string {
			return this.MovementType;
		}

		setMovementType(movementType: string) {
			this.MovementType = movementType;
		}

		private MovementDate: string;

		getMovementDate(): string {
			return this.MovementDate;
		}

		setMovementDate(movementDate: string) {
			this.MovementDate = movementDate;
		}

		private BusinessPartnerId: string;

		getBusinessPartnerId(): string {
			return this.BusinessPartnerId;
		}

		setBusinessPartnerId(businessPartnerId: string) {
			this.BusinessPartnerId = businessPartnerId;
		}

		private WarehouseId: string;

		getWarehouseId(): string {
			return this.WarehouseId;
		}

		setWarehouseId(warehouseId: string) {
			this.WarehouseId = warehouseId;
		}

		private POReference: string;

		getPOReference(): string {
			return this.POReference;
		}

		setPOReference(poReference: string) {
			this.POReference = poReference;
		}

		private FreightAmount: Money;

		getFreightAmount(): Money {
			return this.FreightAmount;
		}

		setFreightAmount(freightAmount: Money) {
			this.FreightAmount = freightAmount;
		}

		private ShipperId: string;

		getShipperId(): string {
			return this.ShipperId;
		}

		setShipperId(shipperId: string) {
			this.ShipperId = shipperId;
		}

		private ChargeAmount: Money;

		getChargeAmount(): Money {
			return this.ChargeAmount;
		}

		setChargeAmount(chargeAmount: Money) {
			this.ChargeAmount = chargeAmount;
		}

		private DatePrinted: string;

		getDatePrinted(): string {
			return this.DatePrinted;
		}

		setDatePrinted(datePrinted: string) {
			this.DatePrinted = datePrinted;
		}

		private SalesRepresentative: string;

		getSalesRepresentative(): string {
			return this.SalesRepresentative;
		}

		setSalesRepresentative(salesRepresentative: string) {
			this.SalesRepresentative = salesRepresentative;
		}

		private NumberOfPackages: number;

		getNumberOfPackages(): number {
			return this.NumberOfPackages;
		}

		setNumberOfPackages(numberOfPackages: number) {
			this.NumberOfPackages = numberOfPackages;
		}

		private PickDate: string;

		getPickDate(): string {
			return this.PickDate;
		}

		setPickDate(pickDate: string) {
			this.PickDate = pickDate;
		}

		private ShipDate: string;

		getShipDate(): string {
			return this.ShipDate;
		}

		setShipDate(shipDate: string) {
			this.ShipDate = shipDate;
		}

		private TrackingNumber: string;

		getTrackingNumber(): string {
			return this.TrackingNumber;
		}

		setTrackingNumber(trackingNumber: string) {
			this.TrackingNumber = trackingNumber;
		}

		private DateReceived: string;

		getDateReceived(): string {
			return this.DateReceived;
		}

		setDateReceived(dateReceived: string) {
			this.DateReceived = dateReceived;
		}

		private IsInTransit: boolean;

		getIsInTransit(): boolean {
			return this.IsInTransit;
		}

		setIsInTransit(isInTransit: boolean) {
			this.IsInTransit = isInTransit;
		}

		private IsApproved: boolean;

		getIsApproved(): boolean {
			return this.IsApproved;
		}

		setIsApproved(isApproved: boolean) {
			this.IsApproved = isApproved;
		}

		private IsInDispute: boolean;

		getIsInDispute(): boolean {
			return this.IsInDispute;
		}

		setIsInDispute(isInDispute: boolean) {
			this.IsInDispute = isInDispute;
		}

		private Volume: string;

		getVolume(): string {
			return this.Volume;
		}

		setVolume(volume: string) {
			this.Volume = volume;
		}

		private Weight: string;

		getWeight(): string {
			return this.Weight;
		}

		setWeight(weight: string) {
			this.Weight = weight;
		}

		private RmaNumber: string;

		getRmaNumber(): string {
			return this.RmaNumber;
		}

		setRmaNumber(rmaNumber: string) {
			this.RmaNumber = rmaNumber;
		}

		private ReversalNumber: string;

		getReversalNumber(): string {
			return this.ReversalNumber;
		}

		setReversalNumber(reversalNumber: string) {
			this.ReversalNumber = reversalNumber;
		}

		private IsDropShip: boolean;

		getIsDropShip(): boolean {
			return this.IsDropShip;
		}

		setIsDropShip(isDropShip: boolean) {
			this.IsDropShip = isDropShip;
		}

		private DropShipBusinessPartnerId: string;

		getDropShipBusinessPartnerId(): string {
			return this.DropShipBusinessPartnerId;
		}

		setDropShipBusinessPartnerId(dropShipBusinessPartnerId: string) {
			this.DropShipBusinessPartnerId = dropShipBusinessPartnerId;
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

		private InOutLines: Array<InOutLine>;

		getInOutLines() {
			return this.InOutLines;
		}
	
		setInOutLines(inOutLines: Array<InOutLine>){
			this.InOutLines = inOutLines;
		}

	}
}

