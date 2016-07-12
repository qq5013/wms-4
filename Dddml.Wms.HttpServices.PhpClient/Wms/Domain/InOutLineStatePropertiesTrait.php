<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\SkuId;


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
     * @Type("long")
     */
    private $lineNumber;

    /**
     * @return long
     */
    public function getLineNumber()
    {
        return $this->lineNumber;
    }

    /**
     * @param long $lineNumber
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
     * @Type("decimal")
     */
    private $movementQuantity;

    /**
     * @return decimal
     */
    public function getMovementQuantity()
    {
        return $this->movementQuantity;
    }

    /**
     * @param decimal $movementQuantity
     */
    public function setMovementQuantity($movementQuantity)
    {
        $this->movementQuantity = $movementQuantity;
    }

    /**
     * @Type("decimal")
     */
    private $confirmedQuantity;

    /**
     * @return decimal
     */
    public function getConfirmedQuantity()
    {
        return $this->confirmedQuantity;
    }

    /**
     * @param decimal $confirmedQuantity
     */
    public function setConfirmedQuantity($confirmedQuantity)
    {
        $this->confirmedQuantity = $confirmedQuantity;
    }

    /**
     * @Type("decimal")
     */
    private $scrappedQuantity;

    /**
     * @return decimal
     */
    public function getScrappedQuantity()
    {
        return $this->scrappedQuantity;
    }

    /**
     * @param decimal $scrappedQuantity
     */
    public function setScrappedQuantity($scrappedQuantity)
    {
        $this->scrappedQuantity = $scrappedQuantity;
    }

    /**
     * @Type("decimal")
     */
    private $targetQuantity;

    /**
     * @return decimal
     */
    public function getTargetQuantity()
    {
        return $this->targetQuantity;
    }

    /**
     * @param decimal $targetQuantity
     */
    public function setTargetQuantity($targetQuantity)
    {
        $this->targetQuantity = $targetQuantity;
    }

    /**
     * @Type("decimal")
     */
    private $pickedQuantity;

    /**
     * @return decimal
     */
    public function getPickedQuantity()
    {
        return $this->pickedQuantity;
    }

    /**
     * @param decimal $pickedQuantity
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
     * @Type("decimal")
     */
    private $quantityEntered;

    /**
     * @return decimal
     */
    public function getQuantityEntered()
    {
        return $this->quantityEntered;
    }

    /**
     * @param decimal $quantityEntered
     */
    public function setQuantityEntered($quantityEntered)
    {
        $this->quantityEntered = $quantityEntered;
    }

    /**
     * @Type("long")
     */
    private $rmaLineNumber;

    /**
     * @return long
     */
    public function getRmaLineNumber()
    {
        return $this->rmaLineNumber;
    }

    /**
     * @param long $rmaLineNumber
     */
    public function setRmaLineNumber($rmaLineNumber)
    {
        $this->rmaLineNumber = $rmaLineNumber;
    }

    /**
     * @Type("long")
     */
    private $reversalLineNumber;

    /**
     * @return long
     */
    public function getReversalLineNumber()
    {
        return $this->reversalLineNumber;
    }

    /**
     * @param long $reversalLineNumber
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
     * @Type("long")
     */
    private $version;

    /**
     * @return long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param long $version
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

