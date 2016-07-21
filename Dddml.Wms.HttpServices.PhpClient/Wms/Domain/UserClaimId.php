<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class UserClaimId implements StringIdInterface
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
     * @Type("integer")
     */
    private $claimId;

    /**
     * @return integer
     */
    public function getClaimId()
    {
        return $this->claimId;
    }

    /**
     * @param integer $claimId
     */
    public function setClaimId($claimId)
    {
        $this->claimId = $claimId;
    }



    /**
     * @var UserClaimIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new UserClaimIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return UserClaimId
     */
    public static function createFromString($idStr)
    {
        return (new UserClaimIdFlattenedDto())
            ->fromString($idStr)
            ->toUserClaimId();
    }


}

