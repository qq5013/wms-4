<?php
/**
 * User: dongww
 * Date: 2016/7/28
 * Time: 16:21
 */
namespace Dddml\Executor\Http;

use Dddml\Command\CommandInterface;

abstract class AbstractCommandRequest implements CommandRequestInterface
{
    /** @var  CommandExecutor */
    private $executor;

    /** @var  CommandInterface */
    protected $command;

    public static $commandType = 'null';

    public function __construct(CommandExecutor $executor)
    {
        $this->executor = $executor;
    }

    /**
     * @param $json
     *
     * @return array|CommandInterface|\JMS\Serializer\scalar|mixed|object
     */
    public function getCommandFromJson($json)
    {
        $serializer = $this->executor->getSerializer();

        $this->command = $serializer->deserialize(
            $json,
            static::$commandType,
            'json'
        );

        return $this->command;
    }
}