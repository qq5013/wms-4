<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;


trait InOutLineStatePropertiesTrait
{

    /**
     * @Type("Wms\Domain\SkuId")
     */
    private $skuId;

    /**
     * @return SkuId
     */
    public function getSkuId()
    {
        return $this->skuId;
    }

    /**
     * @param SkuId $skuId
     */
    public function setSkuId($skuId)
    {
        $this->skuId = $skuId;
    }

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
     * @Type("string")
     */
    private $inOutDocumentNumber;

    /**
     * @return string
     */
    public function getInOutDocumentNumber()
    {
        return $this->inOutDocumentNumber;
    }

    /**
     * @param string $inOutDocumentNumber
     */
    public function setInOutDocumentNumber($inOutDocumentNumber)
    {
        $this->inOutDocumentNumber = $inOutDocumentNumber;
    }

    /**
     * @Type("string")
     */
    private $createdBy;

    /**
     * @return string
     */
    public function getCreatedBy()
    {
        return $this->createdBy;
    }

    /**
     * @param string $createdBy
     */
    public function setCreatedBy($createdBy)
    {
        $this->createdBy = $createdBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $createdAt;

    /**
     * @return \DateTime
     */
    public function getCreatedAt()
    {
        return $this->createdAt;
    }

    /**
     * @param \DateTime $createdAt
     */
    public function setCreatedAt($createdAt)
    {
        $this->createdAt = $createdAt;
    }

    /**
     * @Type("string")
     */
    private $updatedBy;

    /**
     * @return string
     */
    public function getUpdatedBy()
    {
        return $this->updatedBy;
    }

    /**
     * @param string $updatedBy
     */
    public function setUpdatedBy($updatedBy)
    {
        $this->updatedBy = $updatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $updatedAt;

    /**
     * @return \DateTime
     */
    public function getUpdatedAt()
    {
        return $this->updatedAt;
    }

    /**
     * @param \DateTime $updatedAt
     */
    public function setUpdatedAt($updatedAt)
    {
        $this->updatedAt = $updatedAt;
    }


}

