<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait InOutLineMvoIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLineNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyLineNumberRemoved()
    {
        return $this->isPropertyLineNumberRemoved;
    }

    /**
     * @param boolean $isPropertyLineNumberRemoved
     */
    public function setIsPropertyLineNumberRemoved($isPropertyLineNumberRemoved)
    {
        $this->isPropertyLineNumberRemoved = $isPropertyLineNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDescriptionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyDescriptionRemoved()
    {
        return $this->isPropertyDescriptionRemoved;
    }

    /**
     * @param boolean $isPropertyDescriptionRemoved
     */
    public function setIsPropertyDescriptionRemoved($isPropertyDescriptionRemoved)
    {
        $this->isPropertyDescriptionRemoved = $isPropertyDescriptionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLocatorIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyLocatorIdRemoved()
    {
        return $this->isPropertyLocatorIdRemoved;
    }

    /**
     * @param boolean $isPropertyLocatorIdRemoved
     */
    public function setIsPropertyLocatorIdRemoved($isPropertyLocatorIdRemoved)
    {
        $this->isPropertyLocatorIdRemoved = $isPropertyLocatorIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyProductRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyProductRemoved()
    {
        return $this->isPropertyProductRemoved;
    }

    /**
     * @param boolean $isPropertyProductRemoved
     */
    public function setIsPropertyProductRemoved($isPropertyProductRemoved)
    {
        $this->isPropertyProductRemoved = $isPropertyProductRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUomIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUomIdRemoved()
    {
        return $this->isPropertyUomIdRemoved;
    }

    /**
     * @param boolean $isPropertyUomIdRemoved
     */
    public function setIsPropertyUomIdRemoved($isPropertyUomIdRemoved)
    {
        $this->isPropertyUomIdRemoved = $isPropertyUomIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyMovementQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyMovementQuantityRemoved()
    {
        return $this->isPropertyMovementQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyMovementQuantityRemoved
     */
    public function setIsPropertyMovementQuantityRemoved($isPropertyMovementQuantityRemoved)
    {
        $this->isPropertyMovementQuantityRemoved = $isPropertyMovementQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyConfirmedQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyConfirmedQuantityRemoved()
    {
        return $this->isPropertyConfirmedQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyConfirmedQuantityRemoved
     */
    public function setIsPropertyConfirmedQuantityRemoved($isPropertyConfirmedQuantityRemoved)
    {
        $this->isPropertyConfirmedQuantityRemoved = $isPropertyConfirmedQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyScrappedQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyScrappedQuantityRemoved()
    {
        return $this->isPropertyScrappedQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyScrappedQuantityRemoved
     */
    public function setIsPropertyScrappedQuantityRemoved($isPropertyScrappedQuantityRemoved)
    {
        $this->isPropertyScrappedQuantityRemoved = $isPropertyScrappedQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyTargetQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyTargetQuantityRemoved()
    {
        return $this->isPropertyTargetQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyTargetQuantityRemoved
     */
    public function setIsPropertyTargetQuantityRemoved($isPropertyTargetQuantityRemoved)
    {
        $this->isPropertyTargetQuantityRemoved = $isPropertyTargetQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPickedQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPickedQuantityRemoved()
    {
        return $this->isPropertyPickedQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyPickedQuantityRemoved
     */
    public function setIsPropertyPickedQuantityRemoved($isPropertyPickedQuantityRemoved)
    {
        $this->isPropertyPickedQuantityRemoved = $isPropertyPickedQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsInvoicedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyIsInvoicedRemoved()
    {
        return $this->isPropertyIsInvoicedRemoved;
    }

    /**
     * @param boolean $isPropertyIsInvoicedRemoved
     */
    public function setIsPropertyIsInvoicedRemoved($isPropertyIsInvoicedRemoved)
    {
        $this->isPropertyIsInvoicedRemoved = $isPropertyIsInvoicedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetInstanceIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetInstanceIdRemoved()
    {
        return $this->isPropertyAttributeSetInstanceIdRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetInstanceIdRemoved
     */
    public function setIsPropertyAttributeSetInstanceIdRemoved($isPropertyAttributeSetInstanceIdRemoved)
    {
        $this->isPropertyAttributeSetInstanceIdRemoved = $isPropertyAttributeSetInstanceIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsDescriptionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyIsDescriptionRemoved()
    {
        return $this->isPropertyIsDescriptionRemoved;
    }

    /**
     * @param boolean $isPropertyIsDescriptionRemoved
     */
    public function setIsPropertyIsDescriptionRemoved($isPropertyIsDescriptionRemoved)
    {
        $this->isPropertyIsDescriptionRemoved = $isPropertyIsDescriptionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyProcessedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyProcessedRemoved()
    {
        return $this->isPropertyProcessedRemoved;
    }

    /**
     * @param boolean $isPropertyProcessedRemoved
     */
    public function setIsPropertyProcessedRemoved($isPropertyProcessedRemoved)
    {
        $this->isPropertyProcessedRemoved = $isPropertyProcessedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyQuantityEnteredRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyQuantityEnteredRemoved()
    {
        return $this->isPropertyQuantityEnteredRemoved;
    }

    /**
     * @param boolean $isPropertyQuantityEnteredRemoved
     */
    public function setIsPropertyQuantityEnteredRemoved($isPropertyQuantityEnteredRemoved)
    {
        $this->isPropertyQuantityEnteredRemoved = $isPropertyQuantityEnteredRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyRmaLineNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyRmaLineNumberRemoved()
    {
        return $this->isPropertyRmaLineNumberRemoved;
    }

    /**
     * @param boolean $isPropertyRmaLineNumberRemoved
     */
    public function setIsPropertyRmaLineNumberRemoved($isPropertyRmaLineNumberRemoved)
    {
        $this->isPropertyRmaLineNumberRemoved = $isPropertyRmaLineNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyReversalLineNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyReversalLineNumberRemoved()
    {
        return $this->isPropertyReversalLineNumberRemoved;
    }

    /**
     * @param boolean $isPropertyReversalLineNumberRemoved
     */
    public function setIsPropertyReversalLineNumberRemoved($isPropertyReversalLineNumberRemoved)
    {
        $this->isPropertyReversalLineNumberRemoved = $isPropertyReversalLineNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyVersionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyVersionRemoved()
    {
        return $this->isPropertyVersionRemoved;
    }

    /**
     * @param boolean $isPropertyVersionRemoved
     */
    public function setIsPropertyVersionRemoved($isPropertyVersionRemoved)
    {
        $this->isPropertyVersionRemoved = $isPropertyVersionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyActiveRemoved()
    {
        return $this->isPropertyActiveRemoved;
    }

    /**
     * @param boolean $isPropertyActiveRemoved
     */
    public function setIsPropertyActiveRemoved($isPropertyActiveRemoved)
    {
        $this->isPropertyActiveRemoved = $isPropertyActiveRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutIsSOTransactionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutIsSOTransactionRemoved()
    {
        return $this->isPropertyInOutIsSOTransactionRemoved;
    }

    /**
     * @param boolean $isPropertyInOutIsSOTransactionRemoved
     */
    public function setIsPropertyInOutIsSOTransactionRemoved($isPropertyInOutIsSOTransactionRemoved)
    {
        $this->isPropertyInOutIsSOTransactionRemoved = $isPropertyInOutIsSOTransactionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutPostedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutPostedRemoved()
    {
        return $this->isPropertyInOutPostedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutPostedRemoved
     */
    public function setIsPropertyInOutPostedRemoved($isPropertyInOutPostedRemoved)
    {
        $this->isPropertyInOutPostedRemoved = $isPropertyInOutPostedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutProcessingRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutProcessingRemoved()
    {
        return $this->isPropertyInOutProcessingRemoved;
    }

    /**
     * @param boolean $isPropertyInOutProcessingRemoved
     */
    public function setIsPropertyInOutProcessingRemoved($isPropertyInOutProcessingRemoved)
    {
        $this->isPropertyInOutProcessingRemoved = $isPropertyInOutProcessingRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutProcessedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutProcessedRemoved()
    {
        return $this->isPropertyInOutProcessedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutProcessedRemoved
     */
    public function setIsPropertyInOutProcessedRemoved($isPropertyInOutProcessedRemoved)
    {
        $this->isPropertyInOutProcessedRemoved = $isPropertyInOutProcessedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutDocumentTypeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutDocumentTypeRemoved()
    {
        return $this->isPropertyInOutDocumentTypeRemoved;
    }

    /**
     * @param boolean $isPropertyInOutDocumentTypeRemoved
     */
    public function setIsPropertyInOutDocumentTypeRemoved($isPropertyInOutDocumentTypeRemoved)
    {
        $this->isPropertyInOutDocumentTypeRemoved = $isPropertyInOutDocumentTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutDescriptionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutDescriptionRemoved()
    {
        return $this->isPropertyInOutDescriptionRemoved;
    }

    /**
     * @param boolean $isPropertyInOutDescriptionRemoved
     */
    public function setIsPropertyInOutDescriptionRemoved($isPropertyInOutDescriptionRemoved)
    {
        $this->isPropertyInOutDescriptionRemoved = $isPropertyInOutDescriptionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutOrderNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutOrderNumberRemoved()
    {
        return $this->isPropertyInOutOrderNumberRemoved;
    }

    /**
     * @param boolean $isPropertyInOutOrderNumberRemoved
     */
    public function setIsPropertyInOutOrderNumberRemoved($isPropertyInOutOrderNumberRemoved)
    {
        $this->isPropertyInOutOrderNumberRemoved = $isPropertyInOutOrderNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutDateOrderedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutDateOrderedRemoved()
    {
        return $this->isPropertyInOutDateOrderedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutDateOrderedRemoved
     */
    public function setIsPropertyInOutDateOrderedRemoved($isPropertyInOutDateOrderedRemoved)
    {
        $this->isPropertyInOutDateOrderedRemoved = $isPropertyInOutDateOrderedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutIsPrintedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutIsPrintedRemoved()
    {
        return $this->isPropertyInOutIsPrintedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutIsPrintedRemoved
     */
    public function setIsPropertyInOutIsPrintedRemoved($isPropertyInOutIsPrintedRemoved)
    {
        $this->isPropertyInOutIsPrintedRemoved = $isPropertyInOutIsPrintedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutMovementTypeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutMovementTypeRemoved()
    {
        return $this->isPropertyInOutMovementTypeRemoved;
    }

    /**
     * @param boolean $isPropertyInOutMovementTypeRemoved
     */
    public function setIsPropertyInOutMovementTypeRemoved($isPropertyInOutMovementTypeRemoved)
    {
        $this->isPropertyInOutMovementTypeRemoved = $isPropertyInOutMovementTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutMovementDateRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutMovementDateRemoved()
    {
        return $this->isPropertyInOutMovementDateRemoved;
    }

    /**
     * @param boolean $isPropertyInOutMovementDateRemoved
     */
    public function setIsPropertyInOutMovementDateRemoved($isPropertyInOutMovementDateRemoved)
    {
        $this->isPropertyInOutMovementDateRemoved = $isPropertyInOutMovementDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutBusinessPartnerIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutBusinessPartnerIdRemoved()
    {
        return $this->isPropertyInOutBusinessPartnerIdRemoved;
    }

    /**
     * @param boolean $isPropertyInOutBusinessPartnerIdRemoved
     */
    public function setIsPropertyInOutBusinessPartnerIdRemoved($isPropertyInOutBusinessPartnerIdRemoved)
    {
        $this->isPropertyInOutBusinessPartnerIdRemoved = $isPropertyInOutBusinessPartnerIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutWarehouseIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutWarehouseIdRemoved()
    {
        return $this->isPropertyInOutWarehouseIdRemoved;
    }

    /**
     * @param boolean $isPropertyInOutWarehouseIdRemoved
     */
    public function setIsPropertyInOutWarehouseIdRemoved($isPropertyInOutWarehouseIdRemoved)
    {
        $this->isPropertyInOutWarehouseIdRemoved = $isPropertyInOutWarehouseIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutPOReferenceRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutPOReferenceRemoved()
    {
        return $this->isPropertyInOutPOReferenceRemoved;
    }

    /**
     * @param boolean $isPropertyInOutPOReferenceRemoved
     */
    public function setIsPropertyInOutPOReferenceRemoved($isPropertyInOutPOReferenceRemoved)
    {
        $this->isPropertyInOutPOReferenceRemoved = $isPropertyInOutPOReferenceRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutFreightAmountRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutFreightAmountRemoved()
    {
        return $this->isPropertyInOutFreightAmountRemoved;
    }

    /**
     * @param boolean $isPropertyInOutFreightAmountRemoved
     */
    public function setIsPropertyInOutFreightAmountRemoved($isPropertyInOutFreightAmountRemoved)
    {
        $this->isPropertyInOutFreightAmountRemoved = $isPropertyInOutFreightAmountRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutShipperIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutShipperIdRemoved()
    {
        return $this->isPropertyInOutShipperIdRemoved;
    }

    /**
     * @param boolean $isPropertyInOutShipperIdRemoved
     */
    public function setIsPropertyInOutShipperIdRemoved($isPropertyInOutShipperIdRemoved)
    {
        $this->isPropertyInOutShipperIdRemoved = $isPropertyInOutShipperIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutChargeAmountRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutChargeAmountRemoved()
    {
        return $this->isPropertyInOutChargeAmountRemoved;
    }

    /**
     * @param boolean $isPropertyInOutChargeAmountRemoved
     */
    public function setIsPropertyInOutChargeAmountRemoved($isPropertyInOutChargeAmountRemoved)
    {
        $this->isPropertyInOutChargeAmountRemoved = $isPropertyInOutChargeAmountRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutDatePrintedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutDatePrintedRemoved()
    {
        return $this->isPropertyInOutDatePrintedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutDatePrintedRemoved
     */
    public function setIsPropertyInOutDatePrintedRemoved($isPropertyInOutDatePrintedRemoved)
    {
        $this->isPropertyInOutDatePrintedRemoved = $isPropertyInOutDatePrintedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutSalesRepresentativeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutSalesRepresentativeRemoved()
    {
        return $this->isPropertyInOutSalesRepresentativeRemoved;
    }

    /**
     * @param boolean $isPropertyInOutSalesRepresentativeRemoved
     */
    public function setIsPropertyInOutSalesRepresentativeRemoved($isPropertyInOutSalesRepresentativeRemoved)
    {
        $this->isPropertyInOutSalesRepresentativeRemoved = $isPropertyInOutSalesRepresentativeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutNumberOfPackagesRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutNumberOfPackagesRemoved()
    {
        return $this->isPropertyInOutNumberOfPackagesRemoved;
    }

    /**
     * @param boolean $isPropertyInOutNumberOfPackagesRemoved
     */
    public function setIsPropertyInOutNumberOfPackagesRemoved($isPropertyInOutNumberOfPackagesRemoved)
    {
        $this->isPropertyInOutNumberOfPackagesRemoved = $isPropertyInOutNumberOfPackagesRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutPickDateRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutPickDateRemoved()
    {
        return $this->isPropertyInOutPickDateRemoved;
    }

    /**
     * @param boolean $isPropertyInOutPickDateRemoved
     */
    public function setIsPropertyInOutPickDateRemoved($isPropertyInOutPickDateRemoved)
    {
        $this->isPropertyInOutPickDateRemoved = $isPropertyInOutPickDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutShipDateRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutShipDateRemoved()
    {
        return $this->isPropertyInOutShipDateRemoved;
    }

    /**
     * @param boolean $isPropertyInOutShipDateRemoved
     */
    public function setIsPropertyInOutShipDateRemoved($isPropertyInOutShipDateRemoved)
    {
        $this->isPropertyInOutShipDateRemoved = $isPropertyInOutShipDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutTrackingNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutTrackingNumberRemoved()
    {
        return $this->isPropertyInOutTrackingNumberRemoved;
    }

    /**
     * @param boolean $isPropertyInOutTrackingNumberRemoved
     */
    public function setIsPropertyInOutTrackingNumberRemoved($isPropertyInOutTrackingNumberRemoved)
    {
        $this->isPropertyInOutTrackingNumberRemoved = $isPropertyInOutTrackingNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutDateReceivedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutDateReceivedRemoved()
    {
        return $this->isPropertyInOutDateReceivedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutDateReceivedRemoved
     */
    public function setIsPropertyInOutDateReceivedRemoved($isPropertyInOutDateReceivedRemoved)
    {
        $this->isPropertyInOutDateReceivedRemoved = $isPropertyInOutDateReceivedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutIsInTransitRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutIsInTransitRemoved()
    {
        return $this->isPropertyInOutIsInTransitRemoved;
    }

    /**
     * @param boolean $isPropertyInOutIsInTransitRemoved
     */
    public function setIsPropertyInOutIsInTransitRemoved($isPropertyInOutIsInTransitRemoved)
    {
        $this->isPropertyInOutIsInTransitRemoved = $isPropertyInOutIsInTransitRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutIsApprovedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutIsApprovedRemoved()
    {
        return $this->isPropertyInOutIsApprovedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutIsApprovedRemoved
     */
    public function setIsPropertyInOutIsApprovedRemoved($isPropertyInOutIsApprovedRemoved)
    {
        $this->isPropertyInOutIsApprovedRemoved = $isPropertyInOutIsApprovedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutIsInDisputeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutIsInDisputeRemoved()
    {
        return $this->isPropertyInOutIsInDisputeRemoved;
    }

    /**
     * @param boolean $isPropertyInOutIsInDisputeRemoved
     */
    public function setIsPropertyInOutIsInDisputeRemoved($isPropertyInOutIsInDisputeRemoved)
    {
        $this->isPropertyInOutIsInDisputeRemoved = $isPropertyInOutIsInDisputeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutVolumeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutVolumeRemoved()
    {
        return $this->isPropertyInOutVolumeRemoved;
    }

    /**
     * @param boolean $isPropertyInOutVolumeRemoved
     */
    public function setIsPropertyInOutVolumeRemoved($isPropertyInOutVolumeRemoved)
    {
        $this->isPropertyInOutVolumeRemoved = $isPropertyInOutVolumeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutWeightRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutWeightRemoved()
    {
        return $this->isPropertyInOutWeightRemoved;
    }

    /**
     * @param boolean $isPropertyInOutWeightRemoved
     */
    public function setIsPropertyInOutWeightRemoved($isPropertyInOutWeightRemoved)
    {
        $this->isPropertyInOutWeightRemoved = $isPropertyInOutWeightRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutRmaNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutRmaNumberRemoved()
    {
        return $this->isPropertyInOutRmaNumberRemoved;
    }

    /**
     * @param boolean $isPropertyInOutRmaNumberRemoved
     */
    public function setIsPropertyInOutRmaNumberRemoved($isPropertyInOutRmaNumberRemoved)
    {
        $this->isPropertyInOutRmaNumberRemoved = $isPropertyInOutRmaNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutReversalNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutReversalNumberRemoved()
    {
        return $this->isPropertyInOutReversalNumberRemoved;
    }

    /**
     * @param boolean $isPropertyInOutReversalNumberRemoved
     */
    public function setIsPropertyInOutReversalNumberRemoved($isPropertyInOutReversalNumberRemoved)
    {
        $this->isPropertyInOutReversalNumberRemoved = $isPropertyInOutReversalNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutIsDropShipRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutIsDropShipRemoved()
    {
        return $this->isPropertyInOutIsDropShipRemoved;
    }

    /**
     * @param boolean $isPropertyInOutIsDropShipRemoved
     */
    public function setIsPropertyInOutIsDropShipRemoved($isPropertyInOutIsDropShipRemoved)
    {
        $this->isPropertyInOutIsDropShipRemoved = $isPropertyInOutIsDropShipRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutDropShipBusinessPartnerIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutDropShipBusinessPartnerIdRemoved()
    {
        return $this->isPropertyInOutDropShipBusinessPartnerIdRemoved;
    }

    /**
     * @param boolean $isPropertyInOutDropShipBusinessPartnerIdRemoved
     */
    public function setIsPropertyInOutDropShipBusinessPartnerIdRemoved($isPropertyInOutDropShipBusinessPartnerIdRemoved)
    {
        $this->isPropertyInOutDropShipBusinessPartnerIdRemoved = $isPropertyInOutDropShipBusinessPartnerIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutCreatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutCreatedByRemoved()
    {
        return $this->isPropertyInOutCreatedByRemoved;
    }

    /**
     * @param boolean $isPropertyInOutCreatedByRemoved
     */
    public function setIsPropertyInOutCreatedByRemoved($isPropertyInOutCreatedByRemoved)
    {
        $this->isPropertyInOutCreatedByRemoved = $isPropertyInOutCreatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutCreatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutCreatedAtRemoved()
    {
        return $this->isPropertyInOutCreatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyInOutCreatedAtRemoved
     */
    public function setIsPropertyInOutCreatedAtRemoved($isPropertyInOutCreatedAtRemoved)
    {
        $this->isPropertyInOutCreatedAtRemoved = $isPropertyInOutCreatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutUpdatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutUpdatedByRemoved()
    {
        return $this->isPropertyInOutUpdatedByRemoved;
    }

    /**
     * @param boolean $isPropertyInOutUpdatedByRemoved
     */
    public function setIsPropertyInOutUpdatedByRemoved($isPropertyInOutUpdatedByRemoved)
    {
        $this->isPropertyInOutUpdatedByRemoved = $isPropertyInOutUpdatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutUpdatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutUpdatedAtRemoved()
    {
        return $this->isPropertyInOutUpdatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyInOutUpdatedAtRemoved
     */
    public function setIsPropertyInOutUpdatedAtRemoved($isPropertyInOutUpdatedAtRemoved)
    {
        $this->isPropertyInOutUpdatedAtRemoved = $isPropertyInOutUpdatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutActiveRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutActiveRemoved()
    {
        return $this->isPropertyInOutActiveRemoved;
    }

    /**
     * @param boolean $isPropertyInOutActiveRemoved
     */
    public function setIsPropertyInOutActiveRemoved($isPropertyInOutActiveRemoved)
    {
        $this->isPropertyInOutActiveRemoved = $isPropertyInOutActiveRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyInOutDeletedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyInOutDeletedRemoved()
    {
        return $this->isPropertyInOutDeletedRemoved;
    }

    /**
     * @param boolean $isPropertyInOutDeletedRemoved
     */
    public function setIsPropertyInOutDeletedRemoved($isPropertyInOutDeletedRemoved)
    {
        $this->isPropertyInOutDeletedRemoved = $isPropertyInOutDeletedRemoved;
    }


}

