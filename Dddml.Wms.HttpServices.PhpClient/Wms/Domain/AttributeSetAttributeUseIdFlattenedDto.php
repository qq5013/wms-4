<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class AttributeSetAttributeUseIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'attributeSetId',
            'attributeId',
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
     * @var AttributeSetAttributeUseId
     */
    private $value;

    public function __construct()
    {
        $this->value = new AttributeSetAttributeUseId();
    }

    /**
     * @return AttributeSetAttributeUseId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param AttributeSetAttributeUseId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
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


}

