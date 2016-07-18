<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class AttributeValueIdFlattenedDto
{

    const PROPERTIES = [
            'attributeId' => 'string',
            'value' => 'string',
        ];

    public static function getPropertyNames()
    {
        return array_keys(static::PROPERTIES);
    }

    public static function getPropertyTypes()
    {
        return array_values(static::PROPERTIES);
    }

	
    /**
     * @var AttributeValueId
     */
    private $value;

    /**
     * @param AttributeValueId $value
     */
    public function __construct(AttributeValueId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeValueId();
        }
    }

    /**
     * @return AttributeValueId
     */
    public function toAttributeValueId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getAttributeId()
    {
        return $this->value->getAttributeId();
    }

    /**
     * @param string $attributeId
     */
    public function setAttributeId($attributeId)
    {
        $this->value->setAttributeId($attributeId);
    }

    /**
     * @return string
     */
    public function getValue()
    {
        return $this->value->getValue();
    }

    /**
     * @param string $value
     */
    public function setValue($value)
    {
        $this->value->setValue($value);
    }


}

