<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeValueId;

class AttributeValueMvoStateEventId
{
    /**
     * @Type("Wms\Domain\AttributeValueId")
     */
    private $attributeValueId;

    /**
     * @return AttributeValueId
     */
    public function getAttributeValueId()
    {
        return $this->attributeValueId;
    }

    /**
     * @var AttributeValueId $attributeValueId
     */
    public function setAttributeValueId($attributeValueId)
    {
        $this->attributeValueId = $attributeValueId;
    }

    /**
     * @Type("integer")
     */
    private $attributeVersion;

    /**
     * @return integer
     */
    public function getAttributeVersion()
    {
        return $this->attributeVersion;
    }

    /**
     * @var integer $attributeVersion
     */
    public function setAttributeVersion($attributeVersion)
    {
        $this->attributeVersion = $attributeVersion;
    }

}

