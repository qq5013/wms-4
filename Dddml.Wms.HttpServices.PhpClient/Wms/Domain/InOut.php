<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Dddml\Serializer\Type\Decimal;
use Dddml\Serializer\Type\Long;

class InOut
{

    use InOutStatePropertiesTrait;

    /**
     * @Type("array<Wms\Domain\InOutLine>")
     * @var InOutLine[]
     */
    private $inOutLines;

    /**
     * @return InOutLine[]
     */
    public function getInOutLines()
    {
        return $this->inOutLines;
    }	

    /**
     * @param InOutLine[] $inOutLines
     */
    public function setInOutLines($inOutLines)
    {
        $this->inOutLines = $inOutLines;
    }


}

