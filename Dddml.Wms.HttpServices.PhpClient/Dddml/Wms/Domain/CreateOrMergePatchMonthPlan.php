<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

class CreateOrMergePatchMonthPlan extends AbstractMonthPlanCommand
{

    use MonthPlanIsPropertyRemovedTrait;

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
     * @Type("array<Dddml\Wms\Domain\CreateOrMergePatchDayPlan>")
     * @var CreateOrMergePatchDayPlan[]
     */
    private $dayPlans;

    /**
     * @return CreateOrMergePatchDayPlan[]
     */
    public function getDayPlans()
    {
        return $this->dayPlans;
    }	

    /**
     * @param CreateOrMergePatchDayPlan[] $dayPlans
     */
    public function setDayPlans($dayPlans)
    {
        $this->dayPlans = $dayPlans;
    }


}

