<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class RolePermissionId implements StringIdInterface
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
     * @param string $roleId
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
     * @param string $permissionId
     */
    public function setPermissionId($permissionId)
    {
        $this->permissionId = $permissionId;
    }



    /**
     * @var RolePermissionIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new RolePermissionIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return RolePermissionId
     */
    public static function createFromString($idStr)
    {
        return (new RolePermissionIdFlattenedDto())
            ->fromString($idStr)
            ->toRolePermissionId();
    }


}

