<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserPermissionIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

