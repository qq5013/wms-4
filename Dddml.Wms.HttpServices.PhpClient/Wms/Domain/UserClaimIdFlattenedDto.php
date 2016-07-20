<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserClaimIdFlattenedDto implements \Serializable
{

    const PROPERTIES = [
            'userId' => 'string',
            'claimId' => 'integer',
        ];

    public static function getPropertyNames()
    {
        return array_keys(static::PROPERTIES);
    }

    public static function getPropertyTypes()
    {
        return array_values(static::PROPERTIES);
    }

	
    /**
     * @var UserClaimId
     */
    private $value;

    /**
     * @param UserClaimId $value
     */
    public function __construct(UserClaimId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserClaimId();
        }
    }

    /**
     * @return UserClaimId
     */
    public function toUserClaimId()
    {
        return $this->value;
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

    public function serialize()
    {
        $pValues = [
            $this->getUserId(),
            $this->getClaimId(),
        ];
        return implode(',', $pValues);
    }

    public function unserialize($data)
    {
        $pValues = explode(',', $data);
        $this->setUserId($pValues[0]);
        $this->setClaimId($pValues[1]);
    }

}

