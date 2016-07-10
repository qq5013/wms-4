<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class RolePermissionId
{
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

    /**
     * @Type("string")
     */
    private $permissionId;

    /**
     * @return string
     */
    public function getPermissionId()
    {
        return $this->permissionId;
    }

    /**
     * @var string $permissionId
     */
    public function setPermissionId($permissionId)
    {
        $this->permissionId = $permissionId;
    }

}

