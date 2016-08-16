<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

class CreateOrMergePatchYearPlan extends AbstractYearPlanCommand
{

    use YearPlanIsPropertyRemovedTrait;

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
     * @Type("array<Dddml\Wms\Domain\CreateOrMergePatchMonthPlan>")
     * @var CreateOrMergePatchMonthPlan[]
     */
    private $monthPlans;

    /**
     * @return CreateOrMergePatchMonthPlan[]
     */
    public function getMonthPlans()
    {
        return $this->monthPlans;
    }	

    /**
     * @param CreateOrMergePatchMonthPlan[] $monthPlans
     */
    public function setMonthPlans($monthPlans)
    {
        $this->monthPlans = $monthPlans;
    }


}

