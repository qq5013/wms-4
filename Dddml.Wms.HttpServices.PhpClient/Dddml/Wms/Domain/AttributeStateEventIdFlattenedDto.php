<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeId' => 'string',
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
     * @var AttributeStateEventId
     */
    private $value;

    /**
     * @param AttributeStateEventId $value
     */
    public function __construct(AttributeStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeStateEventId();
        }
    }

    /**
     * @return AttributeStateEventId
     */
    public function toAttributeStateEventId()
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
            $this->getAttributeId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

