<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class RolePermissionIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'roleId',
            'permissionId',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'string',
        ];
    }
	
    /**
     * @var RolePermissionId
     */
    private $value;

    public function __construct()
    {
        $this->value = new RolePermissionId();
    }

    /**
     * @return RolePermissionId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param RolePermissionId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @return string
     */
    public function getRoleId()
    {
        return $this->value->getRoleId();
    }

    /**
     * @param string $roleId
     */
    public function setRoleId($roleId)
    {
        $this->value->setRoleId($roleId);
    }

    /**
     * @return string
     */
    public function getPermissionId()
    {
        return $this->value->getPermissionId();
    }

    /**
     * @param string $permissionId
     */
    public function setPermissionId($permissionId)
    {
        $this->value->setPermissionId($permissionId);
    }


}

