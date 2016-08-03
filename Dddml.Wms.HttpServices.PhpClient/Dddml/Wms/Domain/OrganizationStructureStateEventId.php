<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class OrganizationStructureStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\OrganizationStructureId")
     */
    private $id;

    /**
     * @return OrganizationStructureId
     */
    public function getId()
    {
        if(!$this->id) {
            $this->id = new OrganizationStructureId(); 
        }
        return $this->id;
    }

    /**
     * @param OrganizationStructureId $id
     */
    public function setId($id)
    {
        $this->id = $id;
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
     * @var OrganizationStructureStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new OrganizationStructureStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return OrganizationStructureStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new OrganizationStructureStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toOrganizationStructureStateEventId();
    }


}

