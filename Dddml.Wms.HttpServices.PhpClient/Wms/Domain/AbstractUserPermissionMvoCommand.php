<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserPermissionId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\CommandTrait;

class AbstractUserPermissionMvoCommand
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\UserPermissionId")
     */
    private $userPermissionId;

    /**
     * @return UserPermissionId
     */
    public function getUserPermissionId()
    {
        return $this->userPermissionId;
    }

    /**
     * @var UserPermissionId $userPermissionId
     */
    public function setUserPermissionId($userPermissionId)
    {
        $this->userPermissionId = $userPermissionId;
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

