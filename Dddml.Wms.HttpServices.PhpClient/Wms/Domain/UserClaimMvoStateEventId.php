<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class UserClaimMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Wms\Domain\UserClaimId")
     */
    private $userClaimId;

    /**
     * @return UserClaimId
     */
    public function getUserClaimId()
    {
        if(!$this->userClaimId) {
            $this->userClaimId = new UserClaimId(); 
        }
        return $this->userClaimId;
    }

    /**
     * @param UserClaimId $userClaimId
     */
    public function setUserClaimId($userClaimId)
    {
        $this->userClaimId = $userClaimId;
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
     * @var UserClaimMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new UserClaimMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return UserClaimMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new UserClaimMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toUserClaimMvoStateEventId();
    }


}

