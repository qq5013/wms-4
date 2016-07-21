<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

abstract class AbstractInOutLineCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\SkuId")
     */
    private $skuId;

    /**
     * @return SkuId
     */
    public function getSkuId()
    {
        return $this->skuId;
    }

    /**
     * @param SkuId $skuId
     */
    public function setSkuId($skuId)
    {
        $this->skuId = $skuId;
    }


}

