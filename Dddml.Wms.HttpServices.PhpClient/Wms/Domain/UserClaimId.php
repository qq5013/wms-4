﻿<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class UserClaimId
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
    private $claimId;

    /**
     * @return integer
     */
    public function getClaimId()
    {
        return $this->claimId;
    }

    /**
     * @var integer $claimId
     */
    public function setClaimId($claimId)
    {
        $this->claimId = $claimId;
    }

}
