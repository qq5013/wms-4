<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Money;
use Dddml\Serializer\Type\Decimal;
use Dddml\Serializer\Type\Long;

class InOut
{

    use InOutStatePropertiesTrait;

    /**
     * @Type("array<Dddml\Wms\Domain\InOutLine>")
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

