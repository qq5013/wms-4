<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractMonthPlanMvoCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Dddml\Wms\Domain\MonthPlanId")
     */
    private $monthPlanId;

    /**
     * @return MonthPlanId
     */
    public function getMonthPlanId()
    {
        return $this->monthPlanId;
    }

    /**
     * @param MonthPlanId $monthPlanId
     */
    public function setMonthPlanId($monthPlanId)
    {
        $this->monthPlanId = $monthPlanId;
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


}

