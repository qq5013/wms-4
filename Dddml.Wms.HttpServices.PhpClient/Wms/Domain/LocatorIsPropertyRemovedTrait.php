<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait LocatorIsPropertyRemovedTrait
{
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
    private $isPropertyParentLocatorIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyParentLocatorIdRemoved()
    {
        return $this->isPropertyParentLocatorIdRemoved;
    }

    /**
     * @param boolean $isPropertyParentLocatorIdRemoved
     */
    public function setIsPropertyParentLocatorIdRemoved($isPropertyParentLocatorIdRemoved)
    {
        $this->isPropertyParentLocatorIdRemoved = $isPropertyParentLocatorIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLocatorTypeRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyLocatorTypeRemoved()
    {
        return $this->isPropertyLocatorTypeRemoved;
    }

    /**
     * @param boolean $isPropertyLocatorTypeRemoved
     */
    public function setIsPropertyLocatorTypeRemoved($isPropertyLocatorTypeRemoved)
    {
        $this->isPropertyLocatorTypeRemoved = $isPropertyLocatorTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPriorityNumberRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyPriorityNumberRemoved()
    {
        return $this->isPropertyPriorityNumberRemoved;
    }

    /**
     * @param boolean $isPropertyPriorityNumberRemoved
     */
    public function setIsPropertyPriorityNumberRemoved($isPropertyPriorityNumberRemoved)
    {
        $this->isPropertyPriorityNumberRemoved = $isPropertyPriorityNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsDefaultRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyIsDefaultRemoved()
    {
        return $this->isPropertyIsDefaultRemoved;
    }

    /**
     * @param boolean $isPropertyIsDefaultRemoved
     */
    public function setIsPropertyIsDefaultRemoved($isPropertyIsDefaultRemoved)
    {
        $this->isPropertyIsDefaultRemoved = $isPropertyIsDefaultRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyXRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyXRemoved()
    {
        return $this->isPropertyXRemoved;
    }

    /**
     * @param boolean $isPropertyXRemoved
     */
    public function setIsPropertyXRemoved($isPropertyXRemoved)
    {
        $this->isPropertyXRemoved = $isPropertyXRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyYRemoved()
    {
        return $this->isPropertyYRemoved;
    }

    /**
     * @param boolean $isPropertyYRemoved
     */
    public function setIsPropertyYRemoved($isPropertyYRemoved)
    {
        $this->isPropertyYRemoved = $isPropertyYRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyZRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyZRemoved()
    {
        return $this->isPropertyZRemoved;
    }

    /**
     * @param boolean $isPropertyZRemoved
     */
    public function setIsPropertyZRemoved($isPropertyZRemoved)
    {
        $this->isPropertyZRemoved = $isPropertyZRemoved;
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

