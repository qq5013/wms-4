<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteAttributeValueMvo;


class DeleteAttributeValueMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteAttributeValueMvo
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteAttributeValueMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('AttributeValueMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeValueMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeValueMvo();
        }

        return $this->command;
    }

}

