<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait MonthPlanMvoIsPropertyRemovedTrait
{
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
    private $isPropertyVersionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyVersionRemoved()
    {
        return $this->isPropertyVersionRemoved;
    }

    /**
     * @param boolean $isPropertyVersionRemoved
     */
    public function setIsPropertyVersionRemoved($isPropertyVersionRemoved)
    {
        $this->isPropertyVersionRemoved = $isPropertyVersionRemoved;
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

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanDescriptionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanDescriptionRemoved()
    {
        return $this->isPropertyYearPlanDescriptionRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanDescriptionRemoved
     */
    public function setIsPropertyYearPlanDescriptionRemoved($isPropertyYearPlanDescriptionRemoved)
    {
        $this->isPropertyYearPlanDescriptionRemoved = $isPropertyYearPlanDescriptionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanVersionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanVersionRemoved()
    {
        return $this->isPropertyYearPlanVersionRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanVersionRemoved
     */
    public function setIsPropertyYearPlanVersionRemoved($isPropertyYearPlanVersionRemoved)
    {
        $this->isPropertyYearPlanVersionRemoved = $isPropertyYearPlanVersionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanCreatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanCreatedByRemoved()
    {
        return $this->isPropertyYearPlanCreatedByRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanCreatedByRemoved
     */
    public function setIsPropertyYearPlanCreatedByRemoved($isPropertyYearPlanCreatedByRemoved)
    {
        $this->isPropertyYearPlanCreatedByRemoved = $isPropertyYearPlanCreatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanCreatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanCreatedAtRemoved()
    {
        return $this->isPropertyYearPlanCreatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanCreatedAtRemoved
     */
    public function setIsPropertyYearPlanCreatedAtRemoved($isPropertyYearPlanCreatedAtRemoved)
    {
        $this->isPropertyYearPlanCreatedAtRemoved = $isPropertyYearPlanCreatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanUpdatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanUpdatedByRemoved()
    {
        return $this->isPropertyYearPlanUpdatedByRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanUpdatedByRemoved
     */
    public function setIsPropertyYearPlanUpdatedByRemoved($isPropertyYearPlanUpdatedByRemoved)
    {
        $this->isPropertyYearPlanUpdatedByRemoved = $isPropertyYearPlanUpdatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanUpdatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanUpdatedAtRemoved()
    {
        return $this->isPropertyYearPlanUpdatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanUpdatedAtRemoved
     */
    public function setIsPropertyYearPlanUpdatedAtRemoved($isPropertyYearPlanUpdatedAtRemoved)
    {
        $this->isPropertyYearPlanUpdatedAtRemoved = $isPropertyYearPlanUpdatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanActiveRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanActiveRemoved()
    {
        return $this->isPropertyYearPlanActiveRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanActiveRemoved
     */
    public function setIsPropertyYearPlanActiveRemoved($isPropertyYearPlanActiveRemoved)
    {
        $this->isPropertyYearPlanActiveRemoved = $isPropertyYearPlanActiveRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyYearPlanDeletedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyYearPlanDeletedRemoved()
    {
        return $this->isPropertyYearPlanDeletedRemoved;
    }

    /**
     * @param boolean $isPropertyYearPlanDeletedRemoved
     */
    public function setIsPropertyYearPlanDeletedRemoved($isPropertyYearPlanDeletedRemoved)
    {
        $this->isPropertyYearPlanDeletedRemoved = $isPropertyYearPlanDeletedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonBirthDateRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonBirthDateRemoved()
    {
        return $this->isPropertyPersonBirthDateRemoved;
    }

    /**
     * @param boolean $isPropertyPersonBirthDateRemoved
     */
    public function setIsPropertyPersonBirthDateRemoved($isPropertyPersonBirthDateRemoved)
    {
        $this->isPropertyPersonBirthDateRemoved = $isPropertyPersonBirthDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonLovesRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonLovesRemoved()
    {
        return $this->isPropertyPersonLovesRemoved;
    }

    /**
     * @param boolean $isPropertyPersonLovesRemoved
     */
    public function setIsPropertyPersonLovesRemoved($isPropertyPersonLovesRemoved)
    {
        $this->isPropertyPersonLovesRemoved = $isPropertyPersonLovesRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonCreatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonCreatedByRemoved()
    {
        return $this->isPropertyPersonCreatedByRemoved;
    }

    /**
     * @param boolean $isPropertyPersonCreatedByRemoved
     */
    public function setIsPropertyPersonCreatedByRemoved($isPropertyPersonCreatedByRemoved)
    {
        $this->isPropertyPersonCreatedByRemoved = $isPropertyPersonCreatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonCreatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonCreatedAtRemoved()
    {
        return $this->isPropertyPersonCreatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyPersonCreatedAtRemoved
     */
    public function setIsPropertyPersonCreatedAtRemoved($isPropertyPersonCreatedAtRemoved)
    {
        $this->isPropertyPersonCreatedAtRemoved = $isPropertyPersonCreatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonUpdatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonUpdatedByRemoved()
    {
        return $this->isPropertyPersonUpdatedByRemoved;
    }

    /**
     * @param boolean $isPropertyPersonUpdatedByRemoved
     */
    public function setIsPropertyPersonUpdatedByRemoved($isPropertyPersonUpdatedByRemoved)
    {
        $this->isPropertyPersonUpdatedByRemoved = $isPropertyPersonUpdatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonUpdatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonUpdatedAtRemoved()
    {
        return $this->isPropertyPersonUpdatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyPersonUpdatedAtRemoved
     */
    public function setIsPropertyPersonUpdatedAtRemoved($isPropertyPersonUpdatedAtRemoved)
    {
        $this->isPropertyPersonUpdatedAtRemoved = $isPropertyPersonUpdatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonActiveRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonActiveRemoved()
    {
        return $this->isPropertyPersonActiveRemoved;
    }

    /**
     * @param boolean $isPropertyPersonActiveRemoved
     */
    public function setIsPropertyPersonActiveRemoved($isPropertyPersonActiveRemoved)
    {
        $this->isPropertyPersonActiveRemoved = $isPropertyPersonActiveRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPersonDeletedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPersonDeletedRemoved()
    {
        return $this->isPropertyPersonDeletedRemoved;
    }

    /**
     * @param boolean $isPropertyPersonDeletedRemoved
     */
    public function setIsPropertyPersonDeletedRemoved($isPropertyPersonDeletedRemoved)
    {
        $this->isPropertyPersonDeletedRemoved = $isPropertyPersonDeletedRemoved;
    }


}

