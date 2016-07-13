<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;


trait LocatorStatePropertiesTrait
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
     * @param string $locatorId
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
     * @param string $warehouseId
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
     * @param string $parentLocatorId
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
     * @param string $locatorType
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
     * @param string $priorityNumber
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
     * @param boolean $isDefault
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
     * @param string $x
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
     * @param string $y
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
     * @param string $z
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

