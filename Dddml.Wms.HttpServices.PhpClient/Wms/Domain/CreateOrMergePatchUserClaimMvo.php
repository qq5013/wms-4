<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchUserClaimMvo extends AbstractUserClaimMvoCommand
{

    use UserClaimMvoIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $claimType;

    /**
     * @return string
     */
    public function getClaimType()
    {
        return $this->claimType;
    }

    /**
     * @param string $claimType
     */
    public function setClaimType($claimType)
    {
        $this->claimType = $claimType;
    }

    /**
     * @Type("string")
     */
    private $claimValue;

    /**
     * @return string
     */
    public function getClaimValue()
    {
        return $this->claimValue;
    }

    /**
     * @param string $claimValue
     */
    public function setClaimValue($claimValue)
    {
        $this->claimValue = $claimValue;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
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
     * @param boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }

    /**
     * @Type("string")
     */
    private $userUserName;

    /**
     * @return string
     */
    public function getUserUserName()
    {
        return $this->userUserName;
    }

    /**
     * @param string $userUserName
     */
    public function setUserUserName($userUserName)
    {
        $this->userUserName = $userUserName;
    }

    /**
     * @Type("integer")
     */
    private $userAccessFailedCount;

    /**
     * @return integer
     */
    public function getUserAccessFailedCount()
    {
        return $this->userAccessFailedCount;
    }

    /**
     * @param integer $userAccessFailedCount
     */
    public function setUserAccessFailedCount($userAccessFailedCount)
    {
        $this->userAccessFailedCount = $userAccessFailedCount;
    }

    /**
     * @Type("string")
     */
    private $userEmail;

    /**
     * @return string
     */
    public function getUserEmail()
    {
        return $this->userEmail;
    }

    /**
     * @param string $userEmail
     */
    public function setUserEmail($userEmail)
    {
        $this->userEmail = $userEmail;
    }

    /**
     * @Type("boolean")
     */
    private $userEmailConfirmed;

    /**
     * @return boolean
     */
    public function getUserEmailConfirmed()
    {
        return $this->userEmailConfirmed;
    }

    /**
     * @param boolean $userEmailConfirmed
     */
    public function setUserEmailConfirmed($userEmailConfirmed)
    {
        $this->userEmailConfirmed = $userEmailConfirmed;
    }

    /**
     * @Type("boolean")
     */
    private $userLockoutEnabled;

    /**
     * @return boolean
     */
    public function getUserLockoutEnabled()
    {
        return $this->userLockoutEnabled;
    }

    /**
     * @param boolean $userLockoutEnabled
     */
    public function setUserLockoutEnabled($userLockoutEnabled)
    {
        $this->userLockoutEnabled = $userLockoutEnabled;
    }

    /**
     * @Type("DateTime")
     */
    private $userLockoutEndDateUtc;

    /**
     * @return \DateTime
     */
    public function getUserLockoutEndDateUtc()
    {
        return $this->userLockoutEndDateUtc;
    }

    /**
     * @param \DateTime $userLockoutEndDateUtc
     */
    public function setUserLockoutEndDateUtc($userLockoutEndDateUtc)
    {
        $this->userLockoutEndDateUtc = $userLockoutEndDateUtc;
    }

    /**
     * @Type("string")
     */
    private $userPasswordHash;

    /**
     * @return string
     */
    public function getUserPasswordHash()
    {
        return $this->userPasswordHash;
    }

    /**
     * @param string $userPasswordHash
     */
    public function setUserPasswordHash($userPasswordHash)
    {
        $this->userPasswordHash = $userPasswordHash;
    }

    /**
     * @Type("string")
     */
    private $userPhoneNumber;

    /**
     * @return string
     */
    public function getUserPhoneNumber()
    {
        return $this->userPhoneNumber;
    }

    /**
     * @param string $userPhoneNumber
     */
    public function setUserPhoneNumber($userPhoneNumber)
    {
        $this->userPhoneNumber = $userPhoneNumber;
    }

    /**
     * @Type("boolean")
     */
    private $userPhoneNumberConfirmed;

    /**
     * @return boolean
     */
    public function getUserPhoneNumberConfirmed()
    {
        return $this->userPhoneNumberConfirmed;
    }

    /**
     * @param boolean $userPhoneNumberConfirmed
     */
    public function setUserPhoneNumberConfirmed($userPhoneNumberConfirmed)
    {
        $this->userPhoneNumberConfirmed = $userPhoneNumberConfirmed;
    }

    /**
     * @Type("boolean")
     */
    private $userTwoFactorEnabled;

    /**
     * @return boolean
     */
    public function getUserTwoFactorEnabled()
    {
        return $this->userTwoFactorEnabled;
    }

    /**
     * @param boolean $userTwoFactorEnabled
     */
    public function setUserTwoFactorEnabled($userTwoFactorEnabled)
    {
        $this->userTwoFactorEnabled = $userTwoFactorEnabled;
    }

    /**
     * @Type("string")
     */
    private $userSecurityStamp;

    /**
     * @return string
     */
    public function getUserSecurityStamp()
    {
        return $this->userSecurityStamp;
    }

    /**
     * @param string $userSecurityStamp
     */
    public function setUserSecurityStamp($userSecurityStamp)
    {
        $this->userSecurityStamp = $userSecurityStamp;
    }

    /**
     * @Type("string")
     */
    private $userCreatedBy;

    /**
     * @return string
     */
    public function getUserCreatedBy()
    {
        return $this->userCreatedBy;
    }

    /**
     * @param string $userCreatedBy
     */
    public function setUserCreatedBy($userCreatedBy)
    {
        $this->userCreatedBy = $userCreatedBy;
    }

    /**
     * @Type("DateTime")
     */
    private $userCreatedAt;

    /**
     * @return \DateTime
     */
    public function getUserCreatedAt()
    {
        return $this->userCreatedAt;
    }

    /**
     * @param \DateTime $userCreatedAt
     */
    public function setUserCreatedAt($userCreatedAt)
    {
        $this->userCreatedAt = $userCreatedAt;
    }

    /**
     * @Type("string")
     */
    private $userUpdatedBy;

    /**
     * @return string
     */
    public function getUserUpdatedBy()
    {
        return $this->userUpdatedBy;
    }

    /**
     * @param string $userUpdatedBy
     */
    public function setUserUpdatedBy($userUpdatedBy)
    {
        $this->userUpdatedBy = $userUpdatedBy;
    }

    /**
     * @Type("DateTime")
     */
    private $userUpdatedAt;

    /**
     * @return \DateTime
     */
    public function getUserUpdatedAt()
    {
        return $this->userUpdatedAt;
    }

    /**
     * @param \DateTime $userUpdatedAt
     */
    public function setUserUpdatedAt($userUpdatedAt)
    {
        $this->userUpdatedAt = $userUpdatedAt;
    }

    /**
     * @Type("boolean")
     */
    private $userActive;

    /**
     * @return boolean
     */
    public function getUserActive()
    {
        return $this->userActive;
    }

    /**
     * @param boolean $userActive
     */
    public function setUserActive($userActive)
    {
        $this->userActive = $userActive;
    }

    /**
     * @Type("boolean")
     */
    private $userDeleted;

    /**
     * @return boolean
     */
    public function getUserDeleted()
    {
        return $this->userDeleted;
    }

    /**
     * @param boolean $userDeleted
     */
    public function setUserDeleted($userDeleted)
    {
        $this->userDeleted = $userDeleted;
    }


}

