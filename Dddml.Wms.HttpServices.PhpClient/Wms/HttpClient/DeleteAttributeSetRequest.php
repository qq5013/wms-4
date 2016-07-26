<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteAttributeSet;


class DeleteAttributeSetRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteAttributeSet
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('AttributeSets/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeSet
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeSet();
        }

        return $this->command;
    }

}

