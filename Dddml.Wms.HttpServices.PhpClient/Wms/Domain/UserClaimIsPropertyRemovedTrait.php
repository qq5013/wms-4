<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserClaimIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyClaimTypeRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyClaimValueRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

