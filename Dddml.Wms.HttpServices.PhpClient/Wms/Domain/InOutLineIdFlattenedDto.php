<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\SkuId;

class InOutLineIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'inOutDocumentNumber',
            'skuIdProductId',
            'skuIdAttributeSetInstanceId',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'string',
            'string',
        ];
    }
	
    /**
     * @var InOutLineId
     */
    private $value;

    public function __construct()
    {
        $this->value = new InOutLineId();
    }

    /**
     * @return InOutLineId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param InOutLineId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @return string
     */
    public function getInOutDocumentNumber()
    {
        return $this->value->getInOutDocumentNumber();
    }

    /**
     * @param string $inOutDocumentNumber
     */
    public function setInOutDocumentNumber($inOutDocumentNumber)
    {
        $this->value->setInOutDocumentNumber($inOutDocumentNumber);
    }

    /**
     * @return string
     */
    public function getSkuIdProductId()
    {
        return $this->value->getSkuId()->getProductId();
    }

    /**
     * @param string $skuIdProductId
     */
    public function setSkuIdProductId($skuIdProductId)
    {
        $this->value->getSkuId()->setProductId($skuIdProductId);
    }

    /**
     * @return string
     */
    public function getSkuIdAttributeSetInstanceId()
    {
        return $this->value->getSkuId()->getAttributeSetInstanceId();
    }

    /**
     * @param string $skuIdAttributeSetInstanceId
     */
    public function setSkuIdAttributeSetInstanceId($skuIdAttributeSetInstanceId)
    {
        $this->value->getSkuId()->setAttributeSetInstanceId($skuIdAttributeSetInstanceId);
    }


}

