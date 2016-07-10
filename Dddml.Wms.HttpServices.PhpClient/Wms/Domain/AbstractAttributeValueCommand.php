<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class AbstractAttributeValueCommand
{

    use CommandTrait;

    /**
     * @Type("string")
     */
    private $value;

    /**
     * @return string
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * @var string $value
     */
    public function setValue($value)
    {
        $this->value = $value;
    }


}

