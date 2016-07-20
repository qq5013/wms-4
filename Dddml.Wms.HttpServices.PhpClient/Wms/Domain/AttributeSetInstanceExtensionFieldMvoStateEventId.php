<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

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
        if(!$this->attributeSetInstanceExtensionFieldId) {
            $this->attributeSetInstanceExtensionFieldId = new AttributeSetInstanceExtensionFieldId(); 
        }
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
    private $attrSetInstEFGroupVersion;

    /**
     * @return Long
     */
    public function getAttrSetInstEFGroupVersion()
    {
        return $this->attrSetInstEFGroupVersion;
    }

    /**
     * @param Long $attrSetInstEFGroupVersion
     */
    public function setAttrSetInstEFGroupVersion($attrSetInstEFGroupVersion)
    {
        $this->attrSetInstEFGroupVersion = $attrSetInstEFGroupVersion;
    }

}

