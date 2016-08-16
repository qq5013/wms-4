<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;

class Person
{

    use PersonStatePropertiesTrait;

    /**
     * @Type("array<Dddml\Wms\Domain\YearPlan>")
     * @var YearPlan[]
     */
    private $yearPlans;

    /**
     * @return YearPlan[]
     */
    public function getYearPlans()
    {
        return $this->yearPlans;
    }	

    /**
     * @param YearPlan[] $yearPlans
     */
    public function setYearPlans($yearPlans)
    {
        $this->yearPlans = $yearPlans;
    }


}

