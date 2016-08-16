<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

class CreateOrMergePatchMonthPlanMvo extends AbstractMonthPlanMvoCommand
{

    use MonthPlanMvoIsPropertyRemovedTrait;

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
    private $yearPlanDescription;

    /**
     * @return string
     */
    public function getYearPlanDescription()
    {
        return $this->yearPlanDescription;
    }

    /**
     * @param string $yearPlanDescription
     */
    public function setYearPlanDescription($yearPlanDescription)
    {
        $this->yearPlanDescription = $yearPlanDescription;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $yearPlanVersion;

    /**
     * @return Long
     */
    public function getYearPlanVersion()
    {
        return $this->yearPlanVersion;
    }

    /**
     * @param Long $yearPlanVersion
     */
    public function setYearPlanVersion($yearPlanVersion)
    {
        $this->yearPlanVersion = $yearPlanVersion;
    }

    /**
     * @Type("string")
     */
    private $yearPlanCreatedBy;

    /**
     * @return string
     */
    public function getYearPlanCreatedBy()
    {
        return $this->yearPlanCreatedBy;
    }

    /**
     * @param string $yearPlanCreatedBy
     */
    public function setYearPlanCreatedBy($yearPlanCreatedBy)
    {
        $this->yearPlanCreatedBy = $yearPlanCreatedBy;
    }

    /**
     * @Type("DateTime")
     */
    private $yearPlanCreatedAt;

    /**
     * @return \DateTime
     */
    public function getYearPlanCreatedAt()
    {
        return $this->yearPlanCreatedAt;
    }

    /**
     * @param \DateTime $yearPlanCreatedAt
     */
    public function setYearPlanCreatedAt($yearPlanCreatedAt)
    {
        $this->yearPlanCreatedAt = $yearPlanCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $yearPlanUpdatedBy;

    /**
     * @return string
     */
    public function getYearPlanUpdatedBy()
    {
        return $this->yearPlanUpdatedBy;
    }

    /**
     * @param string $yearPlanUpdatedBy
     */
    public function setYearPlanUpdatedBy($yearPlanUpdatedBy)
    {
        $this->yearPlanUpdatedBy = $yearPlanUpdatedBy;
    }

    /**
     * @Type("DateTime")
     */
    private $yearPlanUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getYearPlanUpdatedAt()
    {
        return $this->yearPlanUpdatedAt;
    }

    /**
     * @param \DateTime $yearPlanUpdatedAt
     */
    public function setYearPlanUpdatedAt($yearPlanUpdatedAt)
    {
        $this->yearPlanUpdatedAt = $yearPlanUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $yearPlanActive;

    /**
     * @return boolean
     */
    public function getYearPlanActive()
    {
        return $this->yearPlanActive;
    }

    /**
     * @param boolean $yearPlanActive
     */
    public function setYearPlanActive($yearPlanActive)
    {
        $this->yearPlanActive = $yearPlanActive;
    }

    /**
     * @Type("boolean")
     */
    private $yearPlanDeleted;

    /**
     * @return boolean
     */
    public function getYearPlanDeleted()
    {
        return $this->yearPlanDeleted;
    }

    /**
     * @param boolean $yearPlanDeleted
     */
    public function setYearPlanDeleted($yearPlanDeleted)
    {
        $this->yearPlanDeleted = $yearPlanDeleted;
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


}

