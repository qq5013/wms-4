<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class AbstractUserRoleCommand
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
     * @var string $roleId
     */
    public function setRoleId($roleId)
    {
        $this->roleId = $roleId;
    }


}

