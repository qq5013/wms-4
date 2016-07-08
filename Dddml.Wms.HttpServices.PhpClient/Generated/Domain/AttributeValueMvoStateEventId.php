<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\AttributeValue;
use Dddml\Wms\Domain\AttributeValueId;

class AttributeValueMvoStateEventId
{
    /**
     * @Type("_UNKNOWN_")
     */
    private $attributeValueId;

    /**
     * @return _UNKNOWN_
     */
    public function getAttributeValueId()
    {
        return $this->attributeValueId;
    }

    /**
     * @var _UNKNOWN_ $attributeValueId
     */
    public function setAttributeValueId($attributeValueId)
    {
        $this->attributeValueId = $attributeValueId;
    }

    /**
     * @Type("integer")
     */
    private $attributeVersion;

    /**
     * @return integer
     */
    public function getAttributeVersion()
    {
        return $this->attributeVersion;
    }

    /**
     * @var integer $attributeVersion
     */
    public function setAttributeVersion($attributeVersion)
    {
        $this->attributeVersion = $attributeVersion;
    }

}

