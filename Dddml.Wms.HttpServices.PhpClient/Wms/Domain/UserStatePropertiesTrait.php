<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;


trait UserStatePropertiesTrait
{

    /**
     * @Type("string")
     */
    private $userId;

    /**
     * @return string
     */
    public function getUserId()
    {
        return $this->userId;
    }

    /**
     * @param string $userId
     */
    public function setUserId($userId)
    {
        $this->userId = $userId;
    }

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
     * @Type("\DateTime")
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

