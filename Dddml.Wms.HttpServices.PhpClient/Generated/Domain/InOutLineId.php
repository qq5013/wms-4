<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\InOutLine;
use NodaMoney\Money;

class InOutLineId
{
    /**
     * @Type("string")
     */
    private $inOutDocumentNumber;

    /**
     * @return string
     */
    public function getInOutDocumentNumber()
    {
        return $this->inOutDocumentNumber;
    }

    /**
     * @var string $inOutDocumentNumber
     */
    public function setInOutDocumentNumber($inOutDocumentNumber)
    {
        $this->inOutDocumentNumber = $inOutDocumentNumber;
    }

    /**
     * @Type("_UNKNOWN_")
     */
    private $skuId;

    /**
     * @return _UNKNOWN_
     */
    public function getSkuId()
    {
        return $this->skuId;
    }

    /**
     * @var _UNKNOWN_ $skuId
     */
    public function setSkuId($skuId)
    {
        $this->skuId = $skuId;
    }

}

