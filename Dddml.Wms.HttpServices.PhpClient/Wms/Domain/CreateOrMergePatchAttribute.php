<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeValue;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchAttribute extends AbstractAttributeCommand
{

    use AttributeIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $name;

    /**
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @var string $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * @Type("string")
     */
    private $organizationId;

    /**
     * @return string
     */
    public function getOrganizationId()
    {
        return $this->organizationId;
    }

    /**
     * @var string $organizationId
     */
    public function setOrganizationId($organizationId)
    {
        $this->organizationId = $organizationId;
    }

    /**
     * @Type("string")
     */
    private $description;

    /**
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * @var string $description
     */
    public function setDescription($description)
    {
        $this->description = $description;
    }

    /**
     * @Type("boolean")
     */
    private $isMandatory;

    /**
     * @return boolean
     */
    public function getIsMandatory()
    {
        return $this->isMandatory;
    }

    /**
     * @var boolean $isMandatory
     */
    public function setIsMandatory($isMandatory)
    {
        $this->isMandatory = $isMandatory;
    }

    /**
     * @Type("boolean")
     */
    private $isInstanceAttribute;

    /**
     * @return boolean
     */
    public function getIsInstanceAttribute()
    {
        return $this->isInstanceAttribute;
    }

    /**
     * @var boolean $isInstanceAttribute
     */
    public function setIsInstanceAttribute($isInstanceAttribute)
    {
        $this->isInstanceAttribute = $isInstanceAttribute;
    }

    /**
     * @Type("string")
     */
    private $attributeValueType;

    /**
     * @return string
     */
    public function getAttributeValueType()
    {
        return $this->attributeValueType;
    }

    /**
     * @var string $attributeValueType
     */
    public function setAttributeValueType($attributeValueType)
    {
        $this->attributeValueType = $attributeValueType;
    }

    /**
     * @Type("integer")
     */
    private $attributeValueLength;

    /**
     * @return integer
     */
    public function getAttributeValueLength()
    {
        return $this->attributeValueLength;
    }

    /**
     * @var integer $attributeValueLength
     */
    public function setAttributeValueLength($attributeValueLength)
    {
        $this->attributeValueLength = $attributeValueLength;
    }

    /**
     * @Type("boolean")
     */
    private $isList;

    /**
     * @return boolean
     */
    public function getIsList()
    {
        return $this->isList;
    }

    /**
     * @var boolean $isList
     */
    public function setIsList($isList)
    {
        $this->isList = $isList;
    }

    /**
     * @Type("string")
     */
    private $fieldName;

    /**
     * @return string
     */
    public function getFieldName()
    {
        return $this->fieldName;
    }

    /**
     * @var string $fieldName
     */
    public function setFieldName($fieldName)
    {
        $this->fieldName = $fieldName;
    }

    /**
     * @Type("string")
     */
    private $referenceId;

    /**
     * @return string
     */
    public function getReferenceId()
    {
        return $this->referenceId;
    }

    /**
     * @var string $referenceId
     */
    public function setReferenceId($referenceId)
    {
        $this->referenceId = $referenceId;
    }

    /**
     * @Type("boolean")
     */
    private $active;

    /**
     * @return boolean
     */
    public function getActive()
    {
        return $this->active;
    }

    /**
     * @var boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }

    /**
     * @Type("array<Wms\Domain\CreateOrMergePatchAttributeValue>")
     * @var AttributeValue[]
     */
    private $attributeValues;

    /**
     * @return CreateOrMergePatchAttributeValue[]
     */
    public function getAttributeValues()
    {
        return $this->attributeValues;
    }	

    /**
     * @var CreateOrMergePatchAttributeValue[] $attributeValues
     */
    public function setAttributeValues($attributeValues)
    {
        $this->attributeValues = $attributeValues;
    }


}

