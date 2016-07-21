<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserPermissionMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userPermissionIdUserId' => 'string',
            'userPermissionIdPermissionId' => 'string',
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
     * @var UserPermissionMvoStateEventId
     */
    private $value;

    /**
     * @param UserPermissionMvoStateEventId $value
     */
    public function __construct(UserPermissionMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserPermissionMvoStateEventId();
        }
    }

    /**
     * @return UserPermissionMvoStateEventId
     */
    public function toUserPermissionMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getUserPermissionIdUserId()
    {
        return $this->value->getUserPermissionId()->getUserId();
    }

    /**
     * @param string $userPermissionIdUserId
     */
    public function setUserPermissionIdUserId($userPermissionIdUserId)
    {
        $this->value->getUserPermissionId()->setUserId($userPermissionIdUserId);
    }

    /**
     * @return string
     */
    public function getUserPermissionIdPermissionId()
    {
        return $this->value->getUserPermissionId()->getPermissionId();
    }

    /**
     * @param string $userPermissionIdPermissionId
     */
    public function setUserPermissionIdPermissionId($userPermissionIdPermissionId)
    {
        $this->value->getUserPermissionId()->setPermissionId($userPermissionIdPermissionId);
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
            $this->getUserPermissionIdUserId(),
            $this->getUserPermissionIdPermissionId(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserPermissionMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserPermissionIdUserId($pValues[0]);
        $this->setUserPermissionIdPermissionId($pValues[1]);
        $this->setUserVersion($pValues[2]);
        return $this;
    }

}

