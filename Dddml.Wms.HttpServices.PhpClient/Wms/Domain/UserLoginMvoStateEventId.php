<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserLoginId;

class UserLoginMvoStateEventId
{
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
     * @param UserLoginId $userLoginId
     */
    public function setUserLoginId($userLoginId)
    {
        $this->userLoginId = $userLoginId;
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

