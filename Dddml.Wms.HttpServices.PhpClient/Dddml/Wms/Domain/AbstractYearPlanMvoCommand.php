<?php

namespace Dddml\Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

abstract class AbstractYearPlanMvoCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("Dddml\Wms\Domain\YearPlanId")
     */
    private $yearPlanId;

    /**
     * @return YearPlanId
     */
    public function getYearPlanId()
    {
        return $this->yearPlanId;
    }

    /**
     * @param YearPlanId $yearPlanId
     */
    public function setYearPlanId($yearPlanId)
    {
        $this->yearPlanId = $yearPlanId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $personVersion;

    /**
     * @return Long
     */
    public function getPersonVersion()
    {
        return $this->personVersion;
    }

    /**
     * @param Long $personVersion
     */
    public function setPersonVersion($personVersion)
    {
        $this->personVersion = $personVersion;
    }


}

