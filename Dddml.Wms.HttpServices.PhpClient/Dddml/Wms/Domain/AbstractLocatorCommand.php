<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractLocatorCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("string")
     */
    private $locatorId;

    /**
     * @return string
     */
    public function getLocatorId()
    {
        return $this->locatorId;
    }

    /**
     * @param string $locatorId
     */
    public function setLocatorId($locatorId)
    {
        $this->locatorId = $locatorId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }


}

