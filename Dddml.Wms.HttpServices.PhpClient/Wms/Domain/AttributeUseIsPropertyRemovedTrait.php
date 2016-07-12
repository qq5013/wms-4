<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeUseIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertySequenceNumberRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertySequenceNumberRemoved()
    {
        return $this->isPropertySequenceNumberRemoved;
    }

    /**
     * @param boolean $isPropertySequenceNumberRemoved
     */
    public function setIsPropertySequenceNumberRemoved($isPropertySequenceNumberRemoved)
    {
        $this->isPropertySequenceNumberRemoved = $isPropertySequenceNumberRemoved;
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

