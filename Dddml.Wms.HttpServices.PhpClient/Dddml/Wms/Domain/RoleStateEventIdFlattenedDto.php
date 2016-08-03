<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class RoleStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'roleId' => 'string',
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
     * @var RoleStateEventId
     */
    private $value;

    /**
     * @param RoleStateEventId $value
     */
    public function __construct(RoleStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new RoleStateEventId();
        }
    }

    /**
     * @return RoleStateEventId
     */
    public function toRoleStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getRoleId()
    {
        return $this->value->getRoleId();
    }

    /**
     * @param string $roleId
     */
    public function setRoleId($roleId)
    {
        $this->value->setRoleId($roleId);
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
            $this->getRoleId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return RoleStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setRoleId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

