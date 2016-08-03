<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserLoginStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userId' => 'string',
            'loginKeyLoginProvider' => 'string',
            'loginKeyProviderKey' => 'string',
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
     * @var UserLoginStateEventId
     */
    private $value;

    /**
     * @param UserLoginStateEventId $value
     */
    public function __construct(UserLoginStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserLoginStateEventId();
        }
    }

    /**
     * @return UserLoginStateEventId
     */
    public function toUserLoginStateEventId()
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
    public function getLoginKeyLoginProvider()
    {
        return $this->value->getLoginKey()->getLoginProvider();
    }

    /**
     * @param string $loginKeyLoginProvider
     */
    public function setLoginKeyLoginProvider($loginKeyLoginProvider)
    {
        $this->value->getLoginKey()->setLoginProvider($loginKeyLoginProvider);
    }

    /**
     * @return string
     */
    public function getLoginKeyProviderKey()
    {
        return $this->value->getLoginKey()->getProviderKey();
    }

    /**
     * @param string $loginKeyProviderKey
     */
    public function setLoginKeyProviderKey($loginKeyProviderKey)
    {
        $this->value->getLoginKey()->setProviderKey($loginKeyProviderKey);
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
            $this->getLoginKeyLoginProvider(),
            $this->getLoginKeyProviderKey(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserLoginStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserId($pValues[0]);
        $this->setLoginKeyLoginProvider($pValues[1]);
        $this->setLoginKeyProviderKey($pValues[2]);
        $this->setUserVersion($pValues[3]);
        return $this;
    }

}

