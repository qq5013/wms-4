<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserRoleIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

