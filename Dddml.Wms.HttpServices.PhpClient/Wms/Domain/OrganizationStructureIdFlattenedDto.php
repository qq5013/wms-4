<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class OrganizationStructureIdFlattenedDto implements FlattenedDtoInterface
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

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getOrganizationStructureTypeId(),
            $this->getParentId(),
            $this->getSubsidiaryId(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return OrganizationStructureIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setOrganizationStructureTypeId($pValues[0]);
        $this->setParentId($pValues[1]);
        $this->setSubsidiaryId($pValues[2]);
        return $this;
    }

}

