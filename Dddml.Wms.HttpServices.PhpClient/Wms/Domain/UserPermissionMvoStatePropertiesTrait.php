<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserPermissionId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;


trait UserPermissionMvoStatePropertiesTrait
{

    /**
     * @Type("Wms\Domain\UserPermissionId")
     */
    private $userPermissionId;

    /**
     * @return UserPermissionId
     */
    public function getUserPermissionId()
    {
        return $this->userPermissionId;
    }

    /**
     * @param UserPermissionId $userPermissionId
     */
    public function setUserPermissionId($userPermissionId)
    {
        $this->userPermissionId = $userPermissionId;
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
     * @Type("\DateTime")
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
     * @Type("\DateTime")
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
     * @Type("\DateTime")
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

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $userVersion;

    /**
     * @return Long
     */
    public function getUserVersion()
    {
        return $this->userVersion;
    }

    /**
     * @param Long $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->userVersion = $userVersion;
    }

    /**
     * @Type("string")
     */
    private $createdBy;

    /**
     * @return string
     */
    public function getCreatedBy()
    {
        return $this->createdBy;
    }

    /**
     * @param string $createdBy
     */
    public function setCreatedBy($createdBy)
    {
        $this->createdBy = $createdBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $createdAt;

    /**
     * @return \DateTime
     */
    public function getCreatedAt()
    {
        return $this->createdAt;
    }

    /**
     * @param \DateTime $createdAt
     */
    public function setCreatedAt($createdAt)
    {
        $this->createdAt = $createdAt;
    }

    /**
     * @Type("string")
     */
    private $updatedBy;

    /**
     * @return string
     */
    public function getUpdatedBy()
    {
        return $this->updatedBy;
    }

    /**
     * @param string $updatedBy
     */
    public function setUpdatedBy($updatedBy)
    {
        $this->updatedBy = $updatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $updatedAt;

    /**
     * @return \DateTime
     */
    public function getUpdatedAt()
    {
        return $this->updatedAt;
    }

    /**
     * @param \DateTime $updatedAt
     */
    public function setUpdatedAt($updatedAt)
    {
        $this->updatedAt = $updatedAt;
    }


}

