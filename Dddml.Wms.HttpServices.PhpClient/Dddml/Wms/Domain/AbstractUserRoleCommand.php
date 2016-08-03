<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractUserRoleCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("string")
     */
    private $roleId;

    /**
     * @return string
     */
    public function getRoleId()
    {
        return $this->roleId;
    }

    /**
     * @param string $roleId
     */
    public function setRoleId($roleId)
    {
        $this->roleId = $roleId;
    }


}

