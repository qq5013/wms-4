<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait CommandTrait
{
    /**
     * @Type("string")
     */
    protected $commandType;

    /**
     * @param string $commandType
     */
    public function setCommandType($commandType)
    {
        $this->commandType = $commandType;
    }

    /**
     * @return string
     */
    public function getCommandType()
    {
        return $this->commandType;
    }

    /**
     * @Type("string")
     */
    protected $commandId;

    /**
     * @return string
     */
    public function getCommandId()
    {
        return $this->commandId;
    }

    /**
     * @param string $commandId
     */
    public function setCommandId($commandId)
    {
        $this->commandId = $commandId;
    }

    /**
     * @Type("string")
     */
    protected $requesterId;

    /**
     * @return string
     */
    public function getRequesterId()
    {
        return $this->requesterId;
    }

    /**
     * @param string $requesterId
     */
    public function setRequesterId($requesterId)
    {
        $this->requesterId = $requesterId;
    }

}


