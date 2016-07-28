<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Dddml\Serializer\Type\Decimal;
use Dddml\Serializer\Type\Long;
use Wms\Domain\CreateOrMergePatchInOut;


class CreateInOutRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchInOut
     */
    private $command;

    public static $commandType = 'Wms\Domain\CreateOrMergePatchInOut';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_CREATE);

        $this->route = new Route('InOuts/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PUT;
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

