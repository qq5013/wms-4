<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class AbstractAttributeSetInstanceExtensionFieldCommand
{

    use CommandTrait;

    /**
     * @Type("string")
     */
    private $index;

    /**
     * @return string
     */
    public function getIndex()
    {
        return $this->index;
    }

    /**
     * @var string $index
     */
    public function setIndex($index)
    {
        $this->index = $index;
    }


}

