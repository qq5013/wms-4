<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractUserClaimCommand implements CommandInterface
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
     * @param integer $claimId
     */
    public function setClaimId($claimId)
    {
        $this->claimId = $claimId;
    }


}

