<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('name', TextType::class, [
        'required' => false,
        'label'    => 'Name',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('referenceId', TextType::class, [
        'required' => false,
        'label'    => 'ReferenceId',
    ])
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attributeName', TextType::class, [
        'required' => false,
        'label'    => 'AttributeName',
    ])
    ->add('attributeOrganizationId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeOrganizationId',
    ])
    ->add('attributeDescription', TextType::class, [
        'required' => false,
        'label'    => 'AttributeDescription',
    ])
    ->add('attributeIsMandatory', TextType::class, [
        'required' => false,
        'label'    => 'AttributeIsMandatory',
    ])
    ->add('attributeIsInstanceAttribute', TextType::class, [
        'required' => false,
        'label'    => 'AttributeIsInstanceAttribute',
    ])
    ->add('attributeAttributeValueType', TextType::class, [
        'required' => false,
        'label'    => 'AttributeAttributeValueType',
    ])
    ->add('attributeAttributeValueLength', TextType::class, [
        'required' => false,
        'label'    => 'AttributeAttributeValueLength',
    ])
    ->add('attributeIsList', TextType::class, [
        'required' => false,
        'label'    => 'AttributeIsList',
    ])
    ->add('attributeFieldName', TextType::class, [
        'required' => false,
        'label'    => 'AttributeFieldName',
    ])
    ->add('attributeReferenceId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeReferenceId',
    ])
    ->add('attributeCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttributeCreatedBy',
    ])
    ->add('attributeCreatedAt', TextType::class, [
        'required' => false,
        'label'    => 'AttributeCreatedAt',
    ])
    ->add('attributeUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttributeUpdatedBy',
    ])
    ->add('attributeUpdatedAt', TextType::class, [
        'required' => false,
        'label'    => 'AttributeUpdatedAt',
    ])
    ->add('attributeActive', TextType::class, [
        'required' => false,
        'label'    => 'AttributeActive',
    ])
    ->add('attributeDeleted', TextType::class, [
        'required' => false,
        'label'    => 'AttributeDeleted',
    ])
    ->add('attributeVersion', TextType::class, [
        'required' => false,
        'label'    => 'AttributeVersion',
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

