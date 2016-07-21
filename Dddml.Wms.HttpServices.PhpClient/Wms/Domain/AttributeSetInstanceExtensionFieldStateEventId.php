<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class AttributeSetInstanceExtensionFieldStateEventId implements StringIdInterface
{
    /**
     * @Type("string")
     */
    private $groupId;

    /**
     * @return string
     */
    public function getGroupId()
    {
        return $this->groupId;
    }

    /**
     * @param string $groupId
     */
    public function setGroupId($groupId)
    {
        $this->groupId = $groupId;
    }

    /**
     * @Type("string")
     */
    private $index;

    /**
     * @return string
     */
    public function getIndex()
    {
        return $this->index;
    }

    /**
     * @param string $index
     */
    public function setIndex($index)
    {
        $this->index = $index;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $attributeSetInstanceExtensionFieldGroupVersion;

    /**
     * @return Long
     */
    public function getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return $this->attributeSetInstanceExtensionFieldGroupVersion;
    }

    /**
     * @param Long $attributeSetInstanceExtensionFieldGroupVersion
     */
    public function setAttributeSetInstanceExtensionFieldGroupVersion($attributeSetInstanceExtensionFieldGroupVersion)
    {
        $this->attributeSetInstanceExtensionFieldGroupVersion = $attributeSetInstanceExtensionFieldGroupVersion;
    }



    /**
     * @var AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return AttributeSetInstanceExtensionFieldStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toAttributeSetInstanceExtensionFieldStateEventId();
    }


}

