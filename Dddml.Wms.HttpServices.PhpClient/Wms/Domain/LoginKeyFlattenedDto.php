<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class LoginKeyFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'loginProvider',
            'providerKey',
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
     * @var LoginKey
     */
    private $value;

    public function __construct()
    {
        $this->value = new LoginKey();
    }

    /**
     * @return LoginKey
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param LoginKey $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @return string
     */
    public function getLoginProvider()
    {
        return $this->value->getLoginProvider();
    }

    /**
     * @param string $loginProvider
     */
    public function setLoginProvider($loginProvider)
    {
        $this->value->setLoginProvider($loginProvider);
    }

    /**
     * @return string
     */
    public function getProviderKey()
    {
        return $this->value->getProviderKey();
    }

    /**
     * @param string $providerKey
     */
    public function setProviderKey($providerKey)
    {
        $this->value->setProviderKey($providerKey);
    }


}

