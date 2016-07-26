<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserClaimMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userClaimIdUserId' => 'string',
            'userClaimIdClaimId' => 'integer',
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
     * @var UserClaimMvoStateEventId
     */
    private $value;

    /**
     * @param UserClaimMvoStateEventId $value
     */
    public function __construct(UserClaimMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserClaimMvoStateEventId();
        }
    }

    /**
     * @return UserClaimMvoStateEventId
     */
    public function toUserClaimMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getUserClaimIdUserId()
    {
        return $this->value->getUserClaimId()->getUserId();
    }

    /**
     * @param string $userClaimIdUserId
     */
    public function setUserClaimIdUserId($userClaimIdUserId)
    {
        $this->value->getUserClaimId()->setUserId($userClaimIdUserId);
    }

    /**
     * @return integer
     */
    public function getUserClaimIdClaimId()
    {
        return $this->value->getUserClaimId()->getClaimId();
    }

    /**
     * @param integer $userClaimIdClaimId
     */
    public function setUserClaimIdClaimId($userClaimIdClaimId)
    {
        $this->value->getUserClaimId()->setClaimId($userClaimIdClaimId);
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
            $this->getUserClaimIdUserId(),
            $this->getUserClaimIdClaimId(),
            $this->getUserVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserClaimMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserClaimIdUserId($pValues[0]);
        $this->setUserClaimIdClaimId($pValues[1]);
        $this->setUserVersion($pValues[2]);
        return $this;
    }

}

