<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class AttributeSetInstanceExtensionFieldId implements StringIdInterface
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
     * @var AttributeSetInstanceExtensionFieldIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new AttributeSetInstanceExtensionFieldIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return AttributeSetInstanceExtensionFieldId
     */
    public static function createFromString($idStr)
    {
        return (new AttributeSetInstanceExtensionFieldIdFlattenedDto())
            ->fromString($idStr)
            ->toAttributeSetInstanceExtensionFieldId();
    }


}

