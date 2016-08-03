<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class InOutStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'documentNumber' => 'string',
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
     * @var InOutStateEventId
     */
    private $value;

    /**
     * @param InOutStateEventId $value
     */
    public function __construct(InOutStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new InOutStateEventId();
        }
    }

    /**
     * @return InOutStateEventId
     */
    public function toInOutStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getDocumentNumber()
    {
        return $this->value->getDocumentNumber();
    }

    /**
     * @param string $documentNumber
     */
    public function setDocumentNumber($documentNumber)
    {
        $this->value->setDocumentNumber($documentNumber);
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
            $this->getDocumentNumber(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return InOutStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setDocumentNumber($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

