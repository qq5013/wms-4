<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'attributeSetInstanceExtensionFieldIdGroupId' => 'string',
            'attributeSetInstanceExtensionFieldIdIndex' => 'string',
            'attrSetInstEFGroupVersion' => 'Long',
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
     * @var AttributeSetInstanceExtensionFieldMvoStateEventId
     */
    private $value;

    /**
     * @param AttributeSetInstanceExtensionFieldMvoStateEventId $value
     */
    public function __construct(AttributeSetInstanceExtensionFieldMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AttributeSetInstanceExtensionFieldMvoStateEventId();
        }
    }

    /**
     * @return AttributeSetInstanceExtensionFieldMvoStateEventId
     */
    public function toAttributeSetInstanceExtensionFieldMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getAttributeSetInstanceExtensionFieldIdGroupId()
    {
        return $this->value->getAttributeSetInstanceExtensionFieldId()->getGroupId();
    }

    /**
     * @param string $attributeSetInstanceExtensionFieldIdGroupId
     */
    public function setAttributeSetInstanceExtensionFieldIdGroupId($attributeSetInstanceExtensionFieldIdGroupId)
    {
        $this->value->getAttributeSetInstanceExtensionFieldId()->setGroupId($attributeSetInstanceExtensionFieldIdGroupId);
    }

    /**
     * @return string
     */
    public function getAttributeSetInstanceExtensionFieldIdIndex()
    {
        return $this->value->getAttributeSetInstanceExtensionFieldId()->getIndex();
    }

    /**
     * @param string $attributeSetInstanceExtensionFieldIdIndex
     */
    public function setAttributeSetInstanceExtensionFieldIdIndex($attributeSetInstanceExtensionFieldIdIndex)
    {
        $this->value->getAttributeSetInstanceExtensionFieldId()->setIndex($attributeSetInstanceExtensionFieldIdIndex);
    }

    /**
     * @return Long
     */
    public function getAttrSetInstEFGroupVersion()
    {
        return $this->value->getAttrSetInstEFGroupVersion();
    }

    /**
     * @param Long $attrSetInstEFGroupVersion
     */
    public function setAttrSetInstEFGroupVersion($attrSetInstEFGroupVersion)
    {
        $this->value->setAttrSetInstEFGroupVersion($attrSetInstEFGroupVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getAttributeSetInstanceExtensionFieldIdGroupId(),
            $this->getAttributeSetInstanceExtensionFieldIdIndex(),
            $this->getAttrSetInstEFGroupVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AttributeSetInstanceExtensionFieldMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setAttributeSetInstanceExtensionFieldIdGroupId($pValues[0]);
        $this->setAttributeSetInstanceExtensionFieldIdIndex($pValues[1]);
        $this->setAttrSetInstEFGroupVersion($pValues[2]);
        return $this;
    }

}

