<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class OrganizationStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'organizationId' => 'string',
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
     * @var OrganizationStateEventId
     */
    private $value;

    /**
     * @param OrganizationStateEventId $value
     */
    public function __construct(OrganizationStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new OrganizationStateEventId();
        }
    }

    /**
     * @return OrganizationStateEventId
     */
    public function toOrganizationStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getOrganizationId()
    {
        return $this->value->getOrganizationId();
    }

    /**
     * @param string $organizationId
     */
    public function setOrganizationId($organizationId)
    {
        $this->value->setOrganizationId($organizationId);
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
            $this->getOrganizationId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return OrganizationStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setOrganizationId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

