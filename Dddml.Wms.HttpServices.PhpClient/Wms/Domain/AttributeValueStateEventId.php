<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class AttributeValueStateEventId
{
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
     * @Type("string")
     */
    private $value;

    /**
     * @return string
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * @param string $value
     */
    public function setValue($value)
    {
        $this->value = $value;
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

