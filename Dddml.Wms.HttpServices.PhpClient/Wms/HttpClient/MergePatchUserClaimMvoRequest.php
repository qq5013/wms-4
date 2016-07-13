<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Wms\Domain\UserClaimId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\CreateOrMergePatchUserClaimMvo;

class MergePatchUserClaimMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchUserClaimMvo
     */
    private $command;

    public function __construct()
    {
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('UserClaimMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchUserClaimMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchUserClaimMvo();
        }

        return $this->command;
    }
}

