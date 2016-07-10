<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;

class DocumentAction
{
    /**
     * @Type("string")
     */
    private $name;

    /**
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @var string $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

}

