<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class OrganizationStructureId
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
     * @var string $organizationStructureTypeId
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
     * @var string $parentId
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
     * @var string $subsidiaryId
     */
    public function setSubsidiaryId($subsidiaryId)
    {
        $this->subsidiaryId = $subsidiaryId;
    }

}

