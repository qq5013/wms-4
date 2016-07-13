<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Wms\Domain\UserLoginId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\CreateOrMergePatchUserLoginMvo;

class MergePatchUserLoginMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchUserLoginMvo
     */
    private $command;

    public function __construct()
    {
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('UserLoginMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchUserLoginMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchUserLoginMvo();
        }

        return $this->command;
    }
}

