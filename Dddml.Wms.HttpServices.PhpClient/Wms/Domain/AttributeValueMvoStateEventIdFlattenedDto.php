<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeValueMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeValueIdAttributeId' => 'string',
            'attributeValueIdValue' => 'string',
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
     * @var AttributeValueMvoStateEventId
     */
    private $value;

    /**
     * @param AttributeValueMvoStateEventId $value
     */
    public function __construct(AttributeValueMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeValueMvoStateEventId();
        }
    }

    /**
     * @return AttributeValueMvoStateEventId
     */
    public function toAttributeValueMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getAttributeValueIdAttributeId()
    {
        return $this->value->getAttributeValueId()->getAttributeId();
    }

    /**
     * @param string $attributeValueIdAttributeId
     */
    public function setAttributeValueIdAttributeId($attributeValueIdAttributeId)
    {
        $this->value->getAttributeValueId()->setAttributeId($attributeValueIdAttributeId);
    }

    /**
     * @return string
     */
    public function getAttributeValueIdValue()
    {
        return $this->value->getAttributeValueId()->getValue();
    }

    /**
     * @param string $attributeValueIdValue
     */
    public function setAttributeValueIdValue($attributeValueIdValue)
    {
        $this->value->getAttributeValueId()->setValue($attributeValueIdValue);
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
            $this->getAttributeValueIdAttributeId(),
            $this->getAttributeValueIdValue(),
            $this->getAttributeVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeValueMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeValueIdAttributeId($pValues[0]);
        $this->setAttributeValueIdValue($pValues[1]);
        $this->setAttributeVersion($pValues[2]);
        return $this;
    }

}

