<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\RolePermissionId;
use Wms\Domain\CommandTrait;

class AbstractRolePermissionCommand
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\RolePermissionId")
     */
    private $id;

    /**
     * @return RolePermissionId
     */
    public function getId()
    {
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


}

