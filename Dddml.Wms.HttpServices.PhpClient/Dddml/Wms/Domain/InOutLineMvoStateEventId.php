<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\StringIdInterface;

class InOutLineMvoStateEventId implements StringIdInterface
{
    /**
     * @Type("Dddml\Wms\Domain\InOutLineId")
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



    /**
     * @var InOutLineMvoStateEventIdFlattenedDto
     */
    private $idFlattenedDto;

    /**
     * @return string
     */
    public function toString()
    {
        if (!$this->idFlattenedDto) {
            $this->idFlattenedDto = new InOutLineMvoStateEventIdFlattenedDto($this);
        }

        return $this->idFlattenedDto->toString();
    }

    /**
     * @param string $idStr
     *
     * @return InOutLineMvoStateEventId
     */
    public static function createFromString($idStr)
    {
        return (new InOutLineMvoStateEventIdFlattenedDto())
            ->fromString($idStr)
            ->toInOutLineMvoStateEventId();
    }


}

