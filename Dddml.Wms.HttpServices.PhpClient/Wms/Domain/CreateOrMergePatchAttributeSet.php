<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeUse;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchAttributeSet extends AbstractAttributeSetCommand
{

    use AttributeSetIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $name;

    /**
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @var string $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * @Type("string")
     */
    private $organizationId;

    /**
     * @return string
     */
    public function getOrganizationId()
    {
        return $this->organizationId;
    }

    /**
     * @var string $organizationId
     */
    public function setOrganizationId($organizationId)
    {
        $this->organizationId = $organizationId;
    }

    /**
     * @Type("string")
     */
    private $description;

    /**
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * @var string $description
     */
    public function setDescription($description)
    {
        $this->description = $description;
    }

    /**
     * @Type("string")
     */
    private $serialNumberAttributeId;

    /**
     * @return string
     */
    public function getSerialNumberAttributeId()
    {
        return $this->serialNumberAttributeId;
    }

    /**
     * @var string $serialNumberAttributeId
     */
    public function setSerialNumberAttributeId($serialNumberAttributeId)
    {
        $this->serialNumberAttributeId = $serialNumberAttributeId;
    }

    /**
     * @Type("string")
     */
    private $lotAttributeId;

    /**
     * @return string
     */
    public function getLotAttributeId()
    {
        return $this->lotAttributeId;
    }

    /**
     * @var string $lotAttributeId
     */
    public function setLotAttributeId($lotAttributeId)
    {
        $this->lotAttributeId = $lotAttributeId;
    }

    /**
     * @Type("string")
     */
    private $referenceId;

    /**
     * @return string
     */
    public function getReferenceId()
    {
        return $this->referenceId;
    }

    /**
     * @var string $referenceId
     */
    public function setReferenceId($referenceId)
    {
        $this->referenceId = $referenceId;
    }

    /**
     * @Type("boolean")
     */
    private $active;

    /**
     * @return boolean
     */
    public function getActive()
    {
        return $this->active;
    }

    /**
     * @var boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }

    /**
     * @Type("array<Wms\Domain\CreateOrMergePatchAttributeUse>")
     * @var AttributeUse[]
     */
    private $attributeUses;

    /**
     * @return CreateOrMergePatchAttributeUse[]
     */
    public function getAttributeUses()
    {
        return $this->attributeUses;
    }	

    /**
     * @var CreateOrMergePatchAttributeUse[] $attributeUses
     */
    public function setAttributeUses($attributeUses)
    {
        $this->attributeUses = $attributeUses;
    }


}

