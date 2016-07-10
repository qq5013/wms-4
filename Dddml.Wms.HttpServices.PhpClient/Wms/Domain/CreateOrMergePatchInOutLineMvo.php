<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\InOutLineId;
use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchInOutLineMvo extends AbstractInOutLineMvoCommand
{

    use InOutLineMvoIsPropertyRemovedTrait;

    /**
     * @Type("integer")
     */
    private $lineNumber;

    /**
     * @return integer
     */
    public function getLineNumber()
    {
        return $this->lineNumber;
    }

    /**
     * @var integer $lineNumber
     */
    public function setLineNumber($lineNumber)
    {
        $this->lineNumber = $lineNumber;
    }

    /**
     * @Type("string")
     */
    private $description;

    /**
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * @var string $description
     */
    public function setDescription($description)
    {
        $this->description = $description;
    }

    /**
     * @Type("string")
     */
    private $locatorId;

    /**
     * @return string
     */
    public function getLocatorId()
    {
        return $this->locatorId;
    }

    /**
     * @var string $locatorId
     */
    public function setLocatorId($locatorId)
    {
        $this->locatorId = $locatorId;
    }

    /**
     * @Type("string")
     */
    private $product;

    /**
     * @return string
     */
    public function getProduct()
    {
        return $this->product;
    }

    /**
     * @var string $product
     */
    public function setProduct($product)
    {
        $this->product = $product;
    }

    /**
     * @Type("string")
     */
    private $uomId;

    /**
     * @return string
     */
    public function getUomId()
    {
        return $this->uomId;
    }

    /**
     * @var string $uomId
     */
    public function setUomId($uomId)
    {
        $this->uomId = $uomId;
    }

    /**
     * @Type("double")
     */
    private $movementQuantity;

    /**
     * @return double
     */
    public function getMovementQuantity()
    {
        return $this->movementQuantity;
    }

    /**
     * @var double $movementQuantity
     */
    public function setMovementQuantity($movementQuantity)
    {
        $this->movementQuantity = $movementQuantity;
    }

    /**
     * @Type("double")
     */
    private $confirmedQuantity;

    /**
     * @return double
     */
    public function getConfirmedQuantity()
    {
        return $this->confirmedQuantity;
    }

    /**
     * @var double $confirmedQuantity
     */
    public function setConfirmedQuantity($confirmedQuantity)
    {
        $this->confirmedQuantity = $confirmedQuantity;
    }

    /**
     * @Type("double")
     */
    private $scrappedQuantity;

    /**
     * @return double
     */
    public function getScrappedQuantity()
    {
        return $this->scrappedQuantity;
    }

    /**
     * @var double $scrappedQuantity
     */
    public function setScrappedQuantity($scrappedQuantity)
    {
        $this->scrappedQuantity = $scrappedQuantity;
    }

    /**
     * @Type("double")
     */
    private $targetQuantity;

    /**
     * @return double
     */
    public function getTargetQuantity()
    {
        return $this->targetQuantity;
    }

    /**
     * @var double $targetQuantity
     */
    public function setTargetQuantity($targetQuantity)
    {
        $this->targetQuantity = $targetQuantity;
    }

    /**
     * @Type("double")
     */
    private $pickedQuantity;

    /**
     * @return double
     */
    public function getPickedQuantity()
    {
        return $this->pickedQuantity;
    }

    /**
     * @var double $pickedQuantity
     */
    public function setPickedQuantity($pickedQuantity)
    {
        $this->pickedQuantity = $pickedQuantity;
    }

    /**
     * @Type("boolean")
     */
    private $isInvoiced;

    /**
     * @return boolean
     */
    public function getIsInvoiced()
    {
        return $this->isInvoiced;
    }

    /**
     * @var boolean $isInvoiced
     */
    public function setIsInvoiced($isInvoiced)
    {
        $this->isInvoiced = $isInvoiced;
    }

    /**
     * @Type("string")
     */
    private $attributeSetInstanceId;

    /**
     * @return string
     */
    public function getAttributeSetInstanceId()
    {
        return $this->attributeSetInstanceId;
    }

    /**
     * @var string $attributeSetInstanceId
     */
    public function setAttributeSetInstanceId($attributeSetInstanceId)
    {
        $this->attributeSetInstanceId = $attributeSetInstanceId;
    }

    /**
     * @Type("boolean")
     */
    private $isDescription;

    /**
     * @return boolean
     */
    public function getIsDescription()
    {
        return $this->isDescription;
    }

    /**
     * @var boolean $isDescription
     */
    public function setIsDescription($isDescription)
    {
        $this->isDescription = $isDescription;
    }

    /**
     * @Type("boolean")
     */
    private $processed;

    /**
     * @return boolean
     */
    public function getProcessed()
    {
        return $this->processed;
    }

    /**
     * @var boolean $processed
     */
    public function setProcessed($processed)
    {
        $this->processed = $processed;
    }

    /**
     * @Type("double")
     */
    private $quantityEntered;

    /**
     * @return double
     */
    public function getQuantityEntered()
    {
        return $this->quantityEntered;
    }

    /**
     * @var double $quantityEntered
     */
    public function setQuantityEntered($quantityEntered)
    {
        $this->quantityEntered = $quantityEntered;
    }

    /**
     * @Type("integer")
     */
    private $rmaLineNumber;

    /**
     * @return integer
     */
    public function getRmaLineNumber()
    {
        return $this->rmaLineNumber;
    }

    /**
     * @var integer $rmaLineNumber
     */
    public function setRmaLineNumber($rmaLineNumber)
    {
        $this->rmaLineNumber = $rmaLineNumber;
    }

    /**
     * @Type("integer")
     */
    private $reversalLineNumber;

    /**
     * @return integer
     */
    public function getReversalLineNumber()
    {
        return $this->reversalLineNumber;
    }

    /**
     * @var integer $reversalLineNumber
     */
    public function setReversalLineNumber($reversalLineNumber)
    {
        $this->reversalLineNumber = $reversalLineNumber;
    }

    /**
     * @Type("integer")
     */
    private $version;

    /**
     * @return integer
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @var integer $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }

    /**
     * @Type("boolean")
     */
    private $active;

    /**
     * @return boolean
     */
    public function getActive()
    {
        return $this->active;
    }

    /**
     * @var boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }

    /**
     * @Type("boolean")
     */
    private $inOutIsSoTransaction;

    /**
     * @return boolean
     */
    public function getInOutIsSoTransaction()
    {
        return $this->inOutIsSoTransaction;
    }

    /**
     * @var boolean $inOutIsSoTransaction
     */
    public function setInOutIsSoTransaction($inOutIsSoTransaction)
    {
        $this->inOutIsSoTransaction = $inOutIsSoTransaction;
    }

    /**
     * @Type("Wms\Domain\DocumentAction")
     */
    private $documentAction;

    /**
     * @return DocumentAction
     */
    public function getDocumentAction()
    {
        return $this->documentAction;
    }

    /**
     * @var DocumentAction $documentAction
     */
    public function setDocumentAction($documentAction)
    {
        $this->documentAction = $documentAction;
    }

    /**
     * @Type("boolean")
     */
    private $inOutPosted;

    /**
     * @return boolean
     */
    public function getInOutPosted()
    {
        return $this->inOutPosted;
    }

    /**
     * @var boolean $inOutPosted
     */
    public function setInOutPosted($inOutPosted)
    {
        $this->inOutPosted = $inOutPosted;
    }

    /**
     * @Type("boolean")
     */
    private $inOutProcessing;

    /**
     * @return boolean
     */
    public function getInOutProcessing()
    {
        return $this->inOutProcessing;
    }

    /**
     * @var boolean $inOutProcessing
     */
    public function setInOutProcessing($inOutProcessing)
    {
        $this->inOutProcessing = $inOutProcessing;
    }

    /**
     * @Type("boolean")
     */
    private $inOutProcessed;

    /**
     * @return boolean
     */
    public function getInOutProcessed()
    {
        return $this->inOutProcessed;
    }

    /**
     * @var boolean $inOutProcessed
     */
    public function setInOutProcessed($inOutProcessed)
    {
        $this->inOutProcessed = $inOutProcessed;
    }

    /**
     * @Type("integer")
     */
    private $inOutDocumentType;

    /**
     * @return integer
     */
    public function getInOutDocumentType()
    {
        return $this->inOutDocumentType;
    }

    /**
     * @var integer $inOutDocumentType
     */
    public function setInOutDocumentType($inOutDocumentType)
    {
        $this->inOutDocumentType = $inOutDocumentType;
    }

    /**
     * @Type("string")
     */
    private $inOutDescription;

    /**
     * @return string
     */
    public function getInOutDescription()
    {
        return $this->inOutDescription;
    }

    /**
     * @var string $inOutDescription
     */
    public function setInOutDescription($inOutDescription)
    {
        $this->inOutDescription = $inOutDescription;
    }

    /**
     * @Type("string")
     */
    private $inOutOrderNumber;

    /**
     * @return string
     */
    public function getInOutOrderNumber()
    {
        return $this->inOutOrderNumber;
    }

    /**
     * @var string $inOutOrderNumber
     */
    public function setInOutOrderNumber($inOutOrderNumber)
    {
        $this->inOutOrderNumber = $inOutOrderNumber;
    }

    /**
     * @Type("string")
     */
    private $inOutDateOrdered;

    /**
     * @return string
     */
    public function getInOutDateOrdered()
    {
        return $this->inOutDateOrdered;
    }

    /**
     * @var string $inOutDateOrdered
     */
    public function setInOutDateOrdered($inOutDateOrdered)
    {
        $this->inOutDateOrdered = $inOutDateOrdered;
    }

    /**
     * @Type("boolean")
     */
    private $inOutIsPrinted;

    /**
     * @return boolean
     */
    public function getInOutIsPrinted()
    {
        return $this->inOutIsPrinted;
    }

    /**
     * @var boolean $inOutIsPrinted
     */
    public function setInOutIsPrinted($inOutIsPrinted)
    {
        $this->inOutIsPrinted = $inOutIsPrinted;
    }

    /**
     * @Type("string")
     */
    private $inOutMovementType;

    /**
     * @return string
     */
    public function getInOutMovementType()
    {
        return $this->inOutMovementType;
    }

    /**
     * @var string $inOutMovementType
     */
    public function setInOutMovementType($inOutMovementType)
    {
        $this->inOutMovementType = $inOutMovementType;
    }

    /**
     * @Type("string")
     */
    private $inOutMovementDate;

    /**
     * @return string
     */
    public function getInOutMovementDate()
    {
        return $this->inOutMovementDate;
    }

    /**
     * @var string $inOutMovementDate
     */
    public function setInOutMovementDate($inOutMovementDate)
    {
        $this->inOutMovementDate = $inOutMovementDate;
    }

    /**
     * @Type("string")
     */
    private $inOutBusinessPartnerId;

    /**
     * @return string
     */
    public function getInOutBusinessPartnerId()
    {
        return $this->inOutBusinessPartnerId;
    }

    /**
     * @var string $inOutBusinessPartnerId
     */
    public function setInOutBusinessPartnerId($inOutBusinessPartnerId)
    {
        $this->inOutBusinessPartnerId = $inOutBusinessPartnerId;
    }

    /**
     * @Type("string")
     */
    private $inOutWarehouseId;

    /**
     * @return string
     */
    public function getInOutWarehouseId()
    {
        return $this->inOutWarehouseId;
    }

    /**
     * @var string $inOutWarehouseId
     */
    public function setInOutWarehouseId($inOutWarehouseId)
    {
        $this->inOutWarehouseId = $inOutWarehouseId;
    }

    /**
     * @Type("string")
     */
    private $inOutPoReference;

    /**
     * @return string
     */
    public function getInOutPoReference()
    {
        return $this->inOutPoReference;
    }

    /**
     * @var string $inOutPoReference
     */
    public function setInOutPoReference($inOutPoReference)
    {
        $this->inOutPoReference = $inOutPoReference;
    }

    /**
     * @Type("NodaMoney\Money")
     */
    private $inOutFreightAmount;

    /**
     * @return Money
     */
    public function getInOutFreightAmount()
    {
        return $this->inOutFreightAmount;
    }

    /**
     * @var Money $inOutFreightAmount
     */
    public function setInOutFreightAmount($inOutFreightAmount)
    {
        $this->inOutFreightAmount = $inOutFreightAmount;
    }

    /**
     * @Type("string")
     */
    private $inOutShipperId;

    /**
     * @return string
     */
    public function getInOutShipperId()
    {
        return $this->inOutShipperId;
    }

    /**
     * @var string $inOutShipperId
     */
    public function setInOutShipperId($inOutShipperId)
    {
        $this->inOutShipperId = $inOutShipperId;
    }

    /**
     * @Type("NodaMoney\Money")
     */
    private $inOutChargeAmount;

    /**
     * @return Money
     */
    public function getInOutChargeAmount()
    {
        return $this->inOutChargeAmount;
    }

    /**
     * @var Money $inOutChargeAmount
     */
    public function setInOutChargeAmount($inOutChargeAmount)
    {
        $this->inOutChargeAmount = $inOutChargeAmount;
    }

    /**
     * @Type("string")
     */
    private $inOutDatePrinted;

    /**
     * @return string
     */
    public function getInOutDatePrinted()
    {
        return $this->inOutDatePrinted;
    }

    /**
     * @var string $inOutDatePrinted
     */
    public function setInOutDatePrinted($inOutDatePrinted)
    {
        $this->inOutDatePrinted = $inOutDatePrinted;
    }

    /**
     * @Type("string")
     */
    private $inOutSalesRepresentative;

    /**
     * @return string
     */
    public function getInOutSalesRepresentative()
    {
        return $this->inOutSalesRepresentative;
    }

    /**
     * @var string $inOutSalesRepresentative
     */
    public function setInOutSalesRepresentative($inOutSalesRepresentative)
    {
        $this->inOutSalesRepresentative = $inOutSalesRepresentative;
    }

    /**
     * @Type("integer")
     */
    private $inOutNumberOfPackages;

    /**
     * @return integer
     */
    public function getInOutNumberOfPackages()
    {
        return $this->inOutNumberOfPackages;
    }

    /**
     * @var integer $inOutNumberOfPackages
     */
    public function setInOutNumberOfPackages($inOutNumberOfPackages)
    {
        $this->inOutNumberOfPackages = $inOutNumberOfPackages;
    }

    /**
     * @Type("string")
     */
    private $inOutPickDate;

    /**
     * @return string
     */
    public function getInOutPickDate()
    {
        return $this->inOutPickDate;
    }

    /**
     * @var string $inOutPickDate
     */
    public function setInOutPickDate($inOutPickDate)
    {
        $this->inOutPickDate = $inOutPickDate;
    }

    /**
     * @Type("string")
     */
    private $inOutShipDate;

    /**
     * @return string
     */
    public function getInOutShipDate()
    {
        return $this->inOutShipDate;
    }

    /**
     * @var string $inOutShipDate
     */
    public function setInOutShipDate($inOutShipDate)
    {
        $this->inOutShipDate = $inOutShipDate;
    }

    /**
     * @Type("string")
     */
    private $inOutTrackingNumber;

    /**
     * @return string
     */
    public function getInOutTrackingNumber()
    {
        return $this->inOutTrackingNumber;
    }

    /**
     * @var string $inOutTrackingNumber
     */
    public function setInOutTrackingNumber($inOutTrackingNumber)
    {
        $this->inOutTrackingNumber = $inOutTrackingNumber;
    }

    /**
     * @Type("string")
     */
    private $inOutDateReceived;

    /**
     * @return string
     */
    public function getInOutDateReceived()
    {
        return $this->inOutDateReceived;
    }

    /**
     * @var string $inOutDateReceived
     */
    public function setInOutDateReceived($inOutDateReceived)
    {
        $this->inOutDateReceived = $inOutDateReceived;
    }

    /**
     * @Type("boolean")
     */
    private $inOutIsInTransit;

    /**
     * @return boolean
     */
    public function getInOutIsInTransit()
    {
        return $this->inOutIsInTransit;
    }

    /**
     * @var boolean $inOutIsInTransit
     */
    public function setInOutIsInTransit($inOutIsInTransit)
    {
        $this->inOutIsInTransit = $inOutIsInTransit;
    }

    /**
     * @Type("boolean")
     */
    private $inOutIsApproved;

    /**
     * @return boolean
     */
    public function getInOutIsApproved()
    {
        return $this->inOutIsApproved;
    }

    /**
     * @var boolean $inOutIsApproved
     */
    public function setInOutIsApproved($inOutIsApproved)
    {
        $this->inOutIsApproved = $inOutIsApproved;
    }

    /**
     * @Type("boolean")
     */
    private $inOutIsInDispute;

    /**
     * @return boolean
     */
    public function getInOutIsInDispute()
    {
        return $this->inOutIsInDispute;
    }

    /**
     * @var boolean $inOutIsInDispute
     */
    public function setInOutIsInDispute($inOutIsInDispute)
    {
        $this->inOutIsInDispute = $inOutIsInDispute;
    }

    /**
     * @Type("double")
     */
    private $inOutVolume;

    /**
     * @return double
     */
    public function getInOutVolume()
    {
        return $this->inOutVolume;
    }

    /**
     * @var double $inOutVolume
     */
    public function setInOutVolume($inOutVolume)
    {
        $this->inOutVolume = $inOutVolume;
    }

    /**
     * @Type("double")
     */
    private $inOutWeight;

    /**
     * @return double
     */
    public function getInOutWeight()
    {
        return $this->inOutWeight;
    }

    /**
     * @var double $inOutWeight
     */
    public function setInOutWeight($inOutWeight)
    {
        $this->inOutWeight = $inOutWeight;
    }

    /**
     * @Type("string")
     */
    private $inOutRmaNumber;

    /**
     * @return string
     */
    public function getInOutRmaNumber()
    {
        return $this->inOutRmaNumber;
    }

    /**
     * @var string $inOutRmaNumber
     */
    public function setInOutRmaNumber($inOutRmaNumber)
    {
        $this->inOutRmaNumber = $inOutRmaNumber;
    }

    /**
     * @Type("string")
     */
    private $inOutReversalNumber;

    /**
     * @return string
     */
    public function getInOutReversalNumber()
    {
        return $this->inOutReversalNumber;
    }

    /**
     * @var string $inOutReversalNumber
     */
    public function setInOutReversalNumber($inOutReversalNumber)
    {
        $this->inOutReversalNumber = $inOutReversalNumber;
    }

    /**
     * @Type("boolean")
     */
    private $inOutIsDropShip;

    /**
     * @return boolean
     */
    public function getInOutIsDropShip()
    {
        return $this->inOutIsDropShip;
    }

    /**
     * @var boolean $inOutIsDropShip
     */
    public function setInOutIsDropShip($inOutIsDropShip)
    {
        $this->inOutIsDropShip = $inOutIsDropShip;
    }

    /**
     * @Type("string")
     */
    private $inOutDropShipBusinessPartnerId;

    /**
     * @return string
     */
    public function getInOutDropShipBusinessPartnerId()
    {
        return $this->inOutDropShipBusinessPartnerId;
    }

    /**
     * @var string $inOutDropShipBusinessPartnerId
     */
    public function setInOutDropShipBusinessPartnerId($inOutDropShipBusinessPartnerId)
    {
        $this->inOutDropShipBusinessPartnerId = $inOutDropShipBusinessPartnerId;
    }

    /**
     * @Type("string")
     */
    private $inOutCreatedBy;

    /**
     * @return string
     */
    public function getInOutCreatedBy()
    {
        return $this->inOutCreatedBy;
    }

    /**
     * @var string $inOutCreatedBy
     */
    public function setInOutCreatedBy($inOutCreatedBy)
    {
        $this->inOutCreatedBy = $inOutCreatedBy;
    }

    /**
     * @Type("string")
     */
    private $inOutCreatedAt;

    /**
     * @return string
     */
    public function getInOutCreatedAt()
    {
        return $this->inOutCreatedAt;
    }

    /**
     * @var string $inOutCreatedAt
     */
    public function setInOutCreatedAt($inOutCreatedAt)
    {
        $this->inOutCreatedAt = $inOutCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $inOutUpdatedBy;

    /**
     * @return string
     */
    public function getInOutUpdatedBy()
    {
        return $this->inOutUpdatedBy;
    }

    /**
     * @var string $inOutUpdatedBy
     */
    public function setInOutUpdatedBy($inOutUpdatedBy)
    {
        $this->inOutUpdatedBy = $inOutUpdatedBy;
    }

    /**
     * @Type("string")
     */
    private $inOutUpdatedAt;

    /**
     * @return string
     */
    public function getInOutUpdatedAt()
    {
        return $this->inOutUpdatedAt;
    }

    /**
     * @var string $inOutUpdatedAt
     */
    public function setInOutUpdatedAt($inOutUpdatedAt)
    {
        $this->inOutUpdatedAt = $inOutUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $inOutActive;

    /**
     * @return boolean
     */
    public function getInOutActive()
    {
        return $this->inOutActive;
    }

    /**
     * @var boolean $inOutActive
     */
    public function setInOutActive($inOutActive)
    {
        $this->inOutActive = $inOutActive;
    }

    /**
     * @Type("boolean")
     */
    private $inOutDeleted;

    /**
     * @return boolean
     */
    public function getInOutDeleted()
    {
        return $this->inOutDeleted;
    }

    /**
     * @var boolean $inOutDeleted
     */
    public function setInOutDeleted($inOutDeleted)
    {
        $this->inOutDeleted = $inOutDeleted;
    }


}

