<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class PersonStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'personalNameFirstName' => 'string',
            'personalNameLastName' => 'string',
            'version' => 'Long',
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
     * @var PersonStateEventId
     */
    private $value;

    /**
     * @param PersonStateEventId $value
     */
    public function __construct(PersonStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new PersonStateEventId();
        }
    }

    /**
     * @return PersonStateEventId
     */
    public function toPersonStateEventId()
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
     * @return Long
     */
    public function getVersion()
    {
        return $this->value->getVersion();
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->value->setVersion($version);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getPersonalNameFirstName(),
            $this->getPersonalNameLastName(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return PersonStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setPersonalNameFirstName($pValues[0]);
        $this->setPersonalNameLastName($pValues[1]);
        $this->setVersion($pValues[2]);
        return $this;
    }

}

