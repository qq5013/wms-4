<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserClaimStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userId' => 'string',
            'claimId' => 'integer',
            'userVersion' => 'Long',
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
     * @var UserClaimStateEventId
     */
    private $value;

    /**
     * @param UserClaimStateEventId $value
     */
    public function __construct(UserClaimStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserClaimStateEventId();
        }
    }

    /**
     * @return UserClaimStateEventId
     */
    public function toUserClaimStateEventId()
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

    /**
     * @return Long
     */
    public function getUserVersion()
    {
        return $this->value->getUserVersion();
    }

    /**
     * @param Long $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->value->setUserVersion($userVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getUserId(),
            $this->getClaimId(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserClaimStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserId($pValues[0]);
        $this->setClaimId($pValues[1]);
        $this->setUserVersion($pValues[2]);
        return $this;
    }

}

