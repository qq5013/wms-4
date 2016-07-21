<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class AttributeSetInstanceExtensionFieldGroupStateEventId implements StringIdInterface
{
    /**
     * @Type("string")
     */
    private $id;

    /**
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @param string $id
     */
    public function setId($id)
    {
        $this->id = $id;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }



    /**
     * @var AttributeSetInstanceExtensionFieldGroupStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new AttributeSetInstanceExtensionFieldGroupStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return AttributeSetInstanceExtensionFieldGroupStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new AttributeSetInstanceExtensionFieldGroupStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toAttributeSetInstanceExtensionFieldGroupStateEventId();
    }


}

