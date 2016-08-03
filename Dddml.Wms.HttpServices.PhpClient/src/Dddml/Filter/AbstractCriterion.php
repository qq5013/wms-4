<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:00
 */
namespace Dddml\Filter;

abstract class AbstractCriterion implements CriterionInterface
{
    protected $fields = [];

    protected function set($key, $value)
    {
        if ($value) {
            $this->fields[$key] = $value;
        }
    }

    protected function setType($type)
    {
        $this->set('Type', $type);
    }

    public function toJson()
    {
        return json_encode($this->toArray());
    }

    public function getFields()
    {
        return $this->fields;
    }

    public function toArray()
    {
        $array = [];

        foreach ($this->fields as $key => $field) {
            if ($field instanceof CriterionInterface) {
                $array[$key] = $field->toArray();
            } elseif (is_array($field)) {
                $array[$key] = [];
                foreach ($field as $item) {
                    if ($item instanceof CriterionInterface) {
                        $array[$key][] = $item->toArray();
                    } else {
                        $array[$key][] = $item;
                    }
                }
            } else {
                $array[$key] = $field;
            }
        }

        return $array;
    }
}
