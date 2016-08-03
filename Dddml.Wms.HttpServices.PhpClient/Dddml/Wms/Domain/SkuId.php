<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class SkuId
{
    /**
     * @Type("string")
     */
    private $productId;

    /**
     * @return string
     */
    public function getProductId()
    {
        return $this->productId;
    }

    /**
     * @param string $productId
     */
    public function setProductId($productId)
    {
        $this->productId = $productId;
    }

    /**
     * @Type("string")
     */
    private $attributeSetInstanceId;

    /**
     * @return string
     */
    public function getAttributeSetInstanceId()
    {
        return $this->attributeSetInstanceId;
    }

    /**
     * @param string $attributeSetInstanceId
     */
    public function setAttributeSetInstanceId($attributeSetInstanceId)
    {
        $this->attributeSetInstanceId = $attributeSetInstanceId;
    }


}

