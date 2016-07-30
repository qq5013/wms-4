<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AudienceIsPropertyRemovedTrait
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
    private $isPropertyBase64SecretRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyBase64SecretRemoved()
    {
        return $this->isPropertyBase64SecretRemoved;
    }

    /**
     * @param boolean $isPropertyBase64SecretRemoved
     */
    public function setIsPropertyBase64SecretRemoved($isPropertyBase64SecretRemoved)
    {
        $this->isPropertyBase64SecretRemoved = $isPropertyBase64SecretRemoved;
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

