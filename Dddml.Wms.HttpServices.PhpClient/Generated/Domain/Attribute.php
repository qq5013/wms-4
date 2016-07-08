<?php

namespace Dddml\Wms\Domain;

use Dddml\BaseEntity;
use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\AttributeValue;
use Dddml\Wms\Domain\AttributeValueId;


class Attribute extends BaseEntity
{

    /**
     * @Type("string")
     */
    private $attributeId;

    /**
     * @return string
     */
    public function getAttributeId()
    {
        return $this->attributeId;
    }

    /**
     * @var string $attributeId
     */
    public function setAttributeId($attributeId)
    {
        $this->attributeId = $attributeId;
    }

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
     * @Type("integer")
     */
    private $version;

    /**
     * @return integer
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @var integer $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }

    /**
     * @Type("string")
     */
    private $createdBy;

    /**
     * @return string
     */
    public function getCreatedBy()
    {
        return $this->createdBy;
    }

    /**
     * @var string $createdBy
     */
    public function setCreatedBy($createdBy)
    {
        $this->createdBy = $createdBy;
    }

    /**
     * @Type("string")
     */
    private $createdAt;

    /**
     * @return string
     */
    public function getCreatedAt()
    {
        return $this->createdAt;
    }

    /**
     * @var string $createdAt
     */
    public function setCreatedAt($createdAt)
    {
        $this->createdAt = $createdAt;
    }

    /**
     * @Type("string")
     */
    private $updatedBy;

    /**
     * @return string
     */
    public function getUpdatedBy()
    {
        return $this->updatedBy;
    }

    /**
     * @var string $updatedBy
     */
    public function setUpdatedBy($updatedBy)
    {
        $this->updatedBy = $updatedBy;
    }

    /**
     * @Type("string")
     */
    private $updatedAt;

    /**
     * @return string
     */
    public function getUpdatedAt()
    {
        return $this->updatedAt;
    }

    /**
     * @var string $updatedAt
     */
    public function setUpdatedAt($updatedAt)
    {
        $this->updatedAt = $updatedAt;
    }

    /**
     * @Type("array<_UNKNOWN_>")
     * @var _UNKNOWN_[]
     */
    private $attributeValues;

    /**
     * @return _UNKNOWN_[]
     */
    public function getAttributeValues()
    {
        return $this->attributeValues;
    }	

    /**
     * @var _UNKNOWN_[] $attributeValues
     */
    public function setAttributeValues($attributeValues)
    {
        $this->attributeValues = $attributeValues;
    }

}

