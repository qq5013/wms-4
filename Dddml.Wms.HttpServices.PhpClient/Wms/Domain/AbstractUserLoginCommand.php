<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\LoginKey;
use Wms\Domain\CommandTrait;

abstract class AbstractUserLoginCommand
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\LoginKey")
     */
    private $loginKey;

    /**
     * @return LoginKey
     */
    public function getLoginKey()
    {
        return $this->loginKey;
    }

    /**
     * @param LoginKey $loginKey
     */
    public function setLoginKey($loginKey)
    {
        $this->loginKey = $loginKey;
    }


}

