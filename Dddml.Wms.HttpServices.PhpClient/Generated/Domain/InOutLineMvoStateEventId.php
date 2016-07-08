<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use NodaMoney\Money;
use Dddml\Wms\Domain\InOutLine;
use Dddml\Wms\Domain\InOutLineId;

class InOutLineMvoStateEventId
{
    /**
     * @Type("_UNKNOWN_")
     */
    private $inOutLineId;

    /**
     * @return _UNKNOWN_
     */
    public function getInOutLineId()
    {
        return $this->inOutLineId;
    }

    /**
     * @var _UNKNOWN_ $inOutLineId
     */
    public function setInOutLineId($inOutLineId)
    {
        $this->inOutLineId = $inOutLineId;
    }

    /**
     * @Type("integer")
     */
    private $inOutVersion;

    /**
     * @return integer
     */
    public function getInOutVersion()
    {
        return $this->inOutVersion;
    }

    /**
     * @var integer $inOutVersion
     */
    public function setInOutVersion($inOutVersion)
    {
        $this->inOutVersion = $inOutVersion;
    }

}

