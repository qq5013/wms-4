<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\FlattenedDtoInterface;

class WarehouseStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'warehouseId' => 'string',
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
     * @var WarehouseStateEventId
     */
    private $value;

    /**
     * @param WarehouseStateEventId $value
     */
    public function __construct(WarehouseStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new WarehouseStateEventId();
        }
    }

    /**
     * @return WarehouseStateEventId
     */
    public function toWarehouseStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getWarehouseId()
    {
        return $this->value->getWarehouseId();
    }

    /**
     * @param string $warehouseId
     */
    public function setWarehouseId($warehouseId)
    {
        $this->value->setWarehouseId($warehouseId);
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
            $this->getWarehouseId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return WarehouseStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setWarehouseId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

