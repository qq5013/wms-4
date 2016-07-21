<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeSetStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeSetId' => 'string',
            'version' => 'Long',
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
     * @var AttributeSetStateEventId
     */
    private $value;

    /**
     * @param AttributeSetStateEventId $value
     */
    public function __construct(AttributeSetStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeSetStateEventId();
        }
    }

    /**
     * @return AttributeSetStateEventId
     */
    public function toAttributeSetStateEventId()
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
     * @return Long
     */
    public function getVersion()
    {
        return $this->value->getVersion();
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->value->setVersion($version);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getAttributeSetId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeSetStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeSetId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

