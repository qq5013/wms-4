<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserClaimIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'userId',
            'claimId',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'integer',
        ];
    }
	
    /**
     * @var UserClaimId
     */
    private $value;

    public function __construct()
    {
        $this->value = new UserClaimId();
    }

    /**
     * @return UserClaimId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param UserClaimId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @return string
     */
    public function getUserId()
    {
        return $this->value->getUserId();
    }

    /**
     * @param string $userId
     */
    public function setUserId($userId)
    {
        $this->value->setUserId($userId);
    }

    /**
     * @return integer
     */
    public function getClaimId()
    {
        return $this->value->getClaimId();
    }

    /**
     * @param integer $claimId
     */
    public function setClaimId($claimId)
    {
        $this->value->setClaimId($claimId);
    }


}

