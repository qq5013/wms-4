<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeValueStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeId' => 'string',
            'value' => 'string',
            'attributeVersion' => 'Long',
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
     * @var AttributeValueStateEventId
     */
    private $value;

    /**
     * @param AttributeValueStateEventId $value
     */
    public function __construct(AttributeValueStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeValueStateEventId();
        }
    }

    /**
     * @return AttributeValueStateEventId
     */
    public function toAttributeValueStateEventId()
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

    /**
     * @return Long
     */
    public function getAttributeVersion()
    {
        return $this->value->getAttributeVersion();
    }

    /**
     * @param Long $attributeVersion
     */
    public function setAttributeVersion($attributeVersion)
    {
        $this->value->setAttributeVersion($attributeVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getAttributeId(),
            $this->getValue(),
            $this->getAttributeVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeValueStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeId($pValues[0]);
        $this->setValue($pValues[1]);
        $this->setAttributeVersion($pValues[2]);
        return $this;
    }

}

