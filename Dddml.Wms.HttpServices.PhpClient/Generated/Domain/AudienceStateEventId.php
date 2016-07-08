<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;

class AudienceStateEventId
{
    /**
     * @Type("string")
     */
    private $clientId;

    /**
     * @return string
     */
    public function getClientId()
    {
        return $this->clientId;
    }

    /**
     * @var string $clientId
     */
    public function setClientId($clientId)
    {
        $this->clientId = $clientId;
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

