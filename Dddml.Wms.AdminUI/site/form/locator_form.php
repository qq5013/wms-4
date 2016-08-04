<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('locatorId', TextType::class, [
        'required' => true,
        'label'    => 'LocatorId',
    ])
    ->add('warehouseId', TextType::class, [
        'required' => true,
        'label'    => 'WarehouseId',
    ])
    ->add('parentLocatorId', TextType::class, [
        'required' => false,
        'label'    => 'ParentLocatorId',
    ])
    ->add('locatorType', TextType::class, [
        'required' => false,
        'label'    => 'LocatorType',
    ])
    ->add('priorityNumber', TextType::class, [
        'required' => false,
        'label'    => 'PriorityNumber',
    ])
    ->add('isDefault', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsDefault',
    ])
    ->add('x', TextType::class, [
        'required' => false,
        'label'    => 'X',
    ])
    ->add('y', TextType::class, [
        'required' => false,
        'label'    => 'Y',
    ])
    ->add('z', TextType::class, [
        'required' => false,
        'label'    => 'Z',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('createdBy', TextType::class, [
        'required' => false,
        'label'    => 'CreatedBy',
    ])
    ->add('createdAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'CreatedAt',
    ])
    ->add('updatedBy', TextType::class, [
        'required' => false,
        'label'    => 'UpdatedBy',
    ])
    ->add('updatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'UpdatedAt',
    ])
    ->getForm();

