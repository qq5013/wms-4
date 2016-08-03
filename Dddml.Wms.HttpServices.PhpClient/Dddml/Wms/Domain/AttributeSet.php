<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;

class AttributeSet
{

    use AttributeSetStatePropertiesTrait;

    /**
     * @Type("array<Dddml\Wms\Domain\AttributeUse>")
     * @var AttributeUse[]
     */
    private $attributeUses;

    /**
     * @return AttributeUse[]
     */
    public function getAttributeUses()
    {
        return $this->attributeUses;
    }	

    /**
     * @param AttributeUse[] $attributeUses
     */
    public function setAttributeUses($attributeUses)
    {
        $this->attributeUses = $attributeUses;
    }


}

