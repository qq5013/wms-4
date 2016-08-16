<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;


trait YearPlanMvoStatePropertiesTrait
{

    /**
     * @Type("Dddml\Wms\Domain\YearPlanId")
     */
    private $yearPlanId;

    /**
     * @return YearPlanId
     */
    public function getYearPlanId()
    {
        return $this->yearPlanId;
    }

    /**
     * @param YearPlanId $yearPlanId
     */
    public function setYearPlanId($yearPlanId)
    {
        $this->yearPlanId = $yearPlanId;
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
     * @Type("DateTime")
     */
    private $personBirthDate;

    /**
     * @return \DateTime
     */
    public function getPersonBirthDate()
    {
        return $this->personBirthDate;
    }

    /**
     * @param \DateTime $personBirthDate
     */
    public function setPersonBirthDate($personBirthDate)
    {
        $this->personBirthDate = $personBirthDate;
    }

    /**
     * @Type("Dddml\Wms\Domain\PersonalName")
     */
    private $personLoves;

    /**
     * @return PersonalName
     */
    public function getPersonLoves()
    {
        return $this->personLoves;
    }

    /**
     * @param PersonalName $personLoves
     */
    public function setPersonLoves($personLoves)
    {
        $this->personLoves = $personLoves;
    }

    /**
     * @Type("string")
     */
    private $personCreatedBy;

    /**
     * @return string
     */
    public function getPersonCreatedBy()
    {
        return $this->personCreatedBy;
    }

    /**
     * @param string $personCreatedBy
     */
    public function setPersonCreatedBy($personCreatedBy)
    {
        $this->personCreatedBy = $personCreatedBy;
    }

    /**
     * @Type("DateTime")
     */
    private $personCreatedAt;

    /**
     * @return \DateTime
     */
    public function getPersonCreatedAt()
    {
        return $this->personCreatedAt;
    }

    /**
     * @param \DateTime $personCreatedAt
     */
    public function setPersonCreatedAt($personCreatedAt)
    {
        $this->personCreatedAt = $personCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $personUpdatedBy;

    /**
     * @return string
     */
    public function getPersonUpdatedBy()
    {
        return $this->personUpdatedBy;
    }

    /**
     * @param string $personUpdatedBy
     */
    public function setPersonUpdatedBy($personUpdatedBy)
    {
        $this->personUpdatedBy = $personUpdatedBy;
    }

    /**
     * @Type("DateTime")
     */
    private $personUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getPersonUpdatedAt()
    {
        return $this->personUpdatedAt;
    }

    /**
     * @param \DateTime $personUpdatedAt
     */
    public function setPersonUpdatedAt($personUpdatedAt)
    {
        $this->personUpdatedAt = $personUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $personActive;

    /**
     * @return boolean
     */
    public function getPersonActive()
    {
        return $this->personActive;
    }

    /**
     * @param boolean $personActive
     */
    public function setPersonActive($personActive)
    {
        $this->personActive = $personActive;
    }

    /**
     * @Type("boolean")
     */
    private $personDeleted;

    /**
     * @return boolean
     */
    public function getPersonDeleted()
    {
        return $this->personDeleted;
    }

    /**
     * @param boolean $personDeleted
     */
    public function setPersonDeleted($personDeleted)
    {
        $this->personDeleted = $personDeleted;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $personVersion;

    /**
     * @return Long
     */
    public function getPersonVersion()
    {
        return $this->personVersion;
    }

    /**
     * @param Long $personVersion
     */
    public function setPersonVersion($personVersion)
    {
        $this->personVersion = $personVersion;
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
     * @Type("DateTime")
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
     * @Type("DateTime")
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

