<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeUse;
use Wms\Domain\CommandTrait;

class AbstractAttributeSetCommand
{

    use CommandTrait;

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
     * @Type("long")
     */
    private $version;

    /**
     * @return long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }


}

