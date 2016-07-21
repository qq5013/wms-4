<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait InOutIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsSOTransactionRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyIsSOTransactionRemoved()
    {
        return $this->isPropertyIsSOTransactionRemoved;
    }

    /**
     * @param boolean $isPropertyIsSOTransactionRemoved
     */
    public function setIsPropertyIsSOTransactionRemoved($isPropertyIsSOTransactionRemoved)
    {
        $this->isPropertyIsSOTransactionRemoved = $isPropertyIsSOTransactionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPostedRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyPostedRemoved()
    {
        return $this->isPropertyPostedRemoved;
    }

    /**
     * @param boolean $isPropertyPostedRemoved
     */
    public function setIsPropertyPostedRemoved($isPropertyPostedRemoved)
    {
        $this->isPropertyPostedRemoved = $isPropertyPostedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyProcessingRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyProcessingRemoved()
    {
        return $this->isPropertyProcessingRemoved;
    }

    /**
     * @param boolean $isPropertyProcessingRemoved
     */
    public function setIsPropertyProcessingRemoved($isPropertyProcessingRemoved)
    {
        $this->isPropertyProcessingRemoved = $isPropertyProcessingRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyProcessedRemoved = null;

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
    private $isPropertyDocumentTypeRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyDocumentTypeRemoved()
    {
        return $this->isPropertyDocumentTypeRemoved;
    }

    /**
     * @param boolean $isPropertyDocumentTypeRemoved
     */
    public function setIsPropertyDocumentTypeRemoved($isPropertyDocumentTypeRemoved)
    {
        $this->isPropertyDocumentTypeRemoved = $isPropertyDocumentTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDescriptionRemoved = null;

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
    private $isPropertyOrderNumberRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyOrderNumberRemoved()
    {
        return $this->isPropertyOrderNumberRemoved;
    }

    /**
     * @param boolean $isPropertyOrderNumberRemoved
     */
    public function setIsPropertyOrderNumberRemoved($isPropertyOrderNumberRemoved)
    {
        $this->isPropertyOrderNumberRemoved = $isPropertyOrderNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDateOrderedRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyDateOrderedRemoved()
    {
        return $this->isPropertyDateOrderedRemoved;
    }

    /**
     * @param boolean $isPropertyDateOrderedRemoved
     */
    public function setIsPropertyDateOrderedRemoved($isPropertyDateOrderedRemoved)
    {
        $this->isPropertyDateOrderedRemoved = $isPropertyDateOrderedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsPrintedRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyIsPrintedRemoved()
    {
        return $this->isPropertyIsPrintedRemoved;
    }

    /**
     * @param boolean $isPropertyIsPrintedRemoved
     */
    public function setIsPropertyIsPrintedRemoved($isPropertyIsPrintedRemoved)
    {
        $this->isPropertyIsPrintedRemoved = $isPropertyIsPrintedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyMovementTypeRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyMovementTypeRemoved()
    {
        return $this->isPropertyMovementTypeRemoved;
    }

    /**
     * @param boolean $isPropertyMovementTypeRemoved
     */
    public function setIsPropertyMovementTypeRemoved($isPropertyMovementTypeRemoved)
    {
        $this->isPropertyMovementTypeRemoved = $isPropertyMovementTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyMovementDateRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyMovementDateRemoved()
    {
        return $this->isPropertyMovementDateRemoved;
    }

    /**
     * @param boolean $isPropertyMovementDateRemoved
     */
    public function setIsPropertyMovementDateRemoved($isPropertyMovementDateRemoved)
    {
        $this->isPropertyMovementDateRemoved = $isPropertyMovementDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyBusinessPartnerIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyBusinessPartnerIdRemoved()
    {
        return $this->isPropertyBusinessPartnerIdRemoved;
    }

    /**
     * @param boolean $isPropertyBusinessPartnerIdRemoved
     */
    public function setIsPropertyBusinessPartnerIdRemoved($isPropertyBusinessPartnerIdRemoved)
    {
        $this->isPropertyBusinessPartnerIdRemoved = $isPropertyBusinessPartnerIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyWarehouseIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyWarehouseIdRemoved()
    {
        return $this->isPropertyWarehouseIdRemoved;
    }

    /**
     * @param boolean $isPropertyWarehouseIdRemoved
     */
    public function setIsPropertyWarehouseIdRemoved($isPropertyWarehouseIdRemoved)
    {
        $this->isPropertyWarehouseIdRemoved = $isPropertyWarehouseIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPOReferenceRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyPOReferenceRemoved()
    {
        return $this->isPropertyPOReferenceRemoved;
    }

    /**
     * @param boolean $isPropertyPOReferenceRemoved
     */
    public function setIsPropertyPOReferenceRemoved($isPropertyPOReferenceRemoved)
    {
        $this->isPropertyPOReferenceRemoved = $isPropertyPOReferenceRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyFreightAmountRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyFreightAmountRemoved()
    {
        return $this->isPropertyFreightAmountRemoved;
    }

    /**
     * @param boolean $isPropertyFreightAmountRemoved
     */
    public function setIsPropertyFreightAmountRemoved($isPropertyFreightAmountRemoved)
    {
        $this->isPropertyFreightAmountRemoved = $isPropertyFreightAmountRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyShipperIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyShipperIdRemoved()
    {
        return $this->isPropertyShipperIdRemoved;
    }

    /**
     * @param boolean $isPropertyShipperIdRemoved
     */
    public function setIsPropertyShipperIdRemoved($isPropertyShipperIdRemoved)
    {
        $this->isPropertyShipperIdRemoved = $isPropertyShipperIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyChargeAmountRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyChargeAmountRemoved()
    {
        return $this->isPropertyChargeAmountRemoved;
    }

    /**
     * @param boolean $isPropertyChargeAmountRemoved
     */
    public function setIsPropertyChargeAmountRemoved($isPropertyChargeAmountRemoved)
    {
        $this->isPropertyChargeAmountRemoved = $isPropertyChargeAmountRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDatePrintedRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyDatePrintedRemoved()
    {
        return $this->isPropertyDatePrintedRemoved;
    }

    /**
     * @param boolean $isPropertyDatePrintedRemoved
     */
    public function setIsPropertyDatePrintedRemoved($isPropertyDatePrintedRemoved)
    {
        $this->isPropertyDatePrintedRemoved = $isPropertyDatePrintedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertySalesRepresentativeRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertySalesRepresentativeRemoved()
    {
        return $this->isPropertySalesRepresentativeRemoved;
    }

    /**
     * @param boolean $isPropertySalesRepresentativeRemoved
     */
    public function setIsPropertySalesRepresentativeRemoved($isPropertySalesRepresentativeRemoved)
    {
        $this->isPropertySalesRepresentativeRemoved = $isPropertySalesRepresentativeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyNumberOfPackagesRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyNumberOfPackagesRemoved()
    {
        return $this->isPropertyNumberOfPackagesRemoved;
    }

    /**
     * @param boolean $isPropertyNumberOfPackagesRemoved
     */
    public function setIsPropertyNumberOfPackagesRemoved($isPropertyNumberOfPackagesRemoved)
    {
        $this->isPropertyNumberOfPackagesRemoved = $isPropertyNumberOfPackagesRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPickDateRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyPickDateRemoved()
    {
        return $this->isPropertyPickDateRemoved;
    }

    /**
     * @param boolean $isPropertyPickDateRemoved
     */
    public function setIsPropertyPickDateRemoved($isPropertyPickDateRemoved)
    {
        $this->isPropertyPickDateRemoved = $isPropertyPickDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyShipDateRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyShipDateRemoved()
    {
        return $this->isPropertyShipDateRemoved;
    }

    /**
     * @param boolean $isPropertyShipDateRemoved
     */
    public function setIsPropertyShipDateRemoved($isPropertyShipDateRemoved)
    {
        $this->isPropertyShipDateRemoved = $isPropertyShipDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyTrackingNumberRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyTrackingNumberRemoved()
    {
        return $this->isPropertyTrackingNumberRemoved;
    }

    /**
     * @param boolean $isPropertyTrackingNumberRemoved
     */
    public function setIsPropertyTrackingNumberRemoved($isPropertyTrackingNumberRemoved)
    {
        $this->isPropertyTrackingNumberRemoved = $isPropertyTrackingNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDateReceivedRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyDateReceivedRemoved()
    {
        return $this->isPropertyDateReceivedRemoved;
    }

    /**
     * @param boolean $isPropertyDateReceivedRemoved
     */
    public function setIsPropertyDateReceivedRemoved($isPropertyDateReceivedRemoved)
    {
        $this->isPropertyDateReceivedRemoved = $isPropertyDateReceivedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsInTransitRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyIsInTransitRemoved()
    {
        return $this->isPropertyIsInTransitRemoved;
    }

    /**
     * @param boolean $isPropertyIsInTransitRemoved
     */
    public function setIsPropertyIsInTransitRemoved($isPropertyIsInTransitRemoved)
    {
        $this->isPropertyIsInTransitRemoved = $isPropertyIsInTransitRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsApprovedRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyIsApprovedRemoved()
    {
        return $this->isPropertyIsApprovedRemoved;
    }

    /**
     * @param boolean $isPropertyIsApprovedRemoved
     */
    public function setIsPropertyIsApprovedRemoved($isPropertyIsApprovedRemoved)
    {
        $this->isPropertyIsApprovedRemoved = $isPropertyIsApprovedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsInDisputeRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyIsInDisputeRemoved()
    {
        return $this->isPropertyIsInDisputeRemoved;
    }

    /**
     * @param boolean $isPropertyIsInDisputeRemoved
     */
    public function setIsPropertyIsInDisputeRemoved($isPropertyIsInDisputeRemoved)
    {
        $this->isPropertyIsInDisputeRemoved = $isPropertyIsInDisputeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyVolumeRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyVolumeRemoved()
    {
        return $this->isPropertyVolumeRemoved;
    }

    /**
     * @param boolean $isPropertyVolumeRemoved
     */
    public function setIsPropertyVolumeRemoved($isPropertyVolumeRemoved)
    {
        $this->isPropertyVolumeRemoved = $isPropertyVolumeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyWeightRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyWeightRemoved()
    {
        return $this->isPropertyWeightRemoved;
    }

    /**
     * @param boolean $isPropertyWeightRemoved
     */
    public function setIsPropertyWeightRemoved($isPropertyWeightRemoved)
    {
        $this->isPropertyWeightRemoved = $isPropertyWeightRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyRmaNumberRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyRmaNumberRemoved()
    {
        return $this->isPropertyRmaNumberRemoved;
    }

    /**
     * @param boolean $isPropertyRmaNumberRemoved
     */
    public function setIsPropertyRmaNumberRemoved($isPropertyRmaNumberRemoved)
    {
        $this->isPropertyRmaNumberRemoved = $isPropertyRmaNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyReversalNumberRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyReversalNumberRemoved()
    {
        return $this->isPropertyReversalNumberRemoved;
    }

    /**
     * @param boolean $isPropertyReversalNumberRemoved
     */
    public function setIsPropertyReversalNumberRemoved($isPropertyReversalNumberRemoved)
    {
        $this->isPropertyReversalNumberRemoved = $isPropertyReversalNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsDropShipRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyIsDropShipRemoved()
    {
        return $this->isPropertyIsDropShipRemoved;
    }

    /**
     * @param boolean $isPropertyIsDropShipRemoved
     */
    public function setIsPropertyIsDropShipRemoved($isPropertyIsDropShipRemoved)
    {
        $this->isPropertyIsDropShipRemoved = $isPropertyIsDropShipRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDropShipBusinessPartnerIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyDropShipBusinessPartnerIdRemoved()
    {
        return $this->isPropertyDropShipBusinessPartnerIdRemoved;
    }

    /**
     * @param boolean $isPropertyDropShipBusinessPartnerIdRemoved
     */
    public function setIsPropertyDropShipBusinessPartnerIdRemoved($isPropertyDropShipBusinessPartnerIdRemoved)
    {
        $this->isPropertyDropShipBusinessPartnerIdRemoved = $isPropertyDropShipBusinessPartnerIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;

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


}

