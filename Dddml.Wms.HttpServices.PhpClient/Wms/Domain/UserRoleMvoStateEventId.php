<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

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
        if(!$this->userRoleId) {
            $this->userRoleId = new UserRoleId(); 
        }
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

