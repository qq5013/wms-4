<?php

namespace Dddml\Wms\Domain;

use Dddml\BaseEntity;
use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\AttributeUse;
use Dddml\Wms\Domain\AttributeSetAttributeUseId;


class AttributeSet extends BaseEntity
{

    /**
     * @Type("string")
     */
    private $attributeSetId;

    /**
     * @return string
     */
    public function getAttributeSetId()
    {
        return $this->attributeSetId;
    }

    /**
     * @var string $attributeSetId
     */
    public function setAttributeSetId($attributeSetId)
    {
        $this->attributeSetId = $attributeSetId;
    }

    /**
     * @Type("string")
     */
    private $name;

    /**
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @var string $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * @Type("string")
     */
    private $organizationId;

    /**
     * @return string
     */
    public function getOrganizationId()
    {
        return $this->organizationId;
    }

    /**
     * @var string $organizationId
     */
    public function setOrganizationId($organizationId)
    {
        $this->organizationId = $organizationId;
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
    private $serialNumberAttributeId;

    /**
     * @return string
     */
    public function getSerialNumberAttributeId()
    {
        return $this->serialNumberAttributeId;
    }

    /**
     * @var string $serialNumberAttributeId
     */
    public function setSerialNumberAttributeId($serialNumberAttributeId)
    {
        $this->serialNumberAttributeId = $serialNumberAttributeId;
    }

    /**
     * @Type("string")
     */
    private $lotAttributeId;

    /**
     * @return string
     */
    public function getLotAttributeId()
    {
        return $this->lotAttributeId;
    }

    /**
     * @var string $lotAttributeId
     */
    public function setLotAttributeId($lotAttributeId)
    {
        $this->lotAttributeId = $lotAttributeId;
    }

    /**
     * @Type("string")
     */
    private $referenceId;

    /**
     * @return string
     */
    public function getReferenceId()
    {
        return $this->referenceId;
    }

    /**
     * @var string $referenceId
     */
    public function setReferenceId($referenceId)
    {
        $this->referenceId = $referenceId;
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

    /**
     * @Type("array<_UNKNOWN_>")
     * @var _UNKNOWN_[]
     */
    private $attributeUses;

    /**
     * @return _UNKNOWN_[]
     */
    public function getAttributeUses()
    {
        return $this->attributeUses;
    }	

    /**
     * @var _UNKNOWN_[] $attributeUses
     */
    public function setAttributeUses($attributeUses)
    {
        $this->attributeUses = $attributeUses;
    }

}

