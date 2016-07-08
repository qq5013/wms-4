<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;

class RolePermissionStateEventId
{
    /**
     * @Type("_UNKNOWN_")
     */
    private $id;

    /**
     * @return _UNKNOWN_
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @var _UNKNOWN_ $id
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

