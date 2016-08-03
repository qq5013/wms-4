<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserRoleMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userRoleIdUserId' => 'string',
            'userRoleIdRoleId' => 'string',
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
     * @var UserRoleMvoStateEventId
     */
    private $value;

    /**
     * @param UserRoleMvoStateEventId $value
     */
    public function __construct(UserRoleMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserRoleMvoStateEventId();
        }
    }

    /**
     * @return UserRoleMvoStateEventId
     */
    public function toUserRoleMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getUserRoleIdUserId()
    {
        return $this->value->getUserRoleId()->getUserId();
    }

    /**
     * @param string $userRoleIdUserId
     */
    public function setUserRoleIdUserId($userRoleIdUserId)
    {
        $this->value->getUserRoleId()->setUserId($userRoleIdUserId);
    }

    /**
     * @return string
     */
    public function getUserRoleIdRoleId()
    {
        return $this->value->getUserRoleId()->getRoleId();
    }

    /**
     * @param string $userRoleIdRoleId
     */
    public function setUserRoleIdRoleId($userRoleIdRoleId)
    {
        $this->value->getUserRoleId()->setRoleId($userRoleIdRoleId);
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
            $this->getUserRoleIdUserId(),
            $this->getUserRoleIdRoleId(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserRoleMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserRoleIdUserId($pValues[0]);
        $this->setUserRoleIdRoleId($pValues[1]);
        $this->setUserVersion($pValues[2]);
        return $this;
    }

}

