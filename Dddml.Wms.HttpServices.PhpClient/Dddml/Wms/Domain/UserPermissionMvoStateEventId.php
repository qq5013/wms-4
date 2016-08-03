<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class UserPermissionMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\UserPermissionId")
     */
    private $userPermissionId;

    /**
     * @return UserPermissionId
     */
    public function getUserPermissionId()
    {
        if(!$this->userPermissionId) {
            $this->userPermissionId = new UserPermissionId(); 
        }
        return $this->userPermissionId;
    }

    /**
     * @param UserPermissionId $userPermissionId
     */
    public function setUserPermissionId($userPermissionId)
    {
        $this->userPermissionId = $userPermissionId;
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
     * @var UserPermissionMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new UserPermissionMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return UserPermissionMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new UserPermissionMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toUserPermissionMvoStateEventId();
    }


}

