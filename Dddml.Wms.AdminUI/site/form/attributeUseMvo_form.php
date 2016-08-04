<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('sequenceNumber', IntegerType::class, [
        'required' => false,
        'label'    => 'SequenceNumber',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attributeSetName', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetName',
    ])
    ->add('attributeSetOrganizationId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetOrganizationId',
    ])
    ->add('attributeSetDescription', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetDescription',
    ])
    ->add('attributeSetSerialNumberAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetSerialNumberAttributeId',
    ])
    ->add('attributeSetLotAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetLotAttributeId',
    ])
    ->add('attributeSetReferenceId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetReferenceId',
    ])
    ->add('attributeSetCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetCreatedBy',
    ])
    ->add('attributeSetCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'AttributeSetCreatedAt',
    ])
    ->add('attributeSetUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetUpdatedBy',
    ])
    ->add('attributeSetUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'AttributeSetUpdatedAt',
    ])
    ->add('attributeSetActive', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttributeSetActive',
    ])
    ->add('attributeSetDeleted', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttributeSetDeleted',
    ])
    ->add('attributeSetVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'AttributeSetVersion',
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

