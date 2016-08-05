<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('attributeSetId', TextType::class, [
        'required' => true,
        'label'    => 'Attribute Set Id',
    ])
    ->add('name', TextType::class, [
        'required' => false,
        'label'    => 'Name',
    ])
    ->add('organizationId', TextType::class, [
        'required' => false,
        'label'    => 'Organization Id',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('serialNumberAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'Serial Number Attribute Id',
    ])
    ->add('lotAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'Lot Attribute Id',
    ])
    ->add('referenceId', TextType::class, [
        'required' => false,
        'label'    => 'Reference Id',
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

