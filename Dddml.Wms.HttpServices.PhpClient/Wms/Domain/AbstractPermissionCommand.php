<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

abstract class AbstractPermissionCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("string")
     */
    private $permissionId;

    /**
     * @return string
     */
    public function getPermissionId()
    {
        return $this->permissionId;
    }

    /**
     * @param string $permissionId
     */
    public function setPermissionId($permissionId)
    {
        $this->permissionId = $permissionId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }


}

