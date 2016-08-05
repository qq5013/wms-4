<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('id', TextType::class, [
        'required' => true,
        'label'    => 'Id',
    ])
    ->add('fieldType', TextType::class, [
        'required' => false,
        'label'    => 'Field Type',
    ])
    ->add('fieldLength', IntegerType::class, [
        'required' => false,
        'label'    => 'Field Length',
    ])
    ->add('fieldCount', IntegerType::class, [
        'required' => false,
        'label'    => 'Field Count',
    ])
    ->add('nameFormat', TextType::class, [
        'required' => false,
        'label'    => 'Name Format',
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

