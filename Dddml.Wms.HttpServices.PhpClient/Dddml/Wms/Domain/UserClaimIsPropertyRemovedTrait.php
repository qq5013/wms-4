<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserClaimIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyClaimTypeRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyClaimTypeRemoved()
    {
        return $this->isPropertyClaimTypeRemoved;
    }

    /**
     * @param boolean $isPropertyClaimTypeRemoved
     */
    public function setIsPropertyClaimTypeRemoved($isPropertyClaimTypeRemoved)
    {
        $this->isPropertyClaimTypeRemoved = $isPropertyClaimTypeRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyClaimValueRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyClaimValueRemoved()
    {
        return $this->isPropertyClaimValueRemoved;
    }

    /**
     * @param boolean $isPropertyClaimValueRemoved
     */
    public function setIsPropertyClaimValueRemoved($isPropertyClaimValueRemoved)
    {
        $this->isPropertyClaimValueRemoved = $isPropertyClaimValueRemoved;
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

