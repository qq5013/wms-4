<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeUseMvoIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertySequenceNumberRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertySequenceNumberRemoved()
    {
        return $this->isPropertySequenceNumberRemoved;
    }

    /**
     * @param boolean $isPropertySequenceNumberRemoved
     */
    public function setIsPropertySequenceNumberRemoved($isPropertySequenceNumberRemoved)
    {
        $this->isPropertySequenceNumberRemoved = $isPropertySequenceNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyVersionRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyVersionRemoved()
    {
        return $this->isPropertyVersionRemoved;
    }

    /**
     * @param boolean $isPropertyVersionRemoved
     */
    public function setIsPropertyVersionRemoved($isPropertyVersionRemoved)
    {
        $this->isPropertyVersionRemoved = $isPropertyVersionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyActiveRemoved()
    {
        return $this->isPropertyActiveRemoved;
    }

    /**
     * @param boolean $isPropertyActiveRemoved
     */
    public function setIsPropertyActiveRemoved($isPropertyActiveRemoved)
    {
        $this->isPropertyActiveRemoved = $isPropertyActiveRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetNameRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetNameRemoved()
    {
        return $this->isPropertyAttributeSetNameRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetNameRemoved
     */
    public function setIsPropertyAttributeSetNameRemoved($isPropertyAttributeSetNameRemoved)
    {
        $this->isPropertyAttributeSetNameRemoved = $isPropertyAttributeSetNameRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetOrganizationIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetOrganizationIdRemoved()
    {
        return $this->isPropertyAttributeSetOrganizationIdRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetOrganizationIdRemoved
     */
    public function setIsPropertyAttributeSetOrganizationIdRemoved($isPropertyAttributeSetOrganizationIdRemoved)
    {
        $this->isPropertyAttributeSetOrganizationIdRemoved = $isPropertyAttributeSetOrganizationIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetDescriptionRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetDescriptionRemoved()
    {
        return $this->isPropertyAttributeSetDescriptionRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetDescriptionRemoved
     */
    public function setIsPropertyAttributeSetDescriptionRemoved($isPropertyAttributeSetDescriptionRemoved)
    {
        $this->isPropertyAttributeSetDescriptionRemoved = $isPropertyAttributeSetDescriptionRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetSerialNumberAttributeIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetSerialNumberAttributeIdRemoved()
    {
        return $this->isPropertyAttributeSetSerialNumberAttributeIdRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetSerialNumberAttributeIdRemoved
     */
    public function setIsPropertyAttributeSetSerialNumberAttributeIdRemoved($isPropertyAttributeSetSerialNumberAttributeIdRemoved)
    {
        $this->isPropertyAttributeSetSerialNumberAttributeIdRemoved = $isPropertyAttributeSetSerialNumberAttributeIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetLotAttributeIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetLotAttributeIdRemoved()
    {
        return $this->isPropertyAttributeSetLotAttributeIdRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetLotAttributeIdRemoved
     */
    public function setIsPropertyAttributeSetLotAttributeIdRemoved($isPropertyAttributeSetLotAttributeIdRemoved)
    {
        $this->isPropertyAttributeSetLotAttributeIdRemoved = $isPropertyAttributeSetLotAttributeIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetReferenceIdRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetReferenceIdRemoved()
    {
        return $this->isPropertyAttributeSetReferenceIdRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetReferenceIdRemoved
     */
    public function setIsPropertyAttributeSetReferenceIdRemoved($isPropertyAttributeSetReferenceIdRemoved)
    {
        $this->isPropertyAttributeSetReferenceIdRemoved = $isPropertyAttributeSetReferenceIdRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetCreatedByRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetCreatedByRemoved()
    {
        return $this->isPropertyAttributeSetCreatedByRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetCreatedByRemoved
     */
    public function setIsPropertyAttributeSetCreatedByRemoved($isPropertyAttributeSetCreatedByRemoved)
    {
        $this->isPropertyAttributeSetCreatedByRemoved = $isPropertyAttributeSetCreatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetCreatedAtRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetCreatedAtRemoved()
    {
        return $this->isPropertyAttributeSetCreatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetCreatedAtRemoved
     */
    public function setIsPropertyAttributeSetCreatedAtRemoved($isPropertyAttributeSetCreatedAtRemoved)
    {
        $this->isPropertyAttributeSetCreatedAtRemoved = $isPropertyAttributeSetCreatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetUpdatedByRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetUpdatedByRemoved()
    {
        return $this->isPropertyAttributeSetUpdatedByRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetUpdatedByRemoved
     */
    public function setIsPropertyAttributeSetUpdatedByRemoved($isPropertyAttributeSetUpdatedByRemoved)
    {
        $this->isPropertyAttributeSetUpdatedByRemoved = $isPropertyAttributeSetUpdatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetUpdatedAtRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetUpdatedAtRemoved()
    {
        return $this->isPropertyAttributeSetUpdatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetUpdatedAtRemoved
     */
    public function setIsPropertyAttributeSetUpdatedAtRemoved($isPropertyAttributeSetUpdatedAtRemoved)
    {
        $this->isPropertyAttributeSetUpdatedAtRemoved = $isPropertyAttributeSetUpdatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetActiveRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetActiveRemoved()
    {
        return $this->isPropertyAttributeSetActiveRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetActiveRemoved
     */
    public function setIsPropertyAttributeSetActiveRemoved($isPropertyAttributeSetActiveRemoved)
    {
        $this->isPropertyAttributeSetActiveRemoved = $isPropertyAttributeSetActiveRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAttributeSetDeletedRemoved = null;

    /**
     * @return boolean
     */
    public function getIsPropertyAttributeSetDeletedRemoved()
    {
        return $this->isPropertyAttributeSetDeletedRemoved;
    }

    /**
     * @param boolean $isPropertyAttributeSetDeletedRemoved
     */
    public function setIsPropertyAttributeSetDeletedRemoved($isPropertyAttributeSetDeletedRemoved)
    {
        $this->isPropertyAttributeSetDeletedRemoved = $isPropertyAttributeSetDeletedRemoved;
    }


}

