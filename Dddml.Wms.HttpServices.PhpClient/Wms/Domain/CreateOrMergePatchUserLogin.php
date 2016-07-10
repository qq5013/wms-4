<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\LoginKey;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchUserLogin extends AbstractUserLoginCommand
{

    use UserLoginIsPropertyRemovedTrait;

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

