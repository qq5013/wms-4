<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;

class YearPlan
{

    use YearPlanStatePropertiesTrait;

    /**
     * @Type("array<Dddml\Wms\Domain\MonthPlan>")
     * @var MonthPlan[]
     */
    private $monthPlans;

    /**
     * @return MonthPlan[]
     */
    public function getMonthPlans()
    {
        return $this->monthPlans;
    }	

    /**
     * @param MonthPlan[] $monthPlans
     */
    public function setMonthPlans($monthPlans)
    {
        $this->monthPlans = $monthPlans;
    }


}

