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
use Dddml\Wms\Domain\UserRoleId;
use Dddml\Wms\Domain\UserClaimId;
use Dddml\Wms\Domain\UserPermissionId;
use Dddml\Wms\Domain\UserLoginId;

class LoginKey
{
    /**
     * @Type("string")
     */
    private $loginProvider;

    /**
     * @return string
     */
    public function getLoginProvider()
    {
        return $this->loginProvider;
    }

    /**
     * @var string $loginProvider
     */
    public function setLoginProvider($loginProvider)
    {
        $this->loginProvider = $loginProvider;
    }

    /**
     * @Type("string")
     */
    private $providerKey;

    /**
     * @return string
     */
    public function getProviderKey()
    {
        return $this->providerKey;
    }

    /**
     * @var string $providerKey
     */
    public function setProviderKey($providerKey)
    {
        $this->providerKey = $providerKey;
    }

}

