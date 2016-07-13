<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeSetInstanceExtensionFieldId;

class AttributeSetInstanceExtensionFieldMvoStateEventId
{
    /**
     * @Type("Wms\Domain\AttributeSetInstanceExtensionFieldId")
     */
    private $attributeSetInstanceExtensionFieldId;

    /**
     * @return AttributeSetInstanceExtensionFieldId
     */
    public function getAttributeSetInstanceExtensionFieldId()
    {
        return $this->attributeSetInstanceExtensionFieldId;
    }

    /**
     * @param AttributeSetInstanceExtensionFieldId $attributeSetInstanceExtensionFieldId
     */
    public function setAttributeSetInstanceExtensionFieldId($attributeSetInstanceExtensionFieldId)
    {
        $this->attributeSetInstanceExtensionFieldId = $attributeSetInstanceExtensionFieldId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $attrSetInstEfGroupVersion;

    /**
     * @return Long
     */
    public function getAttrSetInstEfGroupVersion()
    {
        return $this->attrSetInstEfGroupVersion;
    }

    /**
     * @param Long $attrSetInstEfGroupVersion
     */
    public function setAttrSetInstEfGroupVersion($attrSetInstEfGroupVersion)
    {
        $this->attrSetInstEfGroupVersion = $attrSetInstEfGroupVersion;
    }

}

