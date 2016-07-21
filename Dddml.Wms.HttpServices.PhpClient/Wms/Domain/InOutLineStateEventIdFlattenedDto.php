<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class InOutLineStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'inOutDocumentNumber' => 'string',
            'skuIdProductId' => 'string',
            'skuIdAttributeSetInstanceId' => 'string',
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
     * @var InOutLineStateEventId
     */
    private $value;

    /**
     * @param InOutLineStateEventId $value
     */
    public function __construct(InOutLineStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new InOutLineStateEventId();
        }
    }

    /**
     * @return InOutLineStateEventId
     */
    public function toInOutLineStateEventId()
    {
        return $this->value;
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
            $this->getInOutDocumentNumber(),
            $this->getSkuIdProductId(),
            $this->getSkuIdAttributeSetInstanceId(),
            $this->getInOutVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return InOutLineStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setInOutDocumentNumber($pValues[0]);
        $this->setSkuIdProductId($pValues[1]);
        $this->setSkuIdAttributeSetInstanceId($pValues[2]);
        $this->setInOutVersion($pValues[3]);
        return $this;
    }

}

