<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class UserPermissionStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userId' => 'string',
            'permissionId' => 'string',
            'userVersion' => 'Long',
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
     * @var UserPermissionStateEventId
     */
    private $value;

    /**
     * @param UserPermissionStateEventId $value
     */
    public function __construct(UserPermissionStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserPermissionStateEventId();
        }
    }

    /**
     * @return UserPermissionStateEventId
     */
    public function toUserPermissionStateEventId()
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

    /**
     * @return Long
     */
    public function getUserVersion()
    {
        return $this->value->getUserVersion();
    }

    /**
     * @param Long $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->value->setUserVersion($userVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getUserId(),
            $this->getPermissionId(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserPermissionStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserId($pValues[0]);
        $this->setPermissionId($pValues[1]);
        $this->setUserVersion($pValues[2]);
        return $this;
    }

}

