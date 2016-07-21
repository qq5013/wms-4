<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

abstract class AbstractAttributeUseMvoCommand implements CommandInterface
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
     * @param AttributeSetAttributeUseId $attributeSetAttributeUseId
     */
    public function setAttributeSetAttributeUseId($attributeSetAttributeUseId)
    {
        $this->attributeSetAttributeUseId = $attributeSetAttributeUseId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $attributeSetVersion;

    /**
     * @return Long
     */
    public function getAttributeSetVersion()
    {
        return $this->attributeSetVersion;
    }

    /**
     * @param Long $attributeSetVersion
     */
    public function setAttributeSetVersion($attributeSetVersion)
    {
        $this->attributeSetVersion = $attributeSetVersion;
    }


}

