<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class AttributeSetInstanceExtensionFieldIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'groupId' => 'string',
            'index' => 'string',
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
     * @var AttributeSetInstanceExtensionFieldId
     */
    private $value;

    /**
     * @param AttributeSetInstanceExtensionFieldId $value
     */
    public function __construct(AttributeSetInstanceExtensionFieldId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeSetInstanceExtensionFieldId();
        }
    }

    /**
     * @return AttributeSetInstanceExtensionFieldId
     */
    public function toAttributeSetInstanceExtensionFieldId()
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

    public function toString()
    {
        $pValues = [
            $this->getGroupId(),
            $this->getIndex(),
        ];
        return implode(',', $pValues);
    }

    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setGroupId($pValues[0]);
        $this->setIndex($pValues[1]);
    }

}

