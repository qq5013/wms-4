<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\RolePermissionId;

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
        return $this->id;
    }

    /**
     * @var RolePermissionId $id
     */
    public function setId($id)
    {
        $this->id = $id;
    }

    /**
     * @Type("integer")
     */
    private $version;

    /**
     * @return integer
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @var integer $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }

}

