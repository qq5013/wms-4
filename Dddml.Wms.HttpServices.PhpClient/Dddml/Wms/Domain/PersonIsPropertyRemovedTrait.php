<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait PersonIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyBirthDateRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyBirthDateRemoved()
    {
        return $this->isPropertyBirthDateRemoved;
    }

    /**
     * @param boolean $isPropertyBirthDateRemoved
     */
    public function setIsPropertyBirthDateRemoved($isPropertyBirthDateRemoved)
    {
        $this->isPropertyBirthDateRemoved = $isPropertyBirthDateRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLovesRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyLovesRemoved()
    {
        return $this->isPropertyLovesRemoved;
    }

    /**
     * @param boolean $isPropertyLovesRemoved
     */
    public function setIsPropertyLovesRemoved($isPropertyLovesRemoved)
    {
        $this->isPropertyLovesRemoved = $isPropertyLovesRemoved;
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

