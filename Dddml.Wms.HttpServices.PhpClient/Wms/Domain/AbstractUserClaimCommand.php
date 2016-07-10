<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class AbstractUserClaimCommand
{

    use CommandTrait;

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

