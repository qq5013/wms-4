<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('locatorId', TextType::class, [
        'required' => true,
        'label'    => 'Locator Id',
    ])
    ->add('warehouseId', TextType::class, [
        'required' => true,
        'label'    => 'Warehouse Id',
    ])
    ->add('parentLocatorId', TextType::class, [
        'required' => false,
        'label'    => 'Parent Locator Id',
    ])
    ->add('locatorType', TextType::class, [
        'required' => false,
        'label'    => 'Locator Type',
    ])
    ->add('priorityNumber', TextType::class, [
        'required' => false,
        'label'    => 'Priority Number',
    ])
    ->add('isDefault', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Default',
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
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('createdBy', TextType::class, [
        'required' => false,
        'label'    => 'Created By',
    ])
    ->add('createdAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Created At',
    ])
    ->add('updatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Updated By',
    ])
    ->add('updatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Updated At',
    ])
    ->getForm();

