<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class SkuIdFlattenedDto
{

    const PROPERTIES = [
            'productId' => 'string',
            'attributeSetInstanceId' => 'string',
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
     * @var SkuId
     */
    private $value;

    /**
     * @param SkuId $value
     */
    public function __construct(SkuId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new SkuId();
        }
    }

    /**
     * @return SkuId
     */
    public function toSkuId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getProductId()
    {
        return $this->value->getProductId();
    }

    /**
     * @param string $productId
     */
    public function setProductId($productId)
    {
        $this->value->setProductId($productId);
    }

    /**
     * @return string
     */
    public function getAttributeSetInstanceId()
    {
        return $this->value->getAttributeSetInstanceId();
    }

    /**
     * @param string $attributeSetInstanceId
     */
    public function setAttributeSetInstanceId($attributeSetInstanceId)
    {
        $this->value->setAttributeSetInstanceId($attributeSetInstanceId);
    }


}

