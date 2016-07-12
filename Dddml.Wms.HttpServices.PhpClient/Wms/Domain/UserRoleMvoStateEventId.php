<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserRoleId;

class UserRoleMvoStateEventId
{
    /**
     * @Type("Wms\Domain\UserRoleId")
     */
    private $userRoleId;

    /**
     * @return UserRoleId
     */
    public function getUserRoleId()
    {
        return $this->userRoleId;
    }

    /**
     * @param UserRoleId $userRoleId
     */
    public function setUserRoleId($userRoleId)
    {
        $this->userRoleId = $userRoleId;
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

