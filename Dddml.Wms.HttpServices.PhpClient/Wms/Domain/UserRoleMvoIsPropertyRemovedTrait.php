<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

trait UserRoleMvoIsPropertyRemovedTrait
{
    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyVersionRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyVersionRemoved()
    {
        return $this->isPropertyVersionRemoved;
    }

    /**
     * @param boolean $isPropertyVersionRemoved
     */
    public function setIsPropertyVersionRemoved($isPropertyVersionRemoved)
    {
        $this->isPropertyVersionRemoved = $isPropertyVersionRemoved;
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

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserUserNameRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserUserNameRemoved()
    {
        return $this->isPropertyUserUserNameRemoved;
    }

    /**
     * @param boolean $isPropertyUserUserNameRemoved
     */
    public function setIsPropertyUserUserNameRemoved($isPropertyUserUserNameRemoved)
    {
        $this->isPropertyUserUserNameRemoved = $isPropertyUserUserNameRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserAccessFailedCountRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserAccessFailedCountRemoved()
    {
        return $this->isPropertyUserAccessFailedCountRemoved;
    }

    /**
     * @param boolean $isPropertyUserAccessFailedCountRemoved
     */
    public function setIsPropertyUserAccessFailedCountRemoved($isPropertyUserAccessFailedCountRemoved)
    {
        $this->isPropertyUserAccessFailedCountRemoved = $isPropertyUserAccessFailedCountRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserEmailRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserEmailRemoved()
    {
        return $this->isPropertyUserEmailRemoved;
    }

    /**
     * @param boolean $isPropertyUserEmailRemoved
     */
    public function setIsPropertyUserEmailRemoved($isPropertyUserEmailRemoved)
    {
        $this->isPropertyUserEmailRemoved = $isPropertyUserEmailRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserEmailConfirmedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserEmailConfirmedRemoved()
    {
        return $this->isPropertyUserEmailConfirmedRemoved;
    }

    /**
     * @param boolean $isPropertyUserEmailConfirmedRemoved
     */
    public function setIsPropertyUserEmailConfirmedRemoved($isPropertyUserEmailConfirmedRemoved)
    {
        $this->isPropertyUserEmailConfirmedRemoved = $isPropertyUserEmailConfirmedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserLockoutEnabledRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserLockoutEnabledRemoved()
    {
        return $this->isPropertyUserLockoutEnabledRemoved;
    }

    /**
     * @param boolean $isPropertyUserLockoutEnabledRemoved
     */
    public function setIsPropertyUserLockoutEnabledRemoved($isPropertyUserLockoutEnabledRemoved)
    {
        $this->isPropertyUserLockoutEnabledRemoved = $isPropertyUserLockoutEnabledRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserLockoutEndDateUtcRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserLockoutEndDateUtcRemoved()
    {
        return $this->isPropertyUserLockoutEndDateUtcRemoved;
    }

    /**
     * @param boolean $isPropertyUserLockoutEndDateUtcRemoved
     */
    public function setIsPropertyUserLockoutEndDateUtcRemoved($isPropertyUserLockoutEndDateUtcRemoved)
    {
        $this->isPropertyUserLockoutEndDateUtcRemoved = $isPropertyUserLockoutEndDateUtcRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserPasswordHashRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserPasswordHashRemoved()
    {
        return $this->isPropertyUserPasswordHashRemoved;
    }

    /**
     * @param boolean $isPropertyUserPasswordHashRemoved
     */
    public function setIsPropertyUserPasswordHashRemoved($isPropertyUserPasswordHashRemoved)
    {
        $this->isPropertyUserPasswordHashRemoved = $isPropertyUserPasswordHashRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserPhoneNumberRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserPhoneNumberRemoved()
    {
        return $this->isPropertyUserPhoneNumberRemoved;
    }

    /**
     * @param boolean $isPropertyUserPhoneNumberRemoved
     */
    public function setIsPropertyUserPhoneNumberRemoved($isPropertyUserPhoneNumberRemoved)
    {
        $this->isPropertyUserPhoneNumberRemoved = $isPropertyUserPhoneNumberRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserPhoneNumberConfirmedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserPhoneNumberConfirmedRemoved()
    {
        return $this->isPropertyUserPhoneNumberConfirmedRemoved;
    }

    /**
     * @param boolean $isPropertyUserPhoneNumberConfirmedRemoved
     */
    public function setIsPropertyUserPhoneNumberConfirmedRemoved($isPropertyUserPhoneNumberConfirmedRemoved)
    {
        $this->isPropertyUserPhoneNumberConfirmedRemoved = $isPropertyUserPhoneNumberConfirmedRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserTwoFactorEnabledRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserTwoFactorEnabledRemoved()
    {
        return $this->isPropertyUserTwoFactorEnabledRemoved;
    }

    /**
     * @param boolean $isPropertyUserTwoFactorEnabledRemoved
     */
    public function setIsPropertyUserTwoFactorEnabledRemoved($isPropertyUserTwoFactorEnabledRemoved)
    {
        $this->isPropertyUserTwoFactorEnabledRemoved = $isPropertyUserTwoFactorEnabledRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserSecurityStampRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserSecurityStampRemoved()
    {
        return $this->isPropertyUserSecurityStampRemoved;
    }

    /**
     * @param boolean $isPropertyUserSecurityStampRemoved
     */
    public function setIsPropertyUserSecurityStampRemoved($isPropertyUserSecurityStampRemoved)
    {
        $this->isPropertyUserSecurityStampRemoved = $isPropertyUserSecurityStampRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserCreatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserCreatedByRemoved()
    {
        return $this->isPropertyUserCreatedByRemoved;
    }

    /**
     * @param boolean $isPropertyUserCreatedByRemoved
     */
    public function setIsPropertyUserCreatedByRemoved($isPropertyUserCreatedByRemoved)
    {
        $this->isPropertyUserCreatedByRemoved = $isPropertyUserCreatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserCreatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserCreatedAtRemoved()
    {
        return $this->isPropertyUserCreatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyUserCreatedAtRemoved
     */
    public function setIsPropertyUserCreatedAtRemoved($isPropertyUserCreatedAtRemoved)
    {
        $this->isPropertyUserCreatedAtRemoved = $isPropertyUserCreatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserUpdatedByRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserUpdatedByRemoved()
    {
        return $this->isPropertyUserUpdatedByRemoved;
    }

    /**
     * @param boolean $isPropertyUserUpdatedByRemoved
     */
    public function setIsPropertyUserUpdatedByRemoved($isPropertyUserUpdatedByRemoved)
    {
        $this->isPropertyUserUpdatedByRemoved = $isPropertyUserUpdatedByRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserUpdatedAtRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserUpdatedAtRemoved()
    {
        return $this->isPropertyUserUpdatedAtRemoved;
    }

    /**
     * @param boolean $isPropertyUserUpdatedAtRemoved
     */
    public function setIsPropertyUserUpdatedAtRemoved($isPropertyUserUpdatedAtRemoved)
    {
        $this->isPropertyUserUpdatedAtRemoved = $isPropertyUserUpdatedAtRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserActiveRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserActiveRemoved()
    {
        return $this->isPropertyUserActiveRemoved;
    }

    /**
     * @param boolean $isPropertyUserActiveRemoved
     */
    public function setIsPropertyUserActiveRemoved($isPropertyUserActiveRemoved)
    {
        $this->isPropertyUserActiveRemoved = $isPropertyUserActiveRemoved;
    }

    /**
     * @Type("boolean")
     *
     * @var boolean
     */
    private $isPropertyUserDeletedRemoved = false;

    /**
     * @return boolean
     */
    public function getIsPropertyUserDeletedRemoved()
    {
        return $this->isPropertyUserDeletedRemoved;
    }

    /**
     * @param boolean $isPropertyUserDeletedRemoved
     */
    public function setIsPropertyUserDeletedRemoved($isPropertyUserDeletedRemoved)
    {
        $this->isPropertyUserDeletedRemoved = $isPropertyUserDeletedRemoved;
    }


}

