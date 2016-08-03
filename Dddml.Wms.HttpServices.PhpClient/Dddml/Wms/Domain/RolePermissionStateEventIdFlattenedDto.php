<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class RolePermissionStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'idRoleId' => 'string',
            'idPermissionId' => 'string',
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
     * @var RolePermissionStateEventId
     */
    private $value;

    /**
     * @param RolePermissionStateEventId $value
     */
    public function __construct(RolePermissionStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new RolePermissionStateEventId();
        }
    }

    /**
     * @return RolePermissionStateEventId
     */
    public function toRolePermissionStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getIdRoleId()
    {
        return $this->value->getId()->getRoleId();
    }

    /**
     * @param string $idRoleId
     */
    public function setIdRoleId($idRoleId)
    {
        $this->value->getId()->setRoleId($idRoleId);
    }

    /**
     * @return string
     */
    public function getIdPermissionId()
    {
        return $this->value->getId()->getPermissionId();
    }

    /**
     * @param string $idPermissionId
     */
    public function setIdPermissionId($idPermissionId)
    {
        $this->value->getId()->setPermissionId($idPermissionId);
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
            $this->getIdRoleId(),
            $this->getIdPermissionId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return RolePermissionStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setIdRoleId($pValues[0]);
        $this->setIdPermissionId($pValues[1]);
        $this->setVersion($pValues[2]);
        return $this;
    }

}

