<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class AttributeSetInstanceExtensionFieldMvoStateEventId implements StringIdInterface
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



    /**
     * @var AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return AttributeSetInstanceExtensionFieldMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toAttributeSetInstanceExtensionFieldMvoStateEventId();
    }


}

