<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeSetAttributeUseId;
use Wms\Domain\AttributeUse;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchAttributeUseMvo extends AbstractAttributeUseMvoCommand
{

    use AttributeUseMvoIsPropertyRemovedTrait;

    /**
     * @Type("integer")
     */
    private $sequenceNumber;

    /**
     * @return integer
     */
    public function getSequenceNumber()
    {
        return $this->sequenceNumber;
    }

    /**
     * @param integer $sequenceNumber
     */
    public function setSequenceNumber($sequenceNumber)
    {
        $this->sequenceNumber = $sequenceNumber;
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
    private $attributeSetName;

    /**
     * @return string
     */
    public function getAttributeSetName()
    {
        return $this->attributeSetName;
    }

    /**
     * @param string $attributeSetName
     */
    public function setAttributeSetName($attributeSetName)
    {
        $this->attributeSetName = $attributeSetName;
    }

    /**
     * @Type("string")
     */
    private $attributeSetOrganizationId;

    /**
     * @return string
     */
    public function getAttributeSetOrganizationId()
    {
        return $this->attributeSetOrganizationId;
    }

    /**
     * @param string $attributeSetOrganizationId
     */
    public function setAttributeSetOrganizationId($attributeSetOrganizationId)
    {
        $this->attributeSetOrganizationId = $attributeSetOrganizationId;
    }

    /**
     * @Type("string")
     */
    private $attributeSetDescription;

    /**
     * @return string
     */
    public function getAttributeSetDescription()
    {
        return $this->attributeSetDescription;
    }

    /**
     * @param string $attributeSetDescription
     */
    public function setAttributeSetDescription($attributeSetDescription)
    {
        $this->attributeSetDescription = $attributeSetDescription;
    }

    /**
     * @Type("string")
     */
    private $attributeSetSerialNumberAttributeId;

    /**
     * @return string
     */
    public function getAttributeSetSerialNumberAttributeId()
    {
        return $this->attributeSetSerialNumberAttributeId;
    }

    /**
     * @param string $attributeSetSerialNumberAttributeId
     */
    public function setAttributeSetSerialNumberAttributeId($attributeSetSerialNumberAttributeId)
    {
        $this->attributeSetSerialNumberAttributeId = $attributeSetSerialNumberAttributeId;
    }

    /**
     * @Type("string")
     */
    private $attributeSetLotAttributeId;

    /**
     * @return string
     */
    public function getAttributeSetLotAttributeId()
    {
        return $this->attributeSetLotAttributeId;
    }

    /**
     * @param string $attributeSetLotAttributeId
     */
    public function setAttributeSetLotAttributeId($attributeSetLotAttributeId)
    {
        $this->attributeSetLotAttributeId = $attributeSetLotAttributeId;
    }

    /**
     * @Type("string")
     */
    private $attributeSetReferenceId;

    /**
     * @return string
     */
    public function getAttributeSetReferenceId()
    {
        return $this->attributeSetReferenceId;
    }

    /**
     * @param string $attributeSetReferenceId
     */
    public function setAttributeSetReferenceId($attributeSetReferenceId)
    {
        $this->attributeSetReferenceId = $attributeSetReferenceId;
    }

    /**
     * @Type("string")
     */
    private $attributeSetCreatedBy;

    /**
     * @return string
     */
    public function getAttributeSetCreatedBy()
    {
        return $this->attributeSetCreatedBy;
    }

    /**
     * @param string $attributeSetCreatedBy
     */
    public function setAttributeSetCreatedBy($attributeSetCreatedBy)
    {
        $this->attributeSetCreatedBy = $attributeSetCreatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attributeSetCreatedAt;

    /**
     * @return \DateTime
     */
    public function getAttributeSetCreatedAt()
    {
        return $this->attributeSetCreatedAt;
    }

    /**
     * @param \DateTime $attributeSetCreatedAt
     */
    public function setAttributeSetCreatedAt($attributeSetCreatedAt)
    {
        $this->attributeSetCreatedAt = $attributeSetCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $attributeSetUpdatedBy;

    /**
     * @return string
     */
    public function getAttributeSetUpdatedBy()
    {
        return $this->attributeSetUpdatedBy;
    }

    /**
     * @param string $attributeSetUpdatedBy
     */
    public function setAttributeSetUpdatedBy($attributeSetUpdatedBy)
    {
        $this->attributeSetUpdatedBy = $attributeSetUpdatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $attributeSetUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getAttributeSetUpdatedAt()
    {
        return $this->attributeSetUpdatedAt;
    }

    /**
     * @param \DateTime $attributeSetUpdatedAt
     */
    public function setAttributeSetUpdatedAt($attributeSetUpdatedAt)
    {
        $this->attributeSetUpdatedAt = $attributeSetUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $attributeSetActive;

    /**
     * @return boolean
     */
    public function getAttributeSetActive()
    {
        return $this->attributeSetActive;
    }

    /**
     * @param boolean $attributeSetActive
     */
    public function setAttributeSetActive($attributeSetActive)
    {
        $this->attributeSetActive = $attributeSetActive;
    }

    /**
     * @Type("boolean")
     */
    private $attributeSetDeleted;

    /**
     * @return boolean
     */
    public function getAttributeSetDeleted()
    {
        return $this->attributeSetDeleted;
    }

    /**
     * @param boolean $attributeSetDeleted
     */
    public function setAttributeSetDeleted($attributeSetDeleted)
    {
        $this->attributeSetDeleted = $attributeSetDeleted;
    }


}

