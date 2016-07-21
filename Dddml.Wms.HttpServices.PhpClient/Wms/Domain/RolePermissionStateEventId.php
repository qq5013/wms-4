<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class RolePermissionStateEventId implements StringIdInterface
{
    /**
     * @Type("Wms\Domain\RolePermissionId")
     */
    private $id;

    /**
     * @return RolePermissionId
     */
    public function getId()
    {
        if(!$this->id) {
            $this->id = new RolePermissionId(); 
        }
        return $this->id;
    }

    /**
     * @param RolePermissionId $id
     */
    public function setId($id)
    {
        $this->id = $id;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }



    /**
     * @var RolePermissionStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new RolePermissionStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return RolePermissionStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new RolePermissionStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toRolePermissionStateEventId();
    }


}

