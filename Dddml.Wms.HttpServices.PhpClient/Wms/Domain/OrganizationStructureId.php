<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\StringIdInterface;

class OrganizationStructureId implements StringIdInterface
{
    /**
     * @Type("string")
     */
    private $organizationStructureTypeId;

    /**
     * @return string
     */
    public function getOrganizationStructureTypeId()
    {
        return $this->organizationStructureTypeId;
    }

    /**
     * @param string $organizationStructureTypeId
     */
    public function setOrganizationStructureTypeId($organizationStructureTypeId)
    {
        $this->organizationStructureTypeId = $organizationStructureTypeId;
    }

    /**
     * @Type("string")
     */
    private $parentId;

    /**
     * @return string
     */
    public function getParentId()
    {
        return $this->parentId;
    }

    /**
     * @param string $parentId
     */
    public function setParentId($parentId)
    {
        $this->parentId = $parentId;
    }

    /**
     * @Type("string")
     */
    private $subsidiaryId;

    /**
     * @return string
     */
    public function getSubsidiaryId()
    {
        return $this->subsidiaryId;
    }

    /**
     * @param string $subsidiaryId
     */
    public function setSubsidiaryId($subsidiaryId)
    {
        $this->subsidiaryId = $subsidiaryId;
    }



    /**
     * @var OrganizationStructureIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new OrganizationStructureIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return OrganizationStructureId
     */
    public static function createFromString($idStr)
    {
        return (new OrganizationStructureIdFlattenedDto())
            ->fromString($idStr)
            ->toOrganizationStructureId();
    }


}

