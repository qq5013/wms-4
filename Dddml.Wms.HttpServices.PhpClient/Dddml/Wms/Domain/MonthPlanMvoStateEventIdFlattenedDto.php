<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class MonthPlanMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'monthPlanIdPersonalNameFirstName' => 'string',
            'monthPlanIdPersonalNameLastName' => 'string',
            'monthPlanIdYear' => 'integer',
            'monthPlanIdMonth' => 'integer',
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
     * @var MonthPlanMvoStateEventId
     */
    private $value;

    /**
     * @param MonthPlanMvoStateEventId $value
     */
    public function __construct(MonthPlanMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new MonthPlanMvoStateEventId();
        }
    }

    /**
     * @return MonthPlanMvoStateEventId
     */
    public function toMonthPlanMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getMonthPlanIdPersonalNameFirstName()
    {
        return $this->value->getMonthPlanId()->getPersonalName()->getFirstName();
    }

    /**
     * @param string $monthPlanIdPersonalNameFirstName
     */
    public function setMonthPlanIdPersonalNameFirstName($monthPlanIdPersonalNameFirstName)
    {
        $this->value->getMonthPlanId()->getPersonalName()->setFirstName($monthPlanIdPersonalNameFirstName);
    }

    /**
     * @return string
     */
    public function getMonthPlanIdPersonalNameLastName()
    {
        return $this->value->getMonthPlanId()->getPersonalName()->getLastName();
    }

    /**
     * @param string $monthPlanIdPersonalNameLastName
     */
    public function setMonthPlanIdPersonalNameLastName($monthPlanIdPersonalNameLastName)
    {
        $this->value->getMonthPlanId()->getPersonalName()->setLastName($monthPlanIdPersonalNameLastName);
    }

    /**
     * @return integer
     */
    public function getMonthPlanIdYear()
    {
        return $this->value->getMonthPlanId()->getYear();
    }

    /**
     * @param integer $monthPlanIdYear
     */
    public function setMonthPlanIdYear($monthPlanIdYear)
    {
        $this->value->getMonthPlanId()->setYear($monthPlanIdYear);
    }

    /**
     * @return integer
     */
    public function getMonthPlanIdMonth()
    {
        return $this->value->getMonthPlanId()->getMonth();
    }

    /**
     * @param integer $monthPlanIdMonth
     */
    public function setMonthPlanIdMonth($monthPlanIdMonth)
    {
        $this->value->getMonthPlanId()->setMonth($monthPlanIdMonth);
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
            $this->getMonthPlanIdPersonalNameFirstName(),
            $this->getMonthPlanIdPersonalNameLastName(),
            $this->getMonthPlanIdYear(),
            $this->getMonthPlanIdMonth(),
            $this->getPersonVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return MonthPlanMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setMonthPlanIdPersonalNameFirstName($pValues[0]);
        $this->setMonthPlanIdPersonalNameLastName($pValues[1]);
        $this->setMonthPlanIdYear($pValues[2]);
        $this->setMonthPlanIdMonth($pValues[3]);
        $this->setPersonVersion($pValues[4]);
        return $this;
    }

}

