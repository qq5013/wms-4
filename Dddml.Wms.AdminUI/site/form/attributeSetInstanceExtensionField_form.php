<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('index', TextType::class, [
        'required' => true,
        'label'    => 'Index',
    ])
    ->add('name', TextType::class, [
        'required' => false,
        'label'    => 'Name',
    ])
    ->add('type', TextType::class, [
        'required' => false,
        'label'    => 'Type',
    ])
    ->add('length', IntegerType::class, [
        'required' => false,
        'label'    => 'Length',
    ])
    ->add('alias', TextType::class, [
        'required' => false,
        'label'    => 'Alias',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('groupId', TextType::class, [
        'required' => false,
        'label'    => 'Group Id',
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

