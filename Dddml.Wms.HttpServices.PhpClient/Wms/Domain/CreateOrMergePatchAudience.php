<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchAudience extends AbstractAudienceCommand
{

    use AudienceIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $name;

    /**
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @var string $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * @Type("string")
     */
    private $base64Secret;

    /**
     * @return string
     */
    public function getBase64Secret()
    {
        return $this->base64Secret;
    }

    /**
     * @var string $base64Secret
     */
    public function setBase64Secret($base64Secret)
    {
        $this->base64Secret = $base64Secret;
    }

    /**
     * @Type("boolean")
     */
    private $active;

    /**
     * @return boolean
     */
    public function getActive()
    {
        return $this->active;
    }

    /**
     * @var boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }


}

