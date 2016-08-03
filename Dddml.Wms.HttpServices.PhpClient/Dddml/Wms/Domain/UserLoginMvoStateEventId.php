<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class UserLoginMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\UserLoginId")
     */
    private $userLoginId;

    /**
     * @return UserLoginId
     */
    public function getUserLoginId()
    {
        if(!$this->userLoginId) {
            $this->userLoginId = new UserLoginId(); 
        }
        return $this->userLoginId;
    }

    /**
     * @param UserLoginId $userLoginId
     */
    public function setUserLoginId($userLoginId)
    {
        $this->userLoginId = $userLoginId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $userVersion;

    /**
     * @return Long
     */
    public function getUserVersion()
    {
        return $this->userVersion;
    }

    /**
     * @param Long $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->userVersion = $userVersion;
    }



    /**
     * @var UserLoginMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new UserLoginMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return UserLoginMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new UserLoginMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toUserLoginMvoStateEventId();
    }


}

