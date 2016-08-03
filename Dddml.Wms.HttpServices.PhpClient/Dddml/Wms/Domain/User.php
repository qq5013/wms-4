<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;

class User
{

    use UserStatePropertiesTrait;

    /**
     * @Type("array<Dddml\Wms\Domain\UserRole>")
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
     * @Type("array<Dddml\Wms\Domain\UserClaim>")
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
     * @Type("array<Dddml\Wms\Domain\UserPermission>")
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
     * @Type("array<Dddml\Wms\Domain\UserLogin>")
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

