<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserRoleId
{
    /**
     * @Type("string")
     */
    private $userId;

    /**
     * @return string
     */
    public function getUserId()
    {
        return $this->userId;
    }

    /**
     * @var string $userId
     */
    public function setUserId($userId)
    {
        $this->userId = $userId;
    }

    /**
     * @Type("string")
     */
    private $roleId;

    /**
     * @return string
     */
    public function getRoleId()
    {
        return $this->roleId;
    }

    /**
     * @var string $roleId
     */
    public function setRoleId($roleId)
    {
        $this->roleId = $roleId;
    }

}

