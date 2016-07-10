<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AudienceIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyNameRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyBase64SecretRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

