<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'groupId' => 'string',
            'index' => 'string',
            'attributeSetInstanceExtensionFieldGroupVersion' => 'Long',
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
     * @var AttributeSetInstanceExtensionFieldStateEventId
     */
    private $value;

    /**
     * @param AttributeSetInstanceExtensionFieldStateEventId $value
     */
    public function __construct(AttributeSetInstanceExtensionFieldStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeSetInstanceExtensionFieldStateEventId();
        }
    }

    /**
     * @return AttributeSetInstanceExtensionFieldStateEventId
     */
    public function toAttributeSetInstanceExtensionFieldStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getGroupId()
    {
        return $this->value->getGroupId();
    }

    /**
     * @param string $groupId
     */
    public function setGroupId($groupId)
    {
        $this->value->setGroupId($groupId);
    }

    /**
     * @return string
     */
    public function getIndex()
    {
        return $this->value->getIndex();
    }

    /**
     * @param string $index
     */
    public function setIndex($index)
    {
        $this->value->setIndex($index);
    }

    /**
     * @return Long
     */
    public function getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return $this->value->getAttributeSetInstanceExtensionFieldGroupVersion();
    }

    /**
     * @param Long $attributeSetInstanceExtensionFieldGroupVersion
     */
    public function setAttributeSetInstanceExtensionFieldGroupVersion($attributeSetInstanceExtensionFieldGroupVersion)
    {
        $this->value->setAttributeSetInstanceExtensionFieldGroupVersion($attributeSetInstanceExtensionFieldGroupVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getGroupId(),
            $this->getIndex(),
            $this->getAttributeSetInstanceExtensionFieldGroupVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeSetInstanceExtensionFieldStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setGroupId($pValues[0]);
        $this->setIndex($pValues[1]);
        $this->setAttributeSetInstanceExtensionFieldGroupVersion($pValues[2]);
        return $this;
    }

}

