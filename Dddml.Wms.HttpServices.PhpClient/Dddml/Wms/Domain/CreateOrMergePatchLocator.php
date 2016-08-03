<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

class CreateOrMergePatchLocator extends AbstractLocatorCommand
{

    use LocatorIsPropertyRemovedTrait;

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


}

