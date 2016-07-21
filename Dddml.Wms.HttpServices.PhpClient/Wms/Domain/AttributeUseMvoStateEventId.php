<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class AttributeUseMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Wms\Domain\AttributeSetAttributeUseId")
     */
    private $attributeSetAttributeUseId;

    /**
     * @return AttributeSetAttributeUseId
     */
    public function getAttributeSetAttributeUseId()
    {
        if(!$this->attributeSetAttributeUseId) {
            $this->attributeSetAttributeUseId = new AttributeSetAttributeUseId(); 
        }
        return $this->attributeSetAttributeUseId;
    }

    /**
     * @param AttributeSetAttributeUseId $attributeSetAttributeUseId
     */
    public function setAttributeSetAttributeUseId($attributeSetAttributeUseId)
    {
        $this->attributeSetAttributeUseId = $attributeSetAttributeUseId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $attributeSetVersion;

    /**
     * @return Long
     */
    public function getAttributeSetVersion()
    {
        return $this->attributeSetVersion;
    }

    /**
     * @param Long $attributeSetVersion
     */
    public function setAttributeSetVersion($attributeSetVersion)
    {
        $this->attributeSetVersion = $attributeSetVersion;
    }



    /**
     * @var AttributeUseMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new AttributeUseMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return AttributeUseMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new AttributeUseMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toAttributeUseMvoStateEventId();
    }


}

