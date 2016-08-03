<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

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
     * @param string $userName
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
     * @param integer $accessFailedCount
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
     * @param string $email
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
     * @param boolean $emailConfirmed
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
     * @param boolean $lockoutEnabled
     */
    public function setLockoutEnabled($lockoutEnabled)
    {
        $this->lockoutEnabled = $lockoutEnabled;
    }

    /**
     * @Type("DateTime")
     */
    private $lockoutEndDateUtc;

    /**
     * @return \DateTime
     */
    public function getLockoutEndDateUtc()
    {
        return $this->lockoutEndDateUtc;
    }

    /**
     * @param \DateTime $lockoutEndDateUtc
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
     * @param string $passwordHash
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
     * @param string $phoneNumber
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
     * @param boolean $phoneNumberConfirmed
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
     * @param boolean $twoFactorEnabled
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
     * @param string $securityStamp
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
     * @param boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }

    /**
     * @Type("array<Dddml\Wms\Domain\CreateOrMergePatchUserRole>")
     * @var CreateOrMergePatchUserRole[]
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
     * @param CreateOrMergePatchUserRole[] $userRoles
     */
    public function setUserRoles($userRoles)
    {
        $this->userRoles = $userRoles;
    }

    /**
     * @Type("array<Dddml\Wms\Domain\CreateOrMergePatchUserClaim>")
     * @var CreateOrMergePatchUserClaim[]
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
     * @param CreateOrMergePatchUserClaim[] $userClaims
     */
    public function setUserClaims($userClaims)
    {
        $this->userClaims = $userClaims;
    }

    /**
     * @Type("array<Dddml\Wms\Domain\CreateOrMergePatchUserPermission>")
     * @var CreateOrMergePatchUserPermission[]
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
     * @param CreateOrMergePatchUserPermission[] $userPermissions
     */
    public function setUserPermissions($userPermissions)
    {
        $this->userPermissions = $userPermissions;
    }

    /**
     * @Type("array<Dddml\Wms\Domain\CreateOrMergePatchUserLogin>")
     * @var CreateOrMergePatchUserLogin[]
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
     * @param CreateOrMergePatchUserLogin[] $userLogins
     */
    public function setUserLogins($userLogins)
    {
        $this->userLogins = $userLogins;
    }


}

