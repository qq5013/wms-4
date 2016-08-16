<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class DayPlanMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'dayPlanIdPersonalNameFirstName' => 'string',
            'dayPlanIdPersonalNameLastName' => 'string',
            'dayPlanIdYear' => 'integer',
            'dayPlanIdMonth' => 'integer',
            'dayPlanIdDay' => 'integer',
            'personVersion' => 'Long',
        ];

    public static function getPropertyNames()
    {
        return array_keys(static::PROPERTIES);
    }

    public static function getPropertyTypes()
    {
        return array_values(static::PROPERTIES);
    }

	
    /**
     * @var DayPlanMvoStateEventId
     */
    private $value;

    /**
     * @param DayPlanMvoStateEventId $value
     */
    public function __construct(DayPlanMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new DayPlanMvoStateEventId();
        }
    }

    /**
     * @return DayPlanMvoStateEventId
     */
    public function toDayPlanMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getDayPlanIdPersonalNameFirstName()
    {
        return $this->value->getDayPlanId()->getPersonalName()->getFirstName();
    }

    /**
     * @param string $dayPlanIdPersonalNameFirstName
     */
    public function setDayPlanIdPersonalNameFirstName($dayPlanIdPersonalNameFirstName)
    {
        $this->value->getDayPlanId()->getPersonalName()->setFirstName($dayPlanIdPersonalNameFirstName);
    }

    /**
     * @return string
     */
    public function getDayPlanIdPersonalNameLastName()
    {
        return $this->value->getDayPlanId()->getPersonalName()->getLastName();
    }

    /**
     * @param string $dayPlanIdPersonalNameLastName
     */
    public function setDayPlanIdPersonalNameLastName($dayPlanIdPersonalNameLastName)
    {
        $this->value->getDayPlanId()->getPersonalName()->setLastName($dayPlanIdPersonalNameLastName);
    }

    /**
     * @return integer
     */
    public function getDayPlanIdYear()
    {
        return $this->value->getDayPlanId()->getYear();
    }

    /**
     * @param integer $dayPlanIdYear
     */
    public function setDayPlanIdYear($dayPlanIdYear)
    {
        $this->value->getDayPlanId()->setYear($dayPlanIdYear);
    }

    /**
     * @return integer
     */
    public function getDayPlanIdMonth()
    {
        return $this->value->getDayPlanId()->getMonth();
    }

    /**
     * @param integer $dayPlanIdMonth
     */
    public function setDayPlanIdMonth($dayPlanIdMonth)
    {
        $this->value->getDayPlanId()->setMonth($dayPlanIdMonth);
    }

    /**
     * @return integer
     */
    public function getDayPlanIdDay()
    {
        return $this->value->getDayPlanId()->getDay();
    }

    /**
     * @param integer $dayPlanIdDay
     */
    public function setDayPlanIdDay($dayPlanIdDay)
    {
        $this->value->getDayPlanId()->setDay($dayPlanIdDay);
    }

    /**
     * @return Long
     */
    public function getPersonVersion()
    {
        return $this->value->getPersonVersion();
    }

    /**
     * @param Long $personVersion
     */
    public function setPersonVersion($personVersion)
    {
        $this->value->setPersonVersion($personVersion);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getDayPlanIdPersonalNameFirstName(),
            $this->getDayPlanIdPersonalNameLastName(),
            $this->getDayPlanIdYear(),
            $this->getDayPlanIdMonth(),
            $this->getDayPlanIdDay(),
            $this->getPersonVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return DayPlanMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setDayPlanIdPersonalNameFirstName($pValues[0]);
        $this->setDayPlanIdPersonalNameLastName($pValues[1]);
        $this->setDayPlanIdYear($pValues[2]);
        $this->setDayPlanIdMonth($pValues[3]);
        $this->setDayPlanIdDay($pValues[4]);
        $this->setPersonVersion($pValues[5]);
        return $this;
    }

}

