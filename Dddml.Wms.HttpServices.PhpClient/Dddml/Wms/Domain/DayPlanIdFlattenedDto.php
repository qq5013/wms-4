<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class DayPlanIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'personalNameFirstName' => 'string',
            'personalNameLastName' => 'string',
            'year' => 'integer',
            'month' => 'integer',
            'day' => 'integer',
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
     * @var DayPlanId
     */
    private $value;

    /**
     * @param DayPlanId $value
     */
    public function __construct(DayPlanId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new DayPlanId();
        }
    }

    /**
     * @return DayPlanId
     */
    public function toDayPlanId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getPersonalNameFirstName()
    {
        return $this->value->getPersonalName()->getFirstName();
    }

    /**
     * @param string $personalNameFirstName
     */
    public function setPersonalNameFirstName($personalNameFirstName)
    {
        $this->value->getPersonalName()->setFirstName($personalNameFirstName);
    }

    /**
     * @return string
     */
    public function getPersonalNameLastName()
    {
        return $this->value->getPersonalName()->getLastName();
    }

    /**
     * @param string $personalNameLastName
     */
    public function setPersonalNameLastName($personalNameLastName)
    {
        $this->value->getPersonalName()->setLastName($personalNameLastName);
    }

    /**
     * @return integer
     */
    public function getYear()
    {
        return $this->value->getYear();
    }

    /**
     * @param integer $year
     */
    public function setYear($year)
    {
        $this->value->setYear($year);
    }

    /**
     * @return integer
     */
    public function getMonth()
    {
        return $this->value->getMonth();
    }

    /**
     * @param integer $month
     */
    public function setMonth($month)
    {
        $this->value->setMonth($month);
    }

    /**
     * @return integer
     */
    public function getDay()
    {
        return $this->value->getDay();
    }

    /**
     * @param integer $day
     */
    public function setDay($day)
    {
        $this->value->setDay($day);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getPersonalNameFirstName(),
            $this->getPersonalNameLastName(),
            $this->getYear(),
            $this->getMonth(),
            $this->getDay(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return DayPlanIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setPersonalNameFirstName($pValues[0]);
        $this->setPersonalNameLastName($pValues[1]);
        $this->setYear($pValues[2]);
        $this->setMonth($pValues[3]);
        $this->setDay($pValues[4]);
        return $this;
    }

}

