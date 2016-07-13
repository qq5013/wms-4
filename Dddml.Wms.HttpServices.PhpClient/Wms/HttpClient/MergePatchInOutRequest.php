<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\SkuId;
use Wms\Domain\CreateOrMergePatchInOut;

class MergePatchInOutRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchInOut
     */
    private $command;

    public function __construct()
    {
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('InOuts/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchInOut
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchInOut();
        }

        return $this->command;
    }
}

