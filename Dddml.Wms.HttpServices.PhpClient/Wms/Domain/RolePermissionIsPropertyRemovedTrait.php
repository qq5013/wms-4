<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait RolePermissionIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

