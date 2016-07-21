<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class UserLoginId implements StringIdInterface
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
     * @param string $userId
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
        if(!$this->loginKey) {
            $this->loginKey = new LoginKey(); 
        }
        return $this->loginKey;
    }

    /**
     * @param LoginKey $loginKey
     */
    public function setLoginKey($loginKey)
    {
        $this->loginKey = $loginKey;
    }



    /**
     * @var UserLoginIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new UserLoginIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return UserLoginId
     */
    public static function createFromString($idStr)
    {
        return (new UserLoginIdFlattenedDto())
            ->fromString($idStr)
            ->toUserLoginId();
    }


}

