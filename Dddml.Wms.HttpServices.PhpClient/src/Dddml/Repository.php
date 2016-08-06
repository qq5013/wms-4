<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 9:30
 */
namespace Dddml;

use Doctrine\Common\Inflector\Inflector;

class Repository
{
    public    $baseNamespace = 'Dddml\\Wms\\HttpClient\\';
    protected $name;
    protected $entityManager;
    protected $queryExecutor;
    protected $commandExecutor;

    public function __construct($name, EntityManager $entityManager)
    {
        $this->name          = $name;
        $this->entityManager = $entityManager;
    }

    /**
     * @param string $id
     * @param array  $fields
     *
     * @return mixed
     */
    public function findOne($id, array $fields = [])
    {
        $option = [
            'parameters' => [
                'id' => $id,
            ],
        ];
        if ($fields) {
            $option['query'] = [
                'fields' => implode(',', $fields),
            ];
        }

        $className = $this->baseNamespace . $this->name . 'QueryRequest';

        $entity = $this->entityManager
            ->getQueryExecutor()
            ->execute(new $className(), $option);

        return $entity;
    }

    public function findBy(array $query = [])
    {
        $className = $this->baseNamespace .
            Inflector::pluralize($this->name) .
            'QueryRequest';

        $entities = $this->entityManager
            ->getQueryExecutor()
            ->execute(new $className(), [
                'query' => $query,
            ]);

        return $entities;
    }

    public function count()
    {
        $className = $this->baseNamespace .
            Inflector::pluralize($this->name) .
            'QueryRequest';

        $count = $this->entityManager
            ->getQueryExecutor()
            ->count(new $className());

        return trim($count, "\"");
    }
}