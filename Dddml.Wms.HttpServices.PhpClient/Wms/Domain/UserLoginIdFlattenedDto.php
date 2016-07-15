<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\LoginKey;

class UserLoginIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'userId',
            'loginKeyLoginProvider',
            'loginKeyProviderKey',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'string',
            'string',
        ];
    }
	
    /**
     * @var UserLoginId
     */
    private $value;

    public function __construct()
    {
        $this->value = new UserLoginId();
    }

    /**
     * @return UserLoginId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param UserLoginId $value
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


}

