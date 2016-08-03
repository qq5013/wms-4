<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractUserLoginCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Dddml\Wms\Domain\LoginKey")
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

