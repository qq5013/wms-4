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
     * @Type("long")
     */
    private $version;

    /**
     * @return long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param long $version
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
    private $attrSetInstEfGroupFieldType;

    /**
     * @return string
     */
    public function getAttrSetInstEfGroupFieldType()
    {
        return $this->attrSetInstEfGroupFieldType;
    }

    /**
     * @param string $attrSetInstEfGroupFieldType
     */
    public function setAttrSetInstEfGroupFieldType($attrSetInstEfGroupFieldType)
    {
        $this->attrSetInstEfGroupFieldType = $attrSetInstEfGroupFieldType;
    }

    /**
     * @Type("integer")
     */
    private $attrSetInstEfGroupFieldLength;

    /**
     * @return integer
     */
    public function getAttrSetInstEfGroupFieldLength()
    {
        return $this->attrSetInstEfGroupFieldLength;
    }

    /**
     * @param integer $attrSetInstEfGroupFieldLength
     */
    public function setAttrSetInstEfGroupFieldLength($attrSetInstEfGroupFieldLength)
    {
        $this->attrSetInstEfGroupFieldLength = $attrSetInstEfGroupFieldLength;
    }

    /**
     * @Type("integer")
     */
    private $attrSetInstEfGroupFieldCount;

    /**
     * @return integer
     */
    public function getAttrSetInstEfGroupFieldCount()
    {
        return $this->attrSetInstEfGroupFieldCount;
    }

    /**
     * @param integer $attrSetInstEfGroupFieldCount
     */
    public function setAttrSetInstEfGroupFieldCount($attrSetInstEfGroupFieldCount)
    {
        $this->attrSetInstEfGroupFieldCount = $attrSetInstEfGroupFieldCount;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEfGroupNameFormat;

    /**
     * @return string
     */
    public function getAttrSetInstEfGroupNameFormat()
    {
        return $this->attrSetInstEfGroupNameFormat;
    }

    /**
     * @param string $attrSetInstEfGroupNameFormat
     */
    public function setAttrSetInstEfGroupNameFormat($attrSetInstEfGroupNameFormat)
    {
        $this->attrSetInstEfGroupNameFormat = $attrSetInstEfGroupNameFormat;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEfGroupDescription;

    /**
     * @return string
     */
    public function getAttrSetInstEfGroupDescription()
    {
        return $this->attrSetInstEfGroupDescription;
    }

    /**
     * @param string $attrSetInstEfGroupDescription
     */
    public function setAttrSetInstEfGroupDescription($attrSetInstEfGroupDescription)
    {
        $this->attrSetInstEfGroupDescription = $attrSetInstEfGroupDescription;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEfGroupCreatedBy;

    /**
     * @return string
     */
    public function getAttrSetInstEfGroupCreatedBy()
    {
        return $this->attrSetInstEfGroupCreatedBy;
    }

    /**
     * @param string $attrSetInstEfGroupCreatedBy
     */
    public function setAttrSetInstEfGroupCreatedBy($attrSetInstEfGroupCreatedBy)
    {
        $this->attrSetInstEfGroupCreatedBy = $attrSetInstEfGroupCreatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attrSetInstEfGroupCreatedAt;

    /**
     * @return \DateTime
     */
    public function getAttrSetInstEfGroupCreatedAt()
    {
        return $this->attrSetInstEfGroupCreatedAt;
    }

    /**
     * @param \DateTime $attrSetInstEfGroupCreatedAt
     */
    public function setAttrSetInstEfGroupCreatedAt($attrSetInstEfGroupCreatedAt)
    {
        $this->attrSetInstEfGroupCreatedAt = $attrSetInstEfGroupCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $attrSetInstEfGroupUpdatedBy;

    /**
     * @return string
     */
    public function getAttrSetInstEfGroupUpdatedBy()
    {
        return $this->attrSetInstEfGroupUpdatedBy;
    }

    /**
     * @param string $attrSetInstEfGroupUpdatedBy
     */
    public function setAttrSetInstEfGroupUpdatedBy($attrSetInstEfGroupUpdatedBy)
    {
        $this->attrSetInstEfGroupUpdatedBy = $attrSetInstEfGroupUpdatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attrSetInstEfGroupUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getAttrSetInstEfGroupUpdatedAt()
    {
        return $this->attrSetInstEfGroupUpdatedAt;
    }

    /**
     * @param \DateTime $attrSetInstEfGroupUpdatedAt
     */
    public function setAttrSetInstEfGroupUpdatedAt($attrSetInstEfGroupUpdatedAt)
    {
        $this->attrSetInstEfGroupUpdatedAt = $attrSetInstEfGroupUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $attrSetInstEfGroupActive;

    /**
     * @return boolean
     */
    public function getAttrSetInstEfGroupActive()
    {
        return $this->attrSetInstEfGroupActive;
    }

    /**
     * @param boolean $attrSetInstEfGroupActive
     */
    public function setAttrSetInstEfGroupActive($attrSetInstEfGroupActive)
    {
        $this->attrSetInstEfGroupActive = $attrSetInstEfGroupActive;
    }

    /**
     * @Type("boolean")
     */
    private $attrSetInstEfGroupDeleted;

    /**
     * @return boolean
     */
    public function getAttrSetInstEfGroupDeleted()
    {
        return $this->attrSetInstEfGroupDeleted;
    }

    /**
     * @param boolean $attrSetInstEfGroupDeleted
     */
    public function setAttrSetInstEfGroupDeleted($attrSetInstEfGroupDeleted)
    {
        $this->attrSetInstEfGroupDeleted = $attrSetInstEfGroupDeleted;
    }


}

