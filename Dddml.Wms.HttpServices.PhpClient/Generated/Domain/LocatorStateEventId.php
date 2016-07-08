<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;

class LocatorStateEventId
{
    /**
     * @Type("string")
     */
    private $locatorId;

    /**
     * @return string
     */
    public function getLocatorId()
    {
        return $this->locatorId;
    }

    /**
     * @var string $locatorId
     */
    public function setLocatorId($locatorId)
    {
        $this->locatorId = $locatorId;
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

