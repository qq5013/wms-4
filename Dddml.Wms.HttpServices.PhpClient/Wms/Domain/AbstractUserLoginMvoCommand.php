<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserLoginId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\CommandTrait;

class AbstractUserLoginMvoCommand
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\UserLoginId")
     */
    private $userLoginId;

    /**
     * @return UserLoginId
     */
    public function getUserLoginId()
    {
        return $this->userLoginId;
    }

    /**
     * @var UserLoginId $userLoginId
     */
    public function setUserLoginId($userLoginId)
    {
        $this->userLoginId = $userLoginId;
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

