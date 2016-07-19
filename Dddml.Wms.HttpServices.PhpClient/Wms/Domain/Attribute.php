<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class Attribute
{

    use AttributeStatePropertiesTrait;

    /**
     * @Type("array<Wms\Domain\AttributeValue>")
     * @var AttributeValue[]
     */
    private $attributeValues;

    /**
     * @return AttributeValue[]
     */
    public function getAttributeValues()
    {
        return $this->attributeValues;
    }	

    /**
     * @param AttributeValue[] $attributeValues
     */
    public function setAttributeValues($attributeValues)
    {
        $this->attributeValues = $attributeValues;
    }


}

