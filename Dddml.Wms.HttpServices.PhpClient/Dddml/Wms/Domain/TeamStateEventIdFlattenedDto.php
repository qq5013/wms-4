<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\FlattenedDtoInterface;

class TeamStateEventIdFlattenedDto implements FlattenedDtoInterface
{

    const PROPERTIES = [
            'teamName' => 'string',
            'version' => 'Long',
        ];

    public static function getPropertyNames()
    {
        return array_keys(static::PROPERTIES);
    }

    public static function getPropertyTypes()
    {
        return array_values(static::PROPERTIES);
    }

	
    /**
     * @var TeamStateEventId
     */
    private $value;

    /**
     * @param TeamStateEventId $value
     */
    public function __construct(TeamStateEventId $value = null)
    {
        if ($value) {
            $this->value = $value;
        } else {
            $this->value = new TeamStateEventId();
        }
    }

    /**
     * @return TeamStateEventId
     */
    public function toTeamStateEventId()
    {
        return $this->value;
    }

    /**
     * @return string
     */
    public function getTeamName()
    {
        return $this->value->getTeamName();
    }

    /**
     * @param string $teamName
     */
    public function setTeamName($teamName)
    {
        $this->value->setTeamName($teamName);
    }

    /**
     * @return Long
     */
    public function getVersion()
    {
        return $this->value->getVersion();
    }

    /**
     * @param Long $version
     */
    public function setVersion($version)
    {
        $this->value->setVersion($version);
    }

    /**
     * @return string
     */
    public function toString()
    {
        $pValues = [
            $this->getTeamName(),
            $this->getVersion(),
        ];
        return implode(',', $pValues);
    }

    /**
     * @param string $data
     *
     * @return TeamStateEventIdFlattenedDto
     */
    public function fromString($data)
    {
        $pValues = explode(',', $data);
        $this->setTeamName($pValues[0]);
        $this->setVersion($pValues[1]);
        return $this;
    }

}

