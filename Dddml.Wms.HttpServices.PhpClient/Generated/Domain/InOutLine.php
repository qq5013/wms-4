<?php

namespace Dddml\Wms\Domain;

use Dddml\BaseEntity;
use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\InOut;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\InOutLineId;
use NodaMoney\Money;


class InOutLine extends BaseEntity
{

    /**
     * @Type("_UNKNOWN_")
     */
    private $skuId;

    /**
     * @return _UNKNOWN_
     */
    public function getSkuId()
    {
        return $this->skuId;
    }

    /**
     * @var _UNKNOWN_ $skuId
     */
    public function setSkuId($skuId)
    {
        $this->skuId = $skuId;
    }

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
     * @var string $inOutDocumentNumber
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
     * @var string $createdBy
     */
    public function setCreatedBy($createdBy)
    {
        $this->createdBy = $createdBy;
    }

    /**
     * @Type("string")
     */
    private $createdAt;

    /**
     * @return string
     */
    public function getCreatedAt()
    {
        return $this->createdAt;
    }

    /**
     * @var string $createdAt
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
     * @var string $updatedBy
     */
    public function setUpdatedBy($updatedBy)
    {
        $this->updatedBy = $updatedBy;
    }

    /**
     * @Type("string")
     */
    private $updatedAt;

    /**
     * @return string
     */
    public function getUpdatedAt()
    {
        return $this->updatedAt;
    }

    /**
     * @var string $updatedAt
     */
    public function setUpdatedAt($updatedAt)
    {
        $this->updatedAt = $updatedAt;
    }

}

