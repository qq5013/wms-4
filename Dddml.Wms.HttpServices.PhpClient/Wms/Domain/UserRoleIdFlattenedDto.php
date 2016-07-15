<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserRoleIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'userId',
            'roleId',
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
     * @var UserRoleId
     */
    private $value;

    public function __construct()
    {
        $this->value = new UserRoleId();
    }

    /**
     * @return UserRoleId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param UserRoleId $value
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


}

