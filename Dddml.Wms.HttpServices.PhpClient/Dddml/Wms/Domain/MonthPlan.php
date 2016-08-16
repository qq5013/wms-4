<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;

class MonthPlan
{

    use MonthPlanStatePropertiesTrait;

    /**
     * @Type("array<Dddml\Wms\Domain\DayPlan>")
     * @var DayPlan[]
     */
    private $dayPlans;

    /**
     * @return DayPlan[]
     */
    public function getDayPlans()
    {
        return $this->dayPlans;
    }	

    /**
     * @param DayPlan[] $dayPlans
     */
    public function setDayPlans($dayPlans)
    {
        $this->dayPlans = $dayPlans;
    }


}

