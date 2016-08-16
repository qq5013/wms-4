<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

class CreateOrMergePatchPerson extends AbstractPersonCommand
{

    use PersonIsPropertyRemovedTrait;

    /**
     * @Type("DateTime")
     */
    private $birthDate;

    /**
     * @return \DateTime
     */
    public function getBirthDate()
    {
        return $this->birthDate;
    }

    /**
     * @param \DateTime $birthDate
     */
    public function setBirthDate($birthDate)
    {
        $this->birthDate = $birthDate;
    }

    /**
     * @Type("Dddml\Wms\Domain\PersonalName")
     */
    private $loves;

    /**
     * @return PersonalName
     */
    public function getLoves()
    {
        return $this->loves;
    }

    /**
     * @param PersonalName $loves
     */
    public function setLoves($loves)
    {
        $this->loves = $loves;
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
     * @Type("array<Dddml\Wms\Domain\CreateOrMergePatchYearPlan>")
     * @var CreateOrMergePatchYearPlan[]
     */
    private $yearPlans;

    /**
     * @return CreateOrMergePatchYearPlan[]
     */
    public function getYearPlans()
    {
        return $this->yearPlans;
    }	

    /**
     * @param CreateOrMergePatchYearPlan[] $yearPlans
     */
    public function setYearPlans($yearPlans)
    {
        $this->yearPlans = $yearPlans;
    }


}

