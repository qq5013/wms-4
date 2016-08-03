<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class OrganizationStructureTypeStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'id' => 'string',
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
     * @var OrganizationStructureTypeStateEventId
     */
    private $value;

    /**
     * @param OrganizationStructureTypeStateEventId $value
     */
    public function __construct(OrganizationStructureTypeStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new OrganizationStructureTypeStateEventId();
        }
    }

    /**
     * @return OrganizationStructureTypeStateEventId
     */
    public function toOrganizationStructureTypeStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getId()
    {
        return $this->value->getId();
    }

    /**
     * @param string $id
     */
    public function setId($id)
    {
        $this->value->setId($id);
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
            $this->getId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return OrganizationStructureTypeStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

