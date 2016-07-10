<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\LoginKey;
use Wms\Domain\CommandTrait;

class AbstractUserLoginCommand
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
     * @var LoginKey $loginKey
     */
    public function setLoginKey($loginKey)
    {
        $this->loginKey = $loginKey;
    }


}

