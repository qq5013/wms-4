<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeUseIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertySequenceNumberRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

