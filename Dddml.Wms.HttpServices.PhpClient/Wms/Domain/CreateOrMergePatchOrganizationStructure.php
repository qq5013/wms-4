<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\OrganizationStructureId;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchOrganizationStructure extends AbstractOrganizationStructureCommand
{

    use OrganizationStructureIsPropertyRemovedTrait;

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

