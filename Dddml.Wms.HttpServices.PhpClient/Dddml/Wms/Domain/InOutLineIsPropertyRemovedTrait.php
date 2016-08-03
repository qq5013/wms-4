<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait InOutLineIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLineNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyLineNumberRemoved()
    {
        return $this->isPropertyLineNumberRemoved;
    }

    /**
     * @param boolean $isPropertyLineNumberRemoved
     */
    public function setIsPropertyLineNumberRemoved($isPropertyLineNumberRemoved)
    {
        $this->isPropertyLineNumberRemoved = $isPropertyLineNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDescriptionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyDescriptionRemoved()
    {
        return $this->isPropertyDescriptionRemoved;
    }

    /**
     * @param boolean $isPropertyDescriptionRemoved
     */
    public function setIsPropertyDescriptionRemoved($isPropertyDescriptionRemoved)
    {
        $this->isPropertyDescriptionRemoved = $isPropertyDescriptionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLocatorIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyLocatorIdRemoved()
    {
        return $this->isPropertyLocatorIdRemoved;
    }

    /**
     * @param boolean $isPropertyLocatorIdRemoved
     */
    public function setIsPropertyLocatorIdRemoved($isPropertyLocatorIdRemoved)
    {
        $this->isPropertyLocatorIdRemoved = $isPropertyLocatorIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyProductRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyProductRemoved()
    {
        return $this->isPropertyProductRemoved;
    }

    /**
     * @param boolean $isPropertyProductRemoved
     */
    public function setIsPropertyProductRemoved($isPropertyProductRemoved)
    {
        $this->isPropertyProductRemoved = $isPropertyProductRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUomIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUomIdRemoved()
    {
        return $this->isPropertyUomIdRemoved;
    }

    /**
     * @param boolean $isPropertyUomIdRemoved
     */
    public function setIsPropertyUomIdRemoved($isPropertyUomIdRemoved)
    {
        $this->isPropertyUomIdRemoved = $isPropertyUomIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyMovementQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyMovementQuantityRemoved()
    {
        return $this->isPropertyMovementQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyMovementQuantityRemoved
     */
    public function setIsPropertyMovementQuantityRemoved($isPropertyMovementQuantityRemoved)
    {
        $this->isPropertyMovementQuantityRemoved = $isPropertyMovementQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyConfirmedQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyConfirmedQuantityRemoved()
    {
        return $this->isPropertyConfirmedQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyConfirmedQuantityRemoved
     */
    public function setIsPropertyConfirmedQuantityRemoved($isPropertyConfirmedQuantityRemoved)
    {
        $this->isPropertyConfirmedQuantityRemoved = $isPropertyConfirmedQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyScrappedQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyScrappedQuantityRemoved()
    {
        return $this->isPropertyScrappedQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyScrappedQuantityRemoved
     */
    public function setIsPropertyScrappedQuantityRemoved($isPropertyScrappedQuantityRemoved)
    {
        $this->isPropertyScrappedQuantityRemoved = $isPropertyScrappedQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyTargetQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyTargetQuantityRemoved()
    {
        return $this->isPropertyTargetQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyTargetQuantityRemoved
     */
    public function setIsPropertyTargetQuantityRemoved($isPropertyTargetQuantityRemoved)
    {
        $this->isPropertyTargetQuantityRemoved = $isPropertyTargetQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPickedQuantityRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPickedQuantityRemoved()
    {
        return $this->isPropertyPickedQuantityRemoved;
    }

    /**
     * @param boolean $isPropertyPickedQuantityRemoved
     */
    public function setIsPropertyPickedQuantityRemoved($isPropertyPickedQuantityRemoved)
    {
        $this->isPropertyPickedQuantityRemoved = $isPropertyPickedQuantityRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsInvoicedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyIsInvoicedRemoved()
    {
        return $this->isPropertyIsInvoicedRemoved;
    }

    /**
     * @param boolean $isPropertyIsInvoicedRemoved
     */
    public function setIsPropertyIsInvoicedRemoved($isPropertyIsInvoicedRemoved)
    {
        $this->isPropertyIsInvoicedRemoved = $isPropertyIsInvoicedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetInstanceIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetInstanceIdRemoved()
    {
        return $this->isPropertyAttributeSetInstanceIdRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetInstanceIdRemoved
     */
    public function setIsPropertyAttributeSetInstanceIdRemoved($isPropertyAttributeSetInstanceIdRemoved)
    {
        $this->isPropertyAttributeSetInstanceIdRemoved = $isPropertyAttributeSetInstanceIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsDescriptionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyIsDescriptionRemoved()
    {
        return $this->isPropertyIsDescriptionRemoved;
    }

    /**
     * @param boolean $isPropertyIsDescriptionRemoved
     */
    public function setIsPropertyIsDescriptionRemoved($isPropertyIsDescriptionRemoved)
    {
        $this->isPropertyIsDescriptionRemoved = $isPropertyIsDescriptionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyProcessedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyProcessedRemoved()
    {
        return $this->isPropertyProcessedRemoved;
    }

    /**
     * @param boolean $isPropertyProcessedRemoved
     */
    public function setIsPropertyProcessedRemoved($isPropertyProcessedRemoved)
    {
        $this->isPropertyProcessedRemoved = $isPropertyProcessedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyQuantityEnteredRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyQuantityEnteredRemoved()
    {
        return $this->isPropertyQuantityEnteredRemoved;
    }

    /**
     * @param boolean $isPropertyQuantityEnteredRemoved
     */
    public function setIsPropertyQuantityEnteredRemoved($isPropertyQuantityEnteredRemoved)
    {
        $this->isPropertyQuantityEnteredRemoved = $isPropertyQuantityEnteredRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyRmaLineNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyRmaLineNumberRemoved()
    {
        return $this->isPropertyRmaLineNumberRemoved;
    }

    /**
     * @param boolean $isPropertyRmaLineNumberRemoved
     */
    public function setIsPropertyRmaLineNumberRemoved($isPropertyRmaLineNumberRemoved)
    {
        $this->isPropertyRmaLineNumberRemoved = $isPropertyRmaLineNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyReversalLineNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyReversalLineNumberRemoved()
    {
        return $this->isPropertyReversalLineNumberRemoved;
    }

    /**
     * @param boolean $isPropertyReversalLineNumberRemoved
     */
    public function setIsPropertyReversalLineNumberRemoved($isPropertyReversalLineNumberRemoved)
    {
        $this->isPropertyReversalLineNumberRemoved = $isPropertyReversalLineNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = false;

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

