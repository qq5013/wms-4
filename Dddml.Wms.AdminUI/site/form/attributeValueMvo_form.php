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
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', ChoiceType::class, [
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
    ->add('attributeIsMandatory', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttributeIsMandatory',
    ])
    ->add('attributeIsInstanceAttribute', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttributeIsInstanceAttribute',
    ])
    ->add('attributeAttributeValueType', TextType::class, [
        'required' => false,
        'label'    => 'AttributeAttributeValueType',
    ])
    ->add('attributeAttributeValueLength', IntegerType::class, [
        'required' => false,
        'label'    => 'AttributeAttributeValueLength',
    ])
    ->add('attributeIsList', ChoiceType::class, [
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
    ->add('attributeCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'AttributeCreatedAt',
    ])
    ->add('attributeUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttributeUpdatedBy',
    ])
    ->add('attributeUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'AttributeUpdatedAt',
    ])
    ->add('attributeActive', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttributeActive',
    ])
    ->add('attributeDeleted', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttributeDeleted',
    ])
    ->add('attributeVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'AttributeVersion',
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

