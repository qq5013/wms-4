<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class OrganizationStructureIdFlattenedDto
{

    const PROPERTIES = [
            'organizationStructureTypeId' => 'string',
            'parentId' => 'string',
            'subsidiaryId' => 'string',
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
     * @var OrganizationStructureId
     */
    private $value;

    /**
     * @param OrganizationStructureId $value
     */
    public function __construct(OrganizationStructureId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new OrganizationStructureId();
        }
    }

    /**
     * @return OrganizationStructureId
     */
    public function toOrganizationStructureId()
    {
        return $this->value;
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

