<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeSetInstanceExtensionFieldGroupIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyFieldTypeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyFieldTypeRemoved()
    {
        return $this->isPropertyFieldTypeRemoved;
    }

    /**
     * @param boolean $isPropertyFieldTypeRemoved
     */
    public function setIsPropertyFieldTypeRemoved($isPropertyFieldTypeRemoved)
    {
        $this->isPropertyFieldTypeRemoved = $isPropertyFieldTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyFieldLengthRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyFieldLengthRemoved()
    {
        return $this->isPropertyFieldLengthRemoved;
    }

    /**
     * @param boolean $isPropertyFieldLengthRemoved
     */
    public function setIsPropertyFieldLengthRemoved($isPropertyFieldLengthRemoved)
    {
        $this->isPropertyFieldLengthRemoved = $isPropertyFieldLengthRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyFieldCountRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyFieldCountRemoved()
    {
        return $this->isPropertyFieldCountRemoved;
    }

    /**
     * @param boolean $isPropertyFieldCountRemoved
     */
    public function setIsPropertyFieldCountRemoved($isPropertyFieldCountRemoved)
    {
        $this->isPropertyFieldCountRemoved = $isPropertyFieldCountRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyNameFormatRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyNameFormatRemoved()
    {
        return $this->isPropertyNameFormatRemoved;
    }

    /**
     * @param boolean $isPropertyNameFormatRemoved
     */
    public function setIsPropertyNameFormatRemoved($isPropertyNameFormatRemoved)
    {
        $this->isPropertyNameFormatRemoved = $isPropertyNameFormatRemoved;
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

