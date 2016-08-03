<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use Dddml\Wms\Domain\DeleteAttributeSetInstance;


class DeleteAttributeSetInstanceRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteAttributeSetInstance
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteAttributeSetInstance';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('AttributeSetInstances/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeSetInstance
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeSetInstance();
        }

        return $this->command;
    }

}

