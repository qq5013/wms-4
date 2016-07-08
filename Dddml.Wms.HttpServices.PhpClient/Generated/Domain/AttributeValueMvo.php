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


class AttributeValueMvo extends BaseEntity
{

    /**
     * @Type("_UNKNOWN_")
     */
    private $attributeValueId;

    /**
     * @return _UNKNOWN_
     */
    public function getAttributeValueId()
    {
        return $this->attributeValueId;
    }

    /**
     * @var _UNKNOWN_ $attributeValueId
     */
    public function setAttributeValueId($attributeValueId)
    {
        $this->attributeValueId = $attributeValueId;
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
     * @Type("string")
     */
    private $attributeName;

    /**
     * @return string
     */
    public function getAttributeName()
    {
        return $this->attributeName;
    }

    /**
     * @var string $attributeName
     */
    public function setAttributeName($attributeName)
    {
        $this->attributeName = $attributeName;
    }

    /**
     * @Type("string")
     */
    private $attributeOrganizationId;

    /**
     * @return string
     */
    public function getAttributeOrganizationId()
    {
        return $this->attributeOrganizationId;
    }

    /**
     * @var string $attributeOrganizationId
     */
    public function setAttributeOrganizationId($attributeOrganizationId)
    {
        $this->attributeOrganizationId = $attributeOrganizationId;
    }

    /**
     * @Type("string")
     */
    private $attributeDescription;

    /**
     * @return string
     */
    public function getAttributeDescription()
    {
        return $this->attributeDescription;
    }

    /**
     * @var string $attributeDescription
     */
    public function setAttributeDescription($attributeDescription)
    {
        $this->attributeDescription = $attributeDescription;
    }

    /**
     * @Type("boolean")
     */
    private $attributeIsMandatory;

    /**
     * @return boolean
     */
    public function getAttributeIsMandatory()
    {
        return $this->attributeIsMandatory;
    }

    /**
     * @var boolean $attributeIsMandatory
     */
    public function setAttributeIsMandatory($attributeIsMandatory)
    {
        $this->attributeIsMandatory = $attributeIsMandatory;
    }

    /**
     * @Type("boolean")
     */
    private $attributeIsInstanceAttribute;

    /**
     * @return boolean
     */
    public function getAttributeIsInstanceAttribute()
    {
        return $this->attributeIsInstanceAttribute;
    }

    /**
     * @var boolean $attributeIsInstanceAttribute
     */
    public function setAttributeIsInstanceAttribute($attributeIsInstanceAttribute)
    {
        $this->attributeIsInstanceAttribute = $attributeIsInstanceAttribute;
    }

    /**
     * @Type("string")
     */
    private $attributeAttributeValueType;

    /**
     * @return string
     */
    public function getAttributeAttributeValueType()
    {
        return $this->attributeAttributeValueType;
    }

    /**
     * @var string $attributeAttributeValueType
     */
    public function setAttributeAttributeValueType($attributeAttributeValueType)
    {
        $this->attributeAttributeValueType = $attributeAttributeValueType;
    }

    /**
     * @Type("integer")
     */
    private $attributeAttributeValueLength;

    /**
     * @return integer
     */
    public function getAttributeAttributeValueLength()
    {
        return $this->attributeAttributeValueLength;
    }

    /**
     * @var integer $attributeAttributeValueLength
     */
    public function setAttributeAttributeValueLength($attributeAttributeValueLength)
    {
        $this->attributeAttributeValueLength = $attributeAttributeValueLength;
    }

    /**
     * @Type("boolean")
     */
    private $attributeIsList;

    /**
     * @return boolean
     */
    public function getAttributeIsList()
    {
        return $this->attributeIsList;
    }

    /**
     * @var boolean $attributeIsList
     */
    public function setAttributeIsList($attributeIsList)
    {
        $this->attributeIsList = $attributeIsList;
    }

    /**
     * @Type("string")
     */
    private $attributeFieldName;

    /**
     * @return string
     */
    public function getAttributeFieldName()
    {
        return $this->attributeFieldName;
    }

    /**
     * @var string $attributeFieldName
     */
    public function setAttributeFieldName($attributeFieldName)
    {
        $this->attributeFieldName = $attributeFieldName;
    }

    /**
     * @Type("string")
     */
    private $attributeReferenceId;

    /**
     * @return string
     */
    public function getAttributeReferenceId()
    {
        return $this->attributeReferenceId;
    }

    /**
     * @var string $attributeReferenceId
     */
    public function setAttributeReferenceId($attributeReferenceId)
    {
        $this->attributeReferenceId = $attributeReferenceId;
    }

    /**
     * @Type("string")
     */
    private $attributeCreatedBy;

    /**
     * @return string
     */
    public function getAttributeCreatedBy()
    {
        return $this->attributeCreatedBy;
    }

    /**
     * @var string $attributeCreatedBy
     */
    public function setAttributeCreatedBy($attributeCreatedBy)
    {
        $this->attributeCreatedBy = $attributeCreatedBy;
    }

    /**
     * @Type("string")
     */
    private $attributeCreatedAt;

    /**
     * @return string
     */
    public function getAttributeCreatedAt()
    {
        return $this->attributeCreatedAt;
    }

    /**
     * @var string $attributeCreatedAt
     */
    public function setAttributeCreatedAt($attributeCreatedAt)
    {
        $this->attributeCreatedAt = $attributeCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $attributeUpdatedBy;

    /**
     * @return string
     */
    public function getAttributeUpdatedBy()
    {
        return $this->attributeUpdatedBy;
    }

    /**
     * @var string $attributeUpdatedBy
     */
    public function setAttributeUpdatedBy($attributeUpdatedBy)
    {
        $this->attributeUpdatedBy = $attributeUpdatedBy;
    }

    /**
     * @Type("string")
     */
    private $attributeUpdatedAt;

    /**
     * @return string
     */
    public function getAttributeUpdatedAt()
    {
        return $this->attributeUpdatedAt;
    }

    /**
     * @var string $attributeUpdatedAt
     */
    public function setAttributeUpdatedAt($attributeUpdatedAt)
    {
        $this->attributeUpdatedAt = $attributeUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $attributeActive;

    /**
     * @return boolean
     */
    public function getAttributeActive()
    {
        return $this->attributeActive;
    }

    /**
     * @var boolean $attributeActive
     */
    public function setAttributeActive($attributeActive)
    {
        $this->attributeActive = $attributeActive;
    }

    /**
     * @Type("boolean")
     */
    private $attributeDeleted;

    /**
     * @return boolean
     */
    public function getAttributeDeleted()
    {
        return $this->attributeDeleted;
    }

    /**
     * @var boolean $attributeDeleted
     */
    public function setAttributeDeleted($attributeDeleted)
    {
        $this->attributeDeleted = $attributeDeleted;
    }

    /**
     * @Type("integer")
     */
    private $attributeVersion;

    /**
     * @return integer
     */
    public function getAttributeVersion()
    {
        return $this->attributeVersion;
    }

    /**
     * @var integer $attributeVersion
     */
    public function setAttributeVersion($attributeVersion)
    {
        $this->attributeVersion = $attributeVersion;
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

}

