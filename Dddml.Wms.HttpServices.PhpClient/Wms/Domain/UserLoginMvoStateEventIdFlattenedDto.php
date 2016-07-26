<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserLoginMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userLoginIdUserId' => 'string',
            'userLoginIdLoginKeyLoginProvider' => 'string',
            'userLoginIdLoginKeyProviderKey' => 'string',
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
     * @var UserLoginMvoStateEventId
     */
    private $value;

    /**
     * @param UserLoginMvoStateEventId $value
     */
    public function __construct(UserLoginMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserLoginMvoStateEventId();
        }
    }

    /**
     * @return UserLoginMvoStateEventId
     */
    public function toUserLoginMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getUserLoginIdUserId()
    {
        return $this->value->getUserLoginId()->getUserId();
    }

    /**
     * @param string $userLoginIdUserId
     */
    public function setUserLoginIdUserId($userLoginIdUserId)
    {
        $this->value->getUserLoginId()->setUserId($userLoginIdUserId);
    }

    /**
     * @return string
     */
    public function getUserLoginIdLoginKeyLoginProvider()
    {
        return $this->value->getUserLoginId()->getLoginKey()->getLoginProvider();
    }

    /**
     * @param string $userLoginIdLoginKeyLoginProvider
     */
    public function setUserLoginIdLoginKeyLoginProvider($userLoginIdLoginKeyLoginProvider)
    {
        $this->value->getUserLoginId()->getLoginKey()->setLoginProvider($userLoginIdLoginKeyLoginProvider);
    }

    /**
     * @return string
     */
    public function getUserLoginIdLoginKeyProviderKey()
    {
        return $this->value->getUserLoginId()->getLoginKey()->getProviderKey();
    }

    /**
     * @param string $userLoginIdLoginKeyProviderKey
     */
    public function setUserLoginIdLoginKeyProviderKey($userLoginIdLoginKeyProviderKey)
    {
        $this->value->getUserLoginId()->getLoginKey()->setProviderKey($userLoginIdLoginKeyProviderKey);
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
            $this->getUserLoginIdUserId(),
            $this->getUserLoginIdLoginKeyLoginProvider(),
            $this->getUserLoginIdLoginKeyProviderKey(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserLoginMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserLoginIdUserId($pValues[0]);
        $this->setUserLoginIdLoginKeyLoginProvider($pValues[1]);
        $this->setUserLoginIdLoginKeyProviderKey($pValues[2]);
        $this->setUserVersion($pValues[3]);
        return $this;
    }

}

