<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\SkuId;
use Wms\Domain\CommandTrait;

class AbstractInOutCommand
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
     * @var string $documentNumber
     */
    public function setDocumentNumber($documentNumber)
    {
        $this->documentNumber = $documentNumber;
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

