<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class InOutLineMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'inOutLineIdInOutDocumentNumber' => 'string',
            'inOutLineIdSkuIdProductId' => 'string',
            'inOutLineIdSkuIdAttributeSetInstanceId' => 'string',
            'inOutVersion' => 'Long',
        ];

    public static function getPropertyNames()
    {
        return array_keys(static::PROPERTIES);
    }

    public static function getPropertyTypes()
    {
        return array_values(static::PROPERTIES);
    }

	
    /**
     * @var InOutLineMvoStateEventId
     */
    private $value;

    /**
     * @param InOutLineMvoStateEventId $value
     */
    public function __construct(InOutLineMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new InOutLineMvoStateEventId();
        }
    }

    /**
     * @return InOutLineMvoStateEventId
     */
    public function toInOutLineMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getInOutLineIdInOutDocumentNumber()
    {
        return $this->value->getInOutLineId()->getInOutDocumentNumber();
    }

    /**
     * @param string $inOutLineIdInOutDocumentNumber
     */
    public function setInOutLineIdInOutDocumentNumber($inOutLineIdInOutDocumentNumber)
    {
        $this->value->getInOutLineId()->setInOutDocumentNumber($inOutLineIdInOutDocumentNumber);
    }

    /**
     * @return string
     */
    public function getInOutLineIdSkuIdProductId()
    {
        return $this->value->getInOutLineId()->getSkuId()->getProductId();
    }

    /**
     * @param string $inOutLineIdSkuIdProductId
     */
    public function setInOutLineIdSkuIdProductId($inOutLineIdSkuIdProductId)
    {
        $this->value->getInOutLineId()->getSkuId()->setProductId($inOutLineIdSkuIdProductId);
    }

    /**
     * @return string
     */
    public function getInOutLineIdSkuIdAttributeSetInstanceId()
    {
        return $this->value->getInOutLineId()->getSkuId()->getAttributeSetInstanceId();
    }

    /**
     * @param string $inOutLineIdSkuIdAttributeSetInstanceId
     */
    public function setInOutLineIdSkuIdAttributeSetInstanceId($inOutLineIdSkuIdAttributeSetInstanceId)
    {
        $this->value->getInOutLineId()->getSkuId()->setAttributeSetInstanceId($inOutLineIdSkuIdAttributeSetInstanceId);
    }

    /**
     * @return Long
     */
    public function getInOutVersion()
    {
        return $this->value->getInOutVersion();
    }

    /**
     * @param Long $inOutVersion
     */
    public function setInOutVersion($inOutVersion)
    {
        $this->value->setInOutVersion($inOutVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getInOutLineIdInOutDocumentNumber(),
            $this->getInOutLineIdSkuIdProductId(),
            $this->getInOutLineIdSkuIdAttributeSetInstanceId(),
            $this->getInOutVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return InOutLineMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setInOutLineIdInOutDocumentNumber($pValues[0]);
        $this->setInOutLineIdSkuIdProductId($pValues[1]);
        $this->setInOutLineIdSkuIdAttributeSetInstanceId($pValues[2]);
        $this->setInOutVersion($pValues[3]);
        return $this;
    }

}

