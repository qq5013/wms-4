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
     * @var UserRoleId $userRoleId
     */
    public function setUserRoleId($userRoleId)
    {
        $this->userRoleId = $userRoleId;
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

