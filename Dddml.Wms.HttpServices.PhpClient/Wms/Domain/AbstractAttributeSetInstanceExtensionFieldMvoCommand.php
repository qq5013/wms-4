<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Wms\Domain\CommandTrait;

abstract class AbstractAttributeSetInstanceExtensionFieldMvoCommand implements CommandInterface
{

    use CommandTrait;

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

