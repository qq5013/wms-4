<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractAttributeSetInstanceExtensionFieldCommand implements CommandInterface
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
     * @param string $index
     */
    public function setIndex($index)
    {
        $this->index = $index;
    }


}

