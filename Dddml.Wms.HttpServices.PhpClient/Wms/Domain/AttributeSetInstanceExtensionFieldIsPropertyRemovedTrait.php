<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait AttributeSetInstanceExtensionFieldIsPropertyRemovedTrait
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
    private $isPropertyTypeRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLengthRemoved = null;

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAliasRemoved = null;

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
    private $isPropertyActiveRemoved = null;


}

