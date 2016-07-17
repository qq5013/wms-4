<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeSetInstanceExtensionFieldId;
use Wms\Domain\AttributeSetInstanceExtensionField;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchAttributeSetInstanceExtensionFieldMvo extends AbstractAttributeSetInstanceExtensionFieldMvoCommand
{

    use AttributeSetInstanceExtensionFieldMvoIsPropertyRemovedTrait;

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
    private $type;

    /**
     * @return string
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * @param string $type
     */
    public function setType($type)
    {
        $this->type = $type;
    }

    /**
     * @Type("integer")
     */
    private $length;

    /**
     * @return integer
     */
    public function getLength()
    {
        return $this->length;
    }

    /**
     * @param integer $length
     */
    public function setLength($length)
    {
        $this->length = $length;
    }

    /**
     * @Type("string")
     */
    private $alias;

    /**
     * @return string
     */
    public function getAlias()
    {
        return $this->alias;
    }

    /**
     * @param string $alias
     */
    public function setAlias($alias)
    {
        $this->alias = $alias;
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
    private $attrSetInstEFGroupFieldType;

    /**
     * @return string
     */
    public function getAttrSetInstEFGroupFieldType()
    {
        return $this->attrSetInstEFGroupFieldType;
    }

    /**
     * @param string $attrSetInstEFGroupFieldType
     */
    public function setAttrSetInstEFGroupFieldType($attrSetInstEFGroupFieldType)
    {
        $this->attrSetInstEFGroupFieldType = $attrSetInstEFGroupFieldType;
    }

    /**
     * @Type("integer")
     */
    private $attrSetInstEFGroupFieldLength;

    /**
     * @return integer
     */
    public function getAttrSetInstEFGroupFieldLength()
    {
        return $this->attrSetInstEFGroupFieldLength;
    }

    /**
     * @param integer $attrSetInstEFGroupFieldLength
     */
    public function setAttrSetInstEFGroupFieldLength($attrSetInstEFGroupFieldLength)
    {
        $this->attrSetInstEFGroupFieldLength = $attrSetInstEFGroupFieldLength;
    }

    /**
     * @Type("integer")
     */
    private $attrSetInstEFGroupFieldCount;

    /**
     * @return integer
     */
    public function getAttrSetInstEFGroupFieldCount()
    {
        return $this->attrSetInstEFGroupFieldCount;
    }

    /**
     * @param integer $attrSetInstEFGroupFieldCount
     */
    public function setAttrSetInstEFGroupFieldCount($attrSetInstEFGroupFieldCount)
    {
        $this->attrSetInstEFGroupFieldCount = $attrSetInstEFGroupFieldCount;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEFGroupNameFormat;

    /**
     * @return string
     */
    public function getAttrSetInstEFGroupNameFormat()
    {
        return $this->attrSetInstEFGroupNameFormat;
    }

    /**
     * @param string $attrSetInstEFGroupNameFormat
     */
    public function setAttrSetInstEFGroupNameFormat($attrSetInstEFGroupNameFormat)
    {
        $this->attrSetInstEFGroupNameFormat = $attrSetInstEFGroupNameFormat;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEFGroupDescription;

    /**
     * @return string
     */
    public function getAttrSetInstEFGroupDescription()
    {
        return $this->attrSetInstEFGroupDescription;
    }

    /**
     * @param string $attrSetInstEFGroupDescription
     */
    public function setAttrSetInstEFGroupDescription($attrSetInstEFGroupDescription)
    {
        $this->attrSetInstEFGroupDescription = $attrSetInstEFGroupDescription;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEFGroupCreatedBy;

    /**
     * @return string
     */
    public function getAttrSetInstEFGroupCreatedBy()
    {
        return $this->attrSetInstEFGroupCreatedBy;
    }

    /**
     * @param string $attrSetInstEFGroupCreatedBy
     */
    public function setAttrSetInstEFGroupCreatedBy($attrSetInstEFGroupCreatedBy)
    {
        $this->attrSetInstEFGroupCreatedBy = $attrSetInstEFGroupCreatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attrSetInstEFGroupCreatedAt;

    /**
     * @return \DateTime
     */
    public function getAttrSetInstEFGroupCreatedAt()
    {
        return $this->attrSetInstEFGroupCreatedAt;
    }

    /**
     * @param \DateTime $attrSetInstEFGroupCreatedAt
     */
    public function setAttrSetInstEFGroupCreatedAt($attrSetInstEFGroupCreatedAt)
    {
        $this->attrSetInstEFGroupCreatedAt = $attrSetInstEFGroupCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEFGroupUpdatedBy;

    /**
     * @return string
     */
    public function getAttrSetInstEFGroupUpdatedBy()
    {
        return $this->attrSetInstEFGroupUpdatedBy;
    }

    /**
     * @param string $attrSetInstEFGroupUpdatedBy
     */
    public function setAttrSetInstEFGroupUpdatedBy($attrSetInstEFGroupUpdatedBy)
    {
        $this->attrSetInstEFGroupUpdatedBy = $attrSetInstEFGroupUpdatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attrSetInstEFGroupUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getAttrSetInstEFGroupUpdatedAt()
    {
        return $this->attrSetInstEFGroupUpdatedAt;
    }

    /**
     * @param \DateTime $attrSetInstEFGroupUpdatedAt
     */
    public function setAttrSetInstEFGroupUpdatedAt($attrSetInstEFGroupUpdatedAt)
    {
        $this->attrSetInstEFGroupUpdatedAt = $attrSetInstEFGroupUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $attrSetInstEFGroupActive;

    /**
     * @return boolean
     */
    public function getAttrSetInstEFGroupActive()
    {
        return $this->attrSetInstEFGroupActive;
    }

    /**
     * @param boolean $attrSetInstEFGroupActive
     */
    public function setAttrSetInstEFGroupActive($attrSetInstEFGroupActive)
    {
        $this->attrSetInstEFGroupActive = $attrSetInstEFGroupActive;
    }

    /**
     * @Type("boolean")
     */
    private $attrSetInstEFGroupDeleted;

    /**
     * @return boolean
     */
    public function getAttrSetInstEFGroupDeleted()
    {
        return $this->attrSetInstEFGroupDeleted;
    }

    /**
     * @param boolean $attrSetInstEFGroupDeleted
     */
    public function setAttrSetInstEFGroupDeleted($attrSetInstEFGroupDeleted)
    {
        $this->attrSetInstEFGroupDeleted = $attrSetInstEFGroupDeleted;
    }


}

