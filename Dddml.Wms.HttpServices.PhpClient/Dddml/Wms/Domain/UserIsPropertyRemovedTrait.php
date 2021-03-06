<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserNameRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserNameRemoved()
    {
        return $this->isPropertyUserNameRemoved;
    }

    /**
     * @param boolean $isPropertyUserNameRemoved
     */
    public function setIsPropertyUserNameRemoved($isPropertyUserNameRemoved)
    {
        $this->isPropertyUserNameRemoved = $isPropertyUserNameRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyAccessFailedCountRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyAccessFailedCountRemoved()
    {
        return $this->isPropertyAccessFailedCountRemoved;
    }

    /**
     * @param boolean $isPropertyAccessFailedCountRemoved
     */
    public function setIsPropertyAccessFailedCountRemoved($isPropertyAccessFailedCountRemoved)
    {
        $this->isPropertyAccessFailedCountRemoved = $isPropertyAccessFailedCountRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyEmailRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyEmailRemoved()
    {
        return $this->isPropertyEmailRemoved;
    }

    /**
     * @param boolean $isPropertyEmailRemoved
     */
    public function setIsPropertyEmailRemoved($isPropertyEmailRemoved)
    {
        $this->isPropertyEmailRemoved = $isPropertyEmailRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyEmailConfirmedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyEmailConfirmedRemoved()
    {
        return $this->isPropertyEmailConfirmedRemoved;
    }

    /**
     * @param boolean $isPropertyEmailConfirmedRemoved
     */
    public function setIsPropertyEmailConfirmedRemoved($isPropertyEmailConfirmedRemoved)
    {
        $this->isPropertyEmailConfirmedRemoved = $isPropertyEmailConfirmedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLockoutEnabledRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyLockoutEnabledRemoved()
    {
        return $this->isPropertyLockoutEnabledRemoved;
    }

    /**
     * @param boolean $isPropertyLockoutEnabledRemoved
     */
    public function setIsPropertyLockoutEnabledRemoved($isPropertyLockoutEnabledRemoved)
    {
        $this->isPropertyLockoutEnabledRemoved = $isPropertyLockoutEnabledRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyLockoutEndDateUtcRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyLockoutEndDateUtcRemoved()
    {
        return $this->isPropertyLockoutEndDateUtcRemoved;
    }

    /**
     * @param boolean $isPropertyLockoutEndDateUtcRemoved
     */
    public function setIsPropertyLockoutEndDateUtcRemoved($isPropertyLockoutEndDateUtcRemoved)
    {
        $this->isPropertyLockoutEndDateUtcRemoved = $isPropertyLockoutEndDateUtcRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPasswordHashRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPasswordHashRemoved()
    {
        return $this->isPropertyPasswordHashRemoved;
    }

    /**
     * @param boolean $isPropertyPasswordHashRemoved
     */
    public function setIsPropertyPasswordHashRemoved($isPropertyPasswordHashRemoved)
    {
        $this->isPropertyPasswordHashRemoved = $isPropertyPasswordHashRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPhoneNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPhoneNumberRemoved()
    {
        return $this->isPropertyPhoneNumberRemoved;
    }

    /**
     * @param boolean $isPropertyPhoneNumberRemoved
     */
    public function setIsPropertyPhoneNumberRemoved($isPropertyPhoneNumberRemoved)
    {
        $this->isPropertyPhoneNumberRemoved = $isPropertyPhoneNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyPhoneNumberConfirmedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyPhoneNumberConfirmedRemoved()
    {
        return $this->isPropertyPhoneNumberConfirmedRemoved;
    }

    /**
     * @param boolean $isPropertyPhoneNumberConfirmedRemoved
     */
    public function setIsPropertyPhoneNumberConfirmedRemoved($isPropertyPhoneNumberConfirmedRemoved)
    {
        $this->isPropertyPhoneNumberConfirmedRemoved = $isPropertyPhoneNumberConfirmedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyTwoFactorEnabledRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyTwoFactorEnabledRemoved()
    {
        return $this->isPropertyTwoFactorEnabledRemoved;
    }

    /**
     * @param boolean $isPropertyTwoFactorEnabledRemoved
     */
    public function setIsPropertyTwoFactorEnabledRemoved($isPropertyTwoFactorEnabledRemoved)
    {
        $this->isPropertyTwoFactorEnabledRemoved = $isPropertyTwoFactorEnabledRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertySecurityStampRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertySecurityStampRemoved()
    {
        return $this->isPropertySecurityStampRemoved;
    }

    /**
     * @param boolean $isPropertySecurityStampRemoved
     */
    public function setIsPropertySecurityStampRemoved($isPropertySecurityStampRemoved)
    {
        $this->isPropertySecurityStampRemoved = $isPropertySecurityStampRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyActiveRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyActiveRemoved()
    {
        return $this->isPropertyActiveRemoved;
    }

    /**
     * @param boolean $isPropertyActiveRemoved
     */
    public function setIsPropertyActiveRemoved($isPropertyActiveRemoved)
    {
        $this->isPropertyActiveRemoved = $isPropertyActiveRemoved;
    }


}

