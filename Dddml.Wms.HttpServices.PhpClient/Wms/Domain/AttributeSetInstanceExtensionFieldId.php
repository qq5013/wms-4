<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class AttributeSetInstanceExtensionFieldId
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

}

