<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeUseMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeSetAttributeUseIdAttributeSetId' => 'string',
            'attributeSetAttributeUseIdAttributeId' => 'string',
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
     * @var AttributeUseMvoStateEventId
     */
    private $value;

    /**
     * @param AttributeUseMvoStateEventId $value
     */
    public function __construct(AttributeUseMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeUseMvoStateEventId();
        }
    }

    /**
     * @return AttributeUseMvoStateEventId
     */
    public function toAttributeUseMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getAttributeSetAttributeUseIdAttributeSetId()
    {
        return $this->value->getAttributeSetAttributeUseId()->getAttributeSetId();
    }

    /**
     * @param string $attributeSetAttributeUseIdAttributeSetId
     */
    public function setAttributeSetAttributeUseIdAttributeSetId($attributeSetAttributeUseIdAttributeSetId)
    {
        $this->value->getAttributeSetAttributeUseId()->setAttributeSetId($attributeSetAttributeUseIdAttributeSetId);
    }

    /**
     * @return string
     */
    public function getAttributeSetAttributeUseIdAttributeId()
    {
        return $this->value->getAttributeSetAttributeUseId()->getAttributeId();
    }

    /**
     * @param string $attributeSetAttributeUseIdAttributeId
     */
    public function setAttributeSetAttributeUseIdAttributeId($attributeSetAttributeUseIdAttributeId)
    {
        $this->value->getAttributeSetAttributeUseId()->setAttributeId($attributeSetAttributeUseIdAttributeId);
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
            $this->getAttributeSetAttributeUseIdAttributeSetId(),
            $this->getAttributeSetAttributeUseIdAttributeId(),
            $this->getAttributeSetVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeUseMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeSetAttributeUseIdAttributeSetId($pValues[0]);
        $this->setAttributeSetAttributeUseIdAttributeId($pValues[1]);
        $this->setAttributeSetVersion($pValues[2]);
        return $this;
    }

}

