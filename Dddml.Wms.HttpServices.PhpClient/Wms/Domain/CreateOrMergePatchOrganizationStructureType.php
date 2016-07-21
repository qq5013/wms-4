<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchOrganizationStructureType extends AbstractOrganizationStructureTypeCommand
{

    use OrganizationStructureTypeIsPropertyRemovedTrait;

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
     * @param boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }


}

