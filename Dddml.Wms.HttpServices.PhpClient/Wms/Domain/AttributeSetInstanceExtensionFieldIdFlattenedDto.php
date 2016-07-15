<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class AttributeSetInstanceExtensionFieldIdFlattenedDto
{


    public function getPropertyNames()
    {
        return [
            'groupId',
            'index',
        ];
    }

    public function getPropertyTypes()
    {
        return [
            'string',
            'string',
        ];
    }
	
    /**
     * @var AttributeSetInstanceExtensionFieldId
     */
    private $value;

    public function __construct()
    {
        $this->value = new AttributeSetInstanceExtensionFieldId();
    }

    /**
     * @return AttributeSetInstanceExtensionFieldId
     */
    public function _getValue()
    {
        return $this->value;
    }

    /**
     * @param AttributeSetInstanceExtensionFieldId $value
     */
    public function _setValue($value)
    {
        $this->value = $value;
    }

    /**
     * @return string
     */
    public function getGroupId()
    {
        return $this->value->getGroupId();
    }

    /**
     * @param string $groupId
     */
    public function setGroupId($groupId)
    {
        $this->value->setGroupId($groupId);
    }

    /**
     * @return string
     */
    public function getIndex()
    {
        return $this->value->getIndex();
    }

    /**
     * @param string $index
     */
    public function setIndex($index)
    {
        $this->value->setIndex($index);
    }


}

