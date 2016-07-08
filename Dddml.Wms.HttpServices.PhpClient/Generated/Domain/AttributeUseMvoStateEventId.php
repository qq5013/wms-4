<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\AttributeUse;
use Dddml\Wms\Domain\AttributeSetAttributeUseId;

class AttributeUseMvoStateEventId
{
    /**
     * @Type("_UNKNOWN_")
     */
    private $attributeSetAttributeUseId;

    /**
     * @return _UNKNOWN_
     */
    public function getAttributeSetAttributeUseId()
    {
        return $this->attributeSetAttributeUseId;
    }

    /**
     * @var _UNKNOWN_ $attributeSetAttributeUseId
     */
    public function setAttributeSetAttributeUseId($attributeSetAttributeUseId)
    {
        $this->attributeSetAttributeUseId = $attributeSetAttributeUseId;
    }

    /**
     * @Type("integer")
     */
    private $attributeSetVersion;

    /**
     * @return integer
     */
    public function getAttributeSetVersion()
    {
        return $this->attributeSetVersion;
    }

    /**
     * @var integer $attributeSetVersion
     */
    public function setAttributeSetVersion($attributeSetVersion)
    {
        $this->attributeSetVersion = $attributeSetVersion;
    }

}

