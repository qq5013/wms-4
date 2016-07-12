<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\LoginKey;

class User
{

    use UserStatePropertiesTrait;

    /**
     * @Type("array<Wms\Domain\UserRole>")
     * @var UserRole[]
     */
    private $userRoles;

    /**
     * @return UserRole[]
     */
    public function getUserRoles()
    {
        return $this->userRoles;
    }	

    /**
     * @param UserRole[] $userRoles
     */
    public function setUserRoles($userRoles)
    {
        $this->userRoles = $userRoles;
    }

    /**
     * @Type("array<Wms\Domain\UserClaim>")
     * @var UserClaim[]
     */
    private $userClaims;

    /**
     * @return UserClaim[]
     */
    public function getUserClaims()
    {
        return $this->userClaims;
    }	

    /**
     * @param UserClaim[] $userClaims
     */
    public function setUserClaims($userClaims)
    {
        $this->userClaims = $userClaims;
    }

    /**
     * @Type("array<Wms\Domain\UserPermission>")
     * @var UserPermission[]
     */
    private $userPermissions;

    /**
     * @return UserPermission[]
     */
    public function getUserPermissions()
    {
        return $this->userPermissions;
    }	

    /**
     * @param UserPermission[] $userPermissions
     */
    public function setUserPermissions($userPermissions)
    {
        $this->userPermissions = $userPermissions;
    }

    /**
     * @Type("array<Wms\Domain\UserLogin>")
     * @var UserLogin[]
     */
    private $userLogins;

    /**
     * @return UserLogin[]
     */
    public function getUserLogins()
    {
        return $this->userLogins;
    }	

    /**
     * @param UserLogin[] $userLogins
     */
    public function setUserLogins($userLogins)
    {
        $this->userLogins = $userLogins;
    }


}

