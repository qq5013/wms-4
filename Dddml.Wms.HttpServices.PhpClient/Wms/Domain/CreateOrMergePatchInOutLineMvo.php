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
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $lineNumber;

    /**
     * @return Long
     */
    public function getLineNumber()
    {
        return $this->lineNumber;
    }

    /**
     * @param Long $lineNumber
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
     * @param string $description
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
     * @param string $locatorId
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
     * @param string $product
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
     * @param string $uomId
     */
    public function setUomId($uomId)
    {
        $this->uomId = $uomId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $movementQuantity;

    /**
     * @return Decimal
     */
    public function getMovementQuantity()
    {
        return $this->movementQuantity;
    }

    /**
     * @param Decimal $movementQuantity
     */
    public function setMovementQuantity($movementQuantity)
    {
        $this->movementQuantity = $movementQuantity;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $confirmedQuantity;

    /**
     * @return Decimal
     */
    public function getConfirmedQuantity()
    {
        return $this->confirmedQuantity;
    }

    /**
     * @param Decimal $confirmedQuantity
     */
    public function setConfirmedQuantity($confirmedQuantity)
    {
        $this->confirmedQuantity = $confirmedQuantity;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $scrappedQuantity;

    /**
     * @return Decimal
     */
    public function getScrappedQuantity()
    {
        return $this->scrappedQuantity;
    }

    /**
     * @param Decimal $scrappedQuantity
     */
    public function setScrappedQuantity($scrappedQuantity)
    {
        $this->scrappedQuantity = $scrappedQuantity;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $targetQuantity;

    /**
     * @return Decimal
     */
    public function getTargetQuantity()
    {
        return $this->targetQuantity;
    }

    /**
     * @param Decimal $targetQuantity
     */
    public function setTargetQuantity($targetQuantity)
    {
        $this->targetQuantity = $targetQuantity;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $pickedQuantity;

    /**
     * @return Decimal
     */
    public function getPickedQuantity()
    {
        return $this->pickedQuantity;
    }

    /**
     * @param Decimal $pickedQuantity
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
     * @param boolean $isInvoiced
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
     * @param string $attributeSetInstanceId
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
     * @param boolean $isDescription
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
     * @param boolean $processed
     */
    public function setProcessed($processed)
    {
        $this->processed = $processed;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $quantityEntered;

    /**
     * @return Decimal
     */
    public function getQuantityEntered()
    {
        return $this->quantityEntered;
    }

    /**
     * @param Decimal $quantityEntered
     */
    public function setQuantityEntered($quantityEntered)
    {
        $this->quantityEntered = $quantityEntered;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $rmaLineNumber;

    /**
     * @return Long
     */
    public function getRmaLineNumber()
    {
        return $this->rmaLineNumber;
    }

    /**
     * @param Long $rmaLineNumber
     */
    public function setRmaLineNumber($rmaLineNumber)
    {
        $this->rmaLineNumber = $rmaLineNumber;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $reversalLineNumber;

    /**
     * @return Long
     */
    public function getReversalLineNumber()
    {
        return $this->reversalLineNumber;
    }

    /**
     * @param Long $reversalLineNumber
     */
    public function setReversalLineNumber($reversalLineNumber)
    {
        $this->reversalLineNumber = $reversalLineNumber;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
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
     * @param boolean $active
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
     * @param boolean $inOutIsSoTransaction
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
     * @param DocumentAction $documentAction
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
     * @param boolean $inOutPosted
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
     * @param boolean $inOutProcessing
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
     * @param boolean $inOutProcessed
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
     * @param integer $inOutDocumentType
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
     * @param string $inOutDescription
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
     * @param string $inOutOrderNumber
     */
    public function setInOutOrderNumber($inOutOrderNumber)
    {
        $this->inOutOrderNumber = $inOutOrderNumber;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutDateOrdered;

    /**
     * @return \DateTime
     */
    public function getInOutDateOrdered()
    {
        return $this->inOutDateOrdered;
    }

    /**
     * @param \DateTime $inOutDateOrdered
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
     * @param boolean $inOutIsPrinted
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
     * @param string $inOutMovementType
     */
    public function setInOutMovementType($inOutMovementType)
    {
        $this->inOutMovementType = $inOutMovementType;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutMovementDate;

    /**
     * @return \DateTime
     */
    public function getInOutMovementDate()
    {
        return $this->inOutMovementDate;
    }

    /**
     * @param \DateTime $inOutMovementDate
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
     * @param string $inOutBusinessPartnerId
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
     * @param string $inOutWarehouseId
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
     * @param string $inOutPoReference
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
     * @param Money $inOutFreightAmount
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
     * @param string $inOutShipperId
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
     * @param Money $inOutChargeAmount
     */
    public function setInOutChargeAmount($inOutChargeAmount)
    {
        $this->inOutChargeAmount = $inOutChargeAmount;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutDatePrinted;

    /**
     * @return \DateTime
     */
    public function getInOutDatePrinted()
    {
        return $this->inOutDatePrinted;
    }

    /**
     * @param \DateTime $inOutDatePrinted
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
     * @param string $inOutSalesRepresentative
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
     * @param integer $inOutNumberOfPackages
     */
    public function setInOutNumberOfPackages($inOutNumberOfPackages)
    {
        $this->inOutNumberOfPackages = $inOutNumberOfPackages;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutPickDate;

    /**
     * @return \DateTime
     */
    public function getInOutPickDate()
    {
        return $this->inOutPickDate;
    }

    /**
     * @param \DateTime $inOutPickDate
     */
    public function setInOutPickDate($inOutPickDate)
    {
        $this->inOutPickDate = $inOutPickDate;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutShipDate;

    /**
     * @return \DateTime
     */
    public function getInOutShipDate()
    {
        return $this->inOutShipDate;
    }

    /**
     * @param \DateTime $inOutShipDate
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
     * @param string $inOutTrackingNumber
     */
    public function setInOutTrackingNumber($inOutTrackingNumber)
    {
        $this->inOutTrackingNumber = $inOutTrackingNumber;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutDateReceived;

    /**
     * @return \DateTime
     */
    public function getInOutDateReceived()
    {
        return $this->inOutDateReceived;
    }

    /**
     * @param \DateTime $inOutDateReceived
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
     * @param boolean $inOutIsInTransit
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
     * @param boolean $inOutIsApproved
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
     * @param boolean $inOutIsInDispute
     */
    public function setInOutIsInDispute($inOutIsInDispute)
    {
        $this->inOutIsInDispute = $inOutIsInDispute;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $inOutVolume;

    /**
     * @return Decimal
     */
    public function getInOutVolume()
    {
        return $this->inOutVolume;
    }

    /**
     * @param Decimal $inOutVolume
     */
    public function setInOutVolume($inOutVolume)
    {
        $this->inOutVolume = $inOutVolume;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $inOutWeight;

    /**
     * @return Decimal
     */
    public function getInOutWeight()
    {
        return $this->inOutWeight;
    }

    /**
     * @param Decimal $inOutWeight
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
     * @param string $inOutRmaNumber
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
     * @param string $inOutReversalNumber
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
     * @param boolean $inOutIsDropShip
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
     * @param string $inOutDropShipBusinessPartnerId
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
     * @param string $inOutCreatedBy
     */
    public function setInOutCreatedBy($inOutCreatedBy)
    {
        $this->inOutCreatedBy = $inOutCreatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutCreatedAt;

    /**
     * @return \DateTime
     */
    public function getInOutCreatedAt()
    {
        return $this->inOutCreatedAt;
    }

    /**
     * @param \DateTime $inOutCreatedAt
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
     * @param string $inOutUpdatedBy
     */
    public function setInOutUpdatedBy($inOutUpdatedBy)
    {
        $this->inOutUpdatedBy = $inOutUpdatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $inOutUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getInOutUpdatedAt()
    {
        return $this->inOutUpdatedAt;
    }

    /**
     * @param \DateTime $inOutUpdatedAt
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
     * @param boolean $inOutActive
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
     * @param boolean $inOutDeleted
     */
    public function setInOutDeleted($inOutDeleted)
    {
        $this->inOutDeleted = $inOutDeleted;
    }


}

