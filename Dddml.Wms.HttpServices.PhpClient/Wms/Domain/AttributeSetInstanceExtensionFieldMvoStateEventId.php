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
     * @var AttributeSetInstanceExtensionFieldId $attributeSetInstanceExtensionFieldId
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

