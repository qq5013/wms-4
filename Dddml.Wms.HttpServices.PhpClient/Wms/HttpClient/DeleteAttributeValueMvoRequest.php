<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteAttributeValueMvo;


class DeleteAttributeValueMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteAttributeValueMvo
     */
    private $command;

    public function __construct()
    {
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

