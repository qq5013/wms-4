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
        'label'    => 'Reference Id',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attributeName', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Name',
    ])
    ->add('attributeOrganizationId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Organization Id',
    ])
    ->add('attributeDescription', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Description',
    ])
    ->add('attributeIsMandatory', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attribute Is Mandatory',
    ])
    ->add('attributeIsInstanceAttribute', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attribute Is Instance Attribute',
    ])
    ->add('attributeAttributeValueType', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Attribute Value Type',
    ])
    ->add('attributeAttributeValueLength', IntegerType::class, [
        'required' => false,
        'label'    => 'Attribute Attribute Value Length',
    ])
    ->add('attributeIsList', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attribute Is List',
    ])
    ->add('attributeFieldName', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Field Name',
    ])
    ->add('attributeReferenceId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Reference Id',
    ])
    ->add('attributeCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Created By',
    ])
    ->add('attributeCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Attribute Created At',
    ])
    ->add('attributeUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Updated By',
    ])
    ->add('attributeUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Attribute Updated At',
    ])
    ->add('attributeActive', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attribute Active',
    ])
    ->add('attributeDeleted', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attribute Deleted',
    ])
    ->add('attributeVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'Attribute Version',
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

