<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class AudienceStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'clientId' => 'string',
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
     * @var AudienceStateEventId
     */
    private $value;

    /**
     * @param AudienceStateEventId $value
     */
    public function __construct(AudienceStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new AudienceStateEventId();
        }
    }

    /**
     * @return AudienceStateEventId
     */
    public function toAudienceStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getClientId()
    {
        return $this->value->getClientId();
    }

    /**
     * @param string $clientId
     */
    public function setClientId($clientId)
    {
        $this->value->setClientId($clientId);
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
            $this->getClientId(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return AudienceStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setClientId($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

