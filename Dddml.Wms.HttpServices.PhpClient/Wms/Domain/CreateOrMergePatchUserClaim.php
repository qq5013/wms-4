﻿<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchUserClaim extends AbstractUserClaimCommand
{

    use UserClaimIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $claimType;

    /**
     * @return string
     */
    public function getClaimType()
    {
        return $this->claimType;
    }

    /**
     * @var string $claimType
     */
    public function setClaimType($claimType)
    {
        $this->claimType = $claimType;
    }

    /**
     * @Type("string")
     */
    private $claimValue;

    /**
     * @return string
     */
    public function getClaimValue()
    {
        return $this->claimValue;
    }

    /**
     * @var string $claimValue
     */
    public function setClaimValue($claimValue)
    {
        $this->claimValue = $claimValue;
    }

    /**
     * @Type("boolean")
     */
    private $active;

    /**
     * @return boolean
     */
    public function getActive()
    {
        return $this->active;
    }

    /**
     * @var boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }


}
