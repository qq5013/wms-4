<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class PersonalNameFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'firstName' => 'string',
            'lastName' => 'string',
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
     * @var PersonalName
     */
    private $value;

    /**
     * @param PersonalName $value
     */
    public function __construct(PersonalName $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new PersonalName();
        }
    }

    /**
     * @return PersonalName
     */
    public function toPersonalName()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getFirstName()
    {
        return $this->value->getFirstName();
    }

    /**
     * @param string $firstName
     */
    public function setFirstName($firstName)
    {
        $this->value->setFirstName($firstName);
    }

    /**
     * @return string
     */
    public function getLastName()
    {
        return $this->value->getLastName();
    }

    /**
     * @param string $lastName
     */
    public function setLastName($lastName)
    {
        $this->value->setLastName($lastName);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getFirstName(),
            $this->getLastName(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return PersonalNameFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setFirstName($pValues[0]);
        $this->setLastName($pValues[1]);
        return $this;
    }

}

