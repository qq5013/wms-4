<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class InOutLineMvoStateEventId
{
    /**
     * @Type("Wms\Domain\InOutLineId")
     */
    private $inOutLineId;

    /**
     * @return InOutLineId
     */
    public function getInOutLineId()
    {
        if(!$this->inOutLineId) {
            $this->inOutLineId = new InOutLineId(); 
        }
        return $this->inOutLineId;
    }

    /**
     * @param InOutLineId $inOutLineId
     */
    public function setInOutLineId($inOutLineId)
    {
        $this->inOutLineId = $inOutLineId;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $inOutVersion;

    /**
     * @return Long
     */
    public function getInOutVersion()
    {
        return $this->inOutVersion;
    }

    /**
     * @param Long $inOutVersion
     */
    public function setInOutVersion($inOutVersion)
    {
        $this->inOutVersion = $inOutVersion;
    }

}

