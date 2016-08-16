<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class YearPlanStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'personalNameFirstName' => 'string',
            'personalNameLastName' => 'string',
            'year' => 'integer',
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
     * @var YearPlanStateEventId
     */
    private $value;

    /**
     * @param YearPlanStateEventId $value
     */
    public function __construct(YearPlanStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new YearPlanStateEventId();
        }
    }

    /**
     * @return YearPlanStateEventId
     */
    public function toYearPlanStateEventId()
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
            $this->getPersonalNameFirstName(),
            $this->getPersonalNameLastName(),
            $this->getYear(),
            $this->getPersonVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return YearPlanStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setPersonalNameFirstName($pValues[0]);
        $this->setPersonalNameLastName($pValues[1]);
        $this->setYear($pValues[2]);
        $this->setPersonVersion($pValues[3]);
        return $this;
    }

}

