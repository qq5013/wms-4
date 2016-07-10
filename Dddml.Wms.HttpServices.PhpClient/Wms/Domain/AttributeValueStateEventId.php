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
     * @var string $attributeId
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
     * @var string $value
     */
    public function setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @Type("integer")
     */
    private $attributeVersion;

    /**
     * @return integer
     */
    public function getAttributeVersion()
    {
        return $this->attributeVersion;
    }

    /**
     * @var integer $attributeVersion
     */
    public function setAttributeVersion($attributeVersion)
    {
        $this->attributeVersion = $attributeVersion;
    }

}

