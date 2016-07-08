<?php

namespace Dddml\Wms\Domain;

use Dddml\BaseEntity;
use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;


class Locator extends BaseEntity
{

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
    private $warehouseId;

    /**
     * @return string
     */
    public function getWarehouseId()
    {
        return $this->warehouseId;
    }

    /**
     * @var string $warehouseId
     */
    public function setWarehouseId($warehouseId)
    {
        $this->warehouseId = $warehouseId;
    }

    /**
     * @Type("string")
     */
    private $parentLocatorId;

    /**
     * @return string
     */
    public function getParentLocatorId()
    {
        return $this->parentLocatorId;
    }

    /**
     * @var string $parentLocatorId
     */
    public function setParentLocatorId($parentLocatorId)
    {
        $this->parentLocatorId = $parentLocatorId;
    }

    /**
     * @Type("string")
     */
    private $locatorType;

    /**
     * @return string
     */
    public function getLocatorType()
    {
        return $this->locatorType;
    }

    /**
     * @var string $locatorType
     */
    public function setLocatorType($locatorType)
    {
        $this->locatorType = $locatorType;
    }

    /**
     * @Type("string")
     */
    private $priorityNumber;

    /**
     * @return string
     */
    public function getPriorityNumber()
    {
        return $this->priorityNumber;
    }

    /**
     * @var string $priorityNumber
     */
    public function setPriorityNumber($priorityNumber)
    {
        $this->priorityNumber = $priorityNumber;
    }

    /**
     * @Type("boolean")
     */
    private $isDefault;

    /**
     * @return boolean
     */
    public function getIsDefault()
    {
        return $this->isDefault;
    }

    /**
     * @var boolean $isDefault
     */
    public function setIsDefault($isDefault)
    {
        $this->isDefault = $isDefault;
    }

    /**
     * @Type("string")
     */
    private $x;

    /**
     * @return string
     */
    public function getX()
    {
        return $this->x;
    }

    /**
     * @var string $x
     */
    public function setX($x)
    {
        $this->x = $x;
    }

    /**
     * @Type("string")
     */
    private $y;

    /**
     * @return string
     */
    public function getY()
    {
        return $this->y;
    }

    /**
     * @var string $y
     */
    public function setY($y)
    {
        $this->y = $y;
    }

    /**
     * @Type("string")
     */
    private $z;

    /**
     * @return string
     */
    public function getZ()
    {
        return $this->z;
    }

    /**
     * @var string $z
     */
    public function setZ($z)
    {
        $this->z = $z;
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

}

