<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait YearPlanMvoIsPropertyRemovedTrait
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

