﻿<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class LoginKey
{
    /**
     * @Type("string")
     */
    private $loginProvider;

    /**
     * @return string
     */
    public function getLoginProvider()
    {
        return $this->loginProvider;
    }

    /**
     * @var string $loginProvider
     */
    public function setLoginProvider($loginProvider)
    {
        $this->loginProvider = $loginProvider;
    }

    /**
     * @Type("string")
     */
    private $providerKey;

    /**
     * @return string
     */
    public function getProviderKey()
    {
        return $this->providerKey;
    }

    /**
     * @var string $providerKey
     */
    public function setProviderKey($providerKey)
    {
        $this->providerKey = $providerKey;
    }

}
