<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class InOutLineId implements StringIdInterface
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
     * @param string $inOutDocumentNumber
     */
    public function setInOutDocumentNumber($inOutDocumentNumber)
    {
        $this->inOutDocumentNumber = $inOutDocumentNumber;
    }

    /**
     * @Type("Dddml\Wms\Domain\SkuId")
     */
    private $skuId;

    /**
     * @return SkuId
     */
    public function getSkuId()
    {
        if(!$this->skuId) {
            $this->skuId = new SkuId(); 
        }
        return $this->skuId;
    }

    /**
     * @param SkuId $skuId
     */
    public function setSkuId($skuId)
    {
        $this->skuId = $skuId;
    }



    /**
     * @var InOutLineIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new InOutLineIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return InOutLineId
     */
    public static function createFromString($idStr)
    {
        return (new InOutLineIdFlattenedDto())
            ->fromString($idStr)
            ->toInOutLineId();
    }


}

