<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchPermission extends AbstractPermissionCommand
{

    use PermissionIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $name;

    /**
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @param string $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * @Type("string")
     */
    private $parentPermissionId;

    /**
     * @return string
     */
    public function getParentPermissionId()
    {
        return $this->parentPermissionId;
    }

    /**
     * @param string $parentPermissionId
     */
    public function setParentPermissionId($parentPermissionId)
    {
        $this->parentPermissionId = $parentPermissionId;
    }

    /**
     * @Type("string")
     */
    private $description;

    /**
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * @param string $description
     */
    public function setDescription($description)
    {
        $this->description = $description;
    }

    /**
     * @Type("boolean")
     */
    private $active;

    /**
     * @return boolean
     */
    public function getActive()
    {
        return $this->active;
    }

    /**
     * @param boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }


}

