<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\InOutLine;
use Dddml\Wms\Domain\InOutLineId;
use NodaMoney\Money;

class InOutStateEventId
{
    /**
     * @Type("string")
     */
    private $documentNumber;

    /**
     * @return string
     */
    public function getDocumentNumber()
    {
        return $this->documentNumber;
    }

    /**
     * @var string $documentNumber
     */
    public function setDocumentNumber($documentNumber)
    {
        $this->documentNumber = $documentNumber;
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

