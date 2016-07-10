<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\LoginKey;

class UserLoginId
{
    /**
     * @Type("string")
     */
    private $userId;

    /**
     * @return string
     */
    public function getUserId()
    {
        return $this->userId;
    }

    /**
     * @var string $userId
     */
    public function setUserId($userId)
    {
        $this->userId = $userId;
    }

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

