<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserRoleStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userId' => 'string',
            'roleId' => 'string',
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
     * @var UserRoleStateEventId
     */
    private $value;

    /**
     * @param UserRoleStateEventId $value
     */
    public function __construct(UserRoleStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserRoleStateEventId();
        }
    }

    /**
     * @return UserRoleStateEventId
     */
    public function toUserRoleStateEventId()
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
            $this->getRoleId(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserRoleStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserId($pValues[0]);
        $this->setRoleId($pValues[1]);
        $this->setUserVersion($pValues[2]);
        return $this;
    }

}

