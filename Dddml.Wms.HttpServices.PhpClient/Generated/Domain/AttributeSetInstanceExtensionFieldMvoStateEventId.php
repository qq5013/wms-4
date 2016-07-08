<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\AttributeSetInstanceExtensionField;
use Dddml\Wms\Domain\AttributeSetInstanceExtensionFieldId;

class AttributeSetInstanceExtensionFieldMvoStateEventId
{
    /**
     * @Type("_UNKNOWN_")
     */
    private $attributeSetInstanceExtensionFieldId;

    /**
     * @return _UNKNOWN_
     */
    public function getAttributeSetInstanceExtensionFieldId()
    {
        return $this->attributeSetInstanceExtensionFieldId;
    }

    /**
     * @var _UNKNOWN_ $attributeSetInstanceExtensionFieldId
     */
    public function setAttributeSetInstanceExtensionFieldId($attributeSetInstanceExtensionFieldId)
    {
        $this->attributeSetInstanceExtensionFieldId = $attributeSetInstanceExtensionFieldId;
    }

    /**
     * @Type("integer")
     */
    private $attrSetInstEfGroupVersion;

    /**
     * @return integer
     */
    public function getAttrSetInstEfGroupVersion()
    {
        return $this->attrSetInstEfGroupVersion;
    }

    /**
     * @var integer $attrSetInstEfGroupVersion
     */
    public function setAttrSetInstEfGroupVersion($attrSetInstEfGroupVersion)
    {
        $this->attrSetInstEfGroupVersion = $attrSetInstEfGroupVersion;
    }

}

