<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class YearPlanMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\YearPlanId")
     */
    private $yearPlanId;

    /**
     * @return YearPlanId
     */
    public function getYearPlanId()
    {
        if(!$this->yearPlanId) {
            $this->yearPlanId = new YearPlanId(); 
        }
        return $this->yearPlanId;
    }

    /**
     * @param YearPlanId $yearPlanId
     */
    public function setYearPlanId($yearPlanId)
    {
        $this->yearPlanId = $yearPlanId;
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
     * @var YearPlanMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new YearPlanMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return YearPlanMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new YearPlanMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toYearPlanMvoStateEventId();
    }


}

