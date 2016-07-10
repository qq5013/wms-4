<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeSetInstanceExtensionField;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup extends AbstractAttributeSetInstanceExtensionFieldGroupCommand
{

    use AttributeSetInstanceExtensionFieldGroupIsPropertyRemovedTrait;

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
     * @Type("array<Wms\Domain\CreateOrMergePatchAttributeSetInstanceExtensionField>")
     * @var AttributeSetInstanceExtensionField[]
     */
    private $fields;

    /**
     * @return CreateOrMergePatchAttributeSetInstanceExtensionField[]
     */
    public function getFields()
    {
        return $this->fields;
    }	

    /**
     * @var CreateOrMergePatchAttributeSetInstanceExtensionField[] $fields
     */
    public function setFields($fields)
    {
        $this->fields = $fields;
    }


}

