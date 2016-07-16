<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class OrganizationStructureIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'organizationStructureTypeId',
            'parentId',
            'subsidiaryId',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'string',
            'string',
        ];
    }
	
    /**
     * @var OrganizationStructureId
     */
    private $value;

    public function __construct()
    {
        $this->value = new OrganizationStructureId();
    }

    /**
     * @return OrganizationStructureId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param OrganizationStructureId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @return string
     */
    public function getOrganizationStructureTypeId()
    {
        return $this->value->getOrganizationStructureTypeId();
    }

    /**
     * @param string $organizationStructureTypeId
     */
    public function setOrganizationStructureTypeId($organizationStructureTypeId)
    {
        $this->value->setOrganizationStructureTypeId($organizationStructureTypeId);
    }

    /**
     * @return string
     */
    public function getParentId()
    {
        return $this->value->getParentId();
    }

    /**
     * @param string $parentId
     */
    public function setParentId($parentId)
    {
        $this->value->setParentId($parentId);
    }

    /**
     * @return string
     */
    public function getSubsidiaryId()
    {
        return $this->value->getSubsidiaryId();
    }

    /**
     * @param string $subsidiaryId
     */
    public function setSubsidiaryId($subsidiaryId)
    {
        $this->value->setSubsidiaryId($subsidiaryId);
    }


}

