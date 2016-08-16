<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class YearPlanIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'personalNameFirstName' => 'string',
            'personalNameLastName' => 'string',
            'year' => 'integer',
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
     * @var YearPlanId
     */
    private $value;

    /**
     * @param YearPlanId $value
     */
    public function __construct(YearPlanId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new YearPlanId();
        }
    }

    /**
     * @return YearPlanId
     */
    public function toYearPlanId()
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
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getPersonalNameFirstName(),
            $this->getPersonalNameLastName(),
            $this->getYear(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return YearPlanIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setPersonalNameFirstName($pValues[0]);
        $this->setPersonalNameLastName($pValues[1]);
        $this->setYear($pValues[2]);
        return $this;
    }

}

