<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeValueIsPropertyRemovedTrait
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
    private $isPropertyDescriptionRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyReferenceIdRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = null;


}

