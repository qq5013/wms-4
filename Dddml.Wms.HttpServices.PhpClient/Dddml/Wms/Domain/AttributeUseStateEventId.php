<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class AttributeUseStateEventId implements StringIdInterface
{
    /**
     * @Type("string")
     */
    private $attributeSetId;

    /**
     * @return string
     */
    public function getAttributeSetId()
    {
        return $this->attributeSetId;
    }

    /**
     * @param string $attributeSetId
     */
    public function setAttributeSetId($attributeSetId)
    {
        $this->attributeSetId = $attributeSetId;
    }

    /**
     * @Type("string")
     */
    private $attributeId;

    /**
     * @return string
     */
    public function getAttributeId()
    {
        return $this->attributeId;
    }

    /**
     * @param string $attributeId
     */
    public function setAttributeId($attributeId)
    {
        $this->attributeId = $attributeId;
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
     * @var AttributeUseStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new AttributeUseStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return AttributeUseStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new AttributeUseStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toAttributeUseStateEventId();
    }


}

