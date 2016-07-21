<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Wms\Domain\CommandTrait;

abstract class AbstractInOutLineMvoCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\InOutLineId")
     */
    private $inOutLineId;

    /**
     * @return InOutLineId
     */
    public function getInOutLineId()
    {
        return $this->inOutLineId;
    }

    /**
     * @param InOutLineId $inOutLineId
     */
    public function setInOutLineId($inOutLineId)
    {
        $this->inOutLineId = $inOutLineId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $inOutVersion;

    /**
     * @return Long
     */
    public function getInOutVersion()
    {
        return $this->inOutVersion;
    }

    /**
     * @param Long $inOutVersion
     */
    public function setInOutVersion($inOutVersion)
    {
        $this->inOutVersion = $inOutVersion;
    }


}

