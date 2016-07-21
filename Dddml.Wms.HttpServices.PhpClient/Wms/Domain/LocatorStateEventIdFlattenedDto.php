<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class LocatorStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'locatorId' => 'string',
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
     * @var LocatorStateEventId
     */
    private $value;

    /**
     * @param LocatorStateEventId $value
     */
    public function __construct(LocatorStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new LocatorStateEventId();
        }
    }

    /**
     * @return LocatorStateEventId
     */
    public function toLocatorStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getLocatorId()
    {
        return $this->value->getLocatorId();
    }

    /**
     * @param string $locatorId
     */
    public function setLocatorId($locatorId)
    {
        $this->value->setLocatorId($locatorId);
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
            $this->getLocatorId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return LocatorStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setLocatorId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

