<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait OrganizationStructureIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

