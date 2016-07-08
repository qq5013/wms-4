<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;

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
     * @var string $productId
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
     * @var string $attributeSetInstanceId
     */
    public function setAttributeSetInstanceId($attributeSetInstanceId)
    {
        $this->attributeSetInstanceId = $attributeSetInstanceId;
    }

}

