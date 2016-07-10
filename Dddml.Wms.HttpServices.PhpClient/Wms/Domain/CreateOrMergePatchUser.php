<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\LoginKey;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchUser extends AbstractUserCommand
{

    use UserIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $userName;

    /**
     * @return string
     */
    public function getUserName()
    {
        return $this->userName;
    }

    /**
     * @var string $userName
     */
    public function setUserName($userName)
    {
        $this->userName = $userName;
    }

    /**
     * @Type("integer")
     */
    private $accessFailedCount;

    /**
     * @return integer
     */
    public function getAccessFailedCount()
    {
        return $this->accessFailedCount;
    }

    /**
     * @var integer $accessFailedCount
     */
    public function setAccessFailedCount($accessFailedCount)
    {
        $this->accessFailedCount = $accessFailedCount;
    }

    /**
     * @Type("string")
     */
    private $email;

    /**
     * @return string
     */
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * @var string $email
     */
    public function setEmail($email)
    {
        $this->email = $email;
    }

    /**
     * @Type("boolean")
     */
    private $emailConfirmed;

    /**
     * @return boolean
     */
    public function getEmailConfirmed()
    {
        return $this->emailConfirmed;
    }

    /**
     * @var boolean $emailConfirmed
     */
    public function setEmailConfirmed($emailConfirmed)
    {
        $this->emailConfirmed = $emailConfirmed;
    }

    /**
     * @Type("boolean")
     */
    private $lockoutEnabled;

    /**
     * @return boolean
     */
    public function getLockoutEnabled()
    {
        return $this->lockoutEnabled;
    }

    /**
     * @var boolean $lockoutEnabled
     */
    public function setLockoutEnabled($lockoutEnabled)
    {
        $this->lockoutEnabled = $lockoutEnabled;
    }

    /**
     * @Type("string")
     */
    private $lockoutEndDateUtc;

    /**
     * @return string
     */
    public function getLockoutEndDateUtc()
    {
        return $this->lockoutEndDateUtc;
    }

    /**
     * @var string $lockoutEndDateUtc
     */
    public function setLockoutEndDateUtc($lockoutEndDateUtc)
    {
        $this->lockoutEndDateUtc = $lockoutEndDateUtc;
    }

    /**
     * @Type("string")
     */
    private $passwordHash;

    /**
     * @return string
     */
    public function getPasswordHash()
    {
        return $this->passwordHash;
    }

    /**
     * @var string $passwordHash
     */
    public function setPasswordHash($passwordHash)
    {
        $this->passwordHash = $passwordHash;
    }

    /**
     * @Type("string")
     */
    private $phoneNumber;

    /**
     * @return string
     */
    public function getPhoneNumber()
    {
        return $this->phoneNumber;
    }

    /**
     * @var string $phoneNumber
     */
    public function setPhoneNumber($phoneNumber)
    {
        $this->phoneNumber = $phoneNumber;
    }

    /**
     * @Type("boolean")
     */
    private $phoneNumberConfirmed;

    /**
     * @return boolean
     */
    public function getPhoneNumberConfirmed()
    {
        return $this->phoneNumberConfirmed;
    }

    /**
     * @var boolean $phoneNumberConfirmed
     */
    public function setPhoneNumberConfirmed($phoneNumberConfirmed)
    {
        $this->phoneNumberConfirmed = $phoneNumberConfirmed;
    }

    /**
     * @Type("boolean")
     */
    private $twoFactorEnabled;

    /**
     * @return boolean
     */
    public function getTwoFactorEnabled()
    {
        return $this->twoFactorEnabled;
    }

    /**
     * @var boolean $twoFactorEnabled
     */
    public function setTwoFactorEnabled($twoFactorEnabled)
    {
        $this->twoFactorEnabled = $twoFactorEnabled;
    }

    /**
     * @Type("string")
     */
    private $securityStamp;

    /**
     * @return string
     */
    public function getSecurityStamp()
    {
        return $this->securityStamp;
    }

    /**
     * @var string $securityStamp
     */
    public function setSecurityStamp($securityStamp)
    {
        $this->securityStamp = $securityStamp;
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
     * @Type("array<Wms\Domain\CreateOrMergePatchUserRole>")
     * @var UserRole[]
     */
    private $userRoles;

    /**
     * @return CreateOrMergePatchUserRole[]
     */
    public function getUserRoles()
    {
        return $this->userRoles;
    }	

    /**
     * @var CreateOrMergePatchUserRole[] $userRoles
     */
    public function setUserRoles($userRoles)
    {
        $this->userRoles = $userRoles;
    }

    /**
     * @Type("array<Wms\Domain\CreateOrMergePatchUserClaim>")
     * @var UserClaim[]
     */
    private $userClaims;

    /**
     * @return CreateOrMergePatchUserClaim[]
     */
    public function getUserClaims()
    {
        return $this->userClaims;
    }	

    /**
     * @var CreateOrMergePatchUserClaim[] $userClaims
     */
    public function setUserClaims($userClaims)
    {
        $this->userClaims = $userClaims;
    }

    /**
     * @Type("array<Wms\Domain\CreateOrMergePatchUserPermission>")
     * @var UserPermission[]
     */
    private $userPermissions;

    /**
     * @return CreateOrMergePatchUserPermission[]
     */
    public function getUserPermissions()
    {
        return $this->userPermissions;
    }	

    /**
     * @var CreateOrMergePatchUserPermission[] $userPermissions
     */
    public function setUserPermissions($userPermissions)
    {
        $this->userPermissions = $userPermissions;
    }

    /**
     * @Type("array<Wms\Domain\CreateOrMergePatchUserLogin>")
     * @var UserLogin[]
     */
    private $userLogins;

    /**
     * @return CreateOrMergePatchUserLogin[]
     */
    public function getUserLogins()
    {
        return $this->userLogins;
    }	

    /**
     * @var CreateOrMergePatchUserLogin[] $userLogins
     */
    public function setUserLogins($userLogins)
    {
        $this->userLogins = $userLogins;
    }


}

