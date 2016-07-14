<?php

namespace Wms\Domain;

use Dddml\Command\CommandInterface;
use JMS\Serializer\Annotation\Type;
use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\SkuId;
use Wms\Domain\CommandTrait;

abstract class AbstractInOutCommand implements CommandInterface
{

    use CommandTrait;

    /**
     * @Type("string")
     */
    private $documentNumber;

    /**
     * @return string
     */
    public function getDocumentNumber()
    {
        return $this->documentNumber;
    }

    /**
     * @param string $documentNumber
     */
    public function setDocumentNumber($documentNumber)
    {
        $this->documentNumber = $documentNumber;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $version;

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }


}

