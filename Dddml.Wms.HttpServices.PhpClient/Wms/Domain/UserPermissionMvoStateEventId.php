<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserPermissionId;

class UserPermissionMvoStateEventId
{
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
     * @param UserPermissionId $userPermissionId
     */
    public function setUserPermissionId($userPermissionId)
    {
        $this->userPermissionId = $userPermissionId;
    }

    /**
     * @Type("long")
     */
    private $userVersion;

    /**
     * @return long
     */
    public function getUserVersion()
    {
        return $this->userVersion;
    }

    /**
     * @param long $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->userVersion = $userVersion;
    }

}

