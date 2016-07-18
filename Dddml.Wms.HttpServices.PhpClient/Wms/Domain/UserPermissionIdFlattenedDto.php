﻿<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserPermissionIdFlattenedDto
{

    const PROPERTIES = [
            'userId' => 'string',
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
     * @var UserPermissionId
     */
    private $value;

    /**
     * @param UserPermissionId $value
     */
    public function __construct(UserPermissionId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserPermissionId();
        }
    }

    /**
     * @return UserPermissionId
     */
    public function toUserPermissionId()
    {
        return $this->value;
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

