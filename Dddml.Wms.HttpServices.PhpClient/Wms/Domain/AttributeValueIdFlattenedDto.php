<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class AttributeValueIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'attributeId',
            'value',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'string',
        ];
    }
	
    /**
     * @var AttributeValueId
     */
    private $value;

    public function __construct()
    {
        $this->value = new AttributeValueId();
    }

    /**
     * @return AttributeValueId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param AttributeValueId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
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
     * @return string
     */
    public function getValue()
    {
        return $this->value->getValue();
    }

    /**
     * @param string $value
     */
    public function setValue($value)
    {
        $this->value->setValue($value);
    }


}

