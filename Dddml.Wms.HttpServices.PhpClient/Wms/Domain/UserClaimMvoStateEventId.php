<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserClaimId;

class UserClaimMvoStateEventId
{
    /**
     * @Type("Wms\Domain\UserClaimId")
     */
    private $userClaimId;

    /**
     * @return UserClaimId
     */
    public function getUserClaimId()
    {
        return $this->userClaimId;
    }

    /**
     * @var UserClaimId $userClaimId
     */
    public function setUserClaimId($userClaimId)
    {
        $this->userClaimId = $userClaimId;
    }

    /**
     * @Type("integer")
     */
    private $userVersion;

    /**
     * @return integer
     */
    public function getUserVersion()
    {
        return $this->userVersion;
    }

    /**
     * @var integer $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->userVersion = $userVersion;
    }

}

