<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('attributeId', TextType::class, [
        'required' => true,
        'label'    => 'Attribute Id',
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
    ->add('isMandatory', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Mandatory',
    ])
    ->add('isInstanceAttribute', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Instance Attribute',
    ])
    ->add('attributeValueType', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Value Type',
    ])
    ->add('attributeValueLength', IntegerType::class, [
        'required' => false,
        'label'    => 'Attribute Value Length',
    ])
    ->add('isList', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is List',
    ])
    ->add('fieldName', TextType::class, [
        'required' => false,
        'label'    => 'Field Name',
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

