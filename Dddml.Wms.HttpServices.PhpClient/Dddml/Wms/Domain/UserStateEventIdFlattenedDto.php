<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class UserStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'userId' => 'string',
            'version' => 'Long',
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
     * @var UserStateEventId
     */
    private $value;

    /**
     * @param UserStateEventId $value
     */
    public function __construct(UserStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new UserStateEventId();
        }
    }

    /**
     * @return UserStateEventId
     */
    public function toUserStateEventId()
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
     * @return Long
     */
    public function getVersion()
    {
        return $this->value->getVersion();
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->value->setVersion($version);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getUserId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return UserStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setUserId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

