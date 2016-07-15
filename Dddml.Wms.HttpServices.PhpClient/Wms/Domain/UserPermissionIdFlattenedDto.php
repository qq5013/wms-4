<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserPermissionIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'userId',
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
     * @var UserPermissionId
     */
    private $value;

    public function __construct()
    {
        $this->value = new UserPermissionId();
    }

    /**
     * @return UserPermissionId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param UserPermissionId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @return string
     */
    public function getUserId()
    {
        return $this->value->getUserId();
    }

    /**
     * @param string $userId
     */
    public function setUserId($userId)
    {
        $this->value->setUserId($userId);
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

