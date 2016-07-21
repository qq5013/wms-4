<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

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
     * @param string $loginProvider
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
     * @param string $providerKey
     */
    public function setProviderKey($providerKey)
    {
        $this->providerKey = $providerKey;
    }


}

