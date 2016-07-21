<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class AttributeSetAttributeUseIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeSetId' => 'string',
            'attributeId' => 'string',
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
     * @var AttributeSetAttributeUseId
     */
    private $value;

    /**
     * @param AttributeSetAttributeUseId $value
     */
    public function __construct(AttributeSetAttributeUseId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeSetAttributeUseId();
        }
    }

    /**
     * @return AttributeSetAttributeUseId
     */
    public function toAttributeSetAttributeUseId()
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

    public function toString()
    {
        $pValues = [
            $this->getAttributeSetId(),
            $this->getAttributeId(),
        ];
        return implode(',', $pValues);
    }

    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeSetId($pValues[0]);
        $this->setAttributeId($pValues[1]);
    }

}

