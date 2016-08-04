<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('attributeId', TextType::class, [
        'required' => true,
        'label'    => 'AttributeId',
    ])
    ->add('name', TextType::class, [
        'required' => false,
        'label'    => 'Name',
    ])
    ->add('organizationId', TextType::class, [
        'required' => false,
        'label'    => 'OrganizationId',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('isMandatory', TextType::class, [
        'required' => false,
        'label'    => 'IsMandatory',
    ])
    ->add('isInstanceAttribute', TextType::class, [
        'required' => false,
        'label'    => 'IsInstanceAttribute',
    ])
    ->add('attributeValueType', TextType::class, [
        'required' => false,
        'label'    => 'AttributeValueType',
    ])
    ->add('attributeValueLength', TextType::class, [
        'required' => false,
        'label'    => 'AttributeValueLength',
    ])
    ->add('isList', TextType::class, [
        'required' => false,
        'label'    => 'IsList',
    ])
    ->add('fieldName', TextType::class, [
        'required' => false,
        'label'    => 'FieldName',
    ])
    ->add('referenceId', TextType::class, [
        'required' => false,
        'label'    => 'ReferenceId',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('createdBy', TextType::class, [
        'required' => false,
        'label'    => 'CreatedBy',
    ])
    ->add('createdAt', TextType::class, [
        'required' => false,
        'label'    => 'CreatedAt',
    ])
    ->add('updatedBy', TextType::class, [
        'required' => false,
        'label'    => 'UpdatedBy',
    ])
    ->add('updatedAt', TextType::class, [
        'required' => false,
        'label'    => 'UpdatedAt',
    ])
    ->getForm();

