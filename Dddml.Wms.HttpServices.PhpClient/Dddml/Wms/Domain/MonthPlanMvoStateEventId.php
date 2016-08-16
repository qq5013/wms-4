<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class MonthPlanMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\MonthPlanId")
     */
    private $monthPlanId;

    /**
     * @return MonthPlanId
     */
    public function getMonthPlanId()
    {
        if(!$this->monthPlanId) {
            $this->monthPlanId = new MonthPlanId(); 
        }
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



    /**
     * @var MonthPlanMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new MonthPlanMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return MonthPlanMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new MonthPlanMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toMonthPlanMvoStateEventId();
    }


}

