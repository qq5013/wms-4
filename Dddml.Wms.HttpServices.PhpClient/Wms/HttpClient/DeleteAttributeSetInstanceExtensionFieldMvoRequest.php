<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteAttributeSetInstanceExtensionFieldMvo;


class DeleteAttributeSetInstanceExtensionFieldMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteAttributeSetInstanceExtensionFieldMvo
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteAttributeSetInstanceExtensionFieldMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('AttributeSetInstanceExtensionFieldMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeSetInstanceExtensionFieldMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeSetInstanceExtensionFieldMvo();
        }

        return $this->command;
    }

}

