<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\OrganizationStructureId;

class OrganizationStructureStateEventId
{
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
     * @var OrganizationStructureId $id
     */
    public function setId($id)
    {
        $this->id = $id;
    }

    /**
     * @Type("integer")
     */
    private $version;

    /**
     * @return integer
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @var integer $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }

}

