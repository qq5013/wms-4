<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeValueId;
use Wms\Domain\AttributeValue;


trait AttributeValueMvoStatePropertiesTrait
{

    /**
     * @Type("Wms\Domain\AttributeValueId")
     */
    private $attributeValueId;

    /**
     * @return AttributeValueId
     */
    public function getAttributeValueId()
    {
        return $this->attributeValueId;
    }

    /**
     * @param AttributeValueId $attributeValueId
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
     * @param string $name
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
     * @param string $description
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
     * @param string $referenceId
     */
    public function setReferenceId($referenceId)
    {
        $this->referenceId = $referenceId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
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
     * @param boolean $active
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
     * @param string $attributeName
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
     * @param string $attributeOrganizationId
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
     * @param string $attributeDescription
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
     * @param boolean $attributeIsMandatory
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
     * @param boolean $attributeIsInstanceAttribute
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
     * @param string $attributeAttributeValueType
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
     * @param integer $attributeAttributeValueLength
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
     * @param boolean $attributeIsList
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
     * @param string $attributeFieldName
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
     * @param string $attributeReferenceId
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
     * @param string $attributeCreatedBy
     */
    public function setAttributeCreatedBy($attributeCreatedBy)
    {
        $this->attributeCreatedBy = $attributeCreatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attributeCreatedAt;

    /**
     * @return \DateTime
     */
    public function getAttributeCreatedAt()
    {
        return $this->attributeCreatedAt;
    }

    /**
     * @param \DateTime $attributeCreatedAt
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
     * @param string $attributeUpdatedBy
     */
    public function setAttributeUpdatedBy($attributeUpdatedBy)
    {
        $this->attributeUpdatedBy = $attributeUpdatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attributeUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getAttributeUpdatedAt()
    {
        return $this->attributeUpdatedAt;
    }

    /**
     * @param \DateTime $attributeUpdatedAt
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
     * @param boolean $attributeActive
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
     * @param boolean $attributeDeleted
     */
    public function setAttributeDeleted($attributeDeleted)
    {
        $this->attributeDeleted = $attributeDeleted;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $attributeVersion;

    /**
     * @return Long
     */
    public function getAttributeVersion()
    {
        return $this->attributeVersion;
    }

    /**
     * @param Long $attributeVersion
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
     * @param string $createdBy
     */
    public function setCreatedBy($createdBy)
    {
        $this->createdBy = $createdBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $createdAt;

    /**
     * @return \DateTime
     */
    public function getCreatedAt()
    {
        return $this->createdAt;
    }

    /**
     * @param \DateTime $createdAt
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
     * @param string $updatedBy
     */
    public function setUpdatedBy($updatedBy)
    {
        $this->updatedBy = $updatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $updatedAt;

    /**
     * @return \DateTime
     */
    public function getUpdatedAt()
    {
        return $this->updatedAt;
    }

    /**
     * @param \DateTime $updatedAt
     */
    public function setUpdatedAt($updatedAt)
    {
        $this->updatedAt = $updatedAt;
    }


}

