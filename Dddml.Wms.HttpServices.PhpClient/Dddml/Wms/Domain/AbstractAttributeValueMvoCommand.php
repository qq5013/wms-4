<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractAttributeValueMvoCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Dddml\Wms\Domain\AttributeValueId")
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

