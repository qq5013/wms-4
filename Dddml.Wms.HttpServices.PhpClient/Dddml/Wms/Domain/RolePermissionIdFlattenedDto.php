<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class RolePermissionIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'roleId' => 'string',
            'permissionId' => 'string',
        ];

    public static function getPropertyNames()
    {
        return array_keys(static::PROPERTIES);
    }

    public static function getPropertyTypes()
    {
        return array_values(static::PROPERTIES);
    }

	
    /**
     * @var RolePermissionId
     */
    private $value;

    /**
     * @param RolePermissionId $value
     */
    public function __construct(RolePermissionId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new RolePermissionId();
        }
    }

    /**
     * @return RolePermissionId
     */
    public function toRolePermissionId()
    {
        return $this->value;
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

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getRoleId(),
            $this->getPermissionId(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return RolePermissionIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setRoleId($pValues[0]);
        $this->setPermissionId($pValues[1]);
        return $this;
    }

}

