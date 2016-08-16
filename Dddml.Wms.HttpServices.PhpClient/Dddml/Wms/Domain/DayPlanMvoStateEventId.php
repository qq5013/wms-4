<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class DayPlanMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\DayPlanId")
     */
    private $dayPlanId;

    /**
     * @return DayPlanId
     */
    public function getDayPlanId()
    {
        if(!$this->dayPlanId) {
            $this->dayPlanId = new DayPlanId(); 
        }
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



    /**
     * @var DayPlanMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new DayPlanMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return DayPlanMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new DayPlanMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toDayPlanMvoStateEventId();
    }


}

