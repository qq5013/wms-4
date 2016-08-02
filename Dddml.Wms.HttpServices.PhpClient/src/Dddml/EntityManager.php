<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 11:29
 */
namespace Dddml;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\QueryExecutor;

class EntityManager
{
    protected $queryExecutor;
    protected $commandExecutor;

    public function __construct(QueryExecutor $queryExecutor, CommandExecutor $commandExecutor)
    {
        $this->queryExecutor   = $queryExecutor;
        $this->commandExecutor = $commandExecutor;
    }

    public function getRepository($entityName)
    {
        return new Repository($entityName, $this);
    }

    public function getQueryExecutor()
    {
        return $this->queryExecutor;
    }

    public function getCommandExecutor()
    {
        return $this->commandExecutor;
    }

    function __invoke($entityName) {
        return $this->getRepository($entityName);
    }
}