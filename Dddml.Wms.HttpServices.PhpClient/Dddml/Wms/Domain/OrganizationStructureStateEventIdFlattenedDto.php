<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class OrganizationStructureStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'idOrganizationStructureTypeId' => 'string',
            'idParentId' => 'string',
            'idSubsidiaryId' => 'string',
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
     * @var OrganizationStructureStateEventId
     */
    private $value;

    /**
     * @param OrganizationStructureStateEventId $value
     */
    public function __construct(OrganizationStructureStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new OrganizationStructureStateEventId();
        }
    }

    /**
     * @return OrganizationStructureStateEventId
     */
    public function toOrganizationStructureStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getIdOrganizationStructureTypeId()
    {
        return $this->value->getId()->getOrganizationStructureTypeId();
    }

    /**
     * @param string $idOrganizationStructureTypeId
     */
    public function setIdOrganizationStructureTypeId($idOrganizationStructureTypeId)
    {
        $this->value->getId()->setOrganizationStructureTypeId($idOrganizationStructureTypeId);
    }

    /**
     * @return string
     */
    public function getIdParentId()
    {
        return $this->value->getId()->getParentId();
    }

    /**
     * @param string $idParentId
     */
    public function setIdParentId($idParentId)
    {
        $this->value->getId()->setParentId($idParentId);
    }

    /**
     * @return string
     */
    public function getIdSubsidiaryId()
    {
        return $this->value->getId()->getSubsidiaryId();
    }

    /**
     * @param string $idSubsidiaryId
     */
    public function setIdSubsidiaryId($idSubsidiaryId)
    {
        $this->value->getId()->setSubsidiaryId($idSubsidiaryId);
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
            $this->getIdOrganizationStructureTypeId(),
            $this->getIdParentId(),
            $this->getIdSubsidiaryId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return OrganizationStructureStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setIdOrganizationStructureTypeId($pValues[0]);
        $this->setIdParentId($pValues[1]);
        $this->setIdSubsidiaryId($pValues[2]);
        $this->setVersion($pValues[3]);
        return $this;
    }

}

