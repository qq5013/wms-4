<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class UserRoleMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\UserRoleId")
     */
    private $userRoleId;

    /**
     * @return UserRoleId
     */
    public function getUserRoleId()
    {
        if(!$this->userRoleId) {
            $this->userRoleId = new UserRoleId(); 
        }
        return $this->userRoleId;
    }

    /**
     * @param UserRoleId $userRoleId
     */
    public function setUserRoleId($userRoleId)
    {
        $this->userRoleId = $userRoleId;
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
     * @var UserRoleMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new UserRoleMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return UserRoleMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new UserRoleMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toUserRoleMvoStateEventId();
    }


}

