<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeUseStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeSetId' => 'string',
            'attributeId' => 'string',
            'attributeSetVersion' => 'Long',
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
     * @var AttributeUseStateEventId
     */
    private $value;

    /**
     * @param AttributeUseStateEventId $value
     */
    public function __construct(AttributeUseStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeUseStateEventId();
        }
    }

    /**
     * @return AttributeUseStateEventId
     */
    public function toAttributeUseStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getAttributeSetId()
    {
        return $this->value->getAttributeSetId();
    }

    /**
     * @param string $attributeSetId
     */
    public function setAttributeSetId($attributeSetId)
    {
        $this->value->setAttributeSetId($attributeSetId);
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
     * @return Long
     */
    public function getAttributeSetVersion()
    {
        return $this->value->getAttributeSetVersion();
    }

    /**
     * @param Long $attributeSetVersion
     */
    public function setAttributeSetVersion($attributeSetVersion)
    {
        $this->value->setAttributeSetVersion($attributeSetVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getAttributeSetId(),
            $this->getAttributeId(),
            $this->getAttributeSetVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeUseStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeSetId($pValues[0]);
        $this->setAttributeId($pValues[1]);
        $this->setAttributeSetVersion($pValues[2]);
        return $this;
    }

}

