<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyNameRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyNameRemoved()
    {
        return $this->isPropertyNameRemoved;
    }

    /**
     * @param boolean $isPropertyNameRemoved
     */
    public function setIsPropertyNameRemoved($isPropertyNameRemoved)
    {
        $this->isPropertyNameRemoved = $isPropertyNameRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyOrganizationIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyOrganizationIdRemoved()
    {
        return $this->isPropertyOrganizationIdRemoved;
    }

    /**
     * @param boolean $isPropertyOrganizationIdRemoved
     */
    public function setIsPropertyOrganizationIdRemoved($isPropertyOrganizationIdRemoved)
    {
        $this->isPropertyOrganizationIdRemoved = $isPropertyOrganizationIdRemoved;
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
    private $isPropertyIsMandatoryRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyIsMandatoryRemoved()
    {
        return $this->isPropertyIsMandatoryRemoved;
    }

    /**
     * @param boolean $isPropertyIsMandatoryRemoved
     */
    public function setIsPropertyIsMandatoryRemoved($isPropertyIsMandatoryRemoved)
    {
        $this->isPropertyIsMandatoryRemoved = $isPropertyIsMandatoryRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsInstanceAttributeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyIsInstanceAttributeRemoved()
    {
        return $this->isPropertyIsInstanceAttributeRemoved;
    }

    /**
     * @param boolean $isPropertyIsInstanceAttributeRemoved
     */
    public function setIsPropertyIsInstanceAttributeRemoved($isPropertyIsInstanceAttributeRemoved)
    {
        $this->isPropertyIsInstanceAttributeRemoved = $isPropertyIsInstanceAttributeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeValueTypeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeValueTypeRemoved()
    {
        return $this->isPropertyAttributeValueTypeRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeValueTypeRemoved
     */
    public function setIsPropertyAttributeValueTypeRemoved($isPropertyAttributeValueTypeRemoved)
    {
        $this->isPropertyAttributeValueTypeRemoved = $isPropertyAttributeValueTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeValueLengthRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeValueLengthRemoved()
    {
        return $this->isPropertyAttributeValueLengthRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeValueLengthRemoved
     */
    public function setIsPropertyAttributeValueLengthRemoved($isPropertyAttributeValueLengthRemoved)
    {
        $this->isPropertyAttributeValueLengthRemoved = $isPropertyAttributeValueLengthRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyIsListRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyIsListRemoved()
    {
        return $this->isPropertyIsListRemoved;
    }

    /**
     * @param boolean $isPropertyIsListRemoved
     */
    public function setIsPropertyIsListRemoved($isPropertyIsListRemoved)
    {
        $this->isPropertyIsListRemoved = $isPropertyIsListRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyFieldNameRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyFieldNameRemoved()
    {
        return $this->isPropertyFieldNameRemoved;
    }

    /**
     * @param boolean $isPropertyFieldNameRemoved
     */
    public function setIsPropertyFieldNameRemoved($isPropertyFieldNameRemoved)
    {
        $this->isPropertyFieldNameRemoved = $isPropertyFieldNameRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyReferenceIdRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyReferenceIdRemoved()
    {
        return $this->isPropertyReferenceIdRemoved;
    }

    /**
     * @param boolean $isPropertyReferenceIdRemoved
     */
    public function setIsPropertyReferenceIdRemoved($isPropertyReferenceIdRemoved)
    {
        $this->isPropertyReferenceIdRemoved = $isPropertyReferenceIdRemoved;
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

