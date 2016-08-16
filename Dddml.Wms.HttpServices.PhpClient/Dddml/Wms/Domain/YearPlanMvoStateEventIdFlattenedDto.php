<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class YearPlanMvoStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'yearPlanIdPersonalNameFirstName' => 'string',
            'yearPlanIdPersonalNameLastName' => 'string',
            'yearPlanIdYear' => 'integer',
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
     * @var YearPlanMvoStateEventId
     */
    private $value;

    /**
     * @param YearPlanMvoStateEventId $value
     */
    public function __construct(YearPlanMvoStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new YearPlanMvoStateEventId();
        }
    }

    /**
     * @return YearPlanMvoStateEventId
     */
    public function toYearPlanMvoStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getYearPlanIdPersonalNameFirstName()
    {
        return $this->value->getYearPlanId()->getPersonalName()->getFirstName();
    }

    /**
     * @param string $yearPlanIdPersonalNameFirstName
     */
    public function setYearPlanIdPersonalNameFirstName($yearPlanIdPersonalNameFirstName)
    {
        $this->value->getYearPlanId()->getPersonalName()->setFirstName($yearPlanIdPersonalNameFirstName);
    }

    /**
     * @return string
     */
    public function getYearPlanIdPersonalNameLastName()
    {
        return $this->value->getYearPlanId()->getPersonalName()->getLastName();
    }

    /**
     * @param string $yearPlanIdPersonalNameLastName
     */
    public function setYearPlanIdPersonalNameLastName($yearPlanIdPersonalNameLastName)
    {
        $this->value->getYearPlanId()->getPersonalName()->setLastName($yearPlanIdPersonalNameLastName);
    }

    /**
     * @return integer
     */
    public function getYearPlanIdYear()
    {
        return $this->value->getYearPlanId()->getYear();
    }

    /**
     * @param integer $yearPlanIdYear
     */
    public function setYearPlanIdYear($yearPlanIdYear)
    {
        $this->value->getYearPlanId()->setYear($yearPlanIdYear);
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
            $this->getYearPlanIdPersonalNameFirstName(),
            $this->getYearPlanIdPersonalNameLastName(),
            $this->getYearPlanIdYear(),
            $this->getPersonVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return YearPlanMvoStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setYearPlanIdPersonalNameFirstName($pValues[0]);
        $this->setYearPlanIdPersonalNameLastName($pValues[1]);
        $this->setYearPlanIdYear($pValues[2]);
        $this->setPersonVersion($pValues[3]);
        return $this;
    }

}

