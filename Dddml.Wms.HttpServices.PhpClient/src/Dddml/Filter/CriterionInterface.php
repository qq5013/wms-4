<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:00
 */
namespace Dddml\Filter;

interface CriterionInterface
{
    const TYPE_IS_NULL     = 'isNull';
    const TYPE_IS_NOT_NULL = 'isNotNull';
    const TYPE_EQ          = 'eq';
    const TYPE_GE          = 'ge';
    const TYPE_LE          = 'le';
    const TYPE_LIKE        = 'like';
    const TYPE_IN          = 'in';
    const TYPE_CONJUNCTION = 'conjunction';
    const TYPE_AND         = 'and';
    const TYPE_OR          = 'or';
    const TYPE_BETWEEN     = 'between';
    const TYPE_DISJUNCTION = 'disjunction';
    const TYPE_EQ_PROPERTY = 'eqProperty';
    const TYPE_LT_PROPERTY = 'ltProperty';
    const TYPE_NOT         = 'not';

    public function toJson();

    public function toArray();
}
