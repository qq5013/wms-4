<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\OrganizationStructureId;
use Wms\Domain\CommandTrait;

class AbstractOrganizationStructureCommand
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\OrganizationStructureId")
     */
    private $id;

    /**
     * @return OrganizationStructureId
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @param OrganizationStructureId $id
     */
    public function setId($id)
    {
        $this->id = $id;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }


}

