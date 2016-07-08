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

class UserStateEventId
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
     * @var string $userId
     */
    public function setUserId($userId)
    {
        $this->userId = $userId;
    }

    /**
     * @Type("integer")
     */
    private $version;

    /**
     * @return integer
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @var integer $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }

}

