<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class SkuIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'productId',
            'attributeSetInstanceId',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'string',
        ];
    }
	
    /**
     * @var SkuId
     */
    private $value;

    public function __construct()
    {
        $this->value = new SkuId();
    }

    /**
     * @return SkuId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param SkuId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
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

