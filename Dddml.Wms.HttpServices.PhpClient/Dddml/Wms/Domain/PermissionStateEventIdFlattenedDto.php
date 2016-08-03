<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class PermissionStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'permissionId' => 'string',
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
     * @var PermissionStateEventId
     */
    private $value;

    /**
     * @param PermissionStateEventId $value
     */
    public function __construct(PermissionStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new PermissionStateEventId();
        }
    }

    /**
     * @return PermissionStateEventId
     */
    public function toPermissionStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getPermissionId()
    {
        return $this->value->getPermissionId();
    }

    /**
     * @param string $permissionId
     */
    public function setPermissionId($permissionId)
    {
        $this->value->setPermissionId($permissionId);
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
            $this->getPermissionId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return PermissionStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setPermissionId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

