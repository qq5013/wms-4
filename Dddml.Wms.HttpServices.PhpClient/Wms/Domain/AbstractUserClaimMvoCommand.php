<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserClaimId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\CommandTrait;

abstract class AbstractUserClaimMvoCommand implements CommandInterface
{

    use CommandTrait;

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
     * @param UserClaimId $userClaimId
     */
    public function setUserClaimId($userClaimId)
    {
        $this->userClaimId = $userClaimId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $userVersion;

    /**
     * @return Long
     */
    public function getUserVersion()
    {
        return $this->userVersion;
    }

    /**
     * @param Long $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->userVersion = $userVersion;
    }


}

