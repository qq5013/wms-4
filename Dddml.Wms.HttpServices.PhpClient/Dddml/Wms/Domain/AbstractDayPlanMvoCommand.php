<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractDayPlanMvoCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Dddml\Wms\Domain\DayPlanId")
     */
    private $dayPlanId;

    /**
     * @return DayPlanId
     */
    public function getDayPlanId()
    {
        return $this->dayPlanId;
    }

    /**
     * @param DayPlanId $dayPlanId
     */
    public function setDayPlanId($dayPlanId)
    {
        $this->dayPlanId = $dayPlanId;
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

