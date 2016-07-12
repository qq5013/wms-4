<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeSetInstanceExtensionFieldIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyNameRemoved = null;

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
    private $isPropertyTypeRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyTypeRemoved()
    {
        return $this->isPropertyTypeRemoved;
    }

    /**
     * @param boolean $isPropertyTypeRemoved
     */
    public function setIsPropertyTypeRemoved($isPropertyTypeRemoved)
    {
        $this->isPropertyTypeRemoved = $isPropertyTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLengthRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyLengthRemoved()
    {
        return $this->isPropertyLengthRemoved;
    }

    /**
     * @param boolean $isPropertyLengthRemoved
     */
    public function setIsPropertyLengthRemoved($isPropertyLengthRemoved)
    {
        $this->isPropertyLengthRemoved = $isPropertyLengthRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAliasRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAliasRemoved()
    {
        return $this->isPropertyAliasRemoved;
    }

    /**
     * @param boolean $isPropertyAliasRemoved
     */
    public function setIsPropertyAliasRemoved($isPropertyAliasRemoved)
    {
        $this->isPropertyAliasRemoved = $isPropertyAliasRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyDescriptionRemoved = null;

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

