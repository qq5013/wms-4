<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserLoginIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

