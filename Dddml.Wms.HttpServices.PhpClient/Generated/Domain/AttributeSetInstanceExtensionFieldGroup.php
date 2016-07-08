<?php

namespace Dddml\Wms\Domain;

use Dddml\BaseEntity;
use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\AttributeSetInstanceExtensionField;
use Dddml\Wms\Domain\AttributeSetInstanceExtensionFieldId;


class AttributeSetInstanceExtensionFieldGroup extends BaseEntity
{

    /**
     * @Type("string")
     */
    private $id;

    /**
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @var string $id
     */
    public function setId($id)
    {
        $this->id = $id;
    }

    /**
     * @Type("string")
     */
    private $fieldType;

    /**
     * @return string
     */
    public function getFieldType()
    {
        return $this->fieldType;
    }

    /**
     * @var string $fieldType
     */
    public function setFieldType($fieldType)
    {
        $this->fieldType = $fieldType;
    }

    /**
     * @Type("integer")
     */
    private $fieldLength;

    /**
     * @return integer
     */
    public function getFieldLength()
    {
        return $this->fieldLength;
    }

    /**
     * @var integer $fieldLength
     */
    public function setFieldLength($fieldLength)
    {
        $this->fieldLength = $fieldLength;
    }

    /**
     * @Type("integer")
     */
    private $fieldCount;

    /**
     * @return integer
     */
    public function getFieldCount()
    {
        return $this->fieldCount;
    }

    /**
     * @var integer $fieldCount
     */
    public function setFieldCount($fieldCount)
    {
        $this->fieldCount = $fieldCount;
    }

    /**
     * @Type("string")
     */
    private $nameFormat;

    /**
     * @return string
     */
    public function getNameFormat()
    {
        return $this->nameFormat;
    }

    /**
     * @var string $nameFormat
     */
    public function setNameFormat($nameFormat)
    {
        $this->nameFormat = $nameFormat;
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
    private $fields;

    /**
     * @return _UNKNOWN_[]
     */
    public function getFields()
    {
        return $this->fields;
    }	

    /**
     * @var _UNKNOWN_[] $fields
     */
    public function setFields($fields)
    {
        $this->fields = $fields;
    }

}

