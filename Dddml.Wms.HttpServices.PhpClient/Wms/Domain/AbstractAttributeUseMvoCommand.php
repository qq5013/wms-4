<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeSetAttributeUseId;
use Wms\Domain\AttributeUse;
use Wms\Domain\CommandTrait;

class AbstractAttributeUseMvoCommand
{

    use CommandTrait;

    /**
     * @Type("Wms\Domain\AttributeSetAttributeUseId")
     */
    private $attributeSetAttributeUseId;

    /**
     * @return AttributeSetAttributeUseId
     */
    public function getAttributeSetAttributeUseId()
    {
        return $this->attributeSetAttributeUseId;
    }

    /**
     * @var AttributeSetAttributeUseId $attributeSetAttributeUseId
     */
    public function setAttributeSetAttributeUseId($attributeSetAttributeUseId)
    {
        $this->attributeSetAttributeUseId = $attributeSetAttributeUseId;
    }

    /**
     * @Type("integer")
     */
    private $attributeSetVersion;

    /**
     * @return integer
     */
    public function getAttributeSetVersion()
    {
        return $this->attributeSetVersion;
    }

    /**
     * @var integer $attributeSetVersion
     */
    public function setAttributeSetVersion($attributeSetVersion)
    {
        $this->attributeSetVersion = $attributeSetVersion;
    }


}

