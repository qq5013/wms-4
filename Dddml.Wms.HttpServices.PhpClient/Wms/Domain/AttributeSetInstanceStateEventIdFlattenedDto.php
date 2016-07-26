<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeSetInstanceStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeSetInstanceId' => 'string',
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
     * @var AttributeSetInstanceStateEventId
     */
    private $value;

    /**
     * @param AttributeSetInstanceStateEventId $value
     */
    public function __construct(AttributeSetInstanceStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeSetInstanceStateEventId();
        }
    }

    /**
     * @return AttributeSetInstanceStateEventId
     */
    public function toAttributeSetInstanceStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getAttributeSetInstanceId()
    {
        return $this->value->getAttributeSetInstanceId();
    }

    /**
     * @param string $attributeSetInstanceId
     */
    public function setAttributeSetInstanceId($attributeSetInstanceId)
    {
        $this->value->setAttributeSetInstanceId($attributeSetInstanceId);
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
            $this->getAttributeSetInstanceId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeSetInstanceStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeSetInstanceId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

