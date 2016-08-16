<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class MonthPlanStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\PersonalName")
     */
    private $personalName;

    /**
     * @return PersonalName
     */
    public function getPersonalName()
    {
        if(!$this->personalName) {
            $this->personalName = new PersonalName(); 
        }
        return $this->personalName;
    }

    /**
     * @param PersonalName $personalName
     */
    public function setPersonalName($personalName)
    {
        $this->personalName = $personalName;
    }

    /**
     * @Type("integer")
     */
    private $year;

    /**
     * @return integer
     */
    public function getYear()
    {
        return $this->year;
    }

    /**
     * @param integer $year
     */
    public function setYear($year)
    {
        $this->year = $year;
    }

    /**
     * @Type("integer")
     */
    private $month;

    /**
     * @return integer
     */
    public function getMonth()
    {
        return $this->month;
    }

    /**
     * @param integer $month
     */
    public function setMonth($month)
    {
        $this->month = $month;
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
     * @var MonthPlanStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new MonthPlanStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return MonthPlanStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new MonthPlanStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toMonthPlanStateEventId();
    }


}

