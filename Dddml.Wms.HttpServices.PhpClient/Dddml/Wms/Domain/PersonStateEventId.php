<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class PersonStateEventId implements StringIdInterface
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
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }



    /**
     * @var PersonStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new PersonStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return PersonStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new PersonStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toPersonStateEventId();
    }


}

