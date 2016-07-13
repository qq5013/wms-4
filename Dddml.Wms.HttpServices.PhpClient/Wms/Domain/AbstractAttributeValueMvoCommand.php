<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeValueId;
use Wms\Domain\AttributeValue;
use Wms\Domain\CommandTrait;

class AbstractAttributeValueMvoCommand
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\AttributeValueId")
     */
    private $attributeValueId;

    /**
     * @return AttributeValueId
     */
    public function getAttributeValueId()
    {
        return $this->attributeValueId;
    }

    /**
     * @param AttributeValueId $attributeValueId
     */
    public function setAttributeValueId($attributeValueId)
    {
        $this->attributeValueId = $attributeValueId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $attributeVersion;

    /**
     * @return Long
     */
    public function getAttributeVersion()
    {
        return $this->attributeVersion;
    }

    /**
     * @param Long $attributeVersion
     */
    public function setAttributeVersion($attributeVersion)
    {
        $this->attributeVersion = $attributeVersion;
    }


}

