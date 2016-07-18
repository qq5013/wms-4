<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class LoginKeyFlattenedDto
{

    const PROPERTIES = [
            'loginProvider' => 'string',
            'providerKey' => 'string',
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
     * @var LoginKey
     */
    private $value;

    /**
     * @param LoginKey $value
     */
    public function __construct(LoginKey $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new LoginKey();
        }
    }

    /**
     * @return LoginKey
     */
    public function toLoginKey()
    {
        return $this->value;
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

