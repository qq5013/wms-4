<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserRoleIdFlattenedDto implements \Serializable
{

    const PROPERTIES = [
            'userId' => 'string',
            'roleId' => 'string',
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
     * @var UserRoleId
     */
    private $value;

    /**
     * @param UserRoleId $value
     */
    public function __construct(UserRoleId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserRoleId();
        }
    }

    /**
     * @return UserRoleId
     */
    public function toUserRoleId()
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

    public function serialize()
    {
        $pValues = [
            $this->getUserId(),
            $this->getRoleId(),
        ];
        return implode(',', $pValues);
    }

    public function unserialize($data)
    {
        $pValues = explode(',', $data);
        $this->setUserId($pValues[0]);
        $this->setRoleId($pValues[1]);
    }

}

