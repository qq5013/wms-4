<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class RolePermissionStateEventId
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

}

