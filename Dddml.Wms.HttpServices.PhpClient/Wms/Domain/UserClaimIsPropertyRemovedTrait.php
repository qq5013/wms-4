<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserClaimIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyClaimTypeRemoved = null;

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
    private $isPropertyClaimValueRemoved = null;

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

