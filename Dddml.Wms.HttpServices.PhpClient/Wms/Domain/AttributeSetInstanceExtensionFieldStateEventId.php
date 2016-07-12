<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class AttributeSetInstanceExtensionFieldStateEventId
{
    /**
     * @Type("string")
     */
    private $groupId;

    /**
     * @return string
     */
    public function getGroupId()
    {
        return $this->groupId;
    }

    /**
     * @param string $groupId
     */
    public function setGroupId($groupId)
    {
        $this->groupId = $groupId;
    }

    /**
     * @Type("string")
     */
    private $index;

    /**
     * @return string
     */
    public function getIndex()
    {
        return $this->index;
    }

    /**
     * @param string $index
     */
    public function setIndex($index)
    {
        $this->index = $index;
    }

    /**
     * @Type("long")
     */
    private $attributeSetInstanceExtensionFieldGroupVersion;

    /**
     * @return long
     */
    public function getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return $this->attributeSetInstanceExtensionFieldGroupVersion;
    }

    /**
     * @param long $attributeSetInstanceExtensionFieldGroupVersion
     */
    public function setAttributeSetInstanceExtensionFieldGroupVersion($attributeSetInstanceExtensionFieldGroupVersion)
    {
        $this->attributeSetInstanceExtensionFieldGroupVersion = $attributeSetInstanceExtensionFieldGroupVersion;
    }

}

