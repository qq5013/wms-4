<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteAttributeSet;


class DeleteAttributeSetRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteAttributeSet
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteAttributeSet';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

