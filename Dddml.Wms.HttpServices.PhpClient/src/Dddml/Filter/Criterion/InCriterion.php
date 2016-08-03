<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:55
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;
use Dddml\Filter\CriterionInterface;

class InCriterion extends HasPropertyCriterion
{
    public function __construct($property, $values)
    {
        $this->setType(self::TYPE_IN);
        parent::__construct($property);
        $this->setValues($values);
    }

    public function setValues(array $values)
    {
        $this->set('Values', $values);
    }

    public function addValue($value)
    {
        if (!isset($this->fields['Values'])) {
            $this->fields['Values'] = [];
        }

        $value = (string)$value;

        if (!in_array($value, $this->fields['Values'])) {
            $this->fields['Values'][] = $value;
        }
    }
}