<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Wms\Domain\InOutLineId;
use NodaMoney\Money;
use Wms\Domain\InOutLine;
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

