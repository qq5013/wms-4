<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractUserClaimMvoCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Dddml\Wms\Domain\UserClaimId")
     */
    private $userClaimId;

    /**
     * @return UserClaimId
     */
    public function getUserClaimId()
    {
        return $this->userClaimId;
    }

    /**
     * @param UserClaimId $userClaimId
     */
    public function setUserClaimId($userClaimId)
    {
        $this->userClaimId = $userClaimId;
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


}

