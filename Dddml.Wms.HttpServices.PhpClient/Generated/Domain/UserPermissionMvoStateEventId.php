<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Wms\Domain\SkuId;
use Dddml\Wms\Domain\DocumentAction;
use Dddml\Wms\Domain\OrganizationStructureId;
use Dddml\Wms\Domain\RolePermissionId;
use Dddml\Wms\Domain\UserRole;
use Dddml\Wms\Domain\UserClaim;
use Dddml\Wms\Domain\UserPermission;
use Dddml\Wms\Domain\UserLogin;
use Dddml\Wms\Domain\LoginKey;
use Dddml\Wms\Domain\UserRoleId;
use Dddml\Wms\Domain\UserClaimId;
use Dddml\Wms\Domain\UserPermissionId;
use Dddml\Wms\Domain\UserLoginId;

class UserPermissionMvoStateEventId
{
    /**
     * @Type("_UNKNOWN_")
     */
    private $userPermissionId;

    /**
     * @return _UNKNOWN_
     */
    public function getUserPermissionId()
    {
        return $this->userPermissionId;
    }

    /**
     * @var _UNKNOWN_ $userPermissionId
     */
    public function setUserPermissionId($userPermissionId)
    {
        $this->userPermissionId = $userPermissionId;
    }

    /**
     * @Type("integer")
     */
    private $userVersion;

    /**
     * @return integer
     */
    public function getUserVersion()
    {
        return $this->userVersion;
    }

    /**
     * @var integer $userVersion
     */
    public function setUserVersion($userVersion)
    {
        $this->userVersion = $userVersion;
    }

}

