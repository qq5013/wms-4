﻿<?php

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
     * @var string $groupId
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
     * @var string $index
     */
    public function setIndex($index)
    {
        $this->index = $index;
    }

    /**
     * @Type("integer")
     */
    private $attributeSetInstanceExtensionFieldGroupVersion;

    /**
     * @return integer
     */
    public function getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return $this->attributeSetInstanceExtensionFieldGroupVersion;
    }

    /**
     * @var integer $attributeSetInstanceExtensionFieldGroupVersion
     */
    public function setAttributeSetInstanceExtensionFieldGroupVersion($attributeSetInstanceExtensionFieldGroupVersion)
    {
        $this->attributeSetInstanceExtensionFieldGroupVersion = $attributeSetInstanceExtensionFieldGroupVersion;
    }

}
